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

import com.aliyuncs.outboundbot.model.v20191226.DeleteContactWhiteListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteContactWhiteListResponseUnmarshaller {

	public static DeleteContactWhiteListResponse unmarshall(DeleteContactWhiteListResponse deleteContactWhiteListResponse, UnmarshallerContext _ctx) {
		
		deleteContactWhiteListResponse.setRequestId(_ctx.stringValue("DeleteContactWhiteListResponse.RequestId"));
		deleteContactWhiteListResponse.setHttpStatusCode(_ctx.integerValue("DeleteContactWhiteListResponse.HttpStatusCode"));
		deleteContactWhiteListResponse.setAffectedRows(_ctx.integerValue("DeleteContactWhiteListResponse.AffectedRows"));
		deleteContactWhiteListResponse.setSuccess(_ctx.booleanValue("DeleteContactWhiteListResponse.Success"));
		deleteContactWhiteListResponse.setCode(_ctx.stringValue("DeleteContactWhiteListResponse.Code"));
		deleteContactWhiteListResponse.setMessage(_ctx.stringValue("DeleteContactWhiteListResponse.Message"));
	 
	 	return deleteContactWhiteListResponse;
	}
}