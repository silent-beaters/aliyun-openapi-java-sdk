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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cr.transform.v20181201.ListNamespaceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListNamespaceResponse extends AcsResponse {

	private String requestId;

	private String code;

	private Integer pageNo;

	private Boolean isSuccess;

	private Integer pageSize;

	private String totalCount;

	private List<NamespacesItem> namespaces;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<NamespacesItem> getNamespaces() {
		return this.namespaces;
	}

	public void setNamespaces(List<NamespacesItem> namespaces) {
		this.namespaces = namespaces;
	}

	public static class NamespacesItem {

		private String defaultRepoType;

		private String namespaceStatus;

		private String namespaceId;

		private Boolean autoCreateRepo;

		private String instanceId;

		private String namespaceName;

		public String getDefaultRepoType() {
			return this.defaultRepoType;
		}

		public void setDefaultRepoType(String defaultRepoType) {
			this.defaultRepoType = defaultRepoType;
		}

		public String getNamespaceStatus() {
			return this.namespaceStatus;
		}

		public void setNamespaceStatus(String namespaceStatus) {
			this.namespaceStatus = namespaceStatus;
		}

		public String getNamespaceId() {
			return this.namespaceId;
		}

		public void setNamespaceId(String namespaceId) {
			this.namespaceId = namespaceId;
		}

		public Boolean getAutoCreateRepo() {
			return this.autoCreateRepo;
		}

		public void setAutoCreateRepo(Boolean autoCreateRepo) {
			this.autoCreateRepo = autoCreateRepo;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getNamespaceName() {
			return this.namespaceName;
		}

		public void setNamespaceName(String namespaceName) {
			this.namespaceName = namespaceName;
		}
	}

	@Override
	public ListNamespaceResponse getInstance(UnmarshallerContext context) {
		return	ListNamespaceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
