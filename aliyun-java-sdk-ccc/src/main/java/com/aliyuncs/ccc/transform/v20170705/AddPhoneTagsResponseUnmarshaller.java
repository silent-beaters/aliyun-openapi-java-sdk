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

import com.aliyuncs.ccc.model.v20170705.AddPhoneTagsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddPhoneTagsResponseUnmarshaller {

	public static AddPhoneTagsResponse unmarshall(AddPhoneTagsResponse addPhoneTagsResponse, UnmarshallerContext _ctx) {
		
		addPhoneTagsResponse.setRequestId(_ctx.stringValue("AddPhoneTagsResponse.RequestId"));
		addPhoneTagsResponse.setHttpStatusCode(_ctx.integerValue("AddPhoneTagsResponse.HttpStatusCode"));
		addPhoneTagsResponse.setCode(_ctx.stringValue("AddPhoneTagsResponse.Code"));
		addPhoneTagsResponse.setMessage(_ctx.stringValue("AddPhoneTagsResponse.Message"));
		addPhoneTagsResponse.setSuccess(_ctx.booleanValue("AddPhoneTagsResponse.Success"));
	 
	 	return addPhoneTagsResponse;
	}
}