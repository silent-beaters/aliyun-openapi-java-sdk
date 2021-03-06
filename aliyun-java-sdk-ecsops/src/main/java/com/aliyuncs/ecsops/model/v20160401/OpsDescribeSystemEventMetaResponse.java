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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeSystemEventMetaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeSystemEventMetaResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<EventMeta> eventMetas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<EventMeta> getEventMetas() {
		return this.eventMetas;
	}

	public void setEventMetas(List<EventMeta> eventMetas) {
		this.eventMetas = eventMetas;
	}

	public static class EventMeta {

		private String resourceType;

		private Integer code;

		private String name;

		private Boolean onlyNotification;

		private String openStatus;

		private String level;

		private Boolean supportSimulate;

		private Boolean reportCms;

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public Integer getCode() {
			return this.code;
		}

		public void setCode(Integer code) {
			this.code = code;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getOnlyNotification() {
			return this.onlyNotification;
		}

		public void setOnlyNotification(Boolean onlyNotification) {
			this.onlyNotification = onlyNotification;
		}

		public String getOpenStatus() {
			return this.openStatus;
		}

		public void setOpenStatus(String openStatus) {
			this.openStatus = openStatus;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public Boolean getSupportSimulate() {
			return this.supportSimulate;
		}

		public void setSupportSimulate(Boolean supportSimulate) {
			this.supportSimulate = supportSimulate;
		}

		public Boolean getReportCms() {
			return this.reportCms;
		}

		public void setReportCms(Boolean reportCms) {
			this.reportCms = reportCms;
		}
	}

	@Override
	public OpsDescribeSystemEventMetaResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeSystemEventMetaResponseUnmarshaller.unmarshall(this, context);
	}
}
