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

package com.aliyuncs.ccc.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20170705.ListTransferableSkillGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTransferableSkillGroupsResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private List<SkillGroup> skillGroups;

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

	public List<SkillGroup> getSkillGroups() {
		return this.skillGroups;
	}

	public void setSkillGroups(List<SkillGroup> skillGroups) {
		this.skillGroups = skillGroups;
	}

	public static class SkillGroup {

		private Boolean allowPrivateOutboundNumber;

		private String routingStrategy;

		private String skillGroupName;

		private String skillGroupId;

		private Integer userCount;

		private String accQueueName;

		private String instanceId;

		private String skillGroupDescription;

		private String accSkillGroupName;

		public Boolean getAllowPrivateOutboundNumber() {
			return this.allowPrivateOutboundNumber;
		}

		public void setAllowPrivateOutboundNumber(Boolean allowPrivateOutboundNumber) {
			this.allowPrivateOutboundNumber = allowPrivateOutboundNumber;
		}

		public String getRoutingStrategy() {
			return this.routingStrategy;
		}

		public void setRoutingStrategy(String routingStrategy) {
			this.routingStrategy = routingStrategy;
		}

		public String getSkillGroupName() {
			return this.skillGroupName;
		}

		public void setSkillGroupName(String skillGroupName) {
			this.skillGroupName = skillGroupName;
		}

		public String getSkillGroupId() {
			return this.skillGroupId;
		}

		public void setSkillGroupId(String skillGroupId) {
			this.skillGroupId = skillGroupId;
		}

		public Integer getUserCount() {
			return this.userCount;
		}

		public void setUserCount(Integer userCount) {
			this.userCount = userCount;
		}

		public String getAccQueueName() {
			return this.accQueueName;
		}

		public void setAccQueueName(String accQueueName) {
			this.accQueueName = accQueueName;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getSkillGroupDescription() {
			return this.skillGroupDescription;
		}

		public void setSkillGroupDescription(String skillGroupDescription) {
			this.skillGroupDescription = skillGroupDescription;
		}

		public String getAccSkillGroupName() {
			return this.accSkillGroupName;
		}

		public void setAccSkillGroupName(String accSkillGroupName) {
			this.accSkillGroupName = accSkillGroupName;
		}
	}

	@Override
	public ListTransferableSkillGroupsResponse getInstance(UnmarshallerContext context) {
		return	ListTransferableSkillGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
