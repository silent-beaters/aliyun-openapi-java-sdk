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

package com.aliyuncs.oos.model.v20190601;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.oos.transform.v20190601.UpdateApplicationGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateApplicationGroupResponse extends AcsResponse {

	private String requestId;

	private ApplicationGroup applicationGroup;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ApplicationGroup getApplicationGroup() {
		return this.applicationGroup;
	}

	public void setApplicationGroup(ApplicationGroup applicationGroup) {
		this.applicationGroup = applicationGroup;
	}

	public static class ApplicationGroup {

		private String deployRegionId;

		private String description;

		private String importTagKey;

		private String updatedDate;

		private String applicationName;

		private String createdDate;

		private String importTagValue;

		private String name;

		public String getDeployRegionId() {
			return this.deployRegionId;
		}

		public void setDeployRegionId(String deployRegionId) {
			this.deployRegionId = deployRegionId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getImportTagKey() {
			return this.importTagKey;
		}

		public void setImportTagKey(String importTagKey) {
			this.importTagKey = importTagKey;
		}

		public String getUpdatedDate() {
			return this.updatedDate;
		}

		public void setUpdatedDate(String updatedDate) {
			this.updatedDate = updatedDate;
		}

		public String getApplicationName() {
			return this.applicationName;
		}

		public void setApplicationName(String applicationName) {
			this.applicationName = applicationName;
		}

		public String getCreatedDate() {
			return this.createdDate;
		}

		public void setCreatedDate(String createdDate) {
			this.createdDate = createdDate;
		}

		public String getImportTagValue() {
			return this.importTagValue;
		}

		public void setImportTagValue(String importTagValue) {
			this.importTagValue = importTagValue;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	@Override
	public UpdateApplicationGroupResponse getInstance(UnmarshallerContext context) {
		return	UpdateApplicationGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
