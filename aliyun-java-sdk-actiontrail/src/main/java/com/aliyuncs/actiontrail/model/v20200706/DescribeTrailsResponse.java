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

package com.aliyuncs.actiontrail.model.v20200706;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.actiontrail.transform.v20200706.DescribeTrailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTrailsResponse extends AcsResponse {

	private String requestId;

	private List<Trail> trailList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Trail> getTrailList() {
		return this.trailList;
	}

	public void setTrailList(List<Trail> trailList) {
		this.trailList = trailList;
	}

	public static class Trail {

		private String trailRegion;

		private String status;

		private String updateTime;

		private String homeRegion;

		private String createTime;

		private String ossKeyPrefix;

		private String eventRW;

		private String startLoggingTime;

		private String ossWriteRoleArn;

		private String slsProjectArn;

		private Boolean isOrganizationTrail;

		private String slsWriteRoleArn;

		private String stopLoggingTime;

		private String name;

		private String ossBucketName;

		private String region;

		private String organizationId;

		private String ossBucketLocation;

		private Long isShadowTrail;

		private String trailArn;

		public String getTrailRegion() {
			return this.trailRegion;
		}

		public void setTrailRegion(String trailRegion) {
			this.trailRegion = trailRegion;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getHomeRegion() {
			return this.homeRegion;
		}

		public void setHomeRegion(String homeRegion) {
			this.homeRegion = homeRegion;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getOssKeyPrefix() {
			return this.ossKeyPrefix;
		}

		public void setOssKeyPrefix(String ossKeyPrefix) {
			this.ossKeyPrefix = ossKeyPrefix;
		}

		public String getEventRW() {
			return this.eventRW;
		}

		public void setEventRW(String eventRW) {
			this.eventRW = eventRW;
		}

		public String getStartLoggingTime() {
			return this.startLoggingTime;
		}

		public void setStartLoggingTime(String startLoggingTime) {
			this.startLoggingTime = startLoggingTime;
		}

		public String getOssWriteRoleArn() {
			return this.ossWriteRoleArn;
		}

		public void setOssWriteRoleArn(String ossWriteRoleArn) {
			this.ossWriteRoleArn = ossWriteRoleArn;
		}

		public String getSlsProjectArn() {
			return this.slsProjectArn;
		}

		public void setSlsProjectArn(String slsProjectArn) {
			this.slsProjectArn = slsProjectArn;
		}

		public Boolean getIsOrganizationTrail() {
			return this.isOrganizationTrail;
		}

		public void setIsOrganizationTrail(Boolean isOrganizationTrail) {
			this.isOrganizationTrail = isOrganizationTrail;
		}

		public String getSlsWriteRoleArn() {
			return this.slsWriteRoleArn;
		}

		public void setSlsWriteRoleArn(String slsWriteRoleArn) {
			this.slsWriteRoleArn = slsWriteRoleArn;
		}

		public String getStopLoggingTime() {
			return this.stopLoggingTime;
		}

		public void setStopLoggingTime(String stopLoggingTime) {
			this.stopLoggingTime = stopLoggingTime;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOssBucketName() {
			return this.ossBucketName;
		}

		public void setOssBucketName(String ossBucketName) {
			this.ossBucketName = ossBucketName;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getOrganizationId() {
			return this.organizationId;
		}

		public void setOrganizationId(String organizationId) {
			this.organizationId = organizationId;
		}

		public String getOssBucketLocation() {
			return this.ossBucketLocation;
		}

		public void setOssBucketLocation(String ossBucketLocation) {
			this.ossBucketLocation = ossBucketLocation;
		}

		public Long getIsShadowTrail() {
			return this.isShadowTrail;
		}

		public void setIsShadowTrail(Long isShadowTrail) {
			this.isShadowTrail = isShadowTrail;
		}

		public String getTrailArn() {
			return this.trailArn;
		}

		public void setTrailArn(String trailArn) {
			this.trailArn = trailArn;
		}
	}

	@Override
	public DescribeTrailsResponse getInstance(UnmarshallerContext context) {
		return	DescribeTrailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
