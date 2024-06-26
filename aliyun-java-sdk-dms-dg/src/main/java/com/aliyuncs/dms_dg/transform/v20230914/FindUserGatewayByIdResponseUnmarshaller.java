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

import com.aliyuncs.dms_dg.model.v20230914.FindUserGatewayByIdResponse;
import com.aliyuncs.dms_dg.model.v20230914.FindUserGatewayByIdResponse.Gateway;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindUserGatewayByIdResponseUnmarshaller {

	public static FindUserGatewayByIdResponse unmarshall(FindUserGatewayByIdResponse findUserGatewayByIdResponse, UnmarshallerContext _ctx) {
		
		findUserGatewayByIdResponse.setRequestId(_ctx.stringValue("FindUserGatewayByIdResponse.RequestId"));
		findUserGatewayByIdResponse.setCode(_ctx.stringValue("FindUserGatewayByIdResponse.Code"));
		findUserGatewayByIdResponse.setErrorMsg(_ctx.stringValue("FindUserGatewayByIdResponse.ErrorMsg"));
		findUserGatewayByIdResponse.setSuccess(_ctx.booleanValue("FindUserGatewayByIdResponse.Success"));

		Gateway gateway = new Gateway();
		gateway.setGatewayDesc(_ctx.stringValue("FindUserGatewayByIdResponse.Gateway.GatewayDesc"));
		gateway.setGatewayName(_ctx.stringValue("FindUserGatewayByIdResponse.Gateway.GatewayName"));
		gateway.setRegionId(_ctx.stringValue("FindUserGatewayByIdResponse.Gateway.RegionId"));
		gateway.setGatewayId(_ctx.stringValue("FindUserGatewayByIdResponse.Gateway.GatewayId"));
		gateway.setStatus(_ctx.stringValue("FindUserGatewayByIdResponse.Gateway.Status"));
		gateway.setUserId(_ctx.stringValue("FindUserGatewayByIdResponse.Gateway.UserId"));
		gateway.setCreatorId(_ctx.stringValue("FindUserGatewayByIdResponse.Gateway.CreatorId"));
		gateway.setDgVersion(_ctx.stringValue("FindUserGatewayByIdResponse.Gateway.DgVersion"));
		gateway.setExceptionMsg(_ctx.stringValue("FindUserGatewayByIdResponse.Gateway.ExceptionMsg"));
		gateway.setNumOfExceptionInstance(_ctx.integerValue("FindUserGatewayByIdResponse.Gateway.NumOfExceptionInstance"));
		gateway.setNumOfRunningInstance(_ctx.integerValue("FindUserGatewayByIdResponse.Gateway.NumOfRunningInstance"));
		findUserGatewayByIdResponse.setGateway(gateway);
	 
	 	return findUserGatewayByIdResponse;
	}
}