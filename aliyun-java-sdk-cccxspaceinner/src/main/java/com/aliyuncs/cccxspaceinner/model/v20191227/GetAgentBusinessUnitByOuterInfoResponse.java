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

package com.aliyuncs.cccxspaceinner.model.v20191227;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cccxspaceinner.transform.v20191227.GetAgentBusinessUnitByOuterInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAgentBusinessUnitByOuterInfoResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long buId;

		private String buName;

		private String buKey;

		public Long getBuId() {
			return this.buId;
		}

		public void setBuId(Long buId) {
			this.buId = buId;
		}

		public String getBuName() {
			return this.buName;
		}

		public void setBuName(String buName) {
			this.buName = buName;
		}

		public String getBuKey() {
			return this.buKey;
		}

		public void setBuKey(String buKey) {
			this.buKey = buKey;
		}
	}

	@Override
	public GetAgentBusinessUnitByOuterInfoResponse getInstance(UnmarshallerContext context) {
		return	GetAgentBusinessUnitByOuterInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}