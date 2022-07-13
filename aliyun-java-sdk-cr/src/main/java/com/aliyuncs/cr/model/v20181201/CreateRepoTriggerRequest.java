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

package com.aliyuncs.cr.model.v20181201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateRepoTriggerRequest extends RpcAcsRequest<CreateRepoTriggerResponse> {
	   

	private String repoId;

	private String triggerTag;

	private String triggerType;

	private String triggerUrl;

	private String instanceId;

	private String triggerName;
	public CreateRepoTriggerRequest() {
		super("cr", "2018-12-01", "CreateRepoTrigger", "acr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRepoId() {
		return this.repoId;
	}

	public void setRepoId(String repoId) {
		this.repoId = repoId;
		if(repoId != null){
			putQueryParameter("RepoId", repoId);
		}
	}

	public String getTriggerTag() {
		return this.triggerTag;
	}

	public void setTriggerTag(String triggerTag) {
		this.triggerTag = triggerTag;
		if(triggerTag != null){
			putQueryParameter("TriggerTag", triggerTag);
		}
	}

	public String getTriggerType() {
		return this.triggerType;
	}

	public void setTriggerType(String triggerType) {
		this.triggerType = triggerType;
		if(triggerType != null){
			putQueryParameter("TriggerType", triggerType);
		}
	}

	public String getTriggerUrl() {
		return this.triggerUrl;
	}

	public void setTriggerUrl(String triggerUrl) {
		this.triggerUrl = triggerUrl;
		if(triggerUrl != null){
			putQueryParameter("TriggerUrl", triggerUrl);
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

	public String getTriggerName() {
		return this.triggerName;
	}

	public void setTriggerName(String triggerName) {
		this.triggerName = triggerName;
		if(triggerName != null){
			putQueryParameter("TriggerName", triggerName);
		}
	}

	@Override
	public Class<CreateRepoTriggerResponse> getResponseClass() {
		return CreateRepoTriggerResponse.class;
	}

}
