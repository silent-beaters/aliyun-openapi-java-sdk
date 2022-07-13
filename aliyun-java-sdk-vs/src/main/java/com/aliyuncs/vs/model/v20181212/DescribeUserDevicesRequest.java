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

package com.aliyuncs.vs.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserDevicesRequest extends RpcAcsRequest<DescribeUserDevicesResponse> {
	   

	private String ensInstanceIds;

	private Long ownerId;

	private String serverName;
	public DescribeUserDevicesRequest() {
		super("vs", "2018-12-12", "DescribeUserDevices");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEnsInstanceIds() {
		return this.ensInstanceIds;
	}

	public void setEnsInstanceIds(String ensInstanceIds) {
		this.ensInstanceIds = ensInstanceIds;
		if(ensInstanceIds != null){
			putQueryParameter("EnsInstanceIds", ensInstanceIds);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getServerName() {
		return this.serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
		if(serverName != null){
			putQueryParameter("ServerName", serverName);
		}
	}

	@Override
	public Class<DescribeUserDevicesResponse> getResponseClass() {
		return DescribeUserDevicesResponse.class;
	}

}
