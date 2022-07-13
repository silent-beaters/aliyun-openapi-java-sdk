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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.SearchRetcodeAppByPageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchRetcodeAppByPageResponse extends AcsResponse {

	private String requestId;

	private PageBean pageBean;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PageBean getPageBean() {
		return this.pageBean;
	}

	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}

	public static class PageBean {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<RetcodeApp> retcodeApps;

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

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<RetcodeApp> getRetcodeApps() {
			return this.retcodeApps;
		}

		public void setRetcodeApps(List<RetcodeApp> retcodeApps) {
			this.retcodeApps = retcodeApps;
		}

		public static class RetcodeApp {

			private String type;

			private String appName;

			private String retcodeAppType;

			private Long updateTime;

			private Long createTime;

			private String pid;

			private Long appId;

			private String userId;

			private String regionId;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getRetcodeAppType() {
				return this.retcodeAppType;
			}

			public void setRetcodeAppType(String retcodeAppType) {
				this.retcodeAppType = retcodeAppType;
			}

			public Long getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(Long updateTime) {
				this.updateTime = updateTime;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public String getPid() {
				return this.pid;
			}

			public void setPid(String pid) {
				this.pid = pid;
			}

			public Long getAppId() {
				return this.appId;
			}

			public void setAppId(Long appId) {
				this.appId = appId;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}
		}
	}

	@Override
	public SearchRetcodeAppByPageResponse getInstance(UnmarshallerContext context) {
		return	SearchRetcodeAppByPageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
