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

import com.aliyuncs.ccc.model.v20170705.CreateVoiceAppraiseResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateVoiceAppraiseResponseUnmarshaller {

	public static CreateVoiceAppraiseResponse unmarshall(CreateVoiceAppraiseResponse createVoiceAppraiseResponse, UnmarshallerContext _ctx) {
		
		createVoiceAppraiseResponse.setRequestId(_ctx.stringValue("CreateVoiceAppraiseResponse.RequestId"));
		createVoiceAppraiseResponse.setHttpStatusCode(_ctx.integerValue("CreateVoiceAppraiseResponse.HttpStatusCode"));
		createVoiceAppraiseResponse.setCode(_ctx.stringValue("CreateVoiceAppraiseResponse.Code"));
		createVoiceAppraiseResponse.setMessage(_ctx.stringValue("CreateVoiceAppraiseResponse.Message"));
		createVoiceAppraiseResponse.setSuccess(_ctx.booleanValue("CreateVoiceAppraiseResponse.Success"));
	 
	 	return createVoiceAppraiseResponse;
	}
}