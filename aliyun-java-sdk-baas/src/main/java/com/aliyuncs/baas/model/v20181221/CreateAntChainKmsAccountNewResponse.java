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

package com.aliyuncs.baas.model.v20181221;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20181221.CreateAntChainKmsAccountNewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateAntChainKmsAccountNewResponse extends AcsResponse {

	private String httpStatusCode;

	private String requestId;

	private Boolean success;

	private String resultMessage;

	private String code;

	private String message;

	private String resultCode;

	private Result result;

	public String getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
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

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String pubKey;

		private String myKmsKeyId;

		public String getPubKey() {
			return this.pubKey;
		}

		public void setPubKey(String pubKey) {
			this.pubKey = pubKey;
		}

		public String getMyKmsKeyId() {
			return this.myKmsKeyId;
		}

		public void setMyKmsKeyId(String myKmsKeyId) {
			this.myKmsKeyId = myKmsKeyId;
		}
	}

	@Override
	public CreateAntChainKmsAccountNewResponse getInstance(UnmarshallerContext context) {
		return	CreateAntChainKmsAccountNewResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
