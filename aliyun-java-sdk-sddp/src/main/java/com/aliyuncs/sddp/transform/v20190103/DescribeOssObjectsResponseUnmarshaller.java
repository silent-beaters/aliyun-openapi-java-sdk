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

package com.aliyuncs.sddp.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sddp.model.v20190103.DescribeOssObjectsResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeOssObjectsResponse.Column;
import com.aliyuncs.sddp.model.v20190103.DescribeOssObjectsResponse.Column.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOssObjectsResponseUnmarshaller {

	public static DescribeOssObjectsResponse unmarshall(DescribeOssObjectsResponse describeOssObjectsResponse, UnmarshallerContext _ctx) {
		
		describeOssObjectsResponse.setRequestId(_ctx.stringValue("DescribeOssObjectsResponse.RequestId"));
		describeOssObjectsResponse.setCurrentPage(_ctx.integerValue("DescribeOssObjectsResponse.CurrentPage"));
		describeOssObjectsResponse.setPageSize(_ctx.integerValue("DescribeOssObjectsResponse.PageSize"));
		describeOssObjectsResponse.setTotalCount(_ctx.integerValue("DescribeOssObjectsResponse.TotalCount"));

		List<Column> items = new ArrayList<Column>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOssObjectsResponse.Items.Length"); i++) {
			Column column = new Column();
			column.setInstanceId(_ctx.longValue("DescribeOssObjectsResponse.Items["+ i +"].InstanceId"));
			column.setCategoryName(_ctx.stringValue("DescribeOssObjectsResponse.Items["+ i +"].CategoryName"));
			column.setRiskLevelId(_ctx.longValue("DescribeOssObjectsResponse.Items["+ i +"].RiskLevelId"));
			column.setRegionId(_ctx.stringValue("DescribeOssObjectsResponse.Items["+ i +"].RegionId"));
			column.setFileId(_ctx.stringValue("DescribeOssObjectsResponse.Items["+ i +"].FileId"));
			column.setLastScanTime(_ctx.longValue("DescribeOssObjectsResponse.Items["+ i +"].LastScanTime"));
			column.setRegionName(_ctx.stringValue("DescribeOssObjectsResponse.Items["+ i +"].RegionName"));
			column.setSize(_ctx.longValue("DescribeOssObjectsResponse.Items["+ i +"].Size"));
			column.setBucketName(_ctx.stringValue("DescribeOssObjectsResponse.Items["+ i +"].BucketName"));
			column.setRiskLevelName(_ctx.stringValue("DescribeOssObjectsResponse.Items["+ i +"].RiskLevelName"));
			column.setCategory(_ctx.longValue("DescribeOssObjectsResponse.Items["+ i +"].Category"));
			column.setName(_ctx.stringValue("DescribeOssObjectsResponse.Items["+ i +"].Name"));
			column.setRuleCount(_ctx.integerValue("DescribeOssObjectsResponse.Items["+ i +"].RuleCount"));
			column.setSensitiveCount(_ctx.integerValue("DescribeOssObjectsResponse.Items["+ i +"].SensitiveCount"));
			column.setId(_ctx.stringValue("DescribeOssObjectsResponse.Items["+ i +"].Id"));

			List<Rule> ruleList = new ArrayList<Rule>();
			for (int j = 0; j < _ctx.lengthValue("DescribeOssObjectsResponse.Items["+ i +"].RuleList.Length"); j++) {
				Rule rule = new Rule();
				rule.setName(_ctx.stringValue("DescribeOssObjectsResponse.Items["+ i +"].RuleList["+ j +"].Name"));
				rule.setRiskLevelId(_ctx.longValue("DescribeOssObjectsResponse.Items["+ i +"].RuleList["+ j +"].RiskLevelId"));
				rule.setCount(_ctx.longValue("DescribeOssObjectsResponse.Items["+ i +"].RuleList["+ j +"].Count"));

				ruleList.add(rule);
			}
			column.setRuleList(ruleList);

			items.add(column);
		}
		describeOssObjectsResponse.setItems(items);
	 
	 	return describeOssObjectsResponse;
	}
}