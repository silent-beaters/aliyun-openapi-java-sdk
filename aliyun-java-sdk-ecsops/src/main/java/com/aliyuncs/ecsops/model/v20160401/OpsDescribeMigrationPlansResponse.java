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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeMigrationPlansResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeMigrationPlansResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private Integer pageSize;

	private Integer pageNumber;

	private List<Plan> planSet;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Plan> getPlanSet() {
		return this.planSet;
	}

	public void setPlanSet(List<Plan> planSet) {
		this.planSet = planSet;
	}

	public static class Plan {

		private String name;

		private String migrationPlanId;

		private Integer type;

		private Integer status;

		private String createTime;

		private Integer totalVmCount;

		private Integer finishVmCount;

		private Boolean keepPrivateIp;

		private Boolean ensureNetworkConnectivity;

		private Boolean remainPublicMacAsPriority;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMigrationPlanId() {
			return this.migrationPlanId;
		}

		public void setMigrationPlanId(String migrationPlanId) {
			this.migrationPlanId = migrationPlanId;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Integer getTotalVmCount() {
			return this.totalVmCount;
		}

		public void setTotalVmCount(Integer totalVmCount) {
			this.totalVmCount = totalVmCount;
		}

		public Integer getFinishVmCount() {
			return this.finishVmCount;
		}

		public void setFinishVmCount(Integer finishVmCount) {
			this.finishVmCount = finishVmCount;
		}

		public Boolean getKeepPrivateIp() {
			return this.keepPrivateIp;
		}

		public void setKeepPrivateIp(Boolean keepPrivateIp) {
			this.keepPrivateIp = keepPrivateIp;
		}

		public Boolean getEnsureNetworkConnectivity() {
			return this.ensureNetworkConnectivity;
		}

		public void setEnsureNetworkConnectivity(Boolean ensureNetworkConnectivity) {
			this.ensureNetworkConnectivity = ensureNetworkConnectivity;
		}

		public Boolean getRemainPublicMacAsPriority() {
			return this.remainPublicMacAsPriority;
		}

		public void setRemainPublicMacAsPriority(Boolean remainPublicMacAsPriority) {
			this.remainPublicMacAsPriority = remainPublicMacAsPriority;
		}
	}

	@Override
	public OpsDescribeMigrationPlansResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeMigrationPlansResponseUnmarshaller.unmarshall(this, context);
	}
}
