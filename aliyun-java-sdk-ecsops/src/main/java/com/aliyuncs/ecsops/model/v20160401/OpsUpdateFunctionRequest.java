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
public class OpsUpdateFunctionRequest extends RpcAcsRequest<OpsUpdateFunctionResponse> {
	   

	private String productCode;

	private String functionViperFeature;

	private String gmtCreate;

	private Integer priority;

	private String functionId;

	private String functionName;

	private String functionDescription;

	private Long id;

	private String auditParamStr;
	public OpsUpdateFunctionRequest() {
		super("Ecsops", "2016-04-01", "OpsUpdateFunction", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putQueryParameter("ProductCode", productCode);
		}
	}

	public String getFunctionViperFeature() {
		return this.functionViperFeature;
	}

	public void setFunctionViperFeature(String functionViperFeature) {
		this.functionViperFeature = functionViperFeature;
		if(functionViperFeature != null){
			putQueryParameter("FunctionViperFeature", functionViperFeature);
		}
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
		if(gmtCreate != null){
			putQueryParameter("GmtCreate", gmtCreate);
		}
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
		if(priority != null){
			putQueryParameter("Priority", priority.toString());
		}
	}

	public String getFunctionId() {
		return this.functionId;
	}

	public void setFunctionId(String functionId) {
		this.functionId = functionId;
		if(functionId != null){
			putQueryParameter("FunctionId", functionId);
		}
	}

	public String getFunctionName() {
		return this.functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
		if(functionName != null){
			putQueryParameter("FunctionName", functionName);
		}
	}

	public String getFunctionDescription() {
		return this.functionDescription;
	}

	public void setFunctionDescription(String functionDescription) {
		this.functionDescription = functionDescription;
		if(functionDescription != null){
			putQueryParameter("FunctionDescription", functionDescription);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
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
	public Class<OpsUpdateFunctionResponse> getResponseClass() {
		return OpsUpdateFunctionResponse.class;
	}

}
