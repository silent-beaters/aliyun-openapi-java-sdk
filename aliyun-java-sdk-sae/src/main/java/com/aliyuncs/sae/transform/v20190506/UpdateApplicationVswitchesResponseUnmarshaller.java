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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.UpdateApplicationVswitchesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateApplicationVswitchesResponseUnmarshaller {

	public static UpdateApplicationVswitchesResponse unmarshall(UpdateApplicationVswitchesResponse updateApplicationVswitchesResponse, UnmarshallerContext _ctx) {
		
		updateApplicationVswitchesResponse.setRequestId(_ctx.stringValue("UpdateApplicationVswitchesResponse.RequestId"));
		updateApplicationVswitchesResponse.setMessage(_ctx.stringValue("UpdateApplicationVswitchesResponse.Message"));
		updateApplicationVswitchesResponse.setTraceId(_ctx.stringValue("UpdateApplicationVswitchesResponse.TraceId"));
		updateApplicationVswitchesResponse.setErrorCode(_ctx.stringValue("UpdateApplicationVswitchesResponse.ErrorCode"));
		updateApplicationVswitchesResponse.setCode(_ctx.stringValue("UpdateApplicationVswitchesResponse.Code"));
		updateApplicationVswitchesResponse.setSuccess(_ctx.booleanValue("UpdateApplicationVswitchesResponse.Success"));
	 
	 	return updateApplicationVswitchesResponse;
	}
}