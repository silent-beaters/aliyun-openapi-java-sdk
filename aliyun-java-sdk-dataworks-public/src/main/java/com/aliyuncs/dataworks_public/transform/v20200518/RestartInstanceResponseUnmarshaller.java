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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.RestartInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RestartInstanceResponseUnmarshaller {

	public static RestartInstanceResponse unmarshall(RestartInstanceResponse restartInstanceResponse, UnmarshallerContext _ctx) {
		
		restartInstanceResponse.setRequestId(_ctx.stringValue("RestartInstanceResponse.RequestId"));
		restartInstanceResponse.setHttpStatusCode(_ctx.integerValue("RestartInstanceResponse.HttpStatusCode"));
		restartInstanceResponse.setData(_ctx.booleanValue("RestartInstanceResponse.Data"));
		restartInstanceResponse.setErrorMessage(_ctx.stringValue("RestartInstanceResponse.ErrorMessage"));
		restartInstanceResponse.setErrorCode(_ctx.stringValue("RestartInstanceResponse.ErrorCode"));
		restartInstanceResponse.setSuccess(_ctx.booleanValue("RestartInstanceResponse.Success"));
	 
	 	return restartInstanceResponse;
	}
}