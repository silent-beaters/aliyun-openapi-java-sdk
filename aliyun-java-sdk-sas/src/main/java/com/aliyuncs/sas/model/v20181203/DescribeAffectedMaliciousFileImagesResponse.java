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
import com.aliyuncs.sas.transform.v20181203.DescribeAffectedMaliciousFileImagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAffectedMaliciousFileImagesResponse extends AcsResponse {

	private String requestId;

	private List<AffectedMaliciousFileImage> affectedMaliciousFileImagesResponse;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AffectedMaliciousFileImage> getAffectedMaliciousFileImagesResponse() {
		return this.affectedMaliciousFileImagesResponse;
	}

	public void setAffectedMaliciousFileImagesResponse(List<AffectedMaliciousFileImage> affectedMaliciousFileImagesResponse) {
		this.affectedMaliciousFileImagesResponse = affectedMaliciousFileImagesResponse;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class AffectedMaliciousFileImage {

		private Integer status;

		private String digest;

		private Long latestVerifyTimestamp;

		private String repoInstanceId;

		private String namespace;

		private String tag;

		private String repoRegionId;

		private String imageUuid;

		private Long firstScanTimestamp;

		private String maliciousMd5;

		private String filePath;

		private String repoId;

		private String layer;

		private Long latestScanTimestamp;

		private String repoName;

		private String level;

		private String downloadUrl;

		private String highLight;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getDigest() {
			return this.digest;
		}

		public void setDigest(String digest) {
			this.digest = digest;
		}

		public Long getLatestVerifyTimestamp() {
			return this.latestVerifyTimestamp;
		}

		public void setLatestVerifyTimestamp(Long latestVerifyTimestamp) {
			this.latestVerifyTimestamp = latestVerifyTimestamp;
		}

		public String getRepoInstanceId() {
			return this.repoInstanceId;
		}

		public void setRepoInstanceId(String repoInstanceId) {
			this.repoInstanceId = repoInstanceId;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getRepoRegionId() {
			return this.repoRegionId;
		}

		public void setRepoRegionId(String repoRegionId) {
			this.repoRegionId = repoRegionId;
		}

		public String getImageUuid() {
			return this.imageUuid;
		}

		public void setImageUuid(String imageUuid) {
			this.imageUuid = imageUuid;
		}

		public Long getFirstScanTimestamp() {
			return this.firstScanTimestamp;
		}

		public void setFirstScanTimestamp(Long firstScanTimestamp) {
			this.firstScanTimestamp = firstScanTimestamp;
		}

		public String getMaliciousMd5() {
			return this.maliciousMd5;
		}

		public void setMaliciousMd5(String maliciousMd5) {
			this.maliciousMd5 = maliciousMd5;
		}

		public String getFilePath() {
			return this.filePath;
		}

		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}

		public String getRepoId() {
			return this.repoId;
		}

		public void setRepoId(String repoId) {
			this.repoId = repoId;
		}

		public String getLayer() {
			return this.layer;
		}

		public void setLayer(String layer) {
			this.layer = layer;
		}

		public Long getLatestScanTimestamp() {
			return this.latestScanTimestamp;
		}

		public void setLatestScanTimestamp(Long latestScanTimestamp) {
			this.latestScanTimestamp = latestScanTimestamp;
		}

		public String getRepoName() {
			return this.repoName;
		}

		public void setRepoName(String repoName) {
			this.repoName = repoName;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public String getDownloadUrl() {
			return this.downloadUrl;
		}

		public void setDownloadUrl(String downloadUrl) {
			this.downloadUrl = downloadUrl;
		}

		public String getHighLight() {
			return this.highLight;
		}

		public void setHighLight(String highLight) {
			this.highLight = highLight;
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalCount;

		private Integer count;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
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

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public DescribeAffectedMaliciousFileImagesResponse getInstance(UnmarshallerContext context) {
		return	DescribeAffectedMaliciousFileImagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
