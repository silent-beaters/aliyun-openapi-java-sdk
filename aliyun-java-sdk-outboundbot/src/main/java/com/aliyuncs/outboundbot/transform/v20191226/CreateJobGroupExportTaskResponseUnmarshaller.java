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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.CreateJobGroupExportTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateJobGroupExportTaskResponseUnmarshaller {

	public static CreateJobGroupExportTaskResponse unmarshall(CreateJobGroupExportTaskResponse createJobGroupExportTaskResponse, UnmarshallerContext _ctx) {
		
		createJobGroupExportTaskResponse.setRequestId(_ctx.stringValue("CreateJobGroupExportTaskResponse.RequestId"));
		createJobGroupExportTaskResponse.setHttpStatusCode(_ctx.integerValue("CreateJobGroupExportTaskResponse.HttpStatusCode"));
		createJobGroupExportTaskResponse.setSuccess(_ctx.booleanValue("CreateJobGroupExportTaskResponse.Success"));
		createJobGroupExportTaskResponse.setCode(_ctx.stringValue("CreateJobGroupExportTaskResponse.Code"));
		createJobGroupExportTaskResponse.setMessage(_ctx.stringValue("CreateJobGroupExportTaskResponse.Message"));
		createJobGroupExportTaskResponse.setTaskId(_ctx.stringValue("CreateJobGroupExportTaskResponse.TaskId"));
	 
	 	return createJobGroupExportTaskResponse;
	}
}