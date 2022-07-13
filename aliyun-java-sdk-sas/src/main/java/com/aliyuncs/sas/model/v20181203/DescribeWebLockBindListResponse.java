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
import com.aliyuncs.sas.transform.v20181203.DescribeWebLockBindListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWebLockBindListResponse extends AcsResponse {

	private Integer currentPage;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<Bind> bindList;

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Bind> getBindList() {
		return this.bindList;
	}

	public void setBindList(List<Bind> bindList) {
		this.bindList = bindList;
	}

	public static class Bind {

		private String status;

		private Integer percent;

		private String internetIp;

		private String serviceDetail;

		private String os;

		private String serviceStatus;

		private String intranetIp;

		private String auditCount;

		private String uuid;

		private String serviceCode;

		private String instanceName;

		private String dirCount;

		private String blockCount;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getPercent() {
			return this.percent;
		}

		public void setPercent(Integer percent) {
			this.percent = percent;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getServiceDetail() {
			return this.serviceDetail;
		}

		public void setServiceDetail(String serviceDetail) {
			this.serviceDetail = serviceDetail;
		}

		public String getOs() {
			return this.os;
		}

		public void setOs(String os) {
			this.os = os;
		}

		public String getServiceStatus() {
			return this.serviceStatus;
		}

		public void setServiceStatus(String serviceStatus) {
			this.serviceStatus = serviceStatus;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public String getAuditCount() {
			return this.auditCount;
		}

		public void setAuditCount(String auditCount) {
			this.auditCount = auditCount;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getServiceCode() {
			return this.serviceCode;
		}

		public void setServiceCode(String serviceCode) {
			this.serviceCode = serviceCode;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getDirCount() {
			return this.dirCount;
		}

		public void setDirCount(String dirCount) {
			this.dirCount = dirCount;
		}

		public String getBlockCount() {
			return this.blockCount;
		}

		public void setBlockCount(String blockCount) {
			this.blockCount = blockCount;
		}
	}

	@Override
	public DescribeWebLockBindListResponse getInstance(UnmarshallerContext context) {
		return	DescribeWebLockBindListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
