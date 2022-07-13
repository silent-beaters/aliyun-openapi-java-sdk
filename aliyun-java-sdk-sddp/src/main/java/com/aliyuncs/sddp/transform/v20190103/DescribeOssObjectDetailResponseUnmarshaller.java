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

import com.aliyuncs.sddp.model.v20190103.DescribeOssObjectDetailResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeOssObjectDetailResponse.OssObjectDetail;
import com.aliyuncs.sddp.model.v20190103.DescribeOssObjectDetailResponse.OssObjectDetail.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOssObjectDetailResponseUnmarshaller {

	public static DescribeOssObjectDetailResponse unmarshall(DescribeOssObjectDetailResponse describeOssObjectDetailResponse, UnmarshallerContext _ctx) {
		
		describeOssObjectDetailResponse.setRequestId(_ctx.stringValue("DescribeOssObjectDetailResponse.RequestId"));

		OssObjectDetail ossObjectDetail = new OssObjectDetail();
		ossObjectDetail.setCategoryName(_ctx.stringValue("DescribeOssObjectDetailResponse.OssObjectDetail.CategoryName"));
		ossObjectDetail.setName(_ctx.stringValue("DescribeOssObjectDetailResponse.OssObjectDetail.Name"));
		ossObjectDetail.setBucketName(_ctx.stringValue("DescribeOssObjectDetailResponse.OssObjectDetail.BucketName"));
		ossObjectDetail.setRiskLevelName(_ctx.stringValue("DescribeOssObjectDetailResponse.OssObjectDetail.RiskLevelName"));
		ossObjectDetail.setRegionId(_ctx.stringValue("DescribeOssObjectDetailResponse.OssObjectDetail.RegionId"));

		List<Rule> ruleList = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOssObjectDetailResponse.OssObjectDetail.RuleList.Length"); i++) {
			Rule rule = new Rule();
			rule.setRiskLevelName(_ctx.stringValue("DescribeOssObjectDetailResponse.OssObjectDetail.RuleList["+ i +"].RiskLevelName"));
			rule.setCategory(_ctx.integerValue("DescribeOssObjectDetailResponse.OssObjectDetail.RuleList["+ i +"].Category"));
			rule.setCategoryName(_ctx.stringValue("DescribeOssObjectDetailResponse.OssObjectDetail.RuleList["+ i +"].CategoryName"));
			rule.setRiskLevelId(_ctx.longValue("DescribeOssObjectDetailResponse.OssObjectDetail.RuleList["+ i +"].RiskLevelId"));
			rule.setCount(_ctx.longValue("DescribeOssObjectDetailResponse.OssObjectDetail.RuleList["+ i +"].Count"));
			rule.setRuleName(_ctx.stringValue("DescribeOssObjectDetailResponse.OssObjectDetail.RuleList["+ i +"].RuleName"));

			List<String> sampleList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeOssObjectDetailResponse.OssObjectDetail.RuleList["+ i +"].SampleList.Length"); j++) {
				sampleList.add(_ctx.stringValue("DescribeOssObjectDetailResponse.OssObjectDetail.RuleList["+ i +"].SampleList["+ j +"]"));
			}
			rule.setSampleList(sampleList);

			ruleList.add(rule);
		}
		ossObjectDetail.setRuleList(ruleList);
		describeOssObjectDetailResponse.setOssObjectDetail(ossObjectDetail);
	 
	 	return describeOssObjectDetailResponse;
	}
}