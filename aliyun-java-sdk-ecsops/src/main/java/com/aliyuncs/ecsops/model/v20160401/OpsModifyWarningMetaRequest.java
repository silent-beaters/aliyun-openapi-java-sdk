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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsModifyWarningMetaRequest extends RpcAcsRequest<OpsModifyWarningMetaResponse> {
	   

	private String diagnoseCategory;

	private String phoneNumber;

	private String ownerTeam;

	private String owner;

	private String app;

	private String warningMetaId;

	private String level;

	private String ownerName;

	private String auditParamStr;
	public OpsModifyWarningMetaRequest() {
		super("Ecsops", "2016-04-01", "OpsModifyWarningMeta", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDiagnoseCategory() {
		return this.diagnoseCategory;
	}

	public void setDiagnoseCategory(String diagnoseCategory) {
		this.diagnoseCategory = diagnoseCategory;
		if(diagnoseCategory != null){
			putQueryParameter("DiagnoseCategory", diagnoseCategory);
		}
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		if(phoneNumber != null){
			putQueryParameter("PhoneNumber", phoneNumber);
		}
	}

	public String getOwnerTeam() {
		return this.ownerTeam;
	}

	public void setOwnerTeam(String ownerTeam) {
		this.ownerTeam = ownerTeam;
		if(ownerTeam != null){
			putQueryParameter("OwnerTeam", ownerTeam);
		}
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
		if(owner != null){
			putQueryParameter("Owner", owner);
		}
	}

	public String getApp() {
		return this.app;
	}

	public void setApp(String app) {
		this.app = app;
		if(app != null){
			putQueryParameter("App", app);
		}
	}

	public String getWarningMetaId() {
		return this.warningMetaId;
	}

	public void setWarningMetaId(String warningMetaId) {
		this.warningMetaId = warningMetaId;
		if(warningMetaId != null){
			putQueryParameter("WarningMetaId", warningMetaId);
		}
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
		if(level != null){
			putQueryParameter("Level", level);
		}
	}

	public String getOwnerName() {
		return this.ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
		if(ownerName != null){
			putQueryParameter("OwnerName", ownerName);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsModifyWarningMetaResponse> getResponseClass() {
		return OpsModifyWarningMetaResponse.class;
	}

}
