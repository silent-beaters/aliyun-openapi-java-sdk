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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.DescribeCloudProductFieldStatisticsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeCloudProductFieldStatisticsResponse.GroupedFields;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCloudProductFieldStatisticsResponseUnmarshaller {

	public static DescribeCloudProductFieldStatisticsResponse unmarshall(DescribeCloudProductFieldStatisticsResponse describeCloudProductFieldStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeCloudProductFieldStatisticsResponse.setRequestId(_ctx.stringValue("DescribeCloudProductFieldStatisticsResponse.RequestId"));

		GroupedFields groupedFields = new GroupedFields();
		groupedFields.setCategoryCount(_ctx.stringValue("DescribeCloudProductFieldStatisticsResponse.GroupedFields.CategoryCount"));
		groupedFields.setInstanceCount(_ctx.integerValue("DescribeCloudProductFieldStatisticsResponse.GroupedFields.InstanceCount"));
		groupedFields.setRiskInstanceCount(_ctx.integerValue("DescribeCloudProductFieldStatisticsResponse.GroupedFields.RiskInstanceCount"));
		describeCloudProductFieldStatisticsResponse.setGroupedFields(groupedFields);
	 
	 	return describeCloudProductFieldStatisticsResponse;
	}
}