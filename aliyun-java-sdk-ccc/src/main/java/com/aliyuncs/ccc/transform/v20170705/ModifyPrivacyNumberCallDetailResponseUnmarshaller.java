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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.ModifyPrivacyNumberCallDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyPrivacyNumberCallDetailResponseUnmarshaller {

	public static ModifyPrivacyNumberCallDetailResponse unmarshall(ModifyPrivacyNumberCallDetailResponse modifyPrivacyNumberCallDetailResponse, UnmarshallerContext _ctx) {
		
		modifyPrivacyNumberCallDetailResponse.setRequestId(_ctx.stringValue("ModifyPrivacyNumberCallDetailResponse.RequestId"));
		modifyPrivacyNumberCallDetailResponse.setHttpStatusCode(_ctx.integerValue("ModifyPrivacyNumberCallDetailResponse.HttpStatusCode"));
		modifyPrivacyNumberCallDetailResponse.setCode(_ctx.stringValue("ModifyPrivacyNumberCallDetailResponse.Code"));
		modifyPrivacyNumberCallDetailResponse.setMessage(_ctx.stringValue("ModifyPrivacyNumberCallDetailResponse.Message"));
		modifyPrivacyNumberCallDetailResponse.setSuccess(_ctx.booleanValue("ModifyPrivacyNumberCallDetailResponse.Success"));
	 
	 	return modifyPrivacyNumberCallDetailResponse;
	}
}