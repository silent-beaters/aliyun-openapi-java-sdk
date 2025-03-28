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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeExpressConnectTrafficQosQueueRequest extends RpcAcsRequest<DescribeExpressConnectTrafficQosQueueResponse> {
	   

	private String clientToken;

	private String qosId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private List<String> queueIdLists;

	private List<String> queueNameLists;

	private Long ownerId;
	public DescribeExpressConnectTrafficQosQueueRequest() {
		super("Vpc", "2016-04-28", "DescribeExpressConnectTrafficQosQueue", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getQosId() {
		return this.qosId;
	}

	public void setQosId(String qosId) {
		this.qosId = qosId;
		if(qosId != null){
			putQueryParameter("QosId", qosId);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public List<String> getQueueIdLists() {
		return this.queueIdLists;
	}

	public void setQueueIdLists(List<String> queueIdLists) {
		this.queueIdLists = queueIdLists;	
		if (queueIdLists != null) {
			for (int i = 0; i < queueIdLists.size(); i++) {
				putQueryParameter("QueueIdList." + (i + 1) , queueIdLists.get(i));
			}
		}	
	}

	public List<String> getQueueNameLists() {
		return this.queueNameLists;
	}

	public void setQueueNameLists(List<String> queueNameLists) {
		this.queueNameLists = queueNameLists;	
		if (queueNameLists != null) {
			for (int i = 0; i < queueNameLists.size(); i++) {
				putQueryParameter("QueueNameList." + (i + 1) , queueNameLists.get(i));
			}
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

	@Override
	public Class<DescribeExpressConnectTrafficQosQueueResponse> getResponseClass() {
		return DescribeExpressConnectTrafficQosQueueResponse.class;
	}

}
