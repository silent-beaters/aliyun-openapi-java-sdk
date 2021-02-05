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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateSnapshotGroupRequest extends RpcAcsRequest<CreateSnapshotGroupResponse> {
	   

	private Long resourceOwnerId;

	private List<String> excludeDiskIds;

	private Boolean instantAccess;

	private String description;

	private Integer instantAccessRetentionDays;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String instanceId;

	private String name;
	public CreateSnapshotGroupRequest() {
		super("Ecs", "2014-05-26", "CreateSnapshotGroup", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public List<String> getExcludeDiskIds() {
		return this.excludeDiskIds;
	}

	public void setExcludeDiskIds(List<String> excludeDiskIds) {
		this.excludeDiskIds = excludeDiskIds;	
		if (excludeDiskIds != null) {
			for (int i = 0; i < excludeDiskIds.size(); i++) {
				putQueryParameter("ExcludeDiskId." + (i + 1) , excludeDiskIds.get(i));
			}
		}	
	}

	public Boolean getInstantAccess() {
		return this.instantAccess;
	}

	public void setInstantAccess(Boolean instantAccess) {
		this.instantAccess = instantAccess;
		if(instantAccess != null){
			putQueryParameter("InstantAccess", instantAccess.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Integer getInstantAccessRetentionDays() {
		return this.instantAccessRetentionDays;
	}

	public void setInstantAccessRetentionDays(Integer instantAccessRetentionDays) {
		this.instantAccessRetentionDays = instantAccessRetentionDays;
		if(instantAccessRetentionDays != null){
			putQueryParameter("InstantAccessRetentionDays", instantAccessRetentionDays.toString());
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	@Override
	public Class<CreateSnapshotGroupResponse> getResponseClass() {
		return CreateSnapshotGroupResponse.class;
	}

}