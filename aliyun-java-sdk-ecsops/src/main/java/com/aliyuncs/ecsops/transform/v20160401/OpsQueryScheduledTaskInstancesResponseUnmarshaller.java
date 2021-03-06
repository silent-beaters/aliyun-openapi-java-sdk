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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryScheduledTaskInstancesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryScheduledTaskInstancesResponse.ScheduledTaskInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryScheduledTaskInstancesResponseUnmarshaller {

	public static OpsQueryScheduledTaskInstancesResponse unmarshall(OpsQueryScheduledTaskInstancesResponse opsQueryScheduledTaskInstancesResponse, UnmarshallerContext _ctx) {
		
		opsQueryScheduledTaskInstancesResponse.setRequestId(_ctx.stringValue("OpsQueryScheduledTaskInstancesResponse.RequestId"));
		opsQueryScheduledTaskInstancesResponse.setCount(_ctx.integerValue("OpsQueryScheduledTaskInstancesResponse.Count"));

		List<ScheduledTaskInstance> scheduledTaskInstances = new ArrayList<ScheduledTaskInstance>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryScheduledTaskInstancesResponse.ScheduledTaskInstances.Length"); i++) {
			ScheduledTaskInstance scheduledTaskInstance = new ScheduledTaskInstance();
			scheduledTaskInstance.setId(_ctx.longValue("OpsQueryScheduledTaskInstancesResponse.ScheduledTaskInstances["+ i +"].Id"));
			scheduledTaskInstance.setTaskName(_ctx.stringValue("OpsQueryScheduledTaskInstancesResponse.ScheduledTaskInstances["+ i +"].TaskName"));
			scheduledTaskInstance.setBizId(_ctx.stringValue("OpsQueryScheduledTaskInstancesResponse.ScheduledTaskInstances["+ i +"].BizId"));
			scheduledTaskInstance.setAliUid(_ctx.longValue("OpsQueryScheduledTaskInstancesResponse.ScheduledTaskInstances["+ i +"].AliUid"));
			scheduledTaskInstance.setTaskStatus(_ctx.stringValue("OpsQueryScheduledTaskInstancesResponse.ScheduledTaskInstances["+ i +"].TaskStatus"));
			scheduledTaskInstance.setTaskResult(_ctx.stringValue("OpsQueryScheduledTaskInstancesResponse.ScheduledTaskInstances["+ i +"].TaskResult"));
			scheduledTaskInstance.setToken(_ctx.stringValue("OpsQueryScheduledTaskInstancesResponse.ScheduledTaskInstances["+ i +"].Token"));
			scheduledTaskInstance.setRequestParameters(_ctx.stringValue("OpsQueryScheduledTaskInstancesResponse.ScheduledTaskInstances["+ i +"].RequestParameters"));
			scheduledTaskInstance.setExtendedField(_ctx.stringValue("OpsQueryScheduledTaskInstancesResponse.ScheduledTaskInstances["+ i +"].ExtendedField"));
			scheduledTaskInstance.setScheduleFactor(_ctx.stringValue("OpsQueryScheduledTaskInstancesResponse.ScheduledTaskInstances["+ i +"].ScheduleFactor"));
			scheduledTaskInstance.setGmtCreate(_ctx.stringValue("OpsQueryScheduledTaskInstancesResponse.ScheduledTaskInstances["+ i +"].GmtCreate"));
			scheduledTaskInstance.setGmtModified(_ctx.stringValue("OpsQueryScheduledTaskInstancesResponse.ScheduledTaskInstances["+ i +"].GmtModified"));
			scheduledTaskInstance.setGmtBeginProcess(_ctx.stringValue("OpsQueryScheduledTaskInstancesResponse.ScheduledTaskInstances["+ i +"].GmtBeginProcess"));
			scheduledTaskInstance.setExecType(_ctx.stringValue("OpsQueryScheduledTaskInstancesResponse.ScheduledTaskInstances["+ i +"].ExecType"));
			scheduledTaskInstance.setSourceIpNode(_ctx.stringValue("OpsQueryScheduledTaskInstancesResponse.ScheduledTaskInstances["+ i +"].SourceIpNode"));
			scheduledTaskInstance.setExecIpNode(_ctx.stringValue("OpsQueryScheduledTaskInstancesResponse.ScheduledTaskInstances["+ i +"].ExecIpNode"));

			scheduledTaskInstances.add(scheduledTaskInstance);
		}
		opsQueryScheduledTaskInstancesResponse.setScheduledTaskInstances(scheduledTaskInstances);
	 
	 	return opsQueryScheduledTaskInstancesResponse;
	}
}