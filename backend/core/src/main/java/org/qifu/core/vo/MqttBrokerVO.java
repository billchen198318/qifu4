package org.qifu.core.vo;

import java.io.Serializable;
import java.util.List;

public class MqttBrokerVO implements Serializable {
	private static final long serialVersionUID = -1429812734123L;
	
	private String host;
	private String port;
	private int clientSize;
	private List<MqttClientVO> clients;
	
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public int getClientSize() {
		return clientSize;
	}
	public void setClientSize(int clientSize) {
		this.clientSize = clientSize;
	}
	public List<MqttClientVO> getClients() {
		return clients;
	}
	public void setClients(List<MqttClientVO> clients) {
		this.clients = clients;
	}
	
	public static class MqttClientVO implements Serializable {
		private static final long serialVersionUID = -2429812734123L;
		private String clientId;
		private String address;
		private int port;
		
		public String getClientId() {
			return clientId;
		}
		public void setClientId(String clientId) {
			this.clientId = clientId;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getPort() {
			return port;
		}
		public void setPort(int port) {
			this.port = port;
		}
	}
}
