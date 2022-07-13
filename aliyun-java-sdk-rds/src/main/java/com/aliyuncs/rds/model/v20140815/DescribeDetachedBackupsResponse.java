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
import com.aliyuncs.rds.transform.v20140815.DescribeDetachedBackupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDetachedBackupsResponse extends AcsResponse {

	private Long totalBackupSize;

	private String pageNumber;

	private String requestId;

	private String pageRecordCount;

	private String totalRecordCount;

	private List<Backup> items;

	public Long getTotalBackupSize() {
		return this.totalBackupSize;
	}

	public void setTotalBackupSize(Long totalBackupSize) {
		this.totalBackupSize = totalBackupSize;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(String pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public String getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(String totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public List<Backup> getItems() {
		return this.items;
	}

	public void setItems(List<Backup> items) {
		this.items = items;
	}

	public static class Backup {

		private String slaveStatus;

		private Long consistentTime;

		private String storeStatus;

		private String backupStatus;

		private String backupLocation;

		private String backupType;

		private String backupStartTime;

		private Long totalBackupSize;

		private String backupDownloadURL;

		private Integer isAvail;

		private String metaStatus;

		private String backupEndTime;

		private String backupDBNames;

		private String backupScale;

		private String backupId;

		private String hostInstanceID;

		private String backupIntranetDownloadURL;

		private Long backupSize;

		private String backupMode;

		private String dBInstanceId;

		private String dBInstanceComment;

		private String backupExtractionStatus;

		private String backupMethod;

		public String getSlaveStatus() {
			return this.slaveStatus;
		}

		public void setSlaveStatus(String slaveStatus) {
			this.slaveStatus = slaveStatus;
		}

		public Long getConsistentTime() {
			return this.consistentTime;
		}

		public void setConsistentTime(Long consistentTime) {
			this.consistentTime = consistentTime;
		}

		public String getStoreStatus() {
			return this.storeStatus;
		}

		public void setStoreStatus(String storeStatus) {
			this.storeStatus = storeStatus;
		}

		public String getBackupStatus() {
			return this.backupStatus;
		}

		public void setBackupStatus(String backupStatus) {
			this.backupStatus = backupStatus;
		}

		public String getBackupLocation() {
			return this.backupLocation;
		}

		public void setBackupLocation(String backupLocation) {
			this.backupLocation = backupLocation;
		}

		public String getBackupType() {
			return this.backupType;
		}

		public void setBackupType(String backupType) {
			this.backupType = backupType;
		}

		public String getBackupStartTime() {
			return this.backupStartTime;
		}

		public void setBackupStartTime(String backupStartTime) {
			this.backupStartTime = backupStartTime;
		}

		public Long getTotalBackupSize() {
			return this.totalBackupSize;
		}

		public void setTotalBackupSize(Long totalBackupSize) {
			this.totalBackupSize = totalBackupSize;
		}

		public String getBackupDownloadURL() {
			return this.backupDownloadURL;
		}

		public void setBackupDownloadURL(String backupDownloadURL) {
			this.backupDownloadURL = backupDownloadURL;
		}

		public Integer getIsAvail() {
			return this.isAvail;
		}

		public void setIsAvail(Integer isAvail) {
			this.isAvail = isAvail;
		}

		public String getMetaStatus() {
			return this.metaStatus;
		}

		public void setMetaStatus(String metaStatus) {
			this.metaStatus = metaStatus;
		}

		public String getBackupEndTime() {
			return this.backupEndTime;
		}

		public void setBackupEndTime(String backupEndTime) {
			this.backupEndTime = backupEndTime;
		}

		public String getBackupDBNames() {
			return this.backupDBNames;
		}

		public void setBackupDBNames(String backupDBNames) {
			this.backupDBNames = backupDBNames;
		}

		public String getBackupScale() {
			return this.backupScale;
		}

		public void setBackupScale(String backupScale) {
			this.backupScale = backupScale;
		}

		public String getBackupId() {
			return this.backupId;
		}

		public void setBackupId(String backupId) {
			this.backupId = backupId;
		}

		public String getHostInstanceID() {
			return this.hostInstanceID;
		}

		public void setHostInstanceID(String hostInstanceID) {
			this.hostInstanceID = hostInstanceID;
		}

		public String getBackupIntranetDownloadURL() {
			return this.backupIntranetDownloadURL;
		}

		public void setBackupIntranetDownloadURL(String backupIntranetDownloadURL) {
			this.backupIntranetDownloadURL = backupIntranetDownloadURL;
		}

		public Long getBackupSize() {
			return this.backupSize;
		}

		public void setBackupSize(Long backupSize) {
			this.backupSize = backupSize;
		}

		public String getBackupMode() {
			return this.backupMode;
		}

		public void setBackupMode(String backupMode) {
			this.backupMode = backupMode;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getDBInstanceComment() {
			return this.dBInstanceComment;
		}

		public void setDBInstanceComment(String dBInstanceComment) {
			this.dBInstanceComment = dBInstanceComment;
		}

		public String getBackupExtractionStatus() {
			return this.backupExtractionStatus;
		}

		public void setBackupExtractionStatus(String backupExtractionStatus) {
			this.backupExtractionStatus = backupExtractionStatus;
		}

		public String getBackupMethod() {
			return this.backupMethod;
		}

		public void setBackupMethod(String backupMethod) {
			this.backupMethod = backupMethod;
		}
	}

	@Override
	public DescribeDetachedBackupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDetachedBackupsResponseUnmarshaller.unmarshall(this, context);
	}
}
