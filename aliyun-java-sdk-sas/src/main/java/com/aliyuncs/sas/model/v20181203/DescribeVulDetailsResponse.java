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
import com.aliyuncs.sas.transform.v20181203.DescribeVulDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVulDetailsResponse extends AcsResponse {

	private String requestId;

	private List<Cve> cves;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Cve> getCves() {
		return this.cves;
	}

	public void setCves(List<Cve> cves) {
		this.cves = cves;
	}

	public static class Cve {

		private String summary;

		private String complexity;

		private String product;

		private Long pocCreateTime;

		private String cveId;

		private String cnvdId;

		private String reference;

		private String cvssScore;

		private String vendor;

		private Long pocDisclosureTime;

		private String classify;

		private String cvssVector;

		private String vulLevel;

		private Long releaseTime;

		private String title;

		private String solution;

		private String content;

		private String poc;

		private String otherId;

		private List<Classify> classifys;

		public String getSummary() {
			return this.summary;
		}

		public void setSummary(String summary) {
			this.summary = summary;
		}

		public String getComplexity() {
			return this.complexity;
		}

		public void setComplexity(String complexity) {
			this.complexity = complexity;
		}

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public Long getPocCreateTime() {
			return this.pocCreateTime;
		}

		public void setPocCreateTime(Long pocCreateTime) {
			this.pocCreateTime = pocCreateTime;
		}

		public String getCveId() {
			return this.cveId;
		}

		public void setCveId(String cveId) {
			this.cveId = cveId;
		}

		public String getCnvdId() {
			return this.cnvdId;
		}

		public void setCnvdId(String cnvdId) {
			this.cnvdId = cnvdId;
		}

		public String getReference() {
			return this.reference;
		}

		public void setReference(String reference) {
			this.reference = reference;
		}

		public String getCvssScore() {
			return this.cvssScore;
		}

		public void setCvssScore(String cvssScore) {
			this.cvssScore = cvssScore;
		}

		public String getVendor() {
			return this.vendor;
		}

		public void setVendor(String vendor) {
			this.vendor = vendor;
		}

		public Long getPocDisclosureTime() {
			return this.pocDisclosureTime;
		}

		public void setPocDisclosureTime(Long pocDisclosureTime) {
			this.pocDisclosureTime = pocDisclosureTime;
		}

		public String getClassify() {
			return this.classify;
		}

		public void setClassify(String classify) {
			this.classify = classify;
		}

		public String getCvssVector() {
			return this.cvssVector;
		}

		public void setCvssVector(String cvssVector) {
			this.cvssVector = cvssVector;
		}

		public String getVulLevel() {
			return this.vulLevel;
		}

		public void setVulLevel(String vulLevel) {
			this.vulLevel = vulLevel;
		}

		public Long getReleaseTime() {
			return this.releaseTime;
		}

		public void setReleaseTime(Long releaseTime) {
			this.releaseTime = releaseTime;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getSolution() {
			return this.solution;
		}

		public void setSolution(String solution) {
			this.solution = solution;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getPoc() {
			return this.poc;
		}

		public void setPoc(String poc) {
			this.poc = poc;
		}

		public String getOtherId() {
			return this.otherId;
		}

		public void setOtherId(String otherId) {
			this.otherId = otherId;
		}

		public List<Classify> getClassifys() {
			return this.classifys;
		}

		public void setClassifys(List<Classify> classifys) {
			this.classifys = classifys;
		}

		public static class Classify {

			private String description;

			private String classify;

			private String demoVideoUrl;

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getClassify() {
				return this.classify;
			}

			public void setClassify(String classify) {
				this.classify = classify;
			}

			public String getDemoVideoUrl() {
				return this.demoVideoUrl;
			}

			public void setDemoVideoUrl(String demoVideoUrl) {
				this.demoVideoUrl = demoVideoUrl;
			}
		}
	}

	@Override
	public DescribeVulDetailsResponse getInstance(UnmarshallerContext context) {
		return	DescribeVulDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
