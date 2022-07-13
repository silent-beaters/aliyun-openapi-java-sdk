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
import com.aliyuncs.cr.transform.v20181201.ListRepoSyncRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRepoSyncRuleResponse extends AcsResponse {

	private String requestId;

	private String code;

	private Integer pageNo;

	private Boolean isSuccess;

	private Integer pageSize;

	private Integer totalCount;

	private List<SyncRulesItem> syncRules;

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<SyncRulesItem> getSyncRules() {
		return this.syncRules;
	}

	public void setSyncRules(List<SyncRulesItem> syncRules) {
		this.syncRules = syncRules;
	}

	public static class SyncRulesItem {

		private String syncTrigger;

		private Long createTime;

		private String localRegionId;

		private String syncScope;

		private String tagFilter;

		private String targetNamespaceName;

		private String targetInstanceId;

		private String targetRepoName;

		private String syncRuleId;

		private Long modifiedTime;

		private String syncRuleName;

		private String targetRegionId;

		private String localInstanceId;

		private String localNamespaceName;

		private String localRepoName;

		private String syncDirection;

		private Boolean crossUser;

		public String getSyncTrigger() {
			return this.syncTrigger;
		}

		public void setSyncTrigger(String syncTrigger) {
			this.syncTrigger = syncTrigger;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getLocalRegionId() {
			return this.localRegionId;
		}

		public void setLocalRegionId(String localRegionId) {
			this.localRegionId = localRegionId;
		}

		public String getSyncScope() {
			return this.syncScope;
		}

		public void setSyncScope(String syncScope) {
			this.syncScope = syncScope;
		}

		public String getTagFilter() {
			return this.tagFilter;
		}

		public void setTagFilter(String tagFilter) {
			this.tagFilter = tagFilter;
		}

		public String getTargetNamespaceName() {
			return this.targetNamespaceName;
		}

		public void setTargetNamespaceName(String targetNamespaceName) {
			this.targetNamespaceName = targetNamespaceName;
		}

		public String getTargetInstanceId() {
			return this.targetInstanceId;
		}

		public void setTargetInstanceId(String targetInstanceId) {
			this.targetInstanceId = targetInstanceId;
		}

		public String getTargetRepoName() {
			return this.targetRepoName;
		}

		public void setTargetRepoName(String targetRepoName) {
			this.targetRepoName = targetRepoName;
		}

		public String getSyncRuleId() {
			return this.syncRuleId;
		}

		public void setSyncRuleId(String syncRuleId) {
			this.syncRuleId = syncRuleId;
		}

		public Long getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(Long modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getSyncRuleName() {
			return this.syncRuleName;
		}

		public void setSyncRuleName(String syncRuleName) {
			this.syncRuleName = syncRuleName;
		}

		public String getTargetRegionId() {
			return this.targetRegionId;
		}

		public void setTargetRegionId(String targetRegionId) {
			this.targetRegionId = targetRegionId;
		}

		public String getLocalInstanceId() {
			return this.localInstanceId;
		}

		public void setLocalInstanceId(String localInstanceId) {
			this.localInstanceId = localInstanceId;
		}

		public String getLocalNamespaceName() {
			return this.localNamespaceName;
		}

		public void setLocalNamespaceName(String localNamespaceName) {
			this.localNamespaceName = localNamespaceName;
		}

		public String getLocalRepoName() {
			return this.localRepoName;
		}

		public void setLocalRepoName(String localRepoName) {
			this.localRepoName = localRepoName;
		}

		public String getSyncDirection() {
			return this.syncDirection;
		}

		public void setSyncDirection(String syncDirection) {
			this.syncDirection = syncDirection;
		}

		public Boolean getCrossUser() {
			return this.crossUser;
		}

		public void setCrossUser(Boolean crossUser) {
			this.crossUser = crossUser;
		}
	}

	@Override
	public ListRepoSyncRuleResponse getInstance(UnmarshallerContext context) {
		return	ListRepoSyncRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
