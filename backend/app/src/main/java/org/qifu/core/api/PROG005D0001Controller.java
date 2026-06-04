package org.qifu.core.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.qifu.base.model.ControllerMethodAuthority;
import org.qifu.base.model.QueryResult;
import org.qifu.base.model.SearchBody;
import org.qifu.base.properties.MqttConfigProperties;
import org.qifu.core.interceptor.MqttMonitoringInterceptor;
import org.qifu.core.util.CoreApiSupport;
import org.qifu.core.vo.MqttBrokerVO;
import org.qifu.core.vo.MqttBrokerVO.MqttClientVO;
import org.qifu.core.vo.MqttMessageVO;
import org.qifu.core.vo.MqttTopicVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.moquette.broker.ClientDescriptor;
import io.moquette.broker.Server;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "CORE_PROG005D0001", description = "MQTT Dashboard.")
@RestController
@RequestMapping("/api/PROG005D0001")
public class PROG005D0001Controller extends CoreApiSupport {

	private static final long serialVersionUID = 52812734123L;

	@Autowired(required = false)
	private Server mqttServer;

	@Autowired(required = false)
	private MqttMonitoringInterceptor interceptor;

	private final MqttConfigProperties mqttConfigProperties;

	public PROG005D0001Controller(MqttConfigProperties mqttConfigProperties) {
		this.mqttConfigProperties = mqttConfigProperties;
	}

	@ControllerMethodAuthority(programId = "CORE_PROG005D0001Q", check = true)
	@Operation(summary = "findPage", description = "MQTT Dashboard 查詢")
	@PostMapping(value = "/findPage", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<QueryResult<MqttBrokerVO>> findPage(@RequestBody SearchBody searchBody) {
		QueryResult<MqttBrokerVO> result = this.initResult();
		try {
			MqttBrokerVO brokerVO = new MqttBrokerVO();
			brokerVO.setEnable(mqttConfigProperties.isEnable());
			brokerVO.setHost(mqttConfigProperties.getHost());
			brokerVO.setPort(mqttConfigProperties.getPort());
			List<MqttClientVO> clients = new ArrayList<>();
			if (mqttServer != null) {
				Collection<ClientDescriptor> descriptors = mqttServer.listConnectedClients();
				for (ClientDescriptor desc : descriptors) {
					MqttClientVO vo = new MqttClientVO();
					vo.setClientId(desc.getClientID());
					vo.setAddress(desc.getAddress());
					vo.setPort(desc.getPort());
					clients.add(vo);
				}
			}
			brokerVO.setClients(clients);
			brokerVO.setClientSize(clients.size());
			result.setValue(brokerVO);
			this.successResult(result);
		} catch (Exception e) {
			this.noSuccessResult(result, e.getMessage());
		}
		return ResponseEntity.ok(result);
	}

	@ControllerMethodAuthority(programId = "CORE_PROG005D0001Q", check = true)
	@Operation(summary = "findTopics", description = "MQTT Topics 查詢")
	@PostMapping(value = "/findTopics", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<QueryResult<List<MqttTopicVO>>> findTopics(@RequestBody SearchBody searchBody) {
		QueryResult<List<MqttTopicVO>> result = this.initResult();
		try {
			List<MqttTopicVO> topics = new ArrayList<>();
			Set<String> allTopics = new HashSet<>();
			if (interceptor != null) {
				allTopics.addAll(interceptor.getObservedTopics());
				allTopics.addAll(interceptor.getSubscribedTopics());
			}
			for (String topic : allTopics) {
				MqttTopicVO vo = new MqttTopicVO();
				vo.setTopic(topic);
				if (interceptor != null) {
					vo.setSubscriberCount(interceptor.getSubscriberCount(topic));
					vo.setLastMessageTime(interceptor.getLastTime(topic));
				}
				topics.add(vo);
			}
			result.setValue(topics);
			this.successResult(result);
		} catch (Exception e) {
			this.noSuccessResult(result, e.getMessage());
		}
		return ResponseEntity.ok(result);
	}

	@ControllerMethodAuthority(programId = "CORE_PROG005D0001Q", check = true)
	@Operation(summary = "findMessages", description = "MQTT Topic 訊息查詢")
	@PostMapping(value = "/findMessages", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<QueryResult<List<MqttMessageVO>>> findMessages(@RequestBody SearchBody searchBody) {
		QueryResult<List<MqttMessageVO>> result = this.initResult();
		try {
			String topic = (String) searchBody.getField().get("topic");
			List<MqttMessageVO> messages = new ArrayList<>();
			if (interceptor != null && topic != null) {
				messages = interceptor.getMessages(topic);
			}
			result.setValue(messages);
			this.successResult(result);
		} catch (Exception e) {
			this.noSuccessResult(result, e.getMessage());
		}
		return ResponseEntity.ok(result);
	}

}