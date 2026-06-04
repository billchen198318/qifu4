package org.qifu.core.interceptor;

import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.qifu.base.properties.MqttConfigProperties;
import org.qifu.core.vo.MqttMessageVO;

import io.moquette.interception.AbstractInterceptHandler;
import io.moquette.interception.messages.InterceptPublishMessage;
import io.moquette.interception.messages.InterceptSubscribeMessage;
import io.moquette.interception.messages.InterceptUnsubscribeMessage;
import io.netty.buffer.ByteBuf;

public class MqttMonitoringInterceptor extends AbstractInterceptHandler {
	private final MqttConfigProperties mqttConfigProperties;
	
	public MqttMonitoringInterceptor(MqttConfigProperties mqttConfigProperties) {
		this.mqttConfigProperties = mqttConfigProperties;
	}

	/**
	 * Topic -> Recent Messages
	 */
	private final Map<String, Deque<MqttMessageVO>> topicMessages = new ConcurrentHashMap<>();

	/**
	 * Topic -> Last Publish Time
	 */
	private final Map<String, String> topicLastTime = new ConcurrentHashMap<>();

	/**
	 * Topic -> Subscriber Count
	 */
	private final Map<String, AtomicInteger> topicSubscribers = new ConcurrentHashMap<>();

	@Override
	public String getID() {
		return "MqttMonitoringInterceptor";
	}

	@Override
	public void onPublish(InterceptPublishMessage msg) {

		String topic = msg.getTopicName();

		ByteBuf payload = msg.getPayload();

		String content = payload.toString(StandardCharsets.UTF_8);

		String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

		MqttMessageVO messageVO = new MqttMessageVO();
		messageVO.setTopic(topic);
		messageVO.setPayload(content);
		messageVO.setTime(time);

		topicMessages.computeIfAbsent(topic, k -> new LinkedList<>());

		Deque<MqttMessageVO> queue = topicMessages.get(topic);

		synchronized (queue) {

			queue.addFirst(messageVO);

			while (queue.size() > mqttConfigProperties.getMonitoringInterceptorPerTopic()) {
				queue.removeLast();
			}
		}

		topicLastTime.put(topic, time);
	}

	@Override
	public void onSubscribe(InterceptSubscribeMessage msg) {

		String topic = msg.getTopicFilter();

		topicSubscribers.computeIfAbsent(topic, k -> new AtomicInteger(0)).incrementAndGet();
	}

	@Override
	public void onUnsubscribe(InterceptUnsubscribeMessage msg) {

		String topic = msg.getTopicFilter();

		AtomicInteger count = topicSubscribers.get(topic);

		if (count != null) {

			int current = count.decrementAndGet();

			if (current <= 0) {
				topicSubscribers.remove(topic);
			}
		}
	}

	@Override
	public void onSessionLoopError(Throwable error) {
		// ignore
	}

	/**
	 * 所有曾收到 Publish 的 Topic
	 */
	public Set<String> getObservedTopics() {
		return topicMessages.keySet();
	}

	/**
	 * 所有有訂閱者的 Topic
	 */
	public Set<String> getSubscribedTopics() {
		return topicSubscribers.keySet();
	}

	/**
	 * Topic -> Subscriber Count
	 */
	public Map<String, Integer> getTopicSubscribers() {

		return topicSubscribers.entrySet().stream()
				.collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().get()));
	}

	/**
	 * 最近訊息
	 */
	public List<MqttMessageVO> getMessages(String topic) {

		Deque<MqttMessageVO> queue = topicMessages.get(topic);

		if (queue == null) {
			return new ArrayList<>();
		}

		synchronized (queue) {
			return new ArrayList<>(queue);
		}
	}

	/**
	 * 最後訊息時間
	 */
	public String getLastTime(String topic) {
		return topicLastTime.get(topic);
	}

	/**
	 * Topic 訂閱數
	 */
	public int getSubscriberCount(String topic) {

		AtomicInteger count = topicSubscribers.get(topic);

		return count == null ? 0 : count.get();
	}
	
}
