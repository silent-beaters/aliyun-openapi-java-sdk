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

import com.aliyuncs.ccc.model.v20170705.GetTURNCredentialsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTURNCredentialsResponseUnmarshaller {

	public static GetTURNCredentialsResponse unmarshall(GetTURNCredentialsResponse getTURNCredentialsResponse, UnmarshallerContext _ctx) {
		
		getTURNCredentialsResponse.setRequestId(_ctx.stringValue("GetTURNCredentialsResponse.RequestId"));
		getTURNCredentialsResponse.setHttpStatusCode(_ctx.integerValue("GetTURNCredentialsResponse.HttpStatusCode"));
		getTURNCredentialsResponse.setPassword(_ctx.stringValue("GetTURNCredentialsResponse.Password"));
		getTURNCredentialsResponse.setSuccess(_ctx.booleanValue("GetTURNCredentialsResponse.Success"));
		getTURNCredentialsResponse.setCode(_ctx.stringValue("GetTURNCredentialsResponse.Code"));
		getTURNCredentialsResponse.setMessage(_ctx.stringValue("GetTURNCredentialsResponse.Message"));
		getTURNCredentialsResponse.setUsername(_ctx.stringValue("GetTURNCredentialsResponse.Username"));
	 
	 	return getTURNCredentialsResponse;
	}
}