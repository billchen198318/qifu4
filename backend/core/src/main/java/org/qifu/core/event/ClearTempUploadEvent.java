/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
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
package org.qifu.core.event;

import java.util.Timer;
import java.util.TimerTask;

import org.qifu.core.util.UploadSupportUtils;
import org.qifu.core.util.UserUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ClearTempUploadEvent {
	protected static Logger logger = LoggerFactory.getLogger(ClearTempUploadEvent.class);
	
	@EventListener(ApplicationStartedEvent.class)
	public void afterStartup() {	
		new Timer().schedule(
				new TimerTask() {
					@Override
					public void run() {
						logger.warn("Clear upload type is TMP data.");
						UserUtils.setUserInfoForUserLocalUtilsBackgroundMode();
						try {
							UploadSupportUtils.cleanTempUpload();
						} catch (Exception e) {
							e.printStackTrace();
						}
						UserUtils.removeForUserLocalUtils();
						logger.info("fine.");
			        }
				}, 30000
		);		
	}
	
}
