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
import org.qifu.base.model.CheckControllerFieldHandler;
import org.qifu.base.model.DefaultControllerJsonResultObj;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.QueryResult;
import org.qifu.base.model.SearchBody;
import org.qifu.core.entity.TbSys;
import org.qifu.core.logic.IApplicationSystemLogicService;
import org.qifu.core.service.ISysService;
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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;

@Api(tags = {"CORE_PROG001D0001"}, value = "Application site.")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/prog001")
public class Prog001ApiController extends CoreApiSupport {
	private static final long serialVersionUID = -5896010855369568172L;
	
	@Autowired
	ISysService<TbSys, String> sysService;
	
	@Autowired
	IApplicationSystemLogicService applicationSystemLogicService;
	
	
	@ApiOperation(
			value="CORE_PROG001D0001 - findPage", 
			notes="查核TB_SYS資料", 
			authorizations={ @Authorization(value="Bearer") }
	)
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "field.sysId", value = "系統Id"),
    	@ApiImplicitParam(name = "field.name", value = "名稱"),
    	@ApiImplicitParam(name = "pageOf.select", value = "換頁代碼-頁"),
    	@ApiImplicitParam(name = "pageOf.showRow", value = "換頁代碼-row")
    })		
	@ResponseBody
	@PostMapping(value = "/findPage", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<QueryResult<List<TbSys>>> findPage(@RequestBody SearchBody searchBody) {
		QueryResult<List<TbSys>> result = this.initResult();
		try {
			QueryResult<List<TbSys>> queryResult = this.sysService.findPage(
					this.queryParameter(searchBody).fullEquals("sysId").fullLink("nameLike").value(), 
					searchBody.getPageOf().orderBy("SYS_ID").sortTypeAsc());
			this.setQueryResponseJsonResult(queryResult, result, searchBody.getPageOf());
		} catch (ServiceException | ControllerException e) {
			this.noSuccessResult(result, e);
		} catch (Exception e) {
			this.noSuccessResult(result, e);
		}
		return ResponseEntity.ok().body(result);
	}
	
	@ApiOperation(value="CORE_PROG001D0001 - delete", notes="刪除TB_SYS資料", authorizations={ @Authorization(value="Bearer") })
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "oid", value = "TB_SYS.OID")
    })
	@ResponseBody
	@PostMapping(value = "/delete", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> doDelete(@RequestBody TbSys sys) {
		DefaultControllerJsonResultObj<Boolean> result = this.initDefaultJsonResult();
		try {
			DefaultResult<Boolean> delResult = this.applicationSystemLogicService.delete(sys);
			this.setDefaultResponseJsonResult(delResult, result);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} catch (Exception e) {
			this.exceptionResult(result, e);
		}
		return ResponseEntity.ok().body(result);
	}
	
	private void handlerCheck(DefaultControllerJsonResultObj<TbSys> result, TbSys sys) throws ControllerException, ServiceException, Exception {
		CheckControllerFieldHandler<TbSys> chk = this.getCheckControllerFieldHandler(result);
		
		chk.testField("sysId", sys, "@org.apache.commons.lang3.StringUtils@isBlank(sysId)", "請輸入編號")
		.testField("name", sys, "@org.apache.commons.lang3.StringUtils@isBlank(name)", "請輸入名稱")
		.testField("host", sys, "@org.apache.commons.lang3.StringUtils@isBlank(host)", "請輸入host")
		.testField("contextPath", sys, "@org.apache.commons.lang3.StringUtils@isBlank(contextPath)", "請輸入Context path")
		.throwHtmlMessage();
		
		chk.testField("sysId", sys, "!@org.qifu.util.SimpleUtils@checkBeTrueOf_azAZ09Id(sysId)", "編號只允許輸入0-9,a-z,A-Z正常字元")
		.throwHtmlMessage();		
	}
	
	private void save(DefaultControllerJsonResultObj<TbSys> result, TbSys sys) throws ControllerException, ServiceException, Exception {
		this.handlerCheck(result, sys);
		DefaultResult<TbSys> cResult = this.applicationSystemLogicService.create(sys);
		this.setDefaultResponseJsonResult(cResult, result);
	}
	
	private void update(DefaultControllerJsonResultObj<TbSys> result, TbSys sys) throws ControllerException, ServiceException, Exception {
		this.handlerCheck(result, sys);
		DefaultResult<TbSys> uResult = this.applicationSystemLogicService.update(sys);
		this.setDefaultResponseJsonResult(uResult, result);
	}
	
	@ApiOperation(value="CORE_PROG001D0001 - save", notes="新增TB_SYS資料", authorizations={ @Authorization(value="Bearer") })
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "sysId", value = ""),
    	@ApiImplicitParam(name = "name", value = ""),
    	@ApiImplicitParam(name = "host", value = ""),
    	@ApiImplicitParam(name = "contextPath", value = ""),
    	@ApiImplicitParam(name = "icon", value = ""),
    	@ApiImplicitParam(name = "isLocal", value = "")
    })
	@ResponseBody
	@PostMapping(value = "/save", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<TbSys>> doSave(@RequestBody TbSys sys) {
		DefaultControllerJsonResultObj<TbSys> result = this.initDefaultJsonResult();
		try {
			this.save(result, sys);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} catch (Exception e) {
			this.exceptionResult(result, e);
		}
		return ResponseEntity.ok().body(result);
	}
	
	@ApiOperation(value="CORE_PROG001D0001 - load", notes="讀取TB_SYS資料", authorizations={ @Authorization(value="Bearer") })
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "oid", value = "TB_SYS.OID")
    })
	@ResponseBody
	@PostMapping(value = "/load", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<TbSys>> doLoad(@RequestBody TbSys sys) {
		DefaultControllerJsonResultObj<TbSys> result = this.initDefaultJsonResult();
		try {
			DefaultResult<TbSys> lResult = this.sysService.selectByEntityPrimaryKey(sys);
			this.setDefaultResponseJsonResult(lResult, result);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} catch (Exception e) {
			this.exceptionResult(result, e);
		}
		return ResponseEntity.ok().body(result);
	}	
	
	@ApiOperation(value="CORE_PROG001D0001 - update", notes="更新TB_SYS資料", authorizations={ @Authorization(value="Bearer") })
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "sysId", value = ""),
    	@ApiImplicitParam(name = "name", value = ""),
    	@ApiImplicitParam(name = "host", value = ""),
    	@ApiImplicitParam(name = "contextPath", value = ""),
    	@ApiImplicitParam(name = "icon", value = ""),
    	@ApiImplicitParam(name = "isLocal", value = "")
    })
	@ResponseBody
	@PostMapping(value = "/update", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<TbSys>> doUpdate(@RequestBody TbSys sys) {
		DefaultControllerJsonResultObj<TbSys> result = this.initDefaultJsonResult();
		try {
			this.update(result, sys);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} catch (Exception e) {
			this.exceptionResult(result, e);
		}
		return ResponseEntity.ok().body(result);
	}	
	
}
