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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.ReinitInstancesResponse;
import com.aliyuncs.ens.model.v20171110.ReinitInstancesResponse.Responses;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReinitInstancesResponseUnmarshaller {

	public static ReinitInstancesResponse unmarshall(ReinitInstancesResponse reinitInstancesResponse, UnmarshallerContext _ctx) {
		
		reinitInstancesResponse.setRequestId(_ctx.stringValue("ReinitInstancesResponse.RequestId"));

		List<Responses> instanceResponses = new ArrayList<Responses>();
		for (int i = 0; i < _ctx.lengthValue("ReinitInstancesResponse.InstanceResponses.Length"); i++) {
			Responses responses = new Responses();
			responses.setCode(_ctx.longValue("ReinitInstancesResponse.InstanceResponses["+ i +"].Code"));
			responses.setMessage(_ctx.stringValue("ReinitInstancesResponse.InstanceResponses["+ i +"].Message"));
			responses.setInstanceId(_ctx.stringValue("ReinitInstancesResponse.InstanceResponses["+ i +"].InstanceId"));

			instanceResponses.add(responses);
		}
		reinitInstancesResponse.setInstanceResponses(instanceResponses);
	 
	 	return reinitInstancesResponse;
	}
}