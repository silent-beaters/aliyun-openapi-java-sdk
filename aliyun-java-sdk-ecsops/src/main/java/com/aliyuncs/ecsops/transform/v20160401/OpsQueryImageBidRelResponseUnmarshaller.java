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

package com.aliyuncs.ecsops.transform.v20160401;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryImageBidRelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryImageBidRelResponseUnmarshaller {

	public static OpsQueryImageBidRelResponse unmarshall(OpsQueryImageBidRelResponse opsQueryImageBidRelResponse, UnmarshallerContext _ctx) {
		
		opsQueryImageBidRelResponse.setRequestId(_ctx.stringValue("OpsQueryImageBidRelResponse.RequestId"));
		opsQueryImageBidRelResponse.setImageId(_ctx.stringValue("OpsQueryImageBidRelResponse.ImageId"));
		opsQueryImageBidRelResponse.setRegionId(_ctx.stringValue("OpsQueryImageBidRelResponse.RegionId"));
		opsQueryImageBidRelResponse.setResourceOwnerId(_ctx.longValue("OpsQueryImageBidRelResponse.ResourceOwnerId"));
		opsQueryImageBidRelResponse.setBid2PrivilegeJson(_ctx.stringValue("OpsQueryImageBidRelResponse.Bid2PrivilegeJson"));
	 
	 	return opsQueryImageBidRelResponse;
	}
}