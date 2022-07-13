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

package com.aliyuncs.outboundbot.model.v20191226;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.QueryScriptsByStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryScriptsByStatusResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Scripts scripts;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public Scripts getScripts() {
		return this.scripts;
	}

	public void setScripts(Scripts scripts) {
		this.scripts = scripts;
	}

	public static class Scripts {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<Script> list;

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

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<Script> getList() {
			return this.list;
		}

		public void setList(List<Script> list) {
			this.list = list;
		}

		public static class Script {

			private String status;

			private Long updateTime;

			private String scriptId;

			private String appliedVersion;

			private Boolean isDebugDrafted;

			private String industry;

			private String scriptDescription;

			private Boolean isDrafted;

			private String debugStatus;

			private String debugVersion;

			private String scene;

			private String scriptName;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Long getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(Long updateTime) {
				this.updateTime = updateTime;
			}

			public String getScriptId() {
				return this.scriptId;
			}

			public void setScriptId(String scriptId) {
				this.scriptId = scriptId;
			}

			public String getAppliedVersion() {
				return this.appliedVersion;
			}

			public void setAppliedVersion(String appliedVersion) {
				this.appliedVersion = appliedVersion;
			}

			public Boolean getIsDebugDrafted() {
				return this.isDebugDrafted;
			}

			public void setIsDebugDrafted(Boolean isDebugDrafted) {
				this.isDebugDrafted = isDebugDrafted;
			}

			public String getIndustry() {
				return this.industry;
			}

			public void setIndustry(String industry) {
				this.industry = industry;
			}

			public String getScriptDescription() {
				return this.scriptDescription;
			}

			public void setScriptDescription(String scriptDescription) {
				this.scriptDescription = scriptDescription;
			}

			public Boolean getIsDrafted() {
				return this.isDrafted;
			}

			public void setIsDrafted(Boolean isDrafted) {
				this.isDrafted = isDrafted;
			}

			public String getDebugStatus() {
				return this.debugStatus;
			}

			public void setDebugStatus(String debugStatus) {
				this.debugStatus = debugStatus;
			}

			public String getDebugVersion() {
				return this.debugVersion;
			}

			public void setDebugVersion(String debugVersion) {
				this.debugVersion = debugVersion;
			}

			public String getScene() {
				return this.scene;
			}

			public void setScene(String scene) {
				this.scene = scene;
			}

			public String getScriptName() {
				return this.scriptName;
			}

			public void setScriptName(String scriptName) {
				this.scriptName = scriptName;
			}
		}
	}

	@Override
	public QueryScriptsByStatusResponse getInstance(UnmarshallerContext context) {
		return	QueryScriptsByStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
