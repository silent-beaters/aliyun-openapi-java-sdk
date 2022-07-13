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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateVirtualPhysicalConnectionRequest extends RpcAcsRequest<UpdateVirtualPhysicalConnectionResponse> {
	   

	private Boolean dryRun;

	private Long vlanId;

	private String token;

	private String instanceId;

	private String expectSpec;
	public UpdateVirtualPhysicalConnectionRequest() {
		super("Vpc", "2016-04-28", "UpdateVirtualPhysicalConnection", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public Long getVlanId() {
		return this.vlanId;
	}

	public void setVlanId(Long vlanId) {
		this.vlanId = vlanId;
		if(vlanId != null){
			putQueryParameter("VlanId", vlanId.toString());
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
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

	public String getExpectSpec() {
		return this.expectSpec;
	}

	public void setExpectSpec(String expectSpec) {
		this.expectSpec = expectSpec;
		if(expectSpec != null){
			putQueryParameter("ExpectSpec", expectSpec);
		}
	}

	@Override
	public Class<UpdateVirtualPhysicalConnectionResponse> getResponseClass() {
		return UpdateVirtualPhysicalConnectionResponse.class;
	}

}
