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
import org.qifu.base.model.QueryResult;
import org.qifu.base.model.SearchBody;
import org.qifu.core.entity.TbSysProg;
import org.qifu.core.service.ISysProgService;
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

@Api(tags = {"PROG001D"}, value = "Program page management.")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/prog002")
public class Prog002ApiController extends CoreApiSupport {
	private static final long serialVersionUID = -2060599663035482390L;
	
	@Autowired
	ISysProgService<TbSysProg, String> SysProgService;
	
	@ApiOperation(
			value="PROG002 - findPage", 
			notes="查詢TB_SYS_PROG資料", 
			authorizations={ @Authorization(value="Bearer") }
	)
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "field.progId", value = "程式Id"),
    	@ApiImplicitParam(name = "field.name", value = "程式名稱"),
    	@ApiImplicitParam(name = "pageOf.select", value = "換頁代碼-頁"),
    	@ApiImplicitParam(name = "pageOf.showRow", value = "換頁代碼-row")
    })		
	@ResponseBody
	@PostMapping(value = "/findPage", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<QueryResult<List<TbSysProg>>> findPage(@RequestBody SearchBody searchBody) {
		QueryResult<List<TbSysProg>> result = this.initResult();
		try {
			QueryResult<List<TbSysProg>> queryResult = this.SysProgService.findPage(
					this.queryParameter(searchBody).fullEquals("progId").fullLink("nameLike").value(), 
					searchBody.getPageOf().orderBy("PROG_ID").sortTypeAsc());
			this.setQueryResponseJsonResult(queryResult, result, searchBody.getPageOf());
		} catch (ServiceException | ControllerException e) {
			this.noSuccessResult(result, e);
		} catch (Exception e) {
			this.noSuccessResult(result, e);
		}
		return ResponseEntity.ok().body(result);
	}	
	
	
}
