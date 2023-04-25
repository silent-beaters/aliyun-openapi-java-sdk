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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AppendCasesRequest extends RpcAcsRequest<AppendCasesResponse> {
	   

	private String instanceId;

	private String campaignId;

	@SerializedName("body")
	private List<Body> body;
	public AppendCasesRequest() {
		super("CCC", "2020-07-01", "AppendCases", "CCC");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getCampaignId() {
		return this.campaignId;
	}

	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
		if(campaignId != null){
			putQueryParameter("CampaignId", campaignId);
		}
	}

	public List<Body> getBody() {
		return this.body;
	}

	public void setBody(List<Body> body) {
		this.body = body;	
		if (body != null) {
			putBodyParameter("body" , new Gson().toJson(body));
		}	
	}

	public static class Body {

		@SerializedName("CustomVariables")
		private String customVariables;

		@SerializedName("Caller")
		private String caller;

		@SerializedName("AgentId")
		private String agentId;

		@SerializedName("PhoneNumber")
		private String phoneNumber;

		@SerializedName("MaskedCallee")
		private String maskedCallee;

		@SerializedName("ReferenceId")
		private String referenceId;

		public String getCustomVariables() {
			return this.customVariables;
		}

		public void setCustomVariables(String customVariables) {
			this.customVariables = customVariables;
		}

		public String getCaller() {
			return this.caller;
		}

		public void setCaller(String caller) {
			this.caller = caller;
		}

		public String getAgentId() {
			return this.agentId;
		}

		public void setAgentId(String agentId) {
			this.agentId = agentId;
		}

		public String getPhoneNumber() {
			return this.phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getMaskedCallee() {
			return this.maskedCallee;
		}

		public void setMaskedCallee(String maskedCallee) {
			this.maskedCallee = maskedCallee;
		}

		public String getReferenceId() {
			return this.referenceId;
		}

		public void setReferenceId(String referenceId) {
			this.referenceId = referenceId;
		}
	}

	@Override
	public Class<AppendCasesResponse> getResponseClass() {
		return AppendCasesResponse.class;
	}

}
