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
import com.aliyuncs.vod.transform.v20170321.DescribeVodDomainReqHitRateDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVodDomainReqHitRateDataResponse extends AcsResponse {

	private String endTime;

	private String requestId;

	private String startTime;

	private String domainName;

	private String dataInterval;

	private List<DataModule> data;

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getDataInterval() {
		return this.dataInterval;
	}

	public void setDataInterval(String dataInterval) {
		this.dataInterval = dataInterval;
	}

	public List<DataModule> getData() {
		return this.data;
	}

	public void setData(List<DataModule> data) {
		this.data = data;
	}

	public static class DataModule {

		private String value;

		private String timeStamp;

		private String httpsValue;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getHttpsValue() {
			return this.httpsValue;
		}

		public void setHttpsValue(String httpsValue) {
			this.httpsValue = httpsValue;
		}
	}

	@Override
	public DescribeVodDomainReqHitRateDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeVodDomainReqHitRateDataResponseUnmarshaller.unmarshall(this, context);
	}
}
