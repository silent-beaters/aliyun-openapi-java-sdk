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

package com.aliyuncs.das.transform.v20200116;

import com.aliyuncs.das.model.v20200116.KillInstanceAllSessionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class KillInstanceAllSessionResponseUnmarshaller {

	public static KillInstanceAllSessionResponse unmarshall(KillInstanceAllSessionResponse killInstanceAllSessionResponse, UnmarshallerContext _ctx) {
		
		killInstanceAllSessionResponse.setRequestId(_ctx.stringValue("KillInstanceAllSessionResponse.RequestId"));
		killInstanceAllSessionResponse.setCode(_ctx.stringValue("KillInstanceAllSessionResponse.Code"));
		killInstanceAllSessionResponse.setMessage(_ctx.stringValue("KillInstanceAllSessionResponse.Message"));
		killInstanceAllSessionResponse.setData(_ctx.stringValue("KillInstanceAllSessionResponse.Data"));
		killInstanceAllSessionResponse.setSuccess(_ctx.stringValue("KillInstanceAllSessionResponse.Success"));
	 
	 	return killInstanceAllSessionResponse;
	}
}