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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.qifu.base.exception.ControllerException;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.DefaultControllerJsonResultObj;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.SortType;
import org.qifu.core.entity.TbSys;
import org.qifu.core.entity.TbSysMenu;
import org.qifu.core.entity.TbSysProg;
import org.qifu.core.logic.ISystemMenuLogicService;
import org.qifu.core.model.MenuItemType;
import org.qifu.core.service.ISysMenuService;
import org.qifu.core.service.ISysProgService;
import org.qifu.core.service.ISysService;
import org.qifu.core.util.CoreApiSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
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

@Api(tags = {"CORE_PROG001D0003"}, value = "Program menu management.")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/PROG001D0003")
public class PROG001D0003Controller extends CoreApiSupport {
	private static final long serialVersionUID = 3908071442920993630L;
	
	@Autowired
	ISysService<TbSys, String> sysService;	
	
	@Autowired
	ISysProgService<TbSysProg, String> sysProgService;	
	
	@Autowired
	ISystemMenuLogicService systemMenuLogicService;
	
	
	@ApiOperation(value="CORE_PROG001D0003 - load folder program", notes="讀取TB_SYS_PROG ITEM_TYPE 是 FOLDER 資料", authorizations={ @Authorization(value="Bearer") })
	@ResponseBody
	@PostMapping(value = "/loadProgramFolder", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<List<TbSysProg>>> doLoadProgramFolder() {
		DefaultControllerJsonResultObj<List<TbSysProg>> result = this.initDefaultJsonResult();
		try {
			Map<String, Object> param = new HashMap<String, Object>();
			param.put("itemType", MenuItemType.FOLDER);			
			DefaultResult<List<TbSysProg>> lResult = this.sysProgService.selectListByParams(param, "PROG_ID", SortType.ASC);
			this.setDefaultResponseJsonResult(lResult, result);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} catch (Exception e) {
			this.exceptionResult(result, e);
		}
		return ResponseEntity.ok().body(result);
	}	
	
	@ApiOperation(value="CORE_PROG001D0003 - load folder program", notes="讀取TB_SYS_PROG ITEM_TYPE 是 FOLDER 資料", authorizations={ @Authorization(value="Bearer") })
	@ApiImplicitParams({
		@ApiImplicitParam(name = "oid", value = "oid編號", required = true, dataType = "string")
	})	
	@ResponseBody
	@PostMapping(value = "/loadProgramEnableAndAllList/{oid}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public DefaultControllerJsonResultObj< Map<String, List<TbSysProg>> > queryProgramListByFolderOid(@PathVariable String oid) {
		DefaultControllerJsonResultObj< Map<String, List<TbSysProg>> > result = this.initDefaultJsonResult();
		try {			
			Map<String, List<TbSysProg>> searchDataMap = this.systemMenuLogicService.findForMenuSettingsEnableAndAll(oid);
			result.setValue( searchDataMap );
			result.setSuccess( YES );
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} catch (Exception e) {
			this.exceptionResult(result, e);
		}	
		return result;
	}	
	
}
