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

package com.aliyuncs.oceanbasepro.model.v20190901;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.oceanbasepro.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyTenantUserRolesRequest extends RpcAcsRequest<ModifyTenantUserRolesResponse> {
	   

	private String userType;

	private String userRole;

	private String instanceId;

	private String modifyType;

	private String globalPermissions;

	private String tenantId;

	private String userName;
	public ModifyTenantUserRolesRequest() {
		super("OceanBasePro", "2019-09-01", "ModifyTenantUserRoles", "oceanbase");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
		if(userType != null){
			putBodyParameter("UserType", userType);
		}
	}

	public String getUserRole() {
		return this.userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
		if(userRole != null){
			putBodyParameter("UserRole", userRole);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getModifyType() {
		return this.modifyType;
	}

	public void setModifyType(String modifyType) {
		this.modifyType = modifyType;
		if(modifyType != null){
			putBodyParameter("ModifyType", modifyType);
		}
	}

	public String getGlobalPermissions() {
		return this.globalPermissions;
	}

	public void setGlobalPermissions(String globalPermissions) {
		this.globalPermissions = globalPermissions;
		if(globalPermissions != null){
			putBodyParameter("GlobalPermissions", globalPermissions);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putBodyParameter("UserName", userName);
		}
	}

	@Override
	public Class<ModifyTenantUserRolesResponse> getResponseClass() {
		return ModifyTenantUserRolesResponse.class;
	}

}
