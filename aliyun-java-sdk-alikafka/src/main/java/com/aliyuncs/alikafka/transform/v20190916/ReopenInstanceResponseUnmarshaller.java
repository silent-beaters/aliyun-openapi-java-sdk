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

package com.aliyuncs.alikafka.transform.v20190916;

import com.aliyuncs.alikafka.model.v20190916.ReopenInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReopenInstanceResponseUnmarshaller {

	public static ReopenInstanceResponse unmarshall(ReopenInstanceResponse reopenInstanceResponse, UnmarshallerContext _ctx) {
		
		reopenInstanceResponse.setRequestId(_ctx.stringValue("ReopenInstanceResponse.RequestId"));
		reopenInstanceResponse.setCode(_ctx.integerValue("ReopenInstanceResponse.Code"));
		reopenInstanceResponse.setSuccess(_ctx.booleanValue("ReopenInstanceResponse.Success"));
		reopenInstanceResponse.setMessage(_ctx.stringValue("ReopenInstanceResponse.Message"));
	 
	 	return reopenInstanceResponse;
	}
}