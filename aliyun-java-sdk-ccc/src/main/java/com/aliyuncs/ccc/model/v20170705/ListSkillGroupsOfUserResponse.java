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
import com.aliyuncs.ccc.transform.v20170705.ListSkillGroupsOfUserResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSkillGroupsOfUserResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private List<SkillLevel> skillLevels;

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

	public List<SkillLevel> getSkillLevels() {
		return this.skillLevels;
	}

	public void setSkillLevels(List<SkillLevel> skillLevels) {
		this.skillLevels = skillLevels;
	}

	public static class SkillLevel {

		private String skillLevelId;

		private Integer level;

		private Skill skill;

		public String getSkillLevelId() {
			return this.skillLevelId;
		}

		public void setSkillLevelId(String skillLevelId) {
			this.skillLevelId = skillLevelId;
		}

		public Integer getLevel() {
			return this.level;
		}

		public void setLevel(Integer level) {
			this.level = level;
		}

		public Skill getSkill() {
			return this.skill;
		}

		public void setSkill(Skill skill) {
			this.skill = skill;
		}

		public static class Skill {

			private String instanceId;

			private String routingStrategy;

			private String skillGroupDescription;

			private String skillGroupName;

			private String skillGroupId;

			private List<PhoneNumber> outboundPhoneNumbers;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getRoutingStrategy() {
				return this.routingStrategy;
			}

			public void setRoutingStrategy(String routingStrategy) {
				this.routingStrategy = routingStrategy;
			}

			public String getSkillGroupDescription() {
				return this.skillGroupDescription;
			}

			public void setSkillGroupDescription(String skillGroupDescription) {
				this.skillGroupDescription = skillGroupDescription;
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

			public List<PhoneNumber> getOutboundPhoneNumbers() {
				return this.outboundPhoneNumbers;
			}

			public void setOutboundPhoneNumbers(List<PhoneNumber> outboundPhoneNumbers) {
				this.outboundPhoneNumbers = outboundPhoneNumbers;
			}

			public static class PhoneNumber {

				private Boolean testOnly;

				private Integer trunks;

				private Integer remainingTime;

				private String number;

				private String city;

				private String instanceId;

				private String usage;

				private Boolean allowOutbound;

				private String phoneNumberDescription;

				private String province;

				private String phoneNumberId;

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

				public String getCity() {
					return this.city;
				}

				public void setCity(String city) {
					this.city = city;
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

				public String getProvince() {
					return this.province;
				}

				public void setProvince(String province) {
					this.province = province;
				}

				public String getPhoneNumberId() {
					return this.phoneNumberId;
				}

				public void setPhoneNumberId(String phoneNumberId) {
					this.phoneNumberId = phoneNumberId;
				}
			}
		}
	}

	@Override
	public ListSkillGroupsOfUserResponse getInstance(UnmarshallerContext context) {
		return	ListSkillGroupsOfUserResponseUnmarshaller.unmarshall(this, context);
	}
}
