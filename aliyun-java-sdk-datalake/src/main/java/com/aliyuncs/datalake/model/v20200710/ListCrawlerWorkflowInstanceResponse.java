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

package com.aliyuncs.datalake.model.v20200710;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.datalake.transform.v20200710.ListCrawlerWorkflowInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCrawlerWorkflowInstanceResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer totalCount;

	private List<WorkflowInstanceList> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<WorkflowInstanceList> getData() {
		return this.data;
	}

	public void setData(List<WorkflowInstanceList> data) {
		this.data = data;
	}

	public static class WorkflowInstanceList {

		private String gmtModified;

		private String gmtCreate;

		private String regionId;

		private String crawlerId;

		private String name;

		private String datasourceType;

		private String datasourcePath;

		private String datasourceExcludePath;

		private String fileFormat;

		private String fileFormatConfig;

		private String targetDatabase;

		private String targetTablePrefix;

		private String targetUpdateStrategy;

		private String executeType;

		private String executeCron;

		private String roleName;

		private Long creator;

		private Long owner;

		private String flowInstanceId;

		private String flowId;

		private String flowName;

		private Integer duration;

		private Long startTime;

		private Long endTime;

		private String status;

		private String projectId;

		private String clusterId;

		private String failureInfo;

		private String flowExtendResult;

		private Boolean crawlerIsDelete;

		private Integer batchProgress;

		private String executeMode;

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getCrawlerId() {
			return this.crawlerId;
		}

		public void setCrawlerId(String crawlerId) {
			this.crawlerId = crawlerId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDatasourceType() {
			return this.datasourceType;
		}

		public void setDatasourceType(String datasourceType) {
			this.datasourceType = datasourceType;
		}

		public String getDatasourcePath() {
			return this.datasourcePath;
		}

		public void setDatasourcePath(String datasourcePath) {
			this.datasourcePath = datasourcePath;
		}

		public String getDatasourceExcludePath() {
			return this.datasourceExcludePath;
		}

		public void setDatasourceExcludePath(String datasourceExcludePath) {
			this.datasourceExcludePath = datasourceExcludePath;
		}

		public String getFileFormat() {
			return this.fileFormat;
		}

		public void setFileFormat(String fileFormat) {
			this.fileFormat = fileFormat;
		}

		public String getFileFormatConfig() {
			return this.fileFormatConfig;
		}

		public void setFileFormatConfig(String fileFormatConfig) {
			this.fileFormatConfig = fileFormatConfig;
		}

		public String getTargetDatabase() {
			return this.targetDatabase;
		}

		public void setTargetDatabase(String targetDatabase) {
			this.targetDatabase = targetDatabase;
		}

		public String getTargetTablePrefix() {
			return this.targetTablePrefix;
		}

		public void setTargetTablePrefix(String targetTablePrefix) {
			this.targetTablePrefix = targetTablePrefix;
		}

		public String getTargetUpdateStrategy() {
			return this.targetUpdateStrategy;
		}

		public void setTargetUpdateStrategy(String targetUpdateStrategy) {
			this.targetUpdateStrategy = targetUpdateStrategy;
		}

		public String getExecuteType() {
			return this.executeType;
		}

		public void setExecuteType(String executeType) {
			this.executeType = executeType;
		}

		public String getExecuteCron() {
			return this.executeCron;
		}

		public void setExecuteCron(String executeCron) {
			this.executeCron = executeCron;
		}

		public String getRoleName() {
			return this.roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public Long getCreator() {
			return this.creator;
		}

		public void setCreator(Long creator) {
			this.creator = creator;
		}

		public Long getOwner() {
			return this.owner;
		}

		public void setOwner(Long owner) {
			this.owner = owner;
		}

		public String getFlowInstanceId() {
			return this.flowInstanceId;
		}

		public void setFlowInstanceId(String flowInstanceId) {
			this.flowInstanceId = flowInstanceId;
		}

		public String getFlowId() {
			return this.flowId;
		}

		public void setFlowId(String flowId) {
			this.flowId = flowId;
		}

		public String getFlowName() {
			return this.flowName;
		}

		public void setFlowName(String flowName) {
			this.flowName = flowName;
		}

		public Integer getDuration() {
			return this.duration;
		}

		public void setDuration(Integer duration) {
			this.duration = duration;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getFailureInfo() {
			return this.failureInfo;
		}

		public void setFailureInfo(String failureInfo) {
			this.failureInfo = failureInfo;
		}

		public String getFlowExtendResult() {
			return this.flowExtendResult;
		}

		public void setFlowExtendResult(String flowExtendResult) {
			this.flowExtendResult = flowExtendResult;
		}

		public Boolean getCrawlerIsDelete() {
			return this.crawlerIsDelete;
		}

		public void setCrawlerIsDelete(Boolean crawlerIsDelete) {
			this.crawlerIsDelete = crawlerIsDelete;
		}

		public Integer getBatchProgress() {
			return this.batchProgress;
		}

		public void setBatchProgress(Integer batchProgress) {
			this.batchProgress = batchProgress;
		}

		public String getExecuteMode() {
			return this.executeMode;
		}

		public void setExecuteMode(String executeMode) {
			this.executeMode = executeMode;
		}
	}

	@Override
	public ListCrawlerWorkflowInstanceResponse getInstance(UnmarshallerContext context) {
		return	ListCrawlerWorkflowInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
