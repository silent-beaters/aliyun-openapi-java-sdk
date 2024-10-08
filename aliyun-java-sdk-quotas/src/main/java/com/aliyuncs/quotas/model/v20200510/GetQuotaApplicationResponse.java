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

package com.aliyuncs.quotas.model.v20200510;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quotas.transform.v20200510.GetQuotaApplicationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetQuotaApplicationResponse extends AcsResponse {

	private String requestId;

	private QuotaApplication quotaApplication;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public QuotaApplication getQuotaApplication() {
		return this.quotaApplication;
	}

	public void setQuotaApplication(QuotaApplication quotaApplication) {
		this.quotaApplication = quotaApplication;
	}

	public static class QuotaApplication {

		private String applicationId;

		private String applyTime;

		private Float approveValue;

		private String auditReason;

		private Integer desireValue;

		private Map<Object,Object> dimension;

		private String effectiveTime;

		private String expireTime;

		private Long noticeType;

		private String productCode;

		private String quotaActionCode;

		private String quotaArn;

		private String quotaCategory;

		private String quotaDescription;

		private String quotaName;

		private String quotaUnit;

		private String reason;

		private String status;

		public String getApplicationId() {
			return this.applicationId;
		}

		public void setApplicationId(String applicationId) {
			this.applicationId = applicationId;
		}

		public String getApplyTime() {
			return this.applyTime;
		}

		public void setApplyTime(String applyTime) {
			this.applyTime = applyTime;
		}

		public Float getApproveValue() {
			return this.approveValue;
		}

		public void setApproveValue(Float approveValue) {
			this.approveValue = approveValue;
		}

		public String getAuditReason() {
			return this.auditReason;
		}

		public void setAuditReason(String auditReason) {
			this.auditReason = auditReason;
		}

		public Integer getDesireValue() {
			return this.desireValue;
		}

		public void setDesireValue(Integer desireValue) {
			this.desireValue = desireValue;
		}

		public Map<Object,Object> getDimension() {
			return this.dimension;
		}

		public void setDimension(Map<Object,Object> dimension) {
			this.dimension = dimension;
		}

		public String getEffectiveTime() {
			return this.effectiveTime;
		}

		public void setEffectiveTime(String effectiveTime) {
			this.effectiveTime = effectiveTime;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public Long getNoticeType() {
			return this.noticeType;
		}

		public void setNoticeType(Long noticeType) {
			this.noticeType = noticeType;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getQuotaActionCode() {
			return this.quotaActionCode;
		}

		public void setQuotaActionCode(String quotaActionCode) {
			this.quotaActionCode = quotaActionCode;
		}

		public String getQuotaArn() {
			return this.quotaArn;
		}

		public void setQuotaArn(String quotaArn) {
			this.quotaArn = quotaArn;
		}

		public String getQuotaCategory() {
			return this.quotaCategory;
		}

		public void setQuotaCategory(String quotaCategory) {
			this.quotaCategory = quotaCategory;
		}

		public String getQuotaDescription() {
			return this.quotaDescription;
		}

		public void setQuotaDescription(String quotaDescription) {
			this.quotaDescription = quotaDescription;
		}

		public String getQuotaName() {
			return this.quotaName;
		}

		public void setQuotaName(String quotaName) {
			this.quotaName = quotaName;
		}

		public String getQuotaUnit() {
			return this.quotaUnit;
		}

		public void setQuotaUnit(String quotaUnit) {
			this.quotaUnit = quotaUnit;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public GetQuotaApplicationResponse getInstance(UnmarshallerContext context) {
		return	GetQuotaApplicationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
