package org.qifu.core.api;

import org.qifu.core.util.CoreApiSupport;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/menu")
public class BaseHelperApiController extends CoreApiSupport {
	private static final long serialVersionUID = -769226894308818831L;
	
	

}
