package org.qifu.base.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:appConfig.properties")
@ConfigurationProperties(prefix = "mqttbroker")
public class MqttConfigProperties {

	private boolean enable;
	private String host;
	private String port;
	private boolean allowAnonymous;
	private boolean telemetryEnabled;
	private String storePath;
	private String tempPasswordFile;

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

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

	public boolean isAllowAnonymous() {
		return allowAnonymous;
	}

	public void setAllowAnonymous(boolean allowAnonymous) {
		this.allowAnonymous = allowAnonymous;
	}

	public boolean isTelemetryEnabled() {
		return telemetryEnabled;
	}

	public void setTelemetryEnabled(boolean telemetryEnabled) {
		this.telemetryEnabled = telemetryEnabled;
	}

	public String getStorePath() {
		return storePath;
	}

	public void setStorePath(String storePath) {
		this.storePath = storePath;
	}

	public String getTempPasswordFile() {
		return tempPasswordFile;
	}

	public void setTempPasswordFile(String tempPasswordFile) {
		this.tempPasswordFile = tempPasswordFile;
	}

}