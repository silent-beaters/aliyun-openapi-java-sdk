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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribeVsDomainPvDataResponse;
import com.aliyuncs.vs.model.v20181212.DescribeVsDomainPvDataResponse.UsageData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVsDomainPvDataResponseUnmarshaller {

	public static DescribeVsDomainPvDataResponse unmarshall(DescribeVsDomainPvDataResponse describeVsDomainPvDataResponse, UnmarshallerContext _ctx) {
		
		describeVsDomainPvDataResponse.setRequestId(_ctx.stringValue("DescribeVsDomainPvDataResponse.RequestId"));
		describeVsDomainPvDataResponse.setEndTime(_ctx.stringValue("DescribeVsDomainPvDataResponse.EndTime"));
		describeVsDomainPvDataResponse.setStartTime(_ctx.stringValue("DescribeVsDomainPvDataResponse.StartTime"));
		describeVsDomainPvDataResponse.setDomainName(_ctx.stringValue("DescribeVsDomainPvDataResponse.DomainName"));
		describeVsDomainPvDataResponse.setDataInterval(_ctx.stringValue("DescribeVsDomainPvDataResponse.DataInterval"));

		List<UsageData> pvDataInterval = new ArrayList<UsageData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVsDomainPvDataResponse.PvDataInterval.Length"); i++) {
			UsageData usageData = new UsageData();
			usageData.setValue(_ctx.stringValue("DescribeVsDomainPvDataResponse.PvDataInterval["+ i +"].Value"));
			usageData.setTimeStamp(_ctx.stringValue("DescribeVsDomainPvDataResponse.PvDataInterval["+ i +"].TimeStamp"));

			pvDataInterval.add(usageData);
		}
		describeVsDomainPvDataResponse.setPvDataInterval(pvDataInterval);
	 
	 	return describeVsDomainPvDataResponse;
	}
}