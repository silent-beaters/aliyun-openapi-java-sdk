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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribePortAutoCcStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePortAutoCcStatusResponse extends AcsResponse {

	private String requestId;

	private List<Status> portAutoCcStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Status> getPortAutoCcStatus() {
		return this.portAutoCcStatus;
	}

	public void setPortAutoCcStatus(List<Status> portAutoCcStatus) {
		this.portAutoCcStatus = portAutoCcStatus;
	}

	public static class Status {

		private String _switch;

		private String mode;

		private String webSwitch;

		private String webMode;

		public String get_Switch() {
			return this._switch;
		}

		public void set_Switch(String _switch) {
			this._switch = _switch;
		}

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public String getWebSwitch() {
			return this.webSwitch;
		}

		public void setWebSwitch(String webSwitch) {
			this.webSwitch = webSwitch;
		}

		public String getWebMode() {
			return this.webMode;
		}

		public void setWebMode(String webMode) {
			this.webMode = webMode;
		}
	}

	@Override
	public DescribePortAutoCcStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribePortAutoCcStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
