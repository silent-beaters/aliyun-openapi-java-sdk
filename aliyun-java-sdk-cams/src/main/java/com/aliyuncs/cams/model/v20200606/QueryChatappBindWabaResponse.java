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

package com.aliyuncs.cams.model.v20200606;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cams.transform.v20200606.QueryChatappBindWabaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryChatappBindWabaResponse extends AcsResponse {

	private String accessDeniedDetail;

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private Data data;

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Map<Object,Object> authInternationalRateEligibility;

		private String businessName;

		private String currency;

		private String id;

		private String accountReviewStatus;

		private String messageTemplateNamespace;

		private String businessId;

		private String name;

		private String primaryBusinessLocation;

		public Map<Object,Object> getAuthInternationalRateEligibility() {
			return this.authInternationalRateEligibility;
		}

		public void setAuthInternationalRateEligibility(Map<Object,Object> authInternationalRateEligibility) {
			this.authInternationalRateEligibility = authInternationalRateEligibility;
		}

		public String getBusinessName() {
			return this.businessName;
		}

		public void setBusinessName(String businessName) {
			this.businessName = businessName;
		}

		public String getCurrency() {
			return this.currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getAccountReviewStatus() {
			return this.accountReviewStatus;
		}

		public void setAccountReviewStatus(String accountReviewStatus) {
			this.accountReviewStatus = accountReviewStatus;
		}

		public String getMessageTemplateNamespace() {
			return this.messageTemplateNamespace;
		}

		public void setMessageTemplateNamespace(String messageTemplateNamespace) {
			this.messageTemplateNamespace = messageTemplateNamespace;
		}

		public String getBusinessId() {
			return this.businessId;
		}

		public void setBusinessId(String businessId) {
			this.businessId = businessId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPrimaryBusinessLocation() {
			return this.primaryBusinessLocation;
		}

		public void setPrimaryBusinessLocation(String primaryBusinessLocation) {
			this.primaryBusinessLocation = primaryBusinessLocation;
		}
	}

	@Override
	public QueryChatappBindWabaResponse getInstance(UnmarshallerContext context) {
		return	QueryChatappBindWabaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
