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

package com.aliyuncs.iotcc.model.v20210513;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddCidrToConnectionPoolRequest extends RpcAcsRequest<AddCidrToConnectionPoolResponse> {
	   

	private String clientToken;

	private String connectionPoolId;

	private List<String> cidrss;

	private Boolean dryRun;

	private String ioTCloudConnectorId;
	public AddCidrToConnectionPoolRequest() {
		super("IoTCC", "2021-05-13", "AddCidrToConnectionPool", "IoTCC");
		setMethod(MethodType.POST);
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

	public String getConnectionPoolId() {
		return this.connectionPoolId;
	}

	public void setConnectionPoolId(String connectionPoolId) {
		this.connectionPoolId = connectionPoolId;
		if(connectionPoolId != null){
			putQueryParameter("ConnectionPoolId", connectionPoolId);
		}
	}

	public List<String> getCidrss() {
		return this.cidrss;
	}

	public void setCidrss(List<String> cidrss) {
		this.cidrss = cidrss;	
		if (cidrss != null) {
			for (int i = 0; i < cidrss.size(); i++) {
				putQueryParameter("Cidrs." + (i + 1) , cidrss.get(i));
			}
		}	
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

	public String getIoTCloudConnectorId() {
		return this.ioTCloudConnectorId;
	}

	public void setIoTCloudConnectorId(String ioTCloudConnectorId) {
		this.ioTCloudConnectorId = ioTCloudConnectorId;
		if(ioTCloudConnectorId != null){
			putQueryParameter("IoTCloudConnectorId", ioTCloudConnectorId);
		}
	}

	@Override
	public Class<AddCidrToConnectionPoolResponse> getResponseClass() {
		return AddCidrToConnectionPoolResponse.class;
	}

}
