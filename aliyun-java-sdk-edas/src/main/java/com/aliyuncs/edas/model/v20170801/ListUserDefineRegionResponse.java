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

package com.aliyuncs.edas.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.ListUserDefineRegionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUserDefineRegionResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private List<UserDefineRegionEntity> userDefineRegionList;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
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

	public List<UserDefineRegionEntity> getUserDefineRegionList() {
		return this.userDefineRegionList;
	}

	public void setUserDefineRegionList(List<UserDefineRegionEntity> userDefineRegionList) {
		this.userDefineRegionList = userDefineRegionList;
	}

	public static class UserDefineRegionEntity {

		private String belongRegion;

		private String regionName;

		private String description;

		private Boolean debugEnable;

		private String userId;

		private Long id;

		private String regionId;

		public String getBelongRegion() {
			return this.belongRegion;
		}

		public void setBelongRegion(String belongRegion) {
			this.belongRegion = belongRegion;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Boolean getDebugEnable() {
			return this.debugEnable;
		}

		public void setDebugEnable(Boolean debugEnable) {
			this.debugEnable = debugEnable;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public ListUserDefineRegionResponse getInstance(UnmarshallerContext context) {
		return	ListUserDefineRegionResponseUnmarshaller.unmarshall(this, context);
	}
}
