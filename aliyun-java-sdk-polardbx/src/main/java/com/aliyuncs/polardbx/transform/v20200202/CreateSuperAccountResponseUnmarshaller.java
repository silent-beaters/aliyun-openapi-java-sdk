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

package com.aliyuncs.polardbx.transform.v20200202;

import com.aliyuncs.polardbx.model.v20200202.CreateSuperAccountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSuperAccountResponseUnmarshaller {

	public static CreateSuperAccountResponse unmarshall(CreateSuperAccountResponse createSuperAccountResponse, UnmarshallerContext _ctx) {
		
		createSuperAccountResponse.setRequestId(_ctx.stringValue("CreateSuperAccountResponse.RequestId"));
		createSuperAccountResponse.setMessage(_ctx.stringValue("CreateSuperAccountResponse.Message"));
		createSuperAccountResponse.setSuccess(_ctx.booleanValue("CreateSuperAccountResponse.Success"));
	 
	 	return createSuperAccountResponse;
	}
}