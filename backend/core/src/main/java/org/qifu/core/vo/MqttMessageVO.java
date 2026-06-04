package org.qifu.core.vo;

import java.io.Serializable;

public class MqttMessageVO implements Serializable {
	private static final long serialVersionUID = 42812734126L;
	private String topic;
	private String payload;
	private String time;
	
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getPayload() {
		return payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
}
