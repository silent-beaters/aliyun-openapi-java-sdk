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

package com.aliyuncs.polardbx.model.v20200202;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardbx.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdatePolarDBXInstanceNodeRequest extends RpcAcsRequest<UpdatePolarDBXInstanceNodeResponse> {
	   

	private String addDNSpec;

	private String storagePoolName;

	private String dbInstanceNodeCount;

	private String cNNodeCount;

	private String dBInstanceName;

	private String clientToken;

	private String deleteDNIds;

	private String dNNodeCount;
	public UpdatePolarDBXInstanceNodeRequest() {
		super("polardbx", "2020-02-02", "UpdatePolarDBXInstanceNode", "polardbx");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAddDNSpec() {
		return this.addDNSpec;
	}

	public void setAddDNSpec(String addDNSpec) {
		this.addDNSpec = addDNSpec;
		if(addDNSpec != null){
			putQueryParameter("AddDNSpec", addDNSpec);
		}
	}

	public String getStoragePoolName() {
		return this.storagePoolName;
	}

	public void setStoragePoolName(String storagePoolName) {
		this.storagePoolName = storagePoolName;
		if(storagePoolName != null){
			putQueryParameter("StoragePoolName", storagePoolName);
		}
	}

	public String getDbInstanceNodeCount() {
		return this.dbInstanceNodeCount;
	}

	public void setDbInstanceNodeCount(String dbInstanceNodeCount) {
		this.dbInstanceNodeCount = dbInstanceNodeCount;
		if(dbInstanceNodeCount != null){
			putQueryParameter("DbInstanceNodeCount", dbInstanceNodeCount);
		}
	}

	public String getCNNodeCount() {
		return this.cNNodeCount;
	}

	public void setCNNodeCount(String cNNodeCount) {
		this.cNNodeCount = cNNodeCount;
		if(cNNodeCount != null){
			putQueryParameter("CNNodeCount", cNNodeCount);
		}
	}

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
		if(dBInstanceName != null){
			putQueryParameter("DBInstanceName", dBInstanceName);
		}
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

	public String getDeleteDNIds() {
		return this.deleteDNIds;
	}

	public void setDeleteDNIds(String deleteDNIds) {
		this.deleteDNIds = deleteDNIds;
		if(deleteDNIds != null){
			putQueryParameter("DeleteDNIds", deleteDNIds);
		}
	}

	public String getDNNodeCount() {
		return this.dNNodeCount;
	}

	public void setDNNodeCount(String dNNodeCount) {
		this.dNNodeCount = dNNodeCount;
		if(dNNodeCount != null){
			putQueryParameter("DNNodeCount", dNNodeCount);
		}
	}

	@Override
	public Class<UpdatePolarDBXInstanceNodeResponse> getResponseClass() {
		return UpdatePolarDBXInstanceNodeResponse.class;
	}

}
