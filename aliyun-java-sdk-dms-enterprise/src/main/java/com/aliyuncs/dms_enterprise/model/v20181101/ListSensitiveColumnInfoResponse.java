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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.ListSensitiveColumnInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSensitiveColumnInfoResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private Long totalCount;

	private List<SensitiveColumn> sensitiveColumnList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<SensitiveColumn> getSensitiveColumnList() {
		return this.sensitiveColumnList;
	}

	public void setSensitiveColumnList(List<SensitiveColumn> sensitiveColumnList) {
		this.sensitiveColumnList = sensitiveColumnList;
	}

	public static class SensitiveColumn {

		private Integer instanceId;

		private String schemaName;

		private String tableName;

		private String columnName;

		private String categoryName;

		private Boolean isPlain;

		private String securityLevel;

		private String userSensitivityLevel;

		private String sampleData;

		private List<SemiDesensitizationRule> semiDesensitizationRuleList;

		private DefaultDesensitizationRule defaultDesensitizationRule;

		public Integer getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(Integer instanceId) {
			this.instanceId = instanceId;
		}

		public String getSchemaName() {
			return this.schemaName;
		}

		public void setSchemaName(String schemaName) {
			this.schemaName = schemaName;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getColumnName() {
			return this.columnName;
		}

		public void setColumnName(String columnName) {
			this.columnName = columnName;
		}

		public String getCategoryName() {
			return this.categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}

		public Boolean getIsPlain() {
			return this.isPlain;
		}

		public void setIsPlain(Boolean isPlain) {
			this.isPlain = isPlain;
		}

		public String getSecurityLevel() {
			return this.securityLevel;
		}

		public void setSecurityLevel(String securityLevel) {
			this.securityLevel = securityLevel;
		}

		public String getUserSensitivityLevel() {
			return this.userSensitivityLevel;
		}

		public void setUserSensitivityLevel(String userSensitivityLevel) {
			this.userSensitivityLevel = userSensitivityLevel;
		}

		public String getSampleData() {
			return this.sampleData;
		}

		public void setSampleData(String sampleData) {
			this.sampleData = sampleData;
		}

		public List<SemiDesensitizationRule> getSemiDesensitizationRuleList() {
			return this.semiDesensitizationRuleList;
		}

		public void setSemiDesensitizationRuleList(List<SemiDesensitizationRule> semiDesensitizationRuleList) {
			this.semiDesensitizationRuleList = semiDesensitizationRuleList;
		}

		public DefaultDesensitizationRule getDefaultDesensitizationRule() {
			return this.defaultDesensitizationRule;
		}

		public void setDefaultDesensitizationRule(DefaultDesensitizationRule defaultDesensitizationRule) {
			this.defaultDesensitizationRule = defaultDesensitizationRule;
		}

		public static class SemiDesensitizationRule {

			private Long ruleId;

			private String ruleName;

			public Long getRuleId() {
				return this.ruleId;
			}

			public void setRuleId(Long ruleId) {
				this.ruleId = ruleId;
			}

			public String getRuleName() {
				return this.ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}
		}

		public static class DefaultDesensitizationRule {

			private Long ruleId;

			private String ruleName;

			public Long getRuleId() {
				return this.ruleId;
			}

			public void setRuleId(Long ruleId) {
				this.ruleId = ruleId;
			}

			public String getRuleName() {
				return this.ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}
		}
	}

	@Override
	public ListSensitiveColumnInfoResponse getInstance(UnmarshallerContext context) {
		return	ListSensitiveColumnInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
