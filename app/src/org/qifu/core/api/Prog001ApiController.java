package org.qifu.core.api;

import java.util.List;

import org.qifu.base.exception.ControllerException;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.QueryResult;
import org.qifu.base.model.SearchBody;
import org.qifu.core.entity.TbSys;
import org.qifu.core.service.ISysService;
import org.qifu.core.util.CoreApiSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(tags = {"PROG001D"}, value = "Application site.")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/prog001")
public class Prog001ApiController extends CoreApiSupport {
	private static final long serialVersionUID = -5896010855369568172L;
	
	@Autowired
	ISysService<TbSys, String> sysService;
	
	@ApiOperation(
			value="PROG001 - findPage", 
			notes="查核TB_SYS資料"
	)
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "field.sysId", value = "系統Id", required = false, dataType = "String"),
    	@ApiImplicitParam(name = "field.name", value = "名稱", required = false, dataType = "String"),
    	@ApiImplicitParam(name = "field.createDate", value = "產生日期", required = false, dataType = "String"),
    	@ApiImplicitParam(name = "pageOf.select", value = "換頁代碼-頁", required = true),
    	@ApiImplicitParam(name = "pageOf.showRow", value = "換頁代碼-row", required = true)
    })		
	@ResponseBody
	@RequestMapping(
			value = "/findPage", 
			consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_PROBLEM_JSON_VALUE}, 
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_PROBLEM_JSON_VALUE}, 
			method = {RequestMethod.POST}
	)	
	public ResponseEntity<QueryResult<List<TbSys>>> findPage(@RequestBody SearchBody searchBody) {
		QueryResult<List<TbSys>> result = this.initResult();
		try {
			QueryResult<List<TbSys>> queryResult = this.sysService.findPage(
					this.queryParameter(searchBody).fullEquals("sysId").fullEquals("name").value(), 
					searchBody.getPageOf().orderBy("SYS_ID").sortTypeAsc());
			this.fillEventResult2ResponseResultForPage(queryResult, result, searchBody.getPageOf());
		} catch (ServiceException | ControllerException e) {
			this.noSuccessResult(result, e);
		} catch (Exception e) {
			this.noSuccessResult(result, e);
		}
		return ResponseEntity.ok().body(result);
	}
	
}
