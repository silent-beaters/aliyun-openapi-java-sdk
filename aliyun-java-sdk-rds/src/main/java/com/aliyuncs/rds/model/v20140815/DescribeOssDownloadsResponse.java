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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeOssDownloadsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOssDownloadsResponse extends AcsResponse {

	private String dBInstanceId;

	private String requestId;

	private String migrateTaskId;

	private List<OssDownload> items;

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMigrateTaskId() {
		return this.migrateTaskId;
	}

	public void setMigrateTaskId(String migrateTaskId) {
		this.migrateTaskId = migrateTaskId;
	}

	public List<OssDownload> getItems() {
		return this.items;
	}

	public void setItems(List<OssDownload> items) {
		this.items = items;
	}

	public static class OssDownload {

		private String endTime;

		private String status;

		private String description;

		private String createTime;

		private String backupMode;

		private String isAvailable;

		private String fileName;

		private String fileSize;

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getBackupMode() {
			return this.backupMode;
		}

		public void setBackupMode(String backupMode) {
			this.backupMode = backupMode;
		}

		public String getIsAvailable() {
			return this.isAvailable;
		}

		public void setIsAvailable(String isAvailable) {
			this.isAvailable = isAvailable;
		}

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getFileSize() {
			return this.fileSize;
		}

		public void setFileSize(String fileSize) {
			this.fileSize = fileSize;
		}
	}

	@Override
	public DescribeOssDownloadsResponse getInstance(UnmarshallerContext context) {
		return	DescribeOssDownloadsResponseUnmarshaller.unmarshall(this, context);
	}
}
