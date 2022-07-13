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

package com.aliyuncs.sddp.model.v20190103;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sddp.transform.v20190103.DescribeOssObjectDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOssObjectDetailResponse extends AcsResponse {

	private String requestId;

	private OssObjectDetail ossObjectDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public OssObjectDetail getOssObjectDetail() {
		return this.ossObjectDetail;
	}

	public void setOssObjectDetail(OssObjectDetail ossObjectDetail) {
		this.ossObjectDetail = ossObjectDetail;
	}

	public static class OssObjectDetail {

		private String categoryName;

		private String name;

		private String bucketName;

		private String riskLevelName;

		private String regionId;

		private List<Rule> ruleList;

		public String getCategoryName() {
			return this.categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBucketName() {
			return this.bucketName;
		}

		public void setBucketName(String bucketName) {
			this.bucketName = bucketName;
		}

		public String getRiskLevelName() {
			return this.riskLevelName;
		}

		public void setRiskLevelName(String riskLevelName) {
			this.riskLevelName = riskLevelName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public List<Rule> getRuleList() {
			return this.ruleList;
		}

		public void setRuleList(List<Rule> ruleList) {
			this.ruleList = ruleList;
		}

		public static class Rule {

			private String riskLevelName;

			private Integer category;

			private String categoryName;

			private Long riskLevelId;

			private Long count;

			private String ruleName;

			private List<String> sampleList;

			public String getRiskLevelName() {
				return this.riskLevelName;
			}

			public void setRiskLevelName(String riskLevelName) {
				this.riskLevelName = riskLevelName;
			}

			public Integer getCategory() {
				return this.category;
			}

			public void setCategory(Integer category) {
				this.category = category;
			}

			public String getCategoryName() {
				return this.categoryName;
			}

			public void setCategoryName(String categoryName) {
				this.categoryName = categoryName;
			}

			public Long getRiskLevelId() {
				return this.riskLevelId;
			}

			public void setRiskLevelId(Long riskLevelId) {
				this.riskLevelId = riskLevelId;
			}

			public Long getCount() {
				return this.count;
			}

			public void setCount(Long count) {
				this.count = count;
			}

			public String getRuleName() {
				return this.ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}

			public List<String> getSampleList() {
				return this.sampleList;
			}

			public void setSampleList(List<String> sampleList) {
				this.sampleList = sampleList;
			}
		}
	}

	@Override
	public DescribeOssObjectDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeOssObjectDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
