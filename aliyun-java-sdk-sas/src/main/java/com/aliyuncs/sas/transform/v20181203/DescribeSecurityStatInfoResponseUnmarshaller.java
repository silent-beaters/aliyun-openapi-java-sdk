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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeSecurityStatInfoResponse;
import com.aliyuncs.sas.model.v20181203.DescribeSecurityStatInfoResponse.AttackEvent;
import com.aliyuncs.sas.model.v20181203.DescribeSecurityStatInfoResponse.HealthCheck;
import com.aliyuncs.sas.model.v20181203.DescribeSecurityStatInfoResponse.SecurityEvent;
import com.aliyuncs.sas.model.v20181203.DescribeSecurityStatInfoResponse.Vulnerability;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecurityStatInfoResponseUnmarshaller {

	public static DescribeSecurityStatInfoResponse unmarshall(DescribeSecurityStatInfoResponse describeSecurityStatInfoResponse, UnmarshallerContext _ctx) {
		
		describeSecurityStatInfoResponse.setRequestId(_ctx.stringValue("DescribeSecurityStatInfoResponse.RequestId"));
		describeSecurityStatInfoResponse.setSuccess(_ctx.booleanValue("DescribeSecurityStatInfoResponse.Success"));

		SecurityEvent securityEvent = new SecurityEvent();
		securityEvent.setSuspiciousCount(_ctx.integerValue("DescribeSecurityStatInfoResponse.SecurityEvent.SuspiciousCount"));
		securityEvent.setSeriousCount(_ctx.integerValue("DescribeSecurityStatInfoResponse.SecurityEvent.SeriousCount"));
		securityEvent.setRemindCount(_ctx.integerValue("DescribeSecurityStatInfoResponse.SecurityEvent.RemindCount"));
		securityEvent.setTotalCount(_ctx.integerValue("DescribeSecurityStatInfoResponse.SecurityEvent.TotalCount"));

		List<String> valueArray = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.SecurityEvent.ValueArray.Length"); i++) {
			valueArray.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.SecurityEvent.ValueArray["+ i +"]"));
		}
		securityEvent.setValueArray(valueArray);

		List<String> timeArray = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.SecurityEvent.TimeArray.Length"); i++) {
			timeArray.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.SecurityEvent.TimeArray["+ i +"]"));
		}
		securityEvent.setTimeArray(timeArray);

		List<String> remindList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.SecurityEvent.RemindList.Length"); i++) {
			remindList.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.SecurityEvent.RemindList["+ i +"]"));
		}
		securityEvent.setRemindList(remindList);

		List<String> levelsOn = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.SecurityEvent.LevelsOn.Length"); i++) {
			levelsOn.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.SecurityEvent.LevelsOn["+ i +"]"));
		}
		securityEvent.setLevelsOn(levelsOn);

		List<String> dateArray = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.SecurityEvent.DateArray.Length"); i++) {
			dateArray.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.SecurityEvent.DateArray["+ i +"]"));
		}
		securityEvent.setDateArray(dateArray);

		List<String> suspiciousList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.SecurityEvent.SuspiciousList.Length"); i++) {
			suspiciousList.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.SecurityEvent.SuspiciousList["+ i +"]"));
		}
		securityEvent.setSuspiciousList(suspiciousList);

		List<String> seriousList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.SecurityEvent.SeriousList.Length"); i++) {
			seriousList.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.SecurityEvent.SeriousList["+ i +"]"));
		}
		securityEvent.setSeriousList(seriousList);
		describeSecurityStatInfoResponse.setSecurityEvent(securityEvent);

		AttackEvent attackEvent = new AttackEvent();
		attackEvent.setTotalCount(_ctx.integerValue("DescribeSecurityStatInfoResponse.AttackEvent.TotalCount"));

		List<String> dateArray1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.AttackEvent.DateArray.Length"); i++) {
			dateArray1.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.AttackEvent.DateArray["+ i +"]"));
		}
		attackEvent.setDateArray1(dateArray1);

		List<String> valueArray2 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.AttackEvent.ValueArray.Length"); i++) {
			valueArray2.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.AttackEvent.ValueArray["+ i +"]"));
		}
		attackEvent.setValueArray2(valueArray2);
		describeSecurityStatInfoResponse.setAttackEvent(attackEvent);

		HealthCheck healthCheck = new HealthCheck();
		healthCheck.setHighCount(_ctx.integerValue("DescribeSecurityStatInfoResponse.HealthCheck.HighCount"));
		healthCheck.setLowCount(_ctx.integerValue("DescribeSecurityStatInfoResponse.HealthCheck.LowCount"));
		healthCheck.setTotalCount(_ctx.integerValue("DescribeSecurityStatInfoResponse.HealthCheck.TotalCount"));
		healthCheck.setMediumCount(_ctx.integerValue("DescribeSecurityStatInfoResponse.HealthCheck.MediumCount"));

		List<String> valueArray3 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.HealthCheck.ValueArray.Length"); i++) {
			valueArray3.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.HealthCheck.ValueArray["+ i +"]"));
		}
		healthCheck.setValueArray3(valueArray3);

		List<String> timeArray4 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.HealthCheck.TimeArray.Length"); i++) {
			timeArray4.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.HealthCheck.TimeArray["+ i +"]"));
		}
		healthCheck.setTimeArray4(timeArray4);

		List<String> levelsOn5 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.HealthCheck.LevelsOn.Length"); i++) {
			levelsOn5.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.HealthCheck.LevelsOn["+ i +"]"));
		}
		healthCheck.setLevelsOn5(levelsOn5);

		List<String> lowList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.HealthCheck.LowList.Length"); i++) {
			lowList.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.HealthCheck.LowList["+ i +"]"));
		}
		healthCheck.setLowList(lowList);

		List<String> mediumList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.HealthCheck.MediumList.Length"); i++) {
			mediumList.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.HealthCheck.MediumList["+ i +"]"));
		}
		healthCheck.setMediumList(mediumList);

		List<String> dateArray6 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.HealthCheck.DateArray.Length"); i++) {
			dateArray6.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.HealthCheck.DateArray["+ i +"]"));
		}
		healthCheck.setDateArray6(dateArray6);

		List<String> highList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.HealthCheck.HighList.Length"); i++) {
			highList.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.HealthCheck.HighList["+ i +"]"));
		}
		healthCheck.setHighList(highList);
		describeSecurityStatInfoResponse.setHealthCheck(healthCheck);

		Vulnerability vulnerability = new Vulnerability();
		vulnerability.setNntfCount(_ctx.integerValue("DescribeSecurityStatInfoResponse.Vulnerability.NntfCount"));
		vulnerability.setLaterCount(_ctx.integerValue("DescribeSecurityStatInfoResponse.Vulnerability.LaterCount"));
		vulnerability.setTotalCount(_ctx.integerValue("DescribeSecurityStatInfoResponse.Vulnerability.TotalCount"));
		vulnerability.setAsapCount(_ctx.integerValue("DescribeSecurityStatInfoResponse.Vulnerability.AsapCount"));

		List<String> nntfList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.Vulnerability.NntfList.Length"); i++) {
			nntfList.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.Vulnerability.NntfList["+ i +"]"));
		}
		vulnerability.setNntfList(nntfList);

		List<String> asapList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.Vulnerability.AsapList.Length"); i++) {
			asapList.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.Vulnerability.AsapList["+ i +"]"));
		}
		vulnerability.setAsapList(asapList);

		List<String> valueArray7 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.Vulnerability.ValueArray.Length"); i++) {
			valueArray7.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.Vulnerability.ValueArray["+ i +"]"));
		}
		vulnerability.setValueArray7(valueArray7);

		List<String> timeArray8 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.Vulnerability.TimeArray.Length"); i++) {
			timeArray8.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.Vulnerability.TimeArray["+ i +"]"));
		}
		vulnerability.setTimeArray8(timeArray8);

		List<String> levelsOn9 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.Vulnerability.LevelsOn.Length"); i++) {
			levelsOn9.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.Vulnerability.LevelsOn["+ i +"]"));
		}
		vulnerability.setLevelsOn9(levelsOn9);

		List<String> laterList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.Vulnerability.LaterList.Length"); i++) {
			laterList.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.Vulnerability.LaterList["+ i +"]"));
		}
		vulnerability.setLaterList(laterList);

		List<String> dateArray10 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityStatInfoResponse.Vulnerability.DateArray.Length"); i++) {
			dateArray10.add(_ctx.stringValue("DescribeSecurityStatInfoResponse.Vulnerability.DateArray["+ i +"]"));
		}
		vulnerability.setDateArray10(dateArray10);
		describeSecurityStatInfoResponse.setVulnerability(vulnerability);
	 
	 	return describeSecurityStatInfoResponse;
	}
}