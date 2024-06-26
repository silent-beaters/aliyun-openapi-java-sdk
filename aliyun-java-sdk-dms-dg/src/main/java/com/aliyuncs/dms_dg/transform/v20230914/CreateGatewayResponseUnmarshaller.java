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

package com.aliyuncs.dms_dg.transform.v20230914;

import com.aliyuncs.dms_dg.model.v20230914.CreateGatewayResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateGatewayResponseUnmarshaller {

	public static CreateGatewayResponse unmarshall(CreateGatewayResponse createGatewayResponse, UnmarshallerContext _ctx) {
		
		createGatewayResponse.setRequestId(_ctx.stringValue("CreateGatewayResponse.RequestId"));
		createGatewayResponse.setCode(_ctx.stringValue("CreateGatewayResponse.Code"));
		createGatewayResponse.setData(_ctx.stringValue("CreateGatewayResponse.Data"));
		createGatewayResponse.setErrorMsg(_ctx.stringValue("CreateGatewayResponse.ErrorMsg"));
		createGatewayResponse.setSuccess(_ctx.booleanValue("CreateGatewayResponse.Success"));
	 
	 	return createGatewayResponse;
	}
}