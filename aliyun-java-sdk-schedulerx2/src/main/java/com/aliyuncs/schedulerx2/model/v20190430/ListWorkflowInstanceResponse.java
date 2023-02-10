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

package com.aliyuncs.schedulerx2.model.v20190430;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.schedulerx2.transform.v20190430.ListWorkflowInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListWorkflowInstanceResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private Boolean success;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<WfInstanceInfosItem> wfInstanceInfos;

		public List<WfInstanceInfosItem> getWfInstanceInfos() {
			return this.wfInstanceInfos;
		}

		public void setWfInstanceInfos(List<WfInstanceInfosItem> wfInstanceInfos) {
			this.wfInstanceInfos = wfInstanceInfos;
		}

		public static class WfInstanceInfosItem {

			private Long wfInstanceId;

			private Long workflowId;

			private Integer status;

			private String startTime;

			private String endTime;

			private String scheduleTime;

			private String dataTime;

			public Long getWfInstanceId() {
				return this.wfInstanceId;
			}

			public void setWfInstanceId(Long wfInstanceId) {
				this.wfInstanceId = wfInstanceId;
			}

			public Long getWorkflowId() {
				return this.workflowId;
			}

			public void setWorkflowId(Long workflowId) {
				this.workflowId = workflowId;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getScheduleTime() {
				return this.scheduleTime;
			}

			public void setScheduleTime(String scheduleTime) {
				this.scheduleTime = scheduleTime;
			}

			public String getDataTime() {
				return this.dataTime;
			}

			public void setDataTime(String dataTime) {
				this.dataTime = dataTime;
			}
		}
	}

	@Override
	public ListWorkflowInstanceResponse getInstance(UnmarshallerContext context) {
		return	ListWorkflowInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
