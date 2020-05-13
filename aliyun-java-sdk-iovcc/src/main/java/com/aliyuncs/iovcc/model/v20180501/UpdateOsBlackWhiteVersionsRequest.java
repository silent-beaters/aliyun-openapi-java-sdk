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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iovcc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateOsBlackWhiteVersionsRequest extends RpcAcsRequest<UpdateOsBlackWhiteVersionsResponse> {
	   

	private String blackVersions;

	private String whiteVersions;

	private String versionId;

	private String projectId;
	public UpdateOsBlackWhiteVersionsRequest() {
		super("iovcc", "2018-05-01", "UpdateOsBlackWhiteVersions", "iovcc");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBlackVersions() {
		return this.blackVersions;
	}

	public void setBlackVersions(String blackVersions) {
		this.blackVersions = blackVersions;
		if(blackVersions != null){
			putQueryParameter("BlackVersions", blackVersions);
		}
	}

	public String getWhiteVersions() {
		return this.whiteVersions;
	}

	public void setWhiteVersions(String whiteVersions) {
		this.whiteVersions = whiteVersions;
		if(whiteVersions != null){
			putQueryParameter("WhiteVersions", whiteVersions);
		}
	}

	public String getVersionId() {
		return this.versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
		if(versionId != null){
			putQueryParameter("VersionId", versionId);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	@Override
	public Class<UpdateOsBlackWhiteVersionsResponse> getResponseClass() {
		return UpdateOsBlackWhiteVersionsResponse.class;
	}

}
