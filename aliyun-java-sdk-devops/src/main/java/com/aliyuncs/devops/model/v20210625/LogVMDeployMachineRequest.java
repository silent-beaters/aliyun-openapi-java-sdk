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

package com.aliyuncs.devops.model.v20210625;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class LogVMDeployMachineRequest extends RoaAcsRequest<LogVMDeployMachineResponse> {
	   

	private Long pipelineId;

	private String organizationId;

	private String machineSn;

	private Long deployOrderId;
	public LogVMDeployMachineRequest() {
		super("devops", "2021-06-25", "LogVMDeployMachine");
		setUriPattern("/organization/[organizationId]/pipelines/[pipelineId]/deploy/[deployOrderId]/machine/[machineSn]/log");
		setMethod(MethodType.GET);
	}

	public Long getPipelineId() {
		return this.pipelineId;
	}

	public void setPipelineId(Long pipelineId) {
		this.pipelineId = pipelineId;
		if(pipelineId != null){
			putPathParameter("pipelineId", pipelineId.toString());
		}
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putPathParameter("organizationId", organizationId);
		}
	}

	public String getMachineSn() {
		return this.machineSn;
	}

	public void setMachineSn(String machineSn) {
		this.machineSn = machineSn;
		if(machineSn != null){
			putPathParameter("machineSn", machineSn);
		}
	}

	public Long getDeployOrderId() {
		return this.deployOrderId;
	}

	public void setDeployOrderId(Long deployOrderId) {
		this.deployOrderId = deployOrderId;
		if(deployOrderId != null){
			putPathParameter("deployOrderId", deployOrderId.toString());
		}
	}

	@Override
	public Class<LogVMDeployMachineResponse> getResponseClass() {
		return LogVMDeployMachineResponse.class;
	}

}
