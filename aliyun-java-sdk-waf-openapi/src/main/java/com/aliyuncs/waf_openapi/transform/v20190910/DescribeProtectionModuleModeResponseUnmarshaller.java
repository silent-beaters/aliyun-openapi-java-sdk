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

package com.aliyuncs.waf_openapi.transform.v20190910;

import com.aliyuncs.waf_openapi.model.v20190910.DescribeProtectionModuleModeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProtectionModuleModeResponseUnmarshaller {

	public static DescribeProtectionModuleModeResponse unmarshall(DescribeProtectionModuleModeResponse describeProtectionModuleModeResponse, UnmarshallerContext _ctx) {
		
		describeProtectionModuleModeResponse.setRequestId(_ctx.stringValue("DescribeProtectionModuleModeResponse.RequestId"));
		describeProtectionModuleModeResponse.setLearnStatus(_ctx.integerValue("DescribeProtectionModuleModeResponse.LearnStatus"));
		describeProtectionModuleModeResponse.setMode(_ctx.integerValue("DescribeProtectionModuleModeResponse.Mode"));
	 
	 	return describeProtectionModuleModeResponse;
	}
}