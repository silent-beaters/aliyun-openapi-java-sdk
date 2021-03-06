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

import com.aliyuncs.ecsops.model.v20160401.OpsHouyiQueryWorkflowActivityListResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsHouyiQueryWorkflowActivityListResponse.ActivityInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsHouyiQueryWorkflowActivityListResponseUnmarshaller {

	public static OpsHouyiQueryWorkflowActivityListResponse unmarshall(OpsHouyiQueryWorkflowActivityListResponse opsHouyiQueryWorkflowActivityListResponse, UnmarshallerContext _ctx) {
		
		opsHouyiQueryWorkflowActivityListResponse.setTotalCount(_ctx.integerValue("OpsHouyiQueryWorkflowActivityListResponse.TotalCount"));

		List<ActivityInstance> activityInstances = new ArrayList<ActivityInstance>();
		for (int i = 0; i < _ctx.lengthValue("OpsHouyiQueryWorkflowActivityListResponse.ActivityInstances.Length"); i++) {
			ActivityInstance activityInstance = new ActivityInstance();
			activityInstance.setActivityId(_ctx.longValue("OpsHouyiQueryWorkflowActivityListResponse.ActivityInstances["+ i +"].ActivityId"));
			activityInstance.setWorkflowId(_ctx.stringValue("OpsHouyiQueryWorkflowActivityListResponse.ActivityInstances["+ i +"].WorkflowId"));
			activityInstance.setActivityName(_ctx.stringValue("OpsHouyiQueryWorkflowActivityListResponse.ActivityInstances["+ i +"].ActivityName"));
			activityInstance.setBizMethod(_ctx.stringValue("OpsHouyiQueryWorkflowActivityListResponse.ActivityInstances["+ i +"].Method"));
			activityInstance.setState(_ctx.stringValue("OpsHouyiQueryWorkflowActivityListResponse.ActivityInstances["+ i +"].State"));
			activityInstance.setStartTime(_ctx.longValue("OpsHouyiQueryWorkflowActivityListResponse.ActivityInstances["+ i +"].StartTime"));
			activityInstance.setEndTime(_ctx.longValue("OpsHouyiQueryWorkflowActivityListResponse.ActivityInstances["+ i +"].EndTime"));
			activityInstance.setDuration(_ctx.longValue("OpsHouyiQueryWorkflowActivityListResponse.ActivityInstances["+ i +"].Duration"));
			activityInstance.setCreateTime(_ctx.longValue("OpsHouyiQueryWorkflowActivityListResponse.ActivityInstances["+ i +"].CreateTime"));
			activityInstance.setInput(_ctx.stringValue("OpsHouyiQueryWorkflowActivityListResponse.ActivityInstances["+ i +"].Input"));
			activityInstance.setOutput(_ctx.stringValue("OpsHouyiQueryWorkflowActivityListResponse.ActivityInstances["+ i +"].Output"));
			activityInstance.setError(_ctx.stringValue("OpsHouyiQueryWorkflowActivityListResponse.ActivityInstances["+ i +"].Error"));
			activityInstance.setWorkerNode(_ctx.stringValue("OpsHouyiQueryWorkflowActivityListResponse.ActivityInstances["+ i +"].WorkerNode"));

			activityInstances.add(activityInstance);
		}
		opsHouyiQueryWorkflowActivityListResponse.setActivityInstances(activityInstances);
	 
	 	return opsHouyiQueryWorkflowActivityListResponse;
	}
}