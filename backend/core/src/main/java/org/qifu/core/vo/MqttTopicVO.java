package org.qifu.core.vo;

import java.io.Serializable;

public class MqttTopicVO implements Serializable {
	private static final long serialVersionUID = 42812734125L;
	private String topic;
	private int subscriberCount;
	private String lastMessageTime;
	public String getTopicMsg() {
		return topic;
	}	
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public int getSubscriberCount() {
		return subscriberCount;
	}
	public void setSubscriberCount(int subscriberCount) {
		this.subscriberCount = subscriberCount;
	}
	public String getLastMessageTime() {
		return lastMessageTime;
	}
	public void setLastMessageTime(String lastMessageTime) {
		this.lastMessageTime = lastMessageTime;
	}
}
