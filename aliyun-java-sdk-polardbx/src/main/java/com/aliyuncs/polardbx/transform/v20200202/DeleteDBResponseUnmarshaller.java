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

package com.aliyuncs.polardbx.transform.v20200202;

import com.aliyuncs.polardbx.model.v20200202.DeleteDBResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDBResponseUnmarshaller {

	public static DeleteDBResponse unmarshall(DeleteDBResponse deleteDBResponse, UnmarshallerContext _ctx) {
		
		deleteDBResponse.setRequestId(_ctx.stringValue("DeleteDBResponse.RequestId"));
		deleteDBResponse.setMessage(_ctx.stringValue("DeleteDBResponse.Message"));
		deleteDBResponse.setSuccess(_ctx.booleanValue("DeleteDBResponse.Success"));
	 
	 	return deleteDBResponse;
	}
}