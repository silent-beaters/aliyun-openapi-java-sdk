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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.StartBack2BackCallResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartBack2BackCallResponseUnmarshaller {

	public static StartBack2BackCallResponse unmarshall(StartBack2BackCallResponse startBack2BackCallResponse, UnmarshallerContext _ctx) {
		
		startBack2BackCallResponse.setRequestId(_ctx.stringValue("StartBack2BackCallResponse.RequestId"));
		startBack2BackCallResponse.setHttpStatusCode(_ctx.integerValue("StartBack2BackCallResponse.HttpStatusCode"));
		startBack2BackCallResponse.setSuccess(_ctx.booleanValue("StartBack2BackCallResponse.Success"));
		startBack2BackCallResponse.setStatusCode(_ctx.stringValue("StartBack2BackCallResponse.StatusCode"));
		startBack2BackCallResponse.setCode(_ctx.stringValue("StartBack2BackCallResponse.Code"));
		startBack2BackCallResponse.setMessage(_ctx.stringValue("StartBack2BackCallResponse.Message"));
		startBack2BackCallResponse.setTimeStamp(_ctx.stringValue("StartBack2BackCallResponse.TimeStamp"));
		startBack2BackCallResponse.setTaskId(_ctx.stringValue("StartBack2BackCallResponse.TaskId"));
		startBack2BackCallResponse.setStatusDesc(_ctx.stringValue("StartBack2BackCallResponse.StatusDesc"));
	 
	 	return startBack2BackCallResponse;
	}
}