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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryImageBidRelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryImageBidRelResponse extends AcsResponse {

	private String requestId;

	private String imageId;

	private String regionId;

	private Long resourceOwnerId;

	private String bid2PrivilegeJson;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
	}

	public String getBid2PrivilegeJson() {
		return this.bid2PrivilegeJson;
	}

	public void setBid2PrivilegeJson(String bid2PrivilegeJson) {
		this.bid2PrivilegeJson = bid2PrivilegeJson;
	}

	@Override
	public OpsQueryImageBidRelResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryImageBidRelResponseUnmarshaller.unmarshall(this, context);
	}
}
