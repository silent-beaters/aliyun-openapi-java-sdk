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

package com.aliyuncs.devops.model.v20210625;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.CreateProtectdBranchResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateProtectdBranchResponse extends AcsResponse {

	private String requestId;

	private String errorMessage;

	private String errorCode;

	private Boolean success;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Long id;

		private String branch;

		private List<Integer> allowPushRoles;

		private List<Long> allowPushUserIds;

		private List<Integer> allowMergeRoles;

		private List<Long> allowMergeUserIds;

		private MergeRequestSetting mergeRequestSetting;

		private TestSettingDTO testSettingDTO;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getBranch() {
			return this.branch;
		}

		public void setBranch(String branch) {
			this.branch = branch;
		}

		public List<Integer> getAllowPushRoles() {
			return this.allowPushRoles;
		}

		public void setAllowPushRoles(List<Integer> allowPushRoles) {
			this.allowPushRoles = allowPushRoles;
		}

		public List<Long> getAllowPushUserIds() {
			return this.allowPushUserIds;
		}

		public void setAllowPushUserIds(List<Long> allowPushUserIds) {
			this.allowPushUserIds = allowPushUserIds;
		}

		public List<Integer> getAllowMergeRoles() {
			return this.allowMergeRoles;
		}

		public void setAllowMergeRoles(List<Integer> allowMergeRoles) {
			this.allowMergeRoles = allowMergeRoles;
		}

		public List<Long> getAllowMergeUserIds() {
			return this.allowMergeUserIds;
		}

		public void setAllowMergeUserIds(List<Long> allowMergeUserIds) {
			this.allowMergeUserIds = allowMergeUserIds;
		}

		public MergeRequestSetting getMergeRequestSetting() {
			return this.mergeRequestSetting;
		}

		public void setMergeRequestSetting(MergeRequestSetting mergeRequestSetting) {
			this.mergeRequestSetting = mergeRequestSetting;
		}

		public TestSettingDTO getTestSettingDTO() {
			return this.testSettingDTO;
		}

		public void setTestSettingDTO(TestSettingDTO testSettingDTO) {
			this.testSettingDTO = testSettingDTO;
		}

		public static class MergeRequestSetting {

			private Boolean isRequired;

			private String mrMode;

			private Boolean isAllowSelfApproval;

			private Boolean isRequireDiscussionProcessed;

			private Boolean isResetApprovalWhenNewPush;

			private Integer minimumApproval;

			private String whiteList;

			private List<Integer> allowMergeRequestRoles;

			private List<String> defaultAssignees;

			public Boolean getIsRequired() {
				return this.isRequired;
			}

			public void setIsRequired(Boolean isRequired) {
				this.isRequired = isRequired;
			}

			public String getMrMode() {
				return this.mrMode;
			}

			public void setMrMode(String mrMode) {
				this.mrMode = mrMode;
			}

			public Boolean getIsAllowSelfApproval() {
				return this.isAllowSelfApproval;
			}

			public void setIsAllowSelfApproval(Boolean isAllowSelfApproval) {
				this.isAllowSelfApproval = isAllowSelfApproval;
			}

			public Boolean getIsRequireDiscussionProcessed() {
				return this.isRequireDiscussionProcessed;
			}

			public void setIsRequireDiscussionProcessed(Boolean isRequireDiscussionProcessed) {
				this.isRequireDiscussionProcessed = isRequireDiscussionProcessed;
			}

			public Boolean getIsResetApprovalWhenNewPush() {
				return this.isResetApprovalWhenNewPush;
			}

			public void setIsResetApprovalWhenNewPush(Boolean isResetApprovalWhenNewPush) {
				this.isResetApprovalWhenNewPush = isResetApprovalWhenNewPush;
			}

			public Integer getMinimumApproval() {
				return this.minimumApproval;
			}

			public void setMinimumApproval(Integer minimumApproval) {
				this.minimumApproval = minimumApproval;
			}

			public String getWhiteList() {
				return this.whiteList;
			}

			public void setWhiteList(String whiteList) {
				this.whiteList = whiteList;
			}

			public List<Integer> getAllowMergeRequestRoles() {
				return this.allowMergeRequestRoles;
			}

			public void setAllowMergeRequestRoles(List<Integer> allowMergeRequestRoles) {
				this.allowMergeRequestRoles = allowMergeRequestRoles;
			}

			public List<String> getDefaultAssignees() {
				return this.defaultAssignees;
			}

			public void setDefaultAssignees(List<String> defaultAssignees) {
				this.defaultAssignees = defaultAssignees;
			}
		}

		public static class TestSettingDTO {

			private Boolean isRequired;

			private CodeGuidelinesDetection codeGuidelinesDetection;

			private SensitiveInfoDetection sensitiveInfoDetection;

			private CheckTaskQualityConfig checkTaskQualityConfig;

			private CheckConfig checkConfig;

			public Boolean getIsRequired() {
				return this.isRequired;
			}

			public void setIsRequired(Boolean isRequired) {
				this.isRequired = isRequired;
			}

			public CodeGuidelinesDetection getCodeGuidelinesDetection() {
				return this.codeGuidelinesDetection;
			}

			public void setCodeGuidelinesDetection(CodeGuidelinesDetection codeGuidelinesDetection) {
				this.codeGuidelinesDetection = codeGuidelinesDetection;
			}

			public SensitiveInfoDetection getSensitiveInfoDetection() {
				return this.sensitiveInfoDetection;
			}

			public void setSensitiveInfoDetection(SensitiveInfoDetection sensitiveInfoDetection) {
				this.sensitiveInfoDetection = sensitiveInfoDetection;
			}

			public CheckTaskQualityConfig getCheckTaskQualityConfig() {
				return this.checkTaskQualityConfig;
			}

			public void setCheckTaskQualityConfig(CheckTaskQualityConfig checkTaskQualityConfig) {
				this.checkTaskQualityConfig = checkTaskQualityConfig;
			}

			public CheckConfig getCheckConfig() {
				return this.checkConfig;
			}

			public void setCheckConfig(CheckConfig checkConfig) {
				this.checkConfig = checkConfig;
			}

			public static class CodeGuidelinesDetection {

				private Boolean enabled;

				private String message;

				public Boolean getEnabled() {
					return this.enabled;
				}

				public void setEnabled(Boolean enabled) {
					this.enabled = enabled;
				}

				public String getMessage() {
					return this.message;
				}

				public void setMessage(String message) {
					this.message = message;
				}
			}

			public static class SensitiveInfoDetection {

				private Boolean enabled;

				private String message;

				public Boolean getEnabled() {
					return this.enabled;
				}

				public void setEnabled(Boolean enabled) {
					this.enabled = enabled;
				}

				public String getMessage() {
					return this.message;
				}

				public void setMessage(String message) {
					this.message = message;
				}
			}

			public static class CheckTaskQualityConfig {

				private Boolean enabled;

				private String bizNo;

				private String taskName;

				private String message;

				public Boolean getEnabled() {
					return this.enabled;
				}

				public void setEnabled(Boolean enabled) {
					this.enabled = enabled;
				}

				public String getBizNo() {
					return this.bizNo;
				}

				public void setBizNo(String bizNo) {
					this.bizNo = bizNo;
				}

				public String getTaskName() {
					return this.taskName;
				}

				public void setTaskName(String taskName) {
					this.taskName = taskName;
				}

				public String getMessage() {
					return this.message;
				}

				public void setMessage(String message) {
					this.message = message;
				}
			}

			public static class CheckConfig {

				private List<Check_items> checkItems;

				public List<Check_items> getCheckItems() {
					return this.checkItems;
				}

				public void setCheckItems(List<Check_items> checkItems) {
					this.checkItems = checkItems;
				}

				public static class Check_items {

					private String name;

					private Boolean isRequired;

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public Boolean getIsRequired() {
						return this.isRequired;
					}

					public void setIsRequired(Boolean isRequired) {
						this.isRequired = isRequired;
					}
				}
			}
		}
	}

	@Override
	public CreateProtectdBranchResponse getInstance(UnmarshallerContext context) {
		return	CreateProtectdBranchResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
