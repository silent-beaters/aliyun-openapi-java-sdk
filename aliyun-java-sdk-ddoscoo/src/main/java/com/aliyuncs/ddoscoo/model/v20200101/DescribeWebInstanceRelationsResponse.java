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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeWebInstanceRelationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWebInstanceRelationsResponse extends AcsResponse {

	private String requestId;

	private List<WebInstanceRelation> webInstanceRelations;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<WebInstanceRelation> getWebInstanceRelations() {
		return this.webInstanceRelations;
	}

	public void setWebInstanceRelations(List<WebInstanceRelation> webInstanceRelations) {
		this.webInstanceRelations = webInstanceRelations;
	}

	public static class WebInstanceRelation {

		private String domain;

		private List<InstanceDetail> instanceDetails;

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public List<InstanceDetail> getInstanceDetails() {
			return this.instanceDetails;
		}

		public void setInstanceDetails(List<InstanceDetail> instanceDetails) {
			this.instanceDetails = instanceDetails;
		}

		public static class InstanceDetail {

			private String functionVersion;

			private String instanceId;

			private List<String> eipList;

			public String getFunctionVersion() {
				return this.functionVersion;
			}

			public void setFunctionVersion(String functionVersion) {
				this.functionVersion = functionVersion;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public List<String> getEipList() {
				return this.eipList;
			}

			public void setEipList(List<String> eipList) {
				this.eipList = eipList;
			}
		}
	}

	@Override
	public DescribeWebInstanceRelationsResponse getInstance(UnmarshallerContext context) {
		return	DescribeWebInstanceRelationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
