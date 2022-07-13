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

package com.aliyuncs.account_crm.model.v20160606;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.account_crm.transform.v20160606.GetAgRelationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAgRelationResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private AgRelationDto agRelationDto;

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

	public AgRelationDto getAgRelationDto() {
		return this.agRelationDto;
	}

	public void setAgRelationDto(AgRelationDto agRelationDto) {
		this.agRelationDto = agRelationDto;
	}

	public static class AgRelationDto {

		private String type;

		private String pk;

		private String mpk;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getPk() {
			return this.pk;
		}

		public void setPk(String pk) {
			this.pk = pk;
		}

		public String getMpk() {
			return this.mpk;
		}

		public void setMpk(String mpk) {
			this.mpk = mpk;
		}
	}

	@Override
	public GetAgRelationResponse getInstance(UnmarshallerContext context) {
		return	GetAgRelationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
