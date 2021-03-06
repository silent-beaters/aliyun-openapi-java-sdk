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
public class OpsCreateSystemEventMetaRequest extends RpcAcsRequest<OpsCreateSystemEventMetaResponse> {
	   

	private Integer code;

	private String operator;

	private Boolean onlyNotification;

	private Boolean supportSimulate;

	private String level;

	private Boolean reportCms;

	private String openStatus;

	private String resourceType;

	private String workOrderId;

	private String name;

	private String auditParamStr;
	public OpsCreateSystemEventMetaRequest() {
		super("Ecsops", "2016-04-01", "OpsCreateSystemEventMeta", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
		if(code != null){
			putQueryParameter("Code", code.toString());
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public Boolean getOnlyNotification() {
		return this.onlyNotification;
	}

	public void setOnlyNotification(Boolean onlyNotification) {
		this.onlyNotification = onlyNotification;
		if(onlyNotification != null){
			putQueryParameter("OnlyNotification", onlyNotification.toString());
		}
	}

	public Boolean getSupportSimulate() {
		return this.supportSimulate;
	}

	public void setSupportSimulate(Boolean supportSimulate) {
		this.supportSimulate = supportSimulate;
		if(supportSimulate != null){
			putQueryParameter("SupportSimulate", supportSimulate.toString());
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

	public Boolean getReportCms() {
		return this.reportCms;
	}

	public void setReportCms(Boolean reportCms) {
		this.reportCms = reportCms;
		if(reportCms != null){
			putQueryParameter("ReportCms", reportCms.toString());
		}
	}

	public String getOpenStatus() {
		return this.openStatus;
	}

	public void setOpenStatus(String openStatus) {
		this.openStatus = openStatus;
		if(openStatus != null){
			putQueryParameter("OpenStatus", openStatus);
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public String getWorkOrderId() {
		return this.workOrderId;
	}

	public void setWorkOrderId(String workOrderId) {
		this.workOrderId = workOrderId;
		if(workOrderId != null){
			putQueryParameter("WorkOrderId", workOrderId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
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
	public Class<OpsCreateSystemEventMetaResponse> getResponseClass() {
		return OpsCreateSystemEventMetaResponse.class;
	}

}
