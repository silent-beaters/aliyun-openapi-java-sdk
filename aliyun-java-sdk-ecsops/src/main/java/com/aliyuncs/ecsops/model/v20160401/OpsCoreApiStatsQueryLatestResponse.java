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
import com.aliyuncs.ecsops.transform.v20160401.OpsCoreApiStatsQueryLatestResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsCoreApiStatsQueryLatestResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private String success;

	private List<DataItem> data;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String regionId;

		private Long timestamp;

		private List<ApiStat> apiStats;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}

		public List<ApiStat> getApiStats() {
			return this.apiStats;
		}

		public void setApiStats(List<ApiStat> apiStats) {
			this.apiStats = apiStats;
		}

		public static class ApiStat {

			private String apiType;

			private Long failureCount;

			private Float responseTimeAvg;

			private Long totalCount;

			public String getApiType() {
				return this.apiType;
			}

			public void setApiType(String apiType) {
				this.apiType = apiType;
			}

			public Long getFailureCount() {
				return this.failureCount;
			}

			public void setFailureCount(Long failureCount) {
				this.failureCount = failureCount;
			}

			public Float getResponseTimeAvg() {
				return this.responseTimeAvg;
			}

			public void setResponseTimeAvg(Float responseTimeAvg) {
				this.responseTimeAvg = responseTimeAvg;
			}

			public Long getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Long totalCount) {
				this.totalCount = totalCount;
			}
		}
	}

	@Override
	public OpsCoreApiStatsQueryLatestResponse getInstance(UnmarshallerContext context) {
		return	OpsCoreApiStatsQueryLatestResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
