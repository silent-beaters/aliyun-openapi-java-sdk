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

package com.aliyuncs.vs.transform.v20181212;

import com.aliyuncs.vs.model.v20181212.DescribeDeviceGatewayResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeviceGatewayResponseUnmarshaller {

	public static DescribeDeviceGatewayResponse unmarshall(DescribeDeviceGatewayResponse describeDeviceGatewayResponse, UnmarshallerContext _ctx) {
		
		describeDeviceGatewayResponse.setRequestId(_ctx.stringValue("DescribeDeviceGatewayResponse.RequestId"));
		describeDeviceGatewayResponse.setHost(_ctx.stringValue("DescribeDeviceGatewayResponse.Host"));
		describeDeviceGatewayResponse.setToken(_ctx.stringValue("DescribeDeviceGatewayResponse.Token"));
		describeDeviceGatewayResponse.setPort(_ctx.longValue("DescribeDeviceGatewayResponse.Port"));
		describeDeviceGatewayResponse.setBizProtocol(_ctx.stringValue("DescribeDeviceGatewayResponse.Protocol"));
	 
	 	return describeDeviceGatewayResponse;
	}
}