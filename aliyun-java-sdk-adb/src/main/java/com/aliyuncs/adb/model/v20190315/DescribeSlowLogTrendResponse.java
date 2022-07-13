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

package com.aliyuncs.adb.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeSlowLogTrendResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSlowLogTrendResponse extends AcsResponse {

	private String endTime;

	private String requestId;

	private String startTime;

	private String dBClusterId;

	private List<SlowLogTrendItem> items;

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

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public List<SlowLogTrendItem> getItems() {
		return this.items;
	}

	public void setItems(List<SlowLogTrendItem> items) {
		this.items = items;
	}

	public static class SlowLogTrendItem {

		private String key;

		private String unit;

		private List<SeriesItem> series;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getUnit() {
			return this.unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}

		public List<SeriesItem> getSeries() {
			return this.series;
		}

		public void setSeries(List<SeriesItem> series) {
			this.series = series;
		}

		public static class SeriesItem {

			private String values;

			private String name;

			public String getValues() {
				return this.values;
			}

			public void setValues(String values) {
				this.values = values;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public DescribeSlowLogTrendResponse getInstance(UnmarshallerContext context) {
		return	DescribeSlowLogTrendResponseUnmarshaller.unmarshall(this, context);
	}
}
