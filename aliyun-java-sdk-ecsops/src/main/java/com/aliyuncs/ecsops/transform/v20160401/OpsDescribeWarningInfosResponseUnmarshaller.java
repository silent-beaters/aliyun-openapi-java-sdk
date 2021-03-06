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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeWarningInfosResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeWarningInfosResponse.WarningInfos;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeWarningInfosResponseUnmarshaller {

	public static OpsDescribeWarningInfosResponse unmarshall(OpsDescribeWarningInfosResponse opsDescribeWarningInfosResponse, UnmarshallerContext _ctx) {
		
		opsDescribeWarningInfosResponse.setRequestId(_ctx.stringValue("OpsDescribeWarningInfosResponse.RequestId"));
		opsDescribeWarningInfosResponse.setCode(_ctx.stringValue("OpsDescribeWarningInfosResponse.Code"));
		opsDescribeWarningInfosResponse.setMessage(_ctx.stringValue("OpsDescribeWarningInfosResponse.Message"));
		opsDescribeWarningInfosResponse.setSuccess(_ctx.stringValue("OpsDescribeWarningInfosResponse.Success"));
		opsDescribeWarningInfosResponse.setTotalCount(_ctx.integerValue("OpsDescribeWarningInfosResponse.TotalCount"));
		opsDescribeWarningInfosResponse.setPageNumber(_ctx.integerValue("OpsDescribeWarningInfosResponse.PageNumber"));
		opsDescribeWarningInfosResponse.setPageSize(_ctx.integerValue("OpsDescribeWarningInfosResponse.PageSize"));

		List<WarningInfos> data = new ArrayList<WarningInfos>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeWarningInfosResponse.Data.Length"); i++) {
			WarningInfos warningInfos = new WarningInfos();
			warningInfos.setId(_ctx.longValue("OpsDescribeWarningInfosResponse.Data["+ i +"].Id"));
			warningInfos.setGmtCreate(_ctx.stringValue("OpsDescribeWarningInfosResponse.Data["+ i +"].GmtCreate"));
			warningInfos.setGmtModified(_ctx.stringValue("OpsDescribeWarningInfosResponse.Data["+ i +"].GmtModified"));
			warningInfos.setWarningMetaId(_ctx.stringValue("OpsDescribeWarningInfosResponse.Data["+ i +"].WarningMetaId"));
			warningInfos.setWarningInfoId(_ctx.stringValue("OpsDescribeWarningInfosResponse.Data["+ i +"].WarningInfoId"));
			warningInfos.setStatus(_ctx.integerValue("OpsDescribeWarningInfosResponse.Data["+ i +"].Status"));
			warningInfos.setTitle(_ctx.stringValue("OpsDescribeWarningInfosResponse.Data["+ i +"].Title"));
			warningInfos.setContent(_ctx.stringValue("OpsDescribeWarningInfosResponse.Data["+ i +"].Content"));
			warningInfos.setSourceURL(_ctx.stringValue("OpsDescribeWarningInfosResponse.Data["+ i +"].SourceURL"));
			warningInfos.setOccurTime(_ctx.stringValue("OpsDescribeWarningInfosResponse.Data["+ i +"].OccurTime"));
			warningInfos.setDealTimeBegin(_ctx.stringValue("OpsDescribeWarningInfosResponse.Data["+ i +"].DealTimeBegin"));
			warningInfos.setDealTimeEnd(_ctx.stringValue("OpsDescribeWarningInfosResponse.Data["+ i +"].DealTimeEnd"));
			warningInfos.setOperator(_ctx.stringValue("OpsDescribeWarningInfosResponse.Data["+ i +"].Operator"));
			warningInfos.setOperatorName(_ctx.stringValue("OpsDescribeWarningInfosResponse.Data["+ i +"].OperatorName"));
			warningInfos.setNote(_ctx.stringValue("OpsDescribeWarningInfosResponse.Data["+ i +"].Note"));
			warningInfos.setDiagnoseReportId(_ctx.stringValue("OpsDescribeWarningInfosResponse.Data["+ i +"].DiagnoseReportId"));
			warningInfos.setProductName(_ctx.stringValue("OpsDescribeWarningInfosResponse.Data["+ i +"].ProductName"));
			warningInfos.setApp(_ctx.stringValue("OpsDescribeWarningInfosResponse.Data["+ i +"].App"));
			warningInfos.setLevel(_ctx.stringValue("OpsDescribeWarningInfosResponse.Data["+ i +"].Level"));
			warningInfos.setOwnerTeam(_ctx.stringValue("OpsDescribeWarningInfosResponse.Data["+ i +"].OwnerTeam"));
			warningInfos.setOwner(_ctx.stringValue("OpsDescribeWarningInfosResponse.Data["+ i +"].Owner"));
			warningInfos.setOwnerName(_ctx.stringValue("OpsDescribeWarningInfosResponse.Data["+ i +"].OwnerName"));
			warningInfos.setPhoneNumber(_ctx.stringValue("OpsDescribeWarningInfosResponse.Data["+ i +"].PhoneNumber"));

			data.add(warningInfos);
		}
		opsDescribeWarningInfosResponse.setData(data);
	 
	 	return opsDescribeWarningInfosResponse;
	}
}