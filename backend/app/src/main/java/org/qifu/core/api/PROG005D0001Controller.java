/* 
 * Copyright 2021-2023 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.qifu.base.model.ControllerMethodAuthority;
import org.qifu.base.model.QueryResult;
import org.qifu.base.model.SearchBody;
import org.qifu.base.properties.MqttConfigProperties;
import org.qifu.core.util.CoreApiSupport;
import org.qifu.core.vo.MqttBrokerVO;
import org.qifu.core.vo.MqttBrokerVO.MqttClientVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.moquette.broker.ClientDescriptor;
import io.moquette.broker.Server;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "CORE_PROG005D0001", description = "MQTT Dashboard.")
@RestController
@ResponseBody
@RequestMapping("/api/PROG005D0001")
public class PROG005D0001Controller extends CoreApiSupport {
	private static final long serialVersionUID = 52812734123L;
	
	@Autowired(required = false)
	private Server mqttServer;
	
	private final MqttConfigProperties mqttConfigProperties;
	
	public PROG005D0001Controller(MqttConfigProperties mqttConfigProperties) {
		super();
		this.mqttConfigProperties = mqttConfigProperties;
	}
	
	@ControllerMethodAuthority(programId = "CORE_PROG005D0001Q", check = true)
	@Operation(summary = "CORE_PROG005D0001 - findPage", description = "MQTT Dashboard 查詢")
	@PostMapping(value = "/findPage", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<QueryResult<MqttBrokerVO>> findPage(@RequestBody SearchBody searchBody) {
		QueryResult<MqttBrokerVO> result = this.initResult();
		try {
			MqttBrokerVO brokerVO = new MqttBrokerVO();
			brokerVO.setHost(mqttConfigProperties.getHost());
			brokerVO.setPort(mqttConfigProperties.getPort());
			
			List<MqttClientVO> clients = new ArrayList<>();
			if (mqttServer != null) {
				Collection<ClientDescriptor> descriptors = mqttServer.listConnectedClients();
				for (ClientDescriptor desc : descriptors) {
					MqttClientVO clientVO = new MqttClientVO();
					clientVO.setClientId(desc.getClientID());
					clientVO.setAddress(desc.getAddress());
					clientVO.setPort(desc.getPort());
					clients.add(clientVO);
				}
			}
			
			brokerVO.setClients(clients);
			brokerVO.setClientSize(clients.size());
			
			result.setValue(brokerVO);
			this.successResult(result);
		} catch (Exception e) {
			this.noSuccessResult(result, e.getMessage());
		} 
		return ResponseEntity.ok().body(result);
	}		
	
}
