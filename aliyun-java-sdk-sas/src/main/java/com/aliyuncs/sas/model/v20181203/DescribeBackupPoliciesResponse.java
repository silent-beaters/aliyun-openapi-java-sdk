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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeBackupPoliciesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupPoliciesResponse extends AcsResponse {

	private String requestId;

	private List<BackupPolicy> policies;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BackupPolicy> getPolicies() {
		return this.policies;
	}

	public void setPolicies(List<BackupPolicy> policies) {
		this.policies = policies;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class BackupPolicy {

		private Integer clientErrorCount;

		private String status;

		private String policyVersion;

		private String policy;

		private String upgradeStatus;

		private Integer serviceErrorCount;

		private String policyRegionId;

		private String clientStatus;

		private String name;

		private Integer healthClientCount;

		private Long id;

		private List<String> clientErrorUuidList;

		private List<String> remarkedUuidList;

		private List<String> uuidList;

		private List<String> serviceErrorUuidList;

		private List<String> healthClientUuidList;

		public Integer getClientErrorCount() {
			return this.clientErrorCount;
		}

		public void setClientErrorCount(Integer clientErrorCount) {
			this.clientErrorCount = clientErrorCount;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPolicyVersion() {
			return this.policyVersion;
		}

		public void setPolicyVersion(String policyVersion) {
			this.policyVersion = policyVersion;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}

		public String getUpgradeStatus() {
			return this.upgradeStatus;
		}

		public void setUpgradeStatus(String upgradeStatus) {
			this.upgradeStatus = upgradeStatus;
		}

		public Integer getServiceErrorCount() {
			return this.serviceErrorCount;
		}

		public void setServiceErrorCount(Integer serviceErrorCount) {
			this.serviceErrorCount = serviceErrorCount;
		}

		public String getPolicyRegionId() {
			return this.policyRegionId;
		}

		public void setPolicyRegionId(String policyRegionId) {
			this.policyRegionId = policyRegionId;
		}

		public String getClientStatus() {
			return this.clientStatus;
		}

		public void setClientStatus(String clientStatus) {
			this.clientStatus = clientStatus;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getHealthClientCount() {
			return this.healthClientCount;
		}

		public void setHealthClientCount(Integer healthClientCount) {
			this.healthClientCount = healthClientCount;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public List<String> getClientErrorUuidList() {
			return this.clientErrorUuidList;
		}

		public void setClientErrorUuidList(List<String> clientErrorUuidList) {
			this.clientErrorUuidList = clientErrorUuidList;
		}

		public List<String> getRemarkedUuidList() {
			return this.remarkedUuidList;
		}

		public void setRemarkedUuidList(List<String> remarkedUuidList) {
			this.remarkedUuidList = remarkedUuidList;
		}

		public List<String> getUuidList() {
			return this.uuidList;
		}

		public void setUuidList(List<String> uuidList) {
			this.uuidList = uuidList;
		}

		public List<String> getServiceErrorUuidList() {
			return this.serviceErrorUuidList;
		}

		public void setServiceErrorUuidList(List<String> serviceErrorUuidList) {
			this.serviceErrorUuidList = serviceErrorUuidList;
		}

		public List<String> getHealthClientUuidList() {
			return this.healthClientUuidList;
		}

		public void setHealthClientUuidList(List<String> healthClientUuidList) {
			this.healthClientUuidList = healthClientUuidList;
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalCount;

		private Integer count;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public DescribeBackupPoliciesResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupPoliciesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
