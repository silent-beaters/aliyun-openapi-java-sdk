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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeChangePlanNcStatusResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeChangePlanNcStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeChangePlanNcStatusResponseUnmarshaller {

	public static OpsDescribeChangePlanNcStatusResponse unmarshall(OpsDescribeChangePlanNcStatusResponse opsDescribeChangePlanNcStatusResponse, UnmarshallerContext _ctx) {
		
		opsDescribeChangePlanNcStatusResponse.setRequestId(_ctx.stringValue("OpsDescribeChangePlanNcStatusResponse.RequestId"));

		Data data = new Data();

		List<String> resources = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeChangePlanNcStatusResponse.Data.Resources.Length"); i++) {
			resources.add(_ctx.stringValue("OpsDescribeChangePlanNcStatusResponse.Data.Resources["+ i +"]"));
		}
		data.setResources(resources);
		opsDescribeChangePlanNcStatusResponse.setData(data);
	 
	 	return opsDescribeChangePlanNcStatusResponse;
	}
}