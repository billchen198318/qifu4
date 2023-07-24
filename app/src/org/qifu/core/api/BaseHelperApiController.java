package org.qifu.core.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.qifu.base.exception.AuthorityException;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.QueryResult;
import org.qifu.base.model.SortType;
import org.qifu.core.entity.TbSysMenu;
import org.qifu.core.entity.TbSysProg;
import org.qifu.core.model.MenuItemType;
import org.qifu.core.service.ISysMenuService;
import org.qifu.core.service.ISysProgService;
import org.qifu.core.util.CoreApiSupport;
import org.qifu.core.util.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;

@Api(tags = {"MENU"}, value = "選單資料.")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/menu")
public class BaseHelperApiController extends CoreApiSupport {
	private static final long serialVersionUID = -769226894308818831L;
	
	@Autowired
	ISysMenuService<TbSysMenu, String> sysMenuService;
	
	@Autowired
	ISysProgService<TbSysProg, String> sysProgService;
	
	@ApiOperation(value="選單", notes="左邊選單項目", authorizations={ @Authorization(value="Bearer") })
	@PostMapping(value = "/getMemuItem", produces = {MediaType.APPLICATION_JSON_VALUE})
	public QueryResult<List<Map<String, Object>>> getMemuItem() {
		QueryResult<List<Map<String, Object>>> result = this.initResult();
		try {
			if (UserUtils.isAdmin()) {
				result.setValue( this.sysMenuService.getMemuItemListForFrontend("") );
			} else {
				result.setValue( this.sysMenuService.getMemuItemListForFrontend(UserUtils.getCurrentUser().getUserId()) );
			}			
			result.setSuccess( YES );
		} catch (ServiceException | AuthorityException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	@ApiOperation(value="程式清單", notes="程式清單列表", authorizations={ @Authorization(value="Bearer") })
	@PostMapping(value = "/getProgramList", produces = {MediaType.APPLICATION_JSON_VALUE})
	public QueryResult<List<TbSysProg>> getProgramList() {
		QueryResult<List<TbSysProg>> result = this.initResult();
		try {
			Map<String, Object> param = new HashMap<String, Object>();
			param.put("itemType", MenuItemType.ITEM);
			List<TbSysProg> progList = this.sysProgService.selectListByParams(param, "PROG_ID", SortType.ASC).getValue();
			
			/*
			if (UserUtils.isAdmin()) {
				result.setValue( this.sysMenuService.getMemuItemListForFrontend("") );
			} else {
				result.setValue( this.sysMenuService.getMemuItemListForFrontend(UserUtils.getCurrentUser().getUserId()) );
			}			
			*/
			
			result.setSuccess( YES );
		} catch (ServiceException | AuthorityException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}	
	
}
