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

package com.aliyuncs.nas.model.v20170626;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetFilesetQuotaRequest extends RpcAcsRequest<SetFilesetQuotaResponse> {
	   

	private String fsetId;

	private String clientToken;

	private Long fileCountLimit;

	private Long sizeLimit;

	private String fileSystemId;

	private Boolean dryRun;
	public SetFilesetQuotaRequest() {
		super("NAS", "2017-06-26", "SetFilesetQuota", "nas");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFsetId() {
		return this.fsetId;
	}

	public void setFsetId(String fsetId) {
		this.fsetId = fsetId;
		if(fsetId != null){
			putQueryParameter("FsetId", fsetId);
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

	public Long getFileCountLimit() {
		return this.fileCountLimit;
	}

	public void setFileCountLimit(Long fileCountLimit) {
		this.fileCountLimit = fileCountLimit;
		if(fileCountLimit != null){
			putQueryParameter("FileCountLimit", fileCountLimit.toString());
		}
	}

	public Long getSizeLimit() {
		return this.sizeLimit;
	}

	public void setSizeLimit(Long sizeLimit) {
		this.sizeLimit = sizeLimit;
		if(sizeLimit != null){
			putQueryParameter("SizeLimit", sizeLimit.toString());
		}
	}

	public String getFileSystemId() {
		return this.fileSystemId;
	}

	public void setFileSystemId(String fileSystemId) {
		this.fileSystemId = fileSystemId;
		if(fileSystemId != null){
			putQueryParameter("FileSystemId", fileSystemId);
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

	@Override
	public Class<SetFilesetQuotaResponse> getResponseClass() {
		return SetFilesetQuotaResponse.class;
	}

}
