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
import com.aliyuncs.ccc.transform.v20170705.AddBulkPhoneNumbersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddBulkPhoneNumbersResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private List<PhoneNumber> phoneNumbers;

	private List<String> arrearagePhoneNumbers;

	private List<String> failedPhoneNumbers;

	private List<String> userdPhoneNumbers;

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

	public List<PhoneNumber> getPhoneNumbers() {
		return this.phoneNumbers;
	}

	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public List<String> getArrearagePhoneNumbers() {
		return this.arrearagePhoneNumbers;
	}

	public void setArrearagePhoneNumbers(List<String> arrearagePhoneNumbers) {
		this.arrearagePhoneNumbers = arrearagePhoneNumbers;
	}

	public List<String> getFailedPhoneNumbers() {
		return this.failedPhoneNumbers;
	}

	public void setFailedPhoneNumbers(List<String> failedPhoneNumbers) {
		this.failedPhoneNumbers = failedPhoneNumbers;
	}

	public List<String> getUserdPhoneNumbers() {
		return this.userdPhoneNumbers;
	}

	public void setUserdPhoneNumbers(List<String> userdPhoneNumbers) {
		this.userdPhoneNumbers = userdPhoneNumbers;
	}

	public static class PhoneNumber {

		private Boolean testOnly;

		private Integer trunks;

		private Integer remainingTime;

		private String number;

		private String instanceId;

		private String usage;

		private Boolean allowOutbound;

		private String phoneNumberDescription;

		private String phoneNumberId;

		private List<SkillGroup> skillGroups;

		private ContactFlow contactFlow;

		public Boolean getTestOnly() {
			return this.testOnly;
		}

		public void setTestOnly(Boolean testOnly) {
			this.testOnly = testOnly;
		}

		public Integer getTrunks() {
			return this.trunks;
		}

		public void setTrunks(Integer trunks) {
			this.trunks = trunks;
		}

		public Integer getRemainingTime() {
			return this.remainingTime;
		}

		public void setRemainingTime(Integer remainingTime) {
			this.remainingTime = remainingTime;
		}

		public String getNumber() {
			return this.number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getUsage() {
			return this.usage;
		}

		public void setUsage(String usage) {
			this.usage = usage;
		}

		public Boolean getAllowOutbound() {
			return this.allowOutbound;
		}

		public void setAllowOutbound(Boolean allowOutbound) {
			this.allowOutbound = allowOutbound;
		}

		public String getPhoneNumberDescription() {
			return this.phoneNumberDescription;
		}

		public void setPhoneNumberDescription(String phoneNumberDescription) {
			this.phoneNumberDescription = phoneNumberDescription;
		}

		public String getPhoneNumberId() {
			return this.phoneNumberId;
		}

		public void setPhoneNumberId(String phoneNumberId) {
			this.phoneNumberId = phoneNumberId;
		}

		public List<SkillGroup> getSkillGroups() {
			return this.skillGroups;
		}

		public void setSkillGroups(List<SkillGroup> skillGroups) {
			this.skillGroups = skillGroups;
		}

		public ContactFlow getContactFlow() {
			return this.contactFlow;
		}

		public void setContactFlow(ContactFlow contactFlow) {
			this.contactFlow = contactFlow;
		}

		public static class SkillGroup {

			private String skillGroupName;

			private String skillGroupId;

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
		}

		public static class ContactFlow {

			private String type;

			private String contactFlowDescription;

			private String instanceId;

			private String contactFlowName;

			private String contactFlowId;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getContactFlowDescription() {
				return this.contactFlowDescription;
			}

			public void setContactFlowDescription(String contactFlowDescription) {
				this.contactFlowDescription = contactFlowDescription;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getContactFlowName() {
				return this.contactFlowName;
			}

			public void setContactFlowName(String contactFlowName) {
				this.contactFlowName = contactFlowName;
			}

			public String getContactFlowId() {
				return this.contactFlowId;
			}

			public void setContactFlowId(String contactFlowId) {
				this.contactFlowId = contactFlowId;
			}
		}
	}

	@Override
	public AddBulkPhoneNumbersResponse getInstance(UnmarshallerContext context) {
		return	AddBulkPhoneNumbersResponseUnmarshaller.unmarshall(this, context);
	}
}
