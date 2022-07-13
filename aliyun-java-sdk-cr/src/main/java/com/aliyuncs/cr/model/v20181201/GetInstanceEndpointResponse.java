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

package com.aliyuncs.cr.model.v20181201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cr.transform.v20181201.GetInstanceEndpointResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceEndpointResponse extends AcsResponse {

	private String status;

	private String requestId;

	private String code;

	private Boolean isSuccess;

	private Boolean aclEnable;

	private Boolean enable;

	private List<Endpoints> domains;

	private List<AclEntriesItem> aclEntries;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

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

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public Boolean getAclEnable() {
		return this.aclEnable;
	}

	public void setAclEnable(Boolean aclEnable) {
		this.aclEnable = aclEnable;
	}

	public Boolean getEnable() {
		return this.enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public List<Endpoints> getDomains() {
		return this.domains;
	}

	public void setDomains(List<Endpoints> domains) {
		this.domains = domains;
	}

	public List<AclEntriesItem> getAclEntries() {
		return this.aclEntries;
	}

	public void setAclEntries(List<AclEntriesItem> aclEntries) {
		this.aclEntries = aclEntries;
	}

	public static class Endpoints {

		private String type;

		private String domain;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}
	}

	public static class AclEntriesItem {

		private String comment;

		private String entry;

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getEntry() {
			return this.entry;
		}

		public void setEntry(String entry) {
			this.entry = entry;
		}
	}

	@Override
	public GetInstanceEndpointResponse getInstance(UnmarshallerContext context) {
		return	GetInstanceEndpointResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
