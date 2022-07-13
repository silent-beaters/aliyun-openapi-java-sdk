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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceNetInfoResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceNetInfoResponse.DBInstanceNetInfo;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceNetInfoResponse.DBInstanceNetInfo.DBInstanceWeight;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceNetInfoResponse.DBInstanceNetInfo.SecurityIPGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceNetInfoResponseUnmarshaller {

	public static DescribeDBInstanceNetInfoResponse unmarshall(DescribeDBInstanceNetInfoResponse describeDBInstanceNetInfoResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceNetInfoResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.RequestId"));
		describeDBInstanceNetInfoResponse.setSecurityIPMode(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.SecurityIPMode"));
		describeDBInstanceNetInfoResponse.setInstanceNetworkType(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.InstanceNetworkType"));

		List<DBInstanceNetInfo> dBInstanceNetInfos = new ArrayList<DBInstanceNetInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos.Length"); i++) {
			DBInstanceNetInfo dBInstanceNetInfo = new DBInstanceNetInfo();
			dBInstanceNetInfo.setVSwitchId(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].VSwitchId"));
			dBInstanceNetInfo.setConnectionStringType(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].ConnectionStringType"));
			dBInstanceNetInfo.setConnectionString(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].ConnectionString"));
			dBInstanceNetInfo.setExpiredTime(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].ExpiredTime"));
			dBInstanceNetInfo.setUpgradeable(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].Upgradeable"));
			dBInstanceNetInfo.setMaxDelayTime(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].MaxDelayTime"));
			dBInstanceNetInfo.setIPType(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].IPType"));
			dBInstanceNetInfo.setPort(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].Port"));
			dBInstanceNetInfo.setBabelfishPort(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].BabelfishPort"));
			dBInstanceNetInfo.setVPCId(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].VPCId"));
			dBInstanceNetInfo.setDistributionType(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].DistributionType"));
			dBInstanceNetInfo.setIPAddress(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].IPAddress"));

			List<SecurityIPGroup> securityIPGroups = new ArrayList<SecurityIPGroup>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].SecurityIPGroups.Length"); j++) {
				SecurityIPGroup securityIPGroup = new SecurityIPGroup();
				securityIPGroup.setSecurityIPs(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].SecurityIPGroups["+ j +"].SecurityIPs"));
				securityIPGroup.setSecurityIPGroupName(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].SecurityIPGroups["+ j +"].SecurityIPGroupName"));

				securityIPGroups.add(securityIPGroup);
			}
			dBInstanceNetInfo.setSecurityIPGroups(securityIPGroups);

			List<DBInstanceWeight> dBInstanceWeights = new ArrayList<DBInstanceWeight>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].DBInstanceWeights.Length"); j++) {
				DBInstanceWeight dBInstanceWeight = new DBInstanceWeight();
				dBInstanceWeight.setAvailability(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].DBInstanceWeights["+ j +"].Availability"));
				dBInstanceWeight.setWeight(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].DBInstanceWeights["+ j +"].Weight"));
				dBInstanceWeight.setDBInstanceId(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].DBInstanceWeights["+ j +"].DBInstanceId"));
				dBInstanceWeight.setRole(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].DBInstanceWeights["+ j +"].Role"));
				dBInstanceWeight.setDBInstanceType(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].DBInstanceWeights["+ j +"].DBInstanceType"));

				dBInstanceWeights.add(dBInstanceWeight);
			}
			dBInstanceNetInfo.setDBInstanceWeights(dBInstanceWeights);

			dBInstanceNetInfos.add(dBInstanceNetInfo);
		}
		describeDBInstanceNetInfoResponse.setDBInstanceNetInfos(dBInstanceNetInfos);
	 
	 	return describeDBInstanceNetInfoResponse;
	}
}