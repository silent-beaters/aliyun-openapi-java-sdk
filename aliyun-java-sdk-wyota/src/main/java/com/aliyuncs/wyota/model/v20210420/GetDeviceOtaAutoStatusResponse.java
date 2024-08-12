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

package com.aliyuncs.wyota.model.v20210420;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.wyota.transform.v20210420.GetDeviceOtaAutoStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDeviceOtaAutoStatusResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

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

		private Integer status;

		private Integer forceUpgrade;

		private Integer autoUpdate;

		private String autoUpdateTimeSchedule;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getForceUpgrade() {
			return this.forceUpgrade;
		}

		public void setForceUpgrade(Integer forceUpgrade) {
			this.forceUpgrade = forceUpgrade;
		}

		public Integer getAutoUpdate() {
			return this.autoUpdate;
		}

		public void setAutoUpdate(Integer autoUpdate) {
			this.autoUpdate = autoUpdate;
		}

		public String getAutoUpdateTimeSchedule() {
			return this.autoUpdateTimeSchedule;
		}

		public void setAutoUpdateTimeSchedule(String autoUpdateTimeSchedule) {
			this.autoUpdateTimeSchedule = autoUpdateTimeSchedule;
		}
	}

	@Override
	public GetDeviceOtaAutoStatusResponse getInstance(UnmarshallerContext context) {
		return	GetDeviceOtaAutoStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
