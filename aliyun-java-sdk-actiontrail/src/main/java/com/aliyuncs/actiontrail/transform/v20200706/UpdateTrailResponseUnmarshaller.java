/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.actiontrail.transform.v20200706;

import com.aliyuncs.actiontrail.model.v20200706.UpdateTrailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTrailResponseUnmarshaller {

	public static UpdateTrailResponse unmarshall(UpdateTrailResponse updateTrailResponse, UnmarshallerContext _ctx) {
		
		updateTrailResponse.setRequestId(_ctx.stringValue("UpdateTrailResponse.RequestId"));
		updateTrailResponse.setSlsProjectArn(_ctx.stringValue("UpdateTrailResponse.SlsProjectArn"));
		updateTrailResponse.setOssWriteRoleArn(_ctx.stringValue("UpdateTrailResponse.OssWriteRoleArn"));
		updateTrailResponse.setEventRW(_ctx.stringValue("UpdateTrailResponse.EventRW"));
		updateTrailResponse.setHomeRegion(_ctx.stringValue("UpdateTrailResponse.HomeRegion"));
		updateTrailResponse.setOssKeyPrefix(_ctx.stringValue("UpdateTrailResponse.OssKeyPrefix"));
		updateTrailResponse.setOssBucketName(_ctx.stringValue("UpdateTrailResponse.OssBucketName"));
		updateTrailResponse.setSlsWriteRoleArn(_ctx.stringValue("UpdateTrailResponse.SlsWriteRoleArn"));
		updateTrailResponse.setTrailRegion(_ctx.stringValue("UpdateTrailResponse.TrailRegion"));
		updateTrailResponse.setName(_ctx.stringValue("UpdateTrailResponse.Name"));
	 
	 	return updateTrailResponse;
	}
}