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

package com.aliyuncs.cccxspaceinner.transform.v20191227;

import com.aliyuncs.cccxspaceinner.model.v20191227.CreateChatDispatchRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateChatDispatchRuleResponseUnmarshaller {

	public static CreateChatDispatchRuleResponse unmarshall(CreateChatDispatchRuleResponse createChatDispatchRuleResponse, UnmarshallerContext _ctx) {
		
		createChatDispatchRuleResponse.setRequestId(_ctx.stringValue("CreateChatDispatchRuleResponse.RequestId"));
		createChatDispatchRuleResponse.setCode(_ctx.stringValue("CreateChatDispatchRuleResponse.Code"));
		createChatDispatchRuleResponse.setSuccess(_ctx.booleanValue("CreateChatDispatchRuleResponse.Success"));
		createChatDispatchRuleResponse.setMessage(_ctx.stringValue("CreateChatDispatchRuleResponse.Message"));
		createChatDispatchRuleResponse.setData(_ctx.stringValue("CreateChatDispatchRuleResponse.Data"));
	 
	 	return createChatDispatchRuleResponse;
	}
}