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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.GetEmptyNumberNoMoreCallsInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEmptyNumberNoMoreCallsInfoResponseUnmarshaller {

	public static GetEmptyNumberNoMoreCallsInfoResponse unmarshall(GetEmptyNumberNoMoreCallsInfoResponse getEmptyNumberNoMoreCallsInfoResponse, UnmarshallerContext _ctx) {
		
		getEmptyNumberNoMoreCallsInfoResponse.setRequestId(_ctx.stringValue("GetEmptyNumberNoMoreCallsInfoResponse.RequestId"));
		getEmptyNumberNoMoreCallsInfoResponse.setHttpStatusCode(_ctx.integerValue("GetEmptyNumberNoMoreCallsInfoResponse.HttpStatusCode"));
		getEmptyNumberNoMoreCallsInfoResponse.setEmptyNumberNoMoreCalls(_ctx.booleanValue("GetEmptyNumberNoMoreCallsInfoResponse.EmptyNumberNoMoreCalls"));
		getEmptyNumberNoMoreCallsInfoResponse.setSuccess(_ctx.booleanValue("GetEmptyNumberNoMoreCallsInfoResponse.Success"));
		getEmptyNumberNoMoreCallsInfoResponse.setCode(_ctx.stringValue("GetEmptyNumberNoMoreCallsInfoResponse.Code"));
		getEmptyNumberNoMoreCallsInfoResponse.setMessage(_ctx.stringValue("GetEmptyNumberNoMoreCallsInfoResponse.Message"));
	 
	 	return getEmptyNumberNoMoreCallsInfoResponse;
	}
}