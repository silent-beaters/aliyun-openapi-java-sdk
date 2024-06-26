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

package com.aliyuncs.arms.transform.v20190808;

import com.aliyuncs.arms.model.v20190808.DeleteTraceAppResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteTraceAppResponseUnmarshaller {

	public static DeleteTraceAppResponse unmarshall(DeleteTraceAppResponse deleteTraceAppResponse, UnmarshallerContext _ctx) {
		
		deleteTraceAppResponse.setRequestId(_ctx.stringValue("DeleteTraceAppResponse.RequestId"));
		deleteTraceAppResponse.setData(_ctx.stringValue("DeleteTraceAppResponse.Data"));
		deleteTraceAppResponse.setMessage(_ctx.stringValue("DeleteTraceAppResponse.Message"));
		deleteTraceAppResponse.setCode(_ctx.longValue("DeleteTraceAppResponse.Code"));
		deleteTraceAppResponse.setSuccess(_ctx.booleanValue("DeleteTraceAppResponse.Success"));
	 
	 	return deleteTraceAppResponse;
	}
}