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

package com.aliyuncs.vs.model.v20181212;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vs.transform.v20181212.ListBucketsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBucketsResponse extends AcsResponse {

	private Long totalCount;

	private String requestId;

	private List<BucketInfo> bucketInfos;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BucketInfo> getBucketInfos() {
		return this.bucketInfos;
	}

	public void setBucketInfos(List<BucketInfo> bucketInfos) {
		this.bucketInfos = bucketInfos;
	}

	public static class BucketInfo {

		private String storageClass;

		private String dataRedundancyType;

		private String resourceType;

		private String comment;

		private String dispatcherType;

		private String createTime;

		private String endpoint;

		private String bucketAcl;

		private String bucketName;

		private String modifyTime;

		public String getStorageClass() {
			return this.storageClass;
		}

		public void setStorageClass(String storageClass) {
			this.storageClass = storageClass;
		}

		public String getDataRedundancyType() {
			return this.dataRedundancyType;
		}

		public void setDataRedundancyType(String dataRedundancyType) {
			this.dataRedundancyType = dataRedundancyType;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getDispatcherType() {
			return this.dispatcherType;
		}

		public void setDispatcherType(String dispatcherType) {
			this.dispatcherType = dispatcherType;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getEndpoint() {
			return this.endpoint;
		}

		public void setEndpoint(String endpoint) {
			this.endpoint = endpoint;
		}

		public String getBucketAcl() {
			return this.bucketAcl;
		}

		public void setBucketAcl(String bucketAcl) {
			this.bucketAcl = bucketAcl;
		}

		public String getBucketName() {
			return this.bucketName;
		}

		public void setBucketName(String bucketName) {
			this.bucketName = bucketName;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}
	}

	@Override
	public ListBucketsResponse getInstance(UnmarshallerContext context) {
		return	ListBucketsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
