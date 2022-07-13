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

package com.aliyuncs.dytnsapi.model.v20200217;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dytnsapi.transform.v20200217.TwoElementsVerificationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TwoElementsVerificationResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer isConsistent;

		private String basicCarrier;

		public Integer getIsConsistent() {
			return this.isConsistent;
		}

		public void setIsConsistent(Integer isConsistent) {
			this.isConsistent = isConsistent;
		}

		public String getBasicCarrier() {
			return this.basicCarrier;
		}

		public void setBasicCarrier(String basicCarrier) {
			this.basicCarrier = basicCarrier;
		}
	}

	@Override
	public TwoElementsVerificationResponse getInstance(UnmarshallerContext context) {
		return	TwoElementsVerificationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
