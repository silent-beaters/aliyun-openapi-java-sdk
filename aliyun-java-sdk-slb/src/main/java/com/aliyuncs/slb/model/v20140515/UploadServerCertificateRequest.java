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

package com.aliyuncs.slb.model.v20140515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.slb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UploadServerCertificateRequest extends RpcAcsRequest<UploadServerCertificateResponse> {
	   

	private Long resourceOwnerId;

	private String serverCertificate;

	private String aliCloudCertificateName;

	private String aliCloudCertificateId;

	private String privateKey;

	private String resourceGroupId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String aliCloudCertificateRegionId;

	private String serverCertificateName;
	public UploadServerCertificateRequest() {
		super("Slb", "2014-05-15", "UploadServerCertificate", "slb");
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

	public String getServerCertificate() {
		return this.serverCertificate;
	}

	public void setServerCertificate(String serverCertificate) {
		this.serverCertificate = serverCertificate;
		if(serverCertificate != null){
			putQueryParameter("ServerCertificate", serverCertificate);
		}
	}

	public String getAliCloudCertificateName() {
		return this.aliCloudCertificateName;
	}

	public void setAliCloudCertificateName(String aliCloudCertificateName) {
		this.aliCloudCertificateName = aliCloudCertificateName;
		if(aliCloudCertificateName != null){
			putQueryParameter("AliCloudCertificateName", aliCloudCertificateName);
		}
	}

	public String getAliCloudCertificateId() {
		return this.aliCloudCertificateId;
	}

	public void setAliCloudCertificateId(String aliCloudCertificateId) {
		this.aliCloudCertificateId = aliCloudCertificateId;
		if(aliCloudCertificateId != null){
			putQueryParameter("AliCloudCertificateId", aliCloudCertificateId);
		}
	}

	public String getPrivateKey() {
		return this.privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
		if(privateKey != null){
			putQueryParameter("PrivateKey", privateKey);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
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

	public String getAliCloudCertificateRegionId() {
		return this.aliCloudCertificateRegionId;
	}

	public void setAliCloudCertificateRegionId(String aliCloudCertificateRegionId) {
		this.aliCloudCertificateRegionId = aliCloudCertificateRegionId;
		if(aliCloudCertificateRegionId != null){
			putQueryParameter("AliCloudCertificateRegionId", aliCloudCertificateRegionId);
		}
	}

	public String getServerCertificateName() {
		return this.serverCertificateName;
	}

	public void setServerCertificateName(String serverCertificateName) {
		this.serverCertificateName = serverCertificateName;
		if(serverCertificateName != null){
			putQueryParameter("ServerCertificateName", serverCertificateName);
		}
	}

	@Override
	public Class<UploadServerCertificateResponse> getResponseClass() {
		return UploadServerCertificateResponse.class;
	}

}
