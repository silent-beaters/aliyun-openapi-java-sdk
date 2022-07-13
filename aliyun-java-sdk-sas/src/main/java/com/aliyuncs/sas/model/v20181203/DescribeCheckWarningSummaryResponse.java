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
import com.aliyuncs.sas.transform.v20181203.DescribeCheckWarningSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCheckWarningSummaryResponse extends AcsResponse {

	private Integer currentPage;

	private Integer pageSize;

	private String requestId;

	private Integer totalCount;

	private Integer count;

	private List<WarningSummary> warningSummarys;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public List<WarningSummary> getWarningSummarys() {
		return this.warningSummarys;
	}

	public void setWarningSummarys(List<WarningSummary> warningSummarys) {
		this.warningSummarys = warningSummarys;
	}

	public static class WarningSummary {

		private Integer lowWarningCount;

		private Integer checkCount;

		private Integer mediumWarningCount;

		private String lastFoundTime;

		private Long riskId;

		private String subTypeAlias;

		private Integer warningMachineCount;

		private Integer highWarningCount;

		private String typeAlias;

		private String riskName;

		private String level;

		public Integer getLowWarningCount() {
			return this.lowWarningCount;
		}

		public void setLowWarningCount(Integer lowWarningCount) {
			this.lowWarningCount = lowWarningCount;
		}

		public Integer getCheckCount() {
			return this.checkCount;
		}

		public void setCheckCount(Integer checkCount) {
			this.checkCount = checkCount;
		}

		public Integer getMediumWarningCount() {
			return this.mediumWarningCount;
		}

		public void setMediumWarningCount(Integer mediumWarningCount) {
			this.mediumWarningCount = mediumWarningCount;
		}

		public String getLastFoundTime() {
			return this.lastFoundTime;
		}

		public void setLastFoundTime(String lastFoundTime) {
			this.lastFoundTime = lastFoundTime;
		}

		public Long getRiskId() {
			return this.riskId;
		}

		public void setRiskId(Long riskId) {
			this.riskId = riskId;
		}

		public String getSubTypeAlias() {
			return this.subTypeAlias;
		}

		public void setSubTypeAlias(String subTypeAlias) {
			this.subTypeAlias = subTypeAlias;
		}

		public Integer getWarningMachineCount() {
			return this.warningMachineCount;
		}

		public void setWarningMachineCount(Integer warningMachineCount) {
			this.warningMachineCount = warningMachineCount;
		}

		public Integer getHighWarningCount() {
			return this.highWarningCount;
		}

		public void setHighWarningCount(Integer highWarningCount) {
			this.highWarningCount = highWarningCount;
		}

		public String getTypeAlias() {
			return this.typeAlias;
		}

		public void setTypeAlias(String typeAlias) {
			this.typeAlias = typeAlias;
		}

		public String getRiskName() {
			return this.riskName;
		}

		public void setRiskName(String riskName) {
			this.riskName = riskName;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}
	}

	@Override
	public DescribeCheckWarningSummaryResponse getInstance(UnmarshallerContext context) {
		return	DescribeCheckWarningSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
