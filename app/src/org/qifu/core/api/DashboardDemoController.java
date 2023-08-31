package org.qifu.core.api;

import org.qifu.core.util.CoreApiSupport;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "DASHBOARD_DEMO", description = "index page data from admin.")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/DashboardDemo")
public class DashboardDemoController extends CoreApiSupport {
	private static final long serialVersionUID = -5269105329111725657L;
	
	
	
}
