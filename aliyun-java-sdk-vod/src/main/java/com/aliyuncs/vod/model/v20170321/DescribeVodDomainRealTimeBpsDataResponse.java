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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.DescribeVodDomainRealTimeBpsDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVodDomainRealTimeBpsDataResponse extends AcsResponse {

	private String requestId;

	private List<BpsModel> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BpsModel> getData() {
		return this.data;
	}

	public void setData(List<BpsModel> data) {
		this.data = data;
	}

	public static class BpsModel {

		private Float bps;

		private String timeStamp;

		public Float getBps() {
			return this.bps;
		}

		public void setBps(Float bps) {
			this.bps = bps;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}
	}

	@Override
	public DescribeVodDomainRealTimeBpsDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeVodDomainRealTimeBpsDataResponseUnmarshaller.unmarshall(this, context);
	}
}
