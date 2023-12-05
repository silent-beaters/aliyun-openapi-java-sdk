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

package com.aliyuncs.alb.transform.v20200616;

import com.aliyuncs.alb.model.v20200616.StartShiftLoadBalancerZonesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartShiftLoadBalancerZonesResponseUnmarshaller {

	public static StartShiftLoadBalancerZonesResponse unmarshall(StartShiftLoadBalancerZonesResponse startShiftLoadBalancerZonesResponse, UnmarshallerContext _ctx) {
		
		startShiftLoadBalancerZonesResponse.setRequestId(_ctx.stringValue("StartShiftLoadBalancerZonesResponse.RequestId"));
	 
	 	return startShiftLoadBalancerZonesResponse;
	}
}