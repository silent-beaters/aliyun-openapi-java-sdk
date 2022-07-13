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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.DescribeNamespaceListResponse;
import com.aliyuncs.sae.model.v20190506.DescribeNamespaceListResponse.RegionList;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNamespaceListResponseUnmarshaller {

	public static DescribeNamespaceListResponse unmarshall(DescribeNamespaceListResponse describeNamespaceListResponse, UnmarshallerContext _ctx) {
		
		describeNamespaceListResponse.setRequestId(_ctx.stringValue("DescribeNamespaceListResponse.RequestId"));
		describeNamespaceListResponse.setMessage(_ctx.stringValue("DescribeNamespaceListResponse.Message"));
		describeNamespaceListResponse.setTraceId(_ctx.stringValue("DescribeNamespaceListResponse.TraceId"));
		describeNamespaceListResponse.setErrorCode(_ctx.stringValue("DescribeNamespaceListResponse.ErrorCode"));
		describeNamespaceListResponse.setCode(_ctx.stringValue("DescribeNamespaceListResponse.Code"));
		describeNamespaceListResponse.setSuccess(_ctx.booleanValue("DescribeNamespaceListResponse.Success"));

		List<RegionList> data = new ArrayList<RegionList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNamespaceListResponse.Data.Length"); i++) {
			RegionList regionList = new RegionList();
			regionList.setVpcId(_ctx.stringValue("DescribeNamespaceListResponse.Data["+ i +"].VpcId"));
			regionList.setVSwitchId(_ctx.stringValue("DescribeNamespaceListResponse.Data["+ i +"].VSwitchId"));
			regionList.setCustom(_ctx.booleanValue("DescribeNamespaceListResponse.Data["+ i +"].Custom"));
			regionList.setAgentInstall(_ctx.stringValue("DescribeNamespaceListResponse.Data["+ i +"].AgentInstall"));
			regionList.setNamespaceId(_ctx.stringValue("DescribeNamespaceListResponse.Data["+ i +"].NamespaceId"));
			regionList.setHybridCloudEnable(_ctx.booleanValue("DescribeNamespaceListResponse.Data["+ i +"].HybridCloudEnable"));
			regionList.setSecurityGroupId(_ctx.stringValue("DescribeNamespaceListResponse.Data["+ i +"].SecurityGroupId"));
			regionList.setCurrent(_ctx.booleanValue("DescribeNamespaceListResponse.Data["+ i +"].Current"));
			regionList.setNamespaceName(_ctx.stringValue("DescribeNamespaceListResponse.Data["+ i +"].NamespaceName"));
			regionList.setRegionId(_ctx.stringValue("DescribeNamespaceListResponse.Data["+ i +"].RegionId"));

			data.add(regionList);
		}
		describeNamespaceListResponse.setData(data);
	 
	 	return describeNamespaceListResponse;
	}
}