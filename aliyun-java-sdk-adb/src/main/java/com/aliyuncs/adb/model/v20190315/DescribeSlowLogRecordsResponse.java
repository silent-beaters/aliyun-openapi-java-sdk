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

package com.aliyuncs.adb.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeSlowLogRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSlowLogRecordsResponse extends AcsResponse {

	private String totalCount;

	private String pageSize;

	private String requestId;

	private String pageNumber;

	private String dBClusterId;

	private List<SlowLogRecord> items;

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public List<SlowLogRecord> getItems() {
		return this.items;
	}

	public void setItems(List<SlowLogRecord> items) {
		this.items = items;
	}

	public static class SlowLogRecord {

		private String hostAddress;

		private Long scanTime;

		private String sQLText;

		private String outputSize;

		private String peakMemoryUsage;

		private String state;

		private Long wallTime;

		private String scanSize;

		private String executionStartTime;

		private Long queryTime;

		private Long returnRowCounts;

		private Long scanRows;

		private Long parseRowCounts;

		private String dBName;

		private Long planningTime;

		private Long queueTime;

		private String userName;

		private String processID;

		public String getHostAddress() {
			return this.hostAddress;
		}

		public void setHostAddress(String hostAddress) {
			this.hostAddress = hostAddress;
		}

		public Long getScanTime() {
			return this.scanTime;
		}

		public void setScanTime(Long scanTime) {
			this.scanTime = scanTime;
		}

		public String getSQLText() {
			return this.sQLText;
		}

		public void setSQLText(String sQLText) {
			this.sQLText = sQLText;
		}

		public String getOutputSize() {
			return this.outputSize;
		}

		public void setOutputSize(String outputSize) {
			this.outputSize = outputSize;
		}

		public String getPeakMemoryUsage() {
			return this.peakMemoryUsage;
		}

		public void setPeakMemoryUsage(String peakMemoryUsage) {
			this.peakMemoryUsage = peakMemoryUsage;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Long getWallTime() {
			return this.wallTime;
		}

		public void setWallTime(Long wallTime) {
			this.wallTime = wallTime;
		}

		public String getScanSize() {
			return this.scanSize;
		}

		public void setScanSize(String scanSize) {
			this.scanSize = scanSize;
		}

		public String getExecutionStartTime() {
			return this.executionStartTime;
		}

		public void setExecutionStartTime(String executionStartTime) {
			this.executionStartTime = executionStartTime;
		}

		public Long getQueryTime() {
			return this.queryTime;
		}

		public void setQueryTime(Long queryTime) {
			this.queryTime = queryTime;
		}

		public Long getReturnRowCounts() {
			return this.returnRowCounts;
		}

		public void setReturnRowCounts(Long returnRowCounts) {
			this.returnRowCounts = returnRowCounts;
		}

		public Long getScanRows() {
			return this.scanRows;
		}

		public void setScanRows(Long scanRows) {
			this.scanRows = scanRows;
		}

		public Long getParseRowCounts() {
			return this.parseRowCounts;
		}

		public void setParseRowCounts(Long parseRowCounts) {
			this.parseRowCounts = parseRowCounts;
		}

		public String getDBName() {
			return this.dBName;
		}

		public void setDBName(String dBName) {
			this.dBName = dBName;
		}

		public Long getPlanningTime() {
			return this.planningTime;
		}

		public void setPlanningTime(Long planningTime) {
			this.planningTime = planningTime;
		}

		public Long getQueueTime() {
			return this.queueTime;
		}

		public void setQueueTime(Long queueTime) {
			this.queueTime = queueTime;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getProcessID() {
			return this.processID;
		}

		public void setProcessID(String processID) {
			this.processID = processID;
		}
	}

	@Override
	public DescribeSlowLogRecordsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSlowLogRecordsResponseUnmarshaller.unmarshall(this, context);
	}
}
