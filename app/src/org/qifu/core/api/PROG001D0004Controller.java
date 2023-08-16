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
import org.qifu.core.entity.TbSysTemplate;
import org.qifu.core.logic.ISystemTemplateLogicService;
import org.qifu.core.service.ISysTemplateService;
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

@Api(tags = {"CORE_PROG001D0004"}, value = "Freemarker樣板 management.")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/PROG001D0004")
public class PROG001D0004Controller extends CoreApiSupport {
	private static final long serialVersionUID = 1558945973473225107L;
	
	@Autowired
	ISysTemplateService<TbSysTemplate, String> sysTemplateService;
	
	@Autowired
	ISystemTemplateLogicService systemTemplateLogicService;
	
	@ApiOperation(
			value="CORE_PROG001D0004 - findPage", 
			notes="查詢TB_SYS_TEMPLATE資料", 
			authorizations={ @Authorization(value="Bearer") }
	)
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "field.templateId", value = "樣板Id"),
    	@ApiImplicitParam(name = "field.title", value = "Title"),
    	@ApiImplicitParam(name = "pageOf.select", value = "換頁代碼-頁"),
    	@ApiImplicitParam(name = "pageOf.showRow", value = "換頁代碼-row")
    })		
	@ResponseBody
	@PostMapping(value = "/findPage", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<QueryResult<List<TbSysTemplate>>> findPage(@RequestBody SearchBody searchBody) {
		QueryResult<List<TbSysTemplate>> result = this.initResult();
		try {
			QueryResult<List<TbSysTemplate>> queryResult = this.sysTemplateService.findPage(
					this.queryParameter(searchBody).fullEquals("templateId").fullLink("titleLike").value(), 
					searchBody.getPageOf().orderBy("TEMPLATE_ID").sortTypeAsc());
			this.setQueryResponseJsonResult(queryResult, result, searchBody.getPageOf());
		} catch (ServiceException | ControllerException e) {
			this.noSuccessResult(result, e);
		} catch (Exception e) {
			this.noSuccessResult(result, e);
		}
		return ResponseEntity.ok().body(result);
	}		
	
	@ApiOperation(value="CORE_PROG001D0004 - delete", notes="刪除TB_SYS_TEMPLATE資料", authorizations={ @Authorization(value="Bearer") })
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "oid", value = "TB_SYS_TEMPLATE.OID")
    })
	@ResponseBody
	@PostMapping(value = "/delete", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> doDelete(@RequestBody TbSysTemplate sysTemplate) {
		DefaultControllerJsonResultObj<Boolean> result = this.initDefaultJsonResult();
		try {
			DefaultResult<Boolean> delResult = this.systemTemplateLogicService.delete(sysTemplate);
			this.setDefaultResponseJsonResult(delResult, result);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} catch (Exception e) {
			this.exceptionResult(result, e);
		}
		return ResponseEntity.ok().body(result);
	}	
	
}
