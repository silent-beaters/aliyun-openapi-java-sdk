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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.ListSkillGroupsResponse;
import com.aliyuncs.ccc.model.v20170705.ListSkillGroupsResponse.SkillGroup;
import com.aliyuncs.ccc.model.v20170705.ListSkillGroupsResponse.SkillGroup.PhoneNumber;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSkillGroupsResponseUnmarshaller {

	public static ListSkillGroupsResponse unmarshall(ListSkillGroupsResponse listSkillGroupsResponse, UnmarshallerContext _ctx) {
		
		listSkillGroupsResponse.setRequestId(_ctx.stringValue("ListSkillGroupsResponse.RequestId"));
		listSkillGroupsResponse.setHttpStatusCode(_ctx.integerValue("ListSkillGroupsResponse.HttpStatusCode"));
		listSkillGroupsResponse.setCode(_ctx.stringValue("ListSkillGroupsResponse.Code"));
		listSkillGroupsResponse.setMessage(_ctx.stringValue("ListSkillGroupsResponse.Message"));
		listSkillGroupsResponse.setSuccess(_ctx.booleanValue("ListSkillGroupsResponse.Success"));

		List<SkillGroup> skillGroups = new ArrayList<SkillGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListSkillGroupsResponse.SkillGroups.Length"); i++) {
			SkillGroup skillGroup = new SkillGroup();
			skillGroup.setRoutingStrategy(_ctx.stringValue("ListSkillGroupsResponse.SkillGroups["+ i +"].RoutingStrategy"));
			skillGroup.setSkillGroupId(_ctx.stringValue("ListSkillGroupsResponse.SkillGroups["+ i +"].SkillGroupId"));
			skillGroup.setSkillGroupName(_ctx.stringValue("ListSkillGroupsResponse.SkillGroups["+ i +"].SkillGroupName"));
			skillGroup.setUserCount(_ctx.integerValue("ListSkillGroupsResponse.SkillGroups["+ i +"].UserCount"));
			skillGroup.setInstanceId(_ctx.stringValue("ListSkillGroupsResponse.SkillGroups["+ i +"].InstanceId"));
			skillGroup.setAccQueueName(_ctx.stringValue("ListSkillGroupsResponse.SkillGroups["+ i +"].AccQueueName"));
			skillGroup.setAccSkillGroupName(_ctx.stringValue("ListSkillGroupsResponse.SkillGroups["+ i +"].AccSkillGroupName"));
			skillGroup.setSkillGroupDescription(_ctx.stringValue("ListSkillGroupsResponse.SkillGroups["+ i +"].SkillGroupDescription"));

			List<PhoneNumber> outboundPhoneNumbers = new ArrayList<PhoneNumber>();
			for (int j = 0; j < _ctx.lengthValue("ListSkillGroupsResponse.SkillGroups["+ i +"].OutboundPhoneNumbers.Length"); j++) {
				PhoneNumber phoneNumber = new PhoneNumber();
				phoneNumber.setTestOnly(_ctx.booleanValue("ListSkillGroupsResponse.SkillGroups["+ i +"].OutboundPhoneNumbers["+ j +"].TestOnly"));
				phoneNumber.setTrunks(_ctx.integerValue("ListSkillGroupsResponse.SkillGroups["+ i +"].OutboundPhoneNumbers["+ j +"].Trunks"));
				phoneNumber.setRemainingTime(_ctx.integerValue("ListSkillGroupsResponse.SkillGroups["+ i +"].OutboundPhoneNumbers["+ j +"].RemainingTime"));
				phoneNumber.setNumber(_ctx.stringValue("ListSkillGroupsResponse.SkillGroups["+ i +"].OutboundPhoneNumbers["+ j +"].Number"));
				phoneNumber.setInstanceId(_ctx.stringValue("ListSkillGroupsResponse.SkillGroups["+ i +"].OutboundPhoneNumbers["+ j +"].InstanceId"));
				phoneNumber.setUsage(_ctx.stringValue("ListSkillGroupsResponse.SkillGroups["+ i +"].OutboundPhoneNumbers["+ j +"].Usage"));
				phoneNumber.setAllowOutbound(_ctx.booleanValue("ListSkillGroupsResponse.SkillGroups["+ i +"].OutboundPhoneNumbers["+ j +"].AllowOutbound"));
				phoneNumber.setPhoneNumberDescription(_ctx.stringValue("ListSkillGroupsResponse.SkillGroups["+ i +"].OutboundPhoneNumbers["+ j +"].PhoneNumberDescription"));
				phoneNumber.setPhoneNumberId(_ctx.stringValue("ListSkillGroupsResponse.SkillGroups["+ i +"].OutboundPhoneNumbers["+ j +"].PhoneNumberId"));

				outboundPhoneNumbers.add(phoneNumber);
			}
			skillGroup.setOutboundPhoneNumbers(outboundPhoneNumbers);

			skillGroups.add(skillGroup);
		}
		listSkillGroupsResponse.setSkillGroups(skillGroups);
	 
	 	return listSkillGroupsResponse;
	}
}