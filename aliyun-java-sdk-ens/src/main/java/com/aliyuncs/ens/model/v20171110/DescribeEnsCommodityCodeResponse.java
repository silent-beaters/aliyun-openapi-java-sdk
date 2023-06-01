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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeEnsCommodityCodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEnsCommodityCodeResponse extends AcsResponse {

	private String requestId;

	private List<CommodityCodeInfoItem> commodityCodeInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CommodityCodeInfoItem> getCommodityCodeInfo() {
		return this.commodityCodeInfo;
	}

	public void setCommodityCodeInfo(List<CommodityCodeInfoItem> commodityCodeInfo) {
		this.commodityCodeInfo = commodityCodeInfo;
	}

	public static class CommodityCodeInfoItem {

		private String commodityCode;

		private String commodityName;

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getCommodityName() {
			return this.commodityName;
		}

		public void setCommodityName(String commodityName) {
			this.commodityName = commodityName;
		}
	}

	@Override
	public DescribeEnsCommodityCodeResponse getInstance(UnmarshallerContext context) {
		return	DescribeEnsCommodityCodeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
