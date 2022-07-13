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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeSecurityEventOperationStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSecurityEventOperationStatusResponse extends AcsResponse {

	private String requestId;

	private SecurityEventOperationStatusResponse securityEventOperationStatusResponse;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public SecurityEventOperationStatusResponse getSecurityEventOperationStatusResponse() {
		return this.securityEventOperationStatusResponse;
	}

	public void setSecurityEventOperationStatusResponse(SecurityEventOperationStatusResponse securityEventOperationStatusResponse) {
		this.securityEventOperationStatusResponse = securityEventOperationStatusResponse;
	}

	public static class SecurityEventOperationStatusResponse {

		private String taskStatus;

		private List<SecurityEventOperationStatus> securityEventOperationStatuses;

		public String getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
		}

		public List<SecurityEventOperationStatus> getSecurityEventOperationStatuses() {
			return this.securityEventOperationStatuses;
		}

		public void setSecurityEventOperationStatuses(List<SecurityEventOperationStatus> securityEventOperationStatuses) {
			this.securityEventOperationStatuses = securityEventOperationStatuses;
		}

		public static class SecurityEventOperationStatus {

			private String status;

			private String securityEventId;

			private String errorCode;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getSecurityEventId() {
				return this.securityEventId;
			}

			public void setSecurityEventId(String securityEventId) {
				this.securityEventId = securityEventId;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}
		}
	}

	@Override
	public DescribeSecurityEventOperationStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeSecurityEventOperationStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
