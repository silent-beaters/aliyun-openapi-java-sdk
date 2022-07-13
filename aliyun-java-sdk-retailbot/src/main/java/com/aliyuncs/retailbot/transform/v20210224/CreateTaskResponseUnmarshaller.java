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

package com.aliyuncs.retailbot.transform.v20210224;

import com.aliyuncs.retailbot.model.v20210224.CreateTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTaskResponseUnmarshaller {

	public static CreateTaskResponse unmarshall(CreateTaskResponse createTaskResponse, UnmarshallerContext _ctx) {
		
		createTaskResponse.setRequestId(_ctx.stringValue("CreateTaskResponse.RequestId"));
		createTaskResponse.setSuccess(_ctx.booleanValue("CreateTaskResponse.Success"));
		createTaskResponse.setCode(_ctx.stringValue("CreateTaskResponse.Code"));
		createTaskResponse.setMessage(_ctx.stringValue("CreateTaskResponse.Message"));
		createTaskResponse.setData(_ctx.longValue("CreateTaskResponse.Data"));
	 
	 	return createTaskResponse;
	}
}