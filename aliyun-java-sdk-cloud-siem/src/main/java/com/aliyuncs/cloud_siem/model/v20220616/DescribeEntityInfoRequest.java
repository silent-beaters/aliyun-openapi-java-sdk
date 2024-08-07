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

package com.aliyuncs.cloud_siem.model.v20220616;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeEntityInfoRequest extends RpcAcsRequest<DescribeEntityInfoResponse> {
	   

	private String entityIdentity;

	private Long roleFor;

	private Long entityId;

	private Integer roleType;

	private String sophonTaskId;

	private String incidentUuid;
	public DescribeEntityInfoRequest() {
		super("cloud-siem", "2022-06-16", "DescribeEntityInfo", "cloud-siem");
		setMethod(MethodType.POST);
	}

	public String getEntityIdentity() {
		return this.entityIdentity;
	}

	public void setEntityIdentity(String entityIdentity) {
		this.entityIdentity = entityIdentity;
		if(entityIdentity != null){
			putBodyParameter("EntityIdentity", entityIdentity);
		}
	}

	public Long getRoleFor() {
		return this.roleFor;
	}

	public void setRoleFor(Long roleFor) {
		this.roleFor = roleFor;
		if(roleFor != null){
			putBodyParameter("RoleFor", roleFor.toString());
		}
	}

	public Long getEntityId() {
		return this.entityId;
	}

	public void setEntityId(Long entityId) {
		this.entityId = entityId;
		if(entityId != null){
			putBodyParameter("EntityId", entityId.toString());
		}
	}

	public Integer getRoleType() {
		return this.roleType;
	}

	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
		if(roleType != null){
			putBodyParameter("RoleType", roleType.toString());
		}
	}

	public String getSophonTaskId() {
		return this.sophonTaskId;
	}

	public void setSophonTaskId(String sophonTaskId) {
		this.sophonTaskId = sophonTaskId;
		if(sophonTaskId != null){
			putBodyParameter("SophonTaskId", sophonTaskId);
		}
	}

	public String getIncidentUuid() {
		return this.incidentUuid;
	}

	public void setIncidentUuid(String incidentUuid) {
		this.incidentUuid = incidentUuid;
		if(incidentUuid != null){
			putBodyParameter("IncidentUuid", incidentUuid);
		}
	}

	@Override
	public Class<DescribeEntityInfoResponse> getResponseClass() {
		return DescribeEntityInfoResponse.class;
	}

}
