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

package com.aliyuncs.ccc.model.v20200701;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AnalyzeConversationRequest extends RpcAcsRequest<AnalyzeConversationResponse> {
	   

	private String fieldListJson;

	private String contactId;

	private String instanceId;

	private String taskListJson;
	public AnalyzeConversationRequest() {
		super("CCC", "2020-07-01", "AnalyzeConversation", "CCC");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFieldListJson() {
		return this.fieldListJson;
	}

	public void setFieldListJson(String fieldListJson) {
		this.fieldListJson = fieldListJson;
		if(fieldListJson != null){
			putQueryParameter("FieldListJson", fieldListJson);
		}
	}

	public String getContactId() {
		return this.contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
		if(contactId != null){
			putQueryParameter("ContactId", contactId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getTaskListJson() {
		return this.taskListJson;
	}

	public void setTaskListJson(String taskListJson) {
		this.taskListJson = taskListJson;
		if(taskListJson != null){
			putQueryParameter("TaskListJson", taskListJson);
		}
	}

	@Override
	public Class<AnalyzeConversationResponse> getResponseClass() {
		return AnalyzeConversationResponse.class;
	}

}
