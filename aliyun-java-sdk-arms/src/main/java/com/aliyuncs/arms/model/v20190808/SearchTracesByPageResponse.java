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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.SearchTracesByPageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchTracesByPageResponse extends AcsResponse {

	private String requestId;

	private PageBean pageBean;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PageBean getPageBean() {
		return this.pageBean;
	}

	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}

	public static class PageBean {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer total;

		private List<TraceInfo> traceInfos;

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public List<TraceInfo> getTraceInfos() {
			return this.traceInfos;
		}

		public void setTraceInfos(List<TraceInfo> traceInfos) {
			this.traceInfos = traceInfos;
		}

		public static class TraceInfo {

			private String operationName;

			private String serviceIp;

			private Long duration;

			private Long timestamp;

			private String serviceName;

			private String traceID;

			private String spanID;

			public String getOperationName() {
				return this.operationName;
			}

			public void setOperationName(String operationName) {
				this.operationName = operationName;
			}

			public String getServiceIp() {
				return this.serviceIp;
			}

			public void setServiceIp(String serviceIp) {
				this.serviceIp = serviceIp;
			}

			public Long getDuration() {
				return this.duration;
			}

			public void setDuration(Long duration) {
				this.duration = duration;
			}

			public Long getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(Long timestamp) {
				this.timestamp = timestamp;
			}

			public String getServiceName() {
				return this.serviceName;
			}

			public void setServiceName(String serviceName) {
				this.serviceName = serviceName;
			}

			public String getTraceID() {
				return this.traceID;
			}

			public void setTraceID(String traceID) {
				this.traceID = traceID;
			}

			public String getSpanID() {
				return this.spanID;
			}

			public void setSpanID(String spanID) {
				this.spanID = spanID;
			}
		}
	}

	@Override
	public SearchTracesByPageResponse getInstance(UnmarshallerContext context) {
		return	SearchTracesByPageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
