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

package com.aliyuncs.cbn.model.v20170912;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cbn.transform.v20170912.ListGrantVSwitchEnisResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListGrantVSwitchEnisResponse extends AcsResponse {

	private String requestId;

	private String totalCount;

	private List<GrantVSwitchEni> grantVSwitchEnis;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<GrantVSwitchEni> getGrantVSwitchEnis() {
		return this.grantVSwitchEnis;
	}

	public void setGrantVSwitchEnis(List<GrantVSwitchEni> grantVSwitchEnis) {
		this.grantVSwitchEnis = grantVSwitchEnis;
	}

	public static class GrantVSwitchEni {

		private String vpcId;

		private String vSwitchId;

		private String networkInterfaceId;

		private String description;

		private Boolean transitRouterFlag;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getNetworkInterfaceId() {
			return this.networkInterfaceId;
		}

		public void setNetworkInterfaceId(String networkInterfaceId) {
			this.networkInterfaceId = networkInterfaceId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Boolean getTransitRouterFlag() {
			return this.transitRouterFlag;
		}

		public void setTransitRouterFlag(Boolean transitRouterFlag) {
			this.transitRouterFlag = transitRouterFlag;
		}
	}

	@Override
	public ListGrantVSwitchEnisResponse getInstance(UnmarshallerContext context) {
		return	ListGrantVSwitchEnisResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
