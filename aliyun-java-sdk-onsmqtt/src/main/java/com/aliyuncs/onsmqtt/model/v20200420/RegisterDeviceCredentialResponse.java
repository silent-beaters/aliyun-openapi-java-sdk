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

package com.aliyuncs.onsmqtt.model.v20200420;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.onsmqtt.transform.v20200420.RegisterDeviceCredentialResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RegisterDeviceCredentialResponse extends AcsResponse {

	private String requestId;

	private DeviceCredential deviceCredential;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DeviceCredential getDeviceCredential() {
		return this.deviceCredential;
	}

	public void setDeviceCredential(DeviceCredential deviceCredential) {
		this.deviceCredential = deviceCredential;
	}

	public static class DeviceCredential {

		private Long updateTime;

		private String deviceAccessKeyId;

		private Long createTime;

		private String instanceId;

		private String deviceAccessKeySecret;

		private String clientId;

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getDeviceAccessKeyId() {
			return this.deviceAccessKeyId;
		}

		public void setDeviceAccessKeyId(String deviceAccessKeyId) {
			this.deviceAccessKeyId = deviceAccessKeyId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getDeviceAccessKeySecret() {
			return this.deviceAccessKeySecret;
		}

		public void setDeviceAccessKeySecret(String deviceAccessKeySecret) {
			this.deviceAccessKeySecret = deviceAccessKeySecret;
		}

		public String getClientId() {
			return this.clientId;
		}

		public void setClientId(String clientId) {
			this.clientId = clientId;
		}
	}

	@Override
	public RegisterDeviceCredentialResponse getInstance(UnmarshallerContext context) {
		return	RegisterDeviceCredentialResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
