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

import java.util.List;

import org.qifu.base.exception.ControllerException;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.DefaultControllerJsonResultObj;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.QueryResult;
import org.qifu.base.model.SearchBody;
import org.qifu.core.entity.TbRole;
import org.qifu.core.entity.TbSysProg;
import org.qifu.core.logic.IRoleLogicService;
import org.qifu.core.service.IRoleService;
import org.qifu.core.util.CoreApiSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "CORE_PROG002D0001", description = "Role management.")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/PROG002D0001")
public class PROG002D0001Controller extends CoreApiSupport {
	private static final long serialVersionUID = -8319767341034129139L;
	
	@Autowired
	IRoleService<TbRole, String> roleService;
	
	@Autowired
	IRoleLogicService roleLogicService;
	
	@Operation(summary = "CORE_PROG002D0001 - findPage", description = "查詢TB_ROLE資料")
	@ResponseBody
	@PostMapping(value = "/findPage", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<QueryResult<List<TbRole>>> findPage(@RequestBody SearchBody searchBody) {
		QueryResult<List<TbRole>> result = this.initResult();
		try {
			QueryResult<List<TbRole>> queryResult = this.roleService.findPage(
					this.queryParameter(searchBody).fullEquals("role").value(),
					searchBody.getPageOf().orderBy("ROLE").sortTypeAsc());
			this.setQueryResponseJsonResult(queryResult, result, searchBody.getPageOf());
		} catch (ServiceException | ControllerException e) {
			this.noSuccessResult(result, e);
		} catch (Exception e) {
			this.noSuccessResult(result, e);
		}
		return ResponseEntity.ok().body(result);
	}	
	
	@Operation(summary = "CORE_PROG002D0001 - delete", description = "刪除TB_ROLE資料")
	@ResponseBody
	@PostMapping(value = "/delete", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> doDelete(@RequestBody TbRole role) {
		DefaultControllerJsonResultObj<Boolean> result = this.initDefaultJsonResult();
		try {
			DefaultResult<Boolean> delResult = this.roleLogicService.delete(role);
			this.setDefaultResponseJsonResult(delResult, result);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} catch (Exception e) {
			this.exceptionResult(result, e);
		}
		return ResponseEntity.ok().body(result);
	}	
	
	@Operation(summary = "CORE_PROG002D0001 - save", description = "新增TB_ROLE資料")
	@ResponseBody
	@PostMapping(value = "/save", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<TbSysProg>> doSave(@RequestBody TbSysProg sysProg) {
		DefaultControllerJsonResultObj<TbSysProg> result = this.initDefaultJsonResult();
		try {
			//this.save(result, sysProg);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} catch (Exception e) {
			this.exceptionResult(result, e);
		}
		return ResponseEntity.ok().body(result);
	}		
	
	
}
