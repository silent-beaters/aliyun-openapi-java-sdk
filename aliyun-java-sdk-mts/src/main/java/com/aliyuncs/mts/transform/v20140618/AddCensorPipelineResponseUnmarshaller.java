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

package com.aliyuncs.mts.transform.v20140618;

import com.aliyuncs.mts.model.v20140618.AddCensorPipelineResponse;
import com.aliyuncs.mts.model.v20140618.AddCensorPipelineResponse.Pipeline;
import com.aliyuncs.mts.model.v20140618.AddCensorPipelineResponse.Pipeline.NotifyConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddCensorPipelineResponseUnmarshaller {

	public static AddCensorPipelineResponse unmarshall(AddCensorPipelineResponse addCensorPipelineResponse, UnmarshallerContext _ctx) {
		
		addCensorPipelineResponse.setRequestId(_ctx.stringValue("AddCensorPipelineResponse.RequestId"));

		Pipeline pipeline = new Pipeline();
		pipeline.setState(_ctx.stringValue("AddCensorPipelineResponse.Pipeline.State"));
		pipeline.setPriority(_ctx.integerValue("AddCensorPipelineResponse.Pipeline.Priority"));
		pipeline.setName(_ctx.stringValue("AddCensorPipelineResponse.Pipeline.Name"));
		pipeline.setId(_ctx.stringValue("AddCensorPipelineResponse.Pipeline.Id"));

		NotifyConfig notifyConfig = new NotifyConfig();
		notifyConfig.setTopic(_ctx.stringValue("AddCensorPipelineResponse.Pipeline.NotifyConfig.Topic"));
		notifyConfig.setQueue(_ctx.stringValue("AddCensorPipelineResponse.Pipeline.NotifyConfig.Queue"));
		pipeline.setNotifyConfig(notifyConfig);
		addCensorPipelineResponse.setPipeline(pipeline);
	 
	 	return addCensorPipelineResponse;
	}
}