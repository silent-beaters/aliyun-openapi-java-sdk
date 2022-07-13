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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteHybridMonitorTaskRequest extends RpcAcsRequest<DeleteHybridMonitorTaskResponse> {
	   

	private String targetUserId;

	private String namespace;

	private String taskId;
	public DeleteHybridMonitorTaskRequest() {
		super("Cms", "2019-01-01", "DeleteHybridMonitorTask", "cms");
		setMethod(MethodType.POST);
	}

	public String getTargetUserId() {
		return this.targetUserId;
	}

	public void setTargetUserId(String targetUserId) {
		this.targetUserId = targetUserId;
		if(targetUserId != null){
			putQueryParameter("TargetUserId", targetUserId);
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
		}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("TaskId", taskId);
		}
	}

	@Override
	public Class<DeleteHybridMonitorTaskResponse> getResponseClass() {
		return DeleteHybridMonitorTaskResponse.class;
	}

}
