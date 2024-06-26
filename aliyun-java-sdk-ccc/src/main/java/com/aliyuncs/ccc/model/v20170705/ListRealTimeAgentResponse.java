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
import com.aliyuncs.ccc.transform.v20170705.ListRealTimeAgentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRealTimeAgentResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private List<User> data;

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

	public List<User> getData() {
		return this.data;
	}

	public void setData(List<User> data) {
		this.data = data;
	}

	public static class User {

		private String displayName;

		private String stateDesc;

		private String dn;

		private String state;

		private String ramId;

		private String phone;

		private List<SkillLevel> skillLevels;

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getStateDesc() {
			return this.stateDesc;
		}

		public void setStateDesc(String stateDesc) {
			this.stateDesc = stateDesc;
		}

		public String getDn() {
			return this.dn;
		}

		public void setDn(String dn) {
			this.dn = dn;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getRamId() {
			return this.ramId;
		}

		public void setRamId(String ramId) {
			this.ramId = ramId;
		}

		public String getPhone() {
			return this.phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
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

				private String skillGroupDescription;

				private String skillGroupId;

				private String skillGroupName;

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

				public String getSkillGroupId() {
					return this.skillGroupId;
				}

				public void setSkillGroupId(String skillGroupId) {
					this.skillGroupId = skillGroupId;
				}

				public String getSkillGroupName() {
					return this.skillGroupName;
				}

				public void setSkillGroupName(String skillGroupName) {
					this.skillGroupName = skillGroupName;
				}
			}
		}
	}

	@Override
	public ListRealTimeAgentResponse getInstance(UnmarshallerContext context) {
		return	ListRealTimeAgentResponseUnmarshaller.unmarshall(this, context);
	}
}
