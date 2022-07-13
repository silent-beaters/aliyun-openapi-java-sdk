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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeAutoRenewAttributeResponse;
import com.aliyuncs.adb.model.v20190315.DescribeAutoRenewAttributeResponse.AutoRenewAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAutoRenewAttributeResponseUnmarshaller {

	public static DescribeAutoRenewAttributeResponse unmarshall(DescribeAutoRenewAttributeResponse describeAutoRenewAttributeResponse, UnmarshallerContext _ctx) {
		
		describeAutoRenewAttributeResponse.setRequestId(_ctx.stringValue("DescribeAutoRenewAttributeResponse.RequestId"));
		describeAutoRenewAttributeResponse.setTotalRecordCount(_ctx.integerValue("DescribeAutoRenewAttributeResponse.TotalRecordCount"));
		describeAutoRenewAttributeResponse.setPageRecordCount(_ctx.integerValue("DescribeAutoRenewAttributeResponse.PageRecordCount"));
		describeAutoRenewAttributeResponse.setPageNumber(_ctx.integerValue("DescribeAutoRenewAttributeResponse.PageNumber"));

		List<AutoRenewAttribute> items = new ArrayList<AutoRenewAttribute>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAutoRenewAttributeResponse.Items.Length"); i++) {
			AutoRenewAttribute autoRenewAttribute = new AutoRenewAttribute();
			autoRenewAttribute.setDBClusterId(_ctx.stringValue("DescribeAutoRenewAttributeResponse.Items["+ i +"].DBClusterId"));
			autoRenewAttribute.setPeriodUnit(_ctx.stringValue("DescribeAutoRenewAttributeResponse.Items["+ i +"].PeriodUnit"));
			autoRenewAttribute.setDuration(_ctx.integerValue("DescribeAutoRenewAttributeResponse.Items["+ i +"].Duration"));
			autoRenewAttribute.setRenewalStatus(_ctx.stringValue("DescribeAutoRenewAttributeResponse.Items["+ i +"].RenewalStatus"));
			autoRenewAttribute.setAutoRenewEnabled(_ctx.booleanValue("DescribeAutoRenewAttributeResponse.Items["+ i +"].AutoRenewEnabled"));
			autoRenewAttribute.setRegionId(_ctx.stringValue("DescribeAutoRenewAttributeResponse.Items["+ i +"].RegionId"));

			items.add(autoRenewAttribute);
		}
		describeAutoRenewAttributeResponse.setItems(items);
	 
	 	return describeAutoRenewAttributeResponse;
	}
}