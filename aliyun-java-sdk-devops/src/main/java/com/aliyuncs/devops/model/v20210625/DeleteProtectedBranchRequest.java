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

package com.aliyuncs.devops.model.v20210625;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteProtectedBranchRequest extends RoaAcsRequest<DeleteProtectedBranchResponse> {
	   

	private String organizationId;

	private Long protectedBranchId;

	private Long repositoryId;

	private String accessToken;
	public DeleteProtectedBranchRequest() {
		super("devops", "2021-06-25", "DeleteProtectedBranch");
		setUriPattern("/repository/[repositoryId]/protect_branches/[protectedBranchId]");
		setMethod(MethodType.DELETE);
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putQueryParameter("organizationId", organizationId);
		}
	}

	public Long getProtectedBranchId() {
		return this.protectedBranchId;
	}

	public void setProtectedBranchId(Long protectedBranchId) {
		this.protectedBranchId = protectedBranchId;
		if(protectedBranchId != null){
			putPathParameter("protectedBranchId", protectedBranchId.toString());
		}
	}

	public Long getRepositoryId() {
		return this.repositoryId;
	}

	public void setRepositoryId(Long repositoryId) {
		this.repositoryId = repositoryId;
		if(repositoryId != null){
			putPathParameter("repositoryId", repositoryId.toString());
		}
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
		if(accessToken != null){
			putQueryParameter("accessToken", accessToken);
		}
	}

	@Override
	public Class<DeleteProtectedBranchResponse> getResponseClass() {
		return DeleteProtectedBranchResponse.class;
	}

}
