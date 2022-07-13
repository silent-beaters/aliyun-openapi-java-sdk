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

package com.aliyuncs.sddp.model.v20190103;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sddp.transform.v20190103.DescribeDataMaskingRunHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataMaskingRunHistoryResponse extends AcsResponse {

	private Integer currentPage;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<Task> items;

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
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

	public List<Task> getItems() {
		return this.items;
	}

	public void setItems(List<Task> items) {
		this.items = items;
	}

	public static class Task {

		private Integer status;

		private Integer type;

		private Integer srcType;

		private String srcTableName;

		private Long maskingCount;

		private Integer percentage;

		private Integer dstType;

		private String failMsg;

		private String failCode;

		private Long conflictCount;

		private String dstTypeCode;

		private Long endTime;

		private Integer runIndex;

		private Long startTime;

		private Integer hasSubProcess;

		private Integer hasDownloadFile;

		private String taskId;

		private String srcTypeCode;

		private Long id;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public Integer getSrcType() {
			return this.srcType;
		}

		public void setSrcType(Integer srcType) {
			this.srcType = srcType;
		}

		public String getSrcTableName() {
			return this.srcTableName;
		}

		public void setSrcTableName(String srcTableName) {
			this.srcTableName = srcTableName;
		}

		public Long getMaskingCount() {
			return this.maskingCount;
		}

		public void setMaskingCount(Long maskingCount) {
			this.maskingCount = maskingCount;
		}

		public Integer getPercentage() {
			return this.percentage;
		}

		public void setPercentage(Integer percentage) {
			this.percentage = percentage;
		}

		public Integer getDstType() {
			return this.dstType;
		}

		public void setDstType(Integer dstType) {
			this.dstType = dstType;
		}

		public String getFailMsg() {
			return this.failMsg;
		}

		public void setFailMsg(String failMsg) {
			this.failMsg = failMsg;
		}

		public String getFailCode() {
			return this.failCode;
		}

		public void setFailCode(String failCode) {
			this.failCode = failCode;
		}

		public Long getConflictCount() {
			return this.conflictCount;
		}

		public void setConflictCount(Long conflictCount) {
			this.conflictCount = conflictCount;
		}

		public String getDstTypeCode() {
			return this.dstTypeCode;
		}

		public void setDstTypeCode(String dstTypeCode) {
			this.dstTypeCode = dstTypeCode;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Integer getRunIndex() {
			return this.runIndex;
		}

		public void setRunIndex(Integer runIndex) {
			this.runIndex = runIndex;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Integer getHasSubProcess() {
			return this.hasSubProcess;
		}

		public void setHasSubProcess(Integer hasSubProcess) {
			this.hasSubProcess = hasSubProcess;
		}

		public Integer getHasDownloadFile() {
			return this.hasDownloadFile;
		}

		public void setHasDownloadFile(Integer hasDownloadFile) {
			this.hasDownloadFile = hasDownloadFile;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getSrcTypeCode() {
			return this.srcTypeCode;
		}

		public void setSrcTypeCode(String srcTypeCode) {
			this.srcTypeCode = srcTypeCode;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}
	}

	@Override
	public DescribeDataMaskingRunHistoryResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataMaskingRunHistoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
