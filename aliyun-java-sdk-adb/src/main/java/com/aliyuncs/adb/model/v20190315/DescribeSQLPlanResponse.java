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
import com.aliyuncs.adb.transform.v20190315.DescribeSQLPlanResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSQLPlanResponse extends AcsResponse {

	private String requestId;

	private String originInfo;

	private List<SqlPlanStage> stageList;

	private Detail detail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getOriginInfo() {
		return this.originInfo;
	}

	public void setOriginInfo(String originInfo) {
		this.originInfo = originInfo;
	}

	public List<SqlPlanStage> getStageList() {
		return this.stageList;
	}

	public void setStageList(List<SqlPlanStage> stageList) {
		this.stageList = stageList;
	}

	public Detail getDetail() {
		return this.detail;
	}

	public void setDetail(Detail detail) {
		this.detail = detail;
	}

	public static class SqlPlanStage {

		private String state;

		private Long cPUTimeAvg;

		private Long cPUTimeMax;

		private Long operatorCost;

		private Long scanTimeMax;

		private Long inputSizeMax;

		private Integer stageId;

		private Long scanSizeMax;

		private Long cPUTimeMin;

		private Long scanTimeMin;

		private Long scanSizeMin;

		private Long inputSizeMin;

		private Long peakMemory;

		private Long scanTimeAvg;

		private Long scanSizeAvg;

		private Long inputSizeAvg;

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Long getCPUTimeAvg() {
			return this.cPUTimeAvg;
		}

		public void setCPUTimeAvg(Long cPUTimeAvg) {
			this.cPUTimeAvg = cPUTimeAvg;
		}

		public Long getCPUTimeMax() {
			return this.cPUTimeMax;
		}

		public void setCPUTimeMax(Long cPUTimeMax) {
			this.cPUTimeMax = cPUTimeMax;
		}

		public Long getOperatorCost() {
			return this.operatorCost;
		}

		public void setOperatorCost(Long operatorCost) {
			this.operatorCost = operatorCost;
		}

		public Long getScanTimeMax() {
			return this.scanTimeMax;
		}

		public void setScanTimeMax(Long scanTimeMax) {
			this.scanTimeMax = scanTimeMax;
		}

		public Long getInputSizeMax() {
			return this.inputSizeMax;
		}

		public void setInputSizeMax(Long inputSizeMax) {
			this.inputSizeMax = inputSizeMax;
		}

		public Integer getStageId() {
			return this.stageId;
		}

		public void setStageId(Integer stageId) {
			this.stageId = stageId;
		}

		public Long getScanSizeMax() {
			return this.scanSizeMax;
		}

		public void setScanSizeMax(Long scanSizeMax) {
			this.scanSizeMax = scanSizeMax;
		}

		public Long getCPUTimeMin() {
			return this.cPUTimeMin;
		}

		public void setCPUTimeMin(Long cPUTimeMin) {
			this.cPUTimeMin = cPUTimeMin;
		}

		public Long getScanTimeMin() {
			return this.scanTimeMin;
		}

		public void setScanTimeMin(Long scanTimeMin) {
			this.scanTimeMin = scanTimeMin;
		}

		public Long getScanSizeMin() {
			return this.scanSizeMin;
		}

		public void setScanSizeMin(Long scanSizeMin) {
			this.scanSizeMin = scanSizeMin;
		}

		public Long getInputSizeMin() {
			return this.inputSizeMin;
		}

		public void setInputSizeMin(Long inputSizeMin) {
			this.inputSizeMin = inputSizeMin;
		}

		public Long getPeakMemory() {
			return this.peakMemory;
		}

		public void setPeakMemory(Long peakMemory) {
			this.peakMemory = peakMemory;
		}

		public Long getScanTimeAvg() {
			return this.scanTimeAvg;
		}

		public void setScanTimeAvg(Long scanTimeAvg) {
			this.scanTimeAvg = scanTimeAvg;
		}

		public Long getScanSizeAvg() {
			return this.scanSizeAvg;
		}

		public void setScanSizeAvg(Long scanSizeAvg) {
			this.scanSizeAvg = scanSizeAvg;
		}

		public Long getInputSizeAvg() {
			return this.inputSizeAvg;
		}

		public void setInputSizeAvg(Long inputSizeAvg) {
			this.inputSizeAvg = inputSizeAvg;
		}
	}

	public static class Detail {

		private String sQL;

		private Long outputSize;

		private String state;

		private Long outputRows;

		private String user;

		private String startTime;

		private Long totalStage;

		private Long queuedTime;

		private Long totalTime;

		private Long totalTask;

		private String database;

		private Long peakMemory;

		private String clientIP;

		private Long planningTime;

		private Long cPUTime;

		public String getSQL() {
			return this.sQL;
		}

		public void setSQL(String sQL) {
			this.sQL = sQL;
		}

		public Long getOutputSize() {
			return this.outputSize;
		}

		public void setOutputSize(Long outputSize) {
			this.outputSize = outputSize;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Long getOutputRows() {
			return this.outputRows;
		}

		public void setOutputRows(Long outputRows) {
			this.outputRows = outputRows;
		}

		public String getUser() {
			return this.user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public Long getTotalStage() {
			return this.totalStage;
		}

		public void setTotalStage(Long totalStage) {
			this.totalStage = totalStage;
		}

		public Long getQueuedTime() {
			return this.queuedTime;
		}

		public void setQueuedTime(Long queuedTime) {
			this.queuedTime = queuedTime;
		}

		public Long getTotalTime() {
			return this.totalTime;
		}

		public void setTotalTime(Long totalTime) {
			this.totalTime = totalTime;
		}

		public Long getTotalTask() {
			return this.totalTask;
		}

		public void setTotalTask(Long totalTask) {
			this.totalTask = totalTask;
		}

		public String getDatabase() {
			return this.database;
		}

		public void setDatabase(String database) {
			this.database = database;
		}

		public Long getPeakMemory() {
			return this.peakMemory;
		}

		public void setPeakMemory(Long peakMemory) {
			this.peakMemory = peakMemory;
		}

		public String getClientIP() {
			return this.clientIP;
		}

		public void setClientIP(String clientIP) {
			this.clientIP = clientIP;
		}

		public Long getPlanningTime() {
			return this.planningTime;
		}

		public void setPlanningTime(Long planningTime) {
			this.planningTime = planningTime;
		}

		public Long getCPUTime() {
			return this.cPUTime;
		}

		public void setCPUTime(Long cPUTime) {
			this.cPUTime = cPUTime;
		}
	}

	@Override
	public DescribeSQLPlanResponse getInstance(UnmarshallerContext context) {
		return	DescribeSQLPlanResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
