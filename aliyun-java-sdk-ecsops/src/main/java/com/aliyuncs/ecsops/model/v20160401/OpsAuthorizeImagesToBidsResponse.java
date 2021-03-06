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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsAuthorizeImagesToBidsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsAuthorizeImagesToBidsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<AuthorizeBid> authorizeBids;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<AuthorizeBid> getAuthorizeBids() {
		return this.authorizeBids;
	}

	public void setAuthorizeBids(List<AuthorizeBid> authorizeBids) {
		this.authorizeBids = authorizeBids;
	}

	public static class AuthorizeBid {

		private String regionId;

		private String osName;

		private String onlineImageId;

		private String hiddenImageId;

		private String offlineImageId;

		private List<String> bids;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getOsName() {
			return this.osName;
		}

		public void setOsName(String osName) {
			this.osName = osName;
		}

		public String getOnlineImageId() {
			return this.onlineImageId;
		}

		public void setOnlineImageId(String onlineImageId) {
			this.onlineImageId = onlineImageId;
		}

		public String getHiddenImageId() {
			return this.hiddenImageId;
		}

		public void setHiddenImageId(String hiddenImageId) {
			this.hiddenImageId = hiddenImageId;
		}

		public String getOfflineImageId() {
			return this.offlineImageId;
		}

		public void setOfflineImageId(String offlineImageId) {
			this.offlineImageId = offlineImageId;
		}

		public List<String> getBids() {
			return this.bids;
		}

		public void setBids(List<String> bids) {
			this.bids = bids;
		}
	}

	@Override
	public OpsAuthorizeImagesToBidsResponse getInstance(UnmarshallerContext context) {
		return	OpsAuthorizeImagesToBidsResponseUnmarshaller.unmarshall(this, context);
	}
}
