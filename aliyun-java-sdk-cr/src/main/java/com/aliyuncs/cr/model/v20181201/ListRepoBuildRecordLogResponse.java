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
import com.aliyuncs.cr.transform.v20181201.ListRepoBuildRecordLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRepoBuildRecordLogResponse extends AcsResponse {

	private String requestId;

	private String code;

	private Integer pageNo;

	private Boolean isSuccess;

	private Integer pageSize;

	private String totalCount;

	private List<BuildRecordLogsItem> buildRecordLogs;

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

	public List<BuildRecordLogsItem> getBuildRecordLogs() {
		return this.buildRecordLogs;
	}

	public void setBuildRecordLogs(List<BuildRecordLogsItem> buildRecordLogs) {
		this.buildRecordLogs = buildRecordLogs;
	}

	public static class BuildRecordLogsItem {

		private Integer lineNumber;

		private String message;

		private String buildStage;

		public Integer getLineNumber() {
			return this.lineNumber;
		}

		public void setLineNumber(Integer lineNumber) {
			this.lineNumber = lineNumber;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getBuildStage() {
			return this.buildStage;
		}

		public void setBuildStage(String buildStage) {
			this.buildStage = buildStage;
		}
	}

	@Override
	public ListRepoBuildRecordLogResponse getInstance(UnmarshallerContext context) {
		return	ListRepoBuildRecordLogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
