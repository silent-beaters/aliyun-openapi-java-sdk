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

package com.aliyuncs.cloudapi.model.v20160714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeHistoryApisResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHistoryApisResponse extends AcsResponse {

	private Integer pageNumber;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<ApiHisItem> apiHisItems;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public List<ApiHisItem> getApiHisItems() {
		return this.apiHisItems;
	}

	public void setApiHisItems(List<ApiHisItem> apiHisItems) {
		this.apiHisItems = apiHisItems;
	}

	public static class ApiHisItem {

		private String status;

		private String apiId;

		private String description;

		private String groupName;

		private String groupId;

		private String deployedTime;

		private String stageName;

		private String stageAlias;

		private String historyVersion;

		private String apiName;

		private String regionId;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getApiId() {
			return this.apiId;
		}

		public void setApiId(String apiId) {
			this.apiId = apiId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getDeployedTime() {
			return this.deployedTime;
		}

		public void setDeployedTime(String deployedTime) {
			this.deployedTime = deployedTime;
		}

		public String getStageName() {
			return this.stageName;
		}

		public void setStageName(String stageName) {
			this.stageName = stageName;
		}

		public String getStageAlias() {
			return this.stageAlias;
		}

		public void setStageAlias(String stageAlias) {
			this.stageAlias = stageAlias;
		}

		public String getHistoryVersion() {
			return this.historyVersion;
		}

		public void setHistoryVersion(String historyVersion) {
			this.historyVersion = historyVersion;
		}

		public String getApiName() {
			return this.apiName;
		}

		public void setApiName(String apiName) {
			this.apiName = apiName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public DescribeHistoryApisResponse getInstance(UnmarshallerContext context) {
		return	DescribeHistoryApisResponseUnmarshaller.unmarshall(this, context);
	}
}
