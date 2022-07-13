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

package com.aliyuncs.swas.model.v20170810;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CheckServiceLinkedRoleForDeletingRequest extends RpcAcsRequest<CheckServiceLinkedRoleForDeletingResponse> {
	   

	private String deletionTaskId;

	private String accountId;

	private String sPIRegionId;

	private String roleArn;

	private String serviceName;
	public CheckServiceLinkedRoleForDeletingRequest() {
		super("SWAS", "2017-08-10", "CheckServiceLinkedRoleForDeleting", "SWAS");
		setMethod(MethodType.POST);
	}

	public String getDeletionTaskId() {
		return this.deletionTaskId;
	}

	public void setDeletionTaskId(String deletionTaskId) {
		this.deletionTaskId = deletionTaskId;
		if(deletionTaskId != null){
			putQueryParameter("DeletionTaskId", deletionTaskId);
		}
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
		if(accountId != null){
			putQueryParameter("AccountId", accountId);
		}
	}

	public String getSPIRegionId() {
		return this.sPIRegionId;
	}

	public void setSPIRegionId(String sPIRegionId) {
		this.sPIRegionId = sPIRegionId;
		if(sPIRegionId != null){
			putQueryParameter("SPIRegionId", sPIRegionId);
		}
	}

	public String getRoleArn() {
		return this.roleArn;
	}

	public void setRoleArn(String roleArn) {
		this.roleArn = roleArn;
		if(roleArn != null){
			putQueryParameter("RoleArn", roleArn);
		}
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
		if(serviceName != null){
			putQueryParameter("ServiceName", serviceName);
		}
	}

	@Override
	public Class<CheckServiceLinkedRoleForDeletingResponse> getResponseClass() {
		return CheckServiceLinkedRoleForDeletingResponse.class;
	}

}
