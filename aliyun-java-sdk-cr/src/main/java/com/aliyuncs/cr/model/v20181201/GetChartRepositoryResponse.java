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

package com.aliyuncs.cr.model.v20181201;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cr.transform.v20181201.GetChartRepositoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetChartRepositoryResponse extends AcsResponse {

	private String summary;

	private Long createTime;

	private Boolean isSuccess;

	private String instanceId;

	private String repoStatus;

	private String repoType;

	private String requestId;

	private String repoId;

	private Long modifiedTime;

	private String code;

	private String repoNamespaceName;

	private String repoName;

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getRepoStatus() {
		return this.repoStatus;
	}

	public void setRepoStatus(String repoStatus) {
		this.repoStatus = repoStatus;
	}

	public String getRepoType() {
		return this.repoType;
	}

	public void setRepoType(String repoType) {
		this.repoType = repoType;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRepoId() {
		return this.repoId;
	}

	public void setRepoId(String repoId) {
		this.repoId = repoId;
	}

	public Long getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Long modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRepoNamespaceName() {
		return this.repoNamespaceName;
	}

	public void setRepoNamespaceName(String repoNamespaceName) {
		this.repoNamespaceName = repoNamespaceName;
	}

	public String getRepoName() {
		return this.repoName;
	}

	public void setRepoName(String repoName) {
		this.repoName = repoName;
	}

	@Override
	public GetChartRepositoryResponse getInstance(UnmarshallerContext context) {
		return	GetChartRepositoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
