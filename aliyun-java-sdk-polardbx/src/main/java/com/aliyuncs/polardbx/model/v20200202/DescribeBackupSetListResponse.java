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

package com.aliyuncs.polardbx.model.v20200202;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardbx.transform.v20200202.DescribeBackupSetListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupSetListResponse extends AcsResponse {

	private String message;

	private String requestId;

	private Boolean success;

	private List<BackupSet> data;

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

	public List<BackupSet> getData() {
		return this.data;
	}

	public void setData(List<BackupSet> data) {
		this.data = data;
	}

	public static class BackupSet {

		private Long endTime;

		private Integer status;

		private Long backupSetSize;

		private Long backupSetId;

		private Integer backupType;

		private Long beginTime;

		private Integer backupModel;

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Long getBackupSetSize() {
			return this.backupSetSize;
		}

		public void setBackupSetSize(Long backupSetSize) {
			this.backupSetSize = backupSetSize;
		}

		public Long getBackupSetId() {
			return this.backupSetId;
		}

		public void setBackupSetId(Long backupSetId) {
			this.backupSetId = backupSetId;
		}

		public Integer getBackupType() {
			return this.backupType;
		}

		public void setBackupType(Integer backupType) {
			this.backupType = backupType;
		}

		public Long getBeginTime() {
			return this.beginTime;
		}

		public void setBeginTime(Long beginTime) {
			this.beginTime = beginTime;
		}

		public Integer getBackupModel() {
			return this.backupModel;
		}

		public void setBackupModel(Integer backupModel) {
			this.backupModel = backupModel;
		}
	}

	@Override
	public DescribeBackupSetListResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupSetListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
