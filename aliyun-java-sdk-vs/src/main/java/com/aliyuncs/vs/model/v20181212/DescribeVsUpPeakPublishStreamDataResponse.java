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
import com.aliyuncs.vs.transform.v20181212.DescribeVsUpPeakPublishStreamDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVsUpPeakPublishStreamDataResponse extends AcsResponse {

	private String requestId;

	private List<DescribeVsUpPeakPublishStreamData> describeVsUpPeakPublishStreamDatas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DescribeVsUpPeakPublishStreamData> getDescribeVsUpPeakPublishStreamDatas() {
		return this.describeVsUpPeakPublishStreamDatas;
	}

	public void setDescribeVsUpPeakPublishStreamDatas(List<DescribeVsUpPeakPublishStreamData> describeVsUpPeakPublishStreamDatas) {
		this.describeVsUpPeakPublishStreamDatas = describeVsUpPeakPublishStreamDatas;
	}

	public static class DescribeVsUpPeakPublishStreamData {

		private String queryTime;

		private String bandWidth;

		private String statName;

		private String peakTime;

		private Integer publishStreamNum;

		public String getQueryTime() {
			return this.queryTime;
		}

		public void setQueryTime(String queryTime) {
			this.queryTime = queryTime;
		}

		public String getBandWidth() {
			return this.bandWidth;
		}

		public void setBandWidth(String bandWidth) {
			this.bandWidth = bandWidth;
		}

		public String getStatName() {
			return this.statName;
		}

		public void setStatName(String statName) {
			this.statName = statName;
		}

		public String getPeakTime() {
			return this.peakTime;
		}

		public void setPeakTime(String peakTime) {
			this.peakTime = peakTime;
		}

		public Integer getPublishStreamNum() {
			return this.publishStreamNum;
		}

		public void setPublishStreamNum(Integer publishStreamNum) {
			this.publishStreamNum = publishStreamNum;
		}
	}

	@Override
	public DescribeVsUpPeakPublishStreamDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeVsUpPeakPublishStreamDataResponseUnmarshaller.unmarshall(this, context);
	}
}
