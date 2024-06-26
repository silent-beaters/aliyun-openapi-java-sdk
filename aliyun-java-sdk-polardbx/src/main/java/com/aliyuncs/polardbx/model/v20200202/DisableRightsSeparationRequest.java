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
public class DisableRightsSeparationRequest extends RpcAcsRequest<DisableRightsSeparationResponse> {
	   

	private String dBInstanceName;

	private String dbaAccountPassword;

	private String dbaAccountName;
	public DisableRightsSeparationRequest() {
		super("polardbx", "2020-02-02", "DisableRightsSeparation", "polardbx");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getDbaAccountPassword() {
		return this.dbaAccountPassword;
	}

	public void setDbaAccountPassword(String dbaAccountPassword) {
		this.dbaAccountPassword = dbaAccountPassword;
		if(dbaAccountPassword != null){
			putQueryParameter("DbaAccountPassword", dbaAccountPassword);
		}
	}

	public String getDbaAccountName() {
		return this.dbaAccountName;
	}

	public void setDbaAccountName(String dbaAccountName) {
		this.dbaAccountName = dbaAccountName;
		if(dbaAccountName != null){
			putQueryParameter("DbaAccountName", dbaAccountName);
		}
	}

	@Override
	public Class<DisableRightsSeparationResponse> getResponseClass() {
		return DisableRightsSeparationResponse.class;
	}

}
