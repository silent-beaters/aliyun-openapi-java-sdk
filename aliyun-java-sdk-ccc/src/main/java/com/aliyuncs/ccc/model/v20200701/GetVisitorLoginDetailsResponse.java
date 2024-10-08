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

package com.aliyuncs.ccc.model.v20200701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.GetVisitorLoginDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetVisitorLoginDetailsResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private List<String> params;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public List<String> getParams() {
		return this.params;
	}

	public void setParams(List<String> params) {
		this.params = params;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String chatLoginToken;

		private String chatUserId;

		private String chatDeviceId;

		private String chatServerUrl;

		private String chatAppKey;

		private String chatAppId;

		public String getChatLoginToken() {
			return this.chatLoginToken;
		}

		public void setChatLoginToken(String chatLoginToken) {
			this.chatLoginToken = chatLoginToken;
		}

		public String getChatUserId() {
			return this.chatUserId;
		}

		public void setChatUserId(String chatUserId) {
			this.chatUserId = chatUserId;
		}

		public String getChatDeviceId() {
			return this.chatDeviceId;
		}

		public void setChatDeviceId(String chatDeviceId) {
			this.chatDeviceId = chatDeviceId;
		}

		public String getChatServerUrl() {
			return this.chatServerUrl;
		}

		public void setChatServerUrl(String chatServerUrl) {
			this.chatServerUrl = chatServerUrl;
		}

		public String getChatAppKey() {
			return this.chatAppKey;
		}

		public void setChatAppKey(String chatAppKey) {
			this.chatAppKey = chatAppKey;
		}

		public String getChatAppId() {
			return this.chatAppId;
		}

		public void setChatAppId(String chatAppId) {
			this.chatAppId = chatAppId;
		}
	}

	@Override
	public GetVisitorLoginDetailsResponse getInstance(UnmarshallerContext context) {
		return	GetVisitorLoginDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
