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

import com.aliyuncs.ccc.model.v20170705.ListInstancesOfUserResponse;
import com.aliyuncs.ccc.model.v20170705.ListInstancesOfUserResponse.CallCenterInstance;
import com.aliyuncs.ccc.model.v20170705.ListInstancesOfUserResponse.CallCenterInstance.PhoneNumber;
import com.aliyuncs.ccc.model.v20170705.ListInstancesOfUserResponse.CallCenterInstance.User;
import com.aliyuncs.ccc.model.v20170705.ListInstancesOfUserResponse.CallCenterInstance.User.Detail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesOfUserResponseUnmarshaller {

	public static ListInstancesOfUserResponse unmarshall(ListInstancesOfUserResponse listInstancesOfUserResponse, UnmarshallerContext _ctx) {
		
		listInstancesOfUserResponse.setRequestId(_ctx.stringValue("ListInstancesOfUserResponse.RequestId"));
		listInstancesOfUserResponse.setHttpStatusCode(_ctx.integerValue("ListInstancesOfUserResponse.HttpStatusCode"));
		listInstancesOfUserResponse.setCode(_ctx.stringValue("ListInstancesOfUserResponse.Code"));
		listInstancesOfUserResponse.setMessage(_ctx.stringValue("ListInstancesOfUserResponse.Message"));
		listInstancesOfUserResponse.setSuccess(_ctx.booleanValue("ListInstancesOfUserResponse.Success"));

		List<CallCenterInstance> instances = new ArrayList<CallCenterInstance>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesOfUserResponse.Instances.Length"); i++) {
			CallCenterInstance callCenterInstance = new CallCenterInstance();
			callCenterInstance.setStatus(_ctx.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].Status"));
			callCenterInstance.setOwner(_ctx.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].Owner"));
			callCenterInstance.setStorageMaxDays(_ctx.integerValue("ListInstancesOfUserResponse.Instances["+ i +"].StorageMaxDays"));
			callCenterInstance.setStorageMaxSize(_ctx.integerValue("ListInstancesOfUserResponse.Instances["+ i +"].StorageMaxSize"));
			callCenterInstance.setMaxOnlineAgents(_ctx.integerValue("ListInstancesOfUserResponse.Instances["+ i +"].MaxOnlineAgents"));
			callCenterInstance.setInstanceId(_ctx.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].InstanceId"));
			callCenterInstance.setInstanceDescription(_ctx.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].InstanceDescription"));
			callCenterInstance.setDomainName(_ctx.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].DomainName"));
			callCenterInstance.setConsoleUrl(_ctx.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].ConsoleUrl"));
			callCenterInstance.setInstanceName(_ctx.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].InstanceName"));
			callCenterInstance.setStorageBucket(_ctx.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].StorageBucket"));
			callCenterInstance.setCreatedTime(_ctx.longValue("ListInstancesOfUserResponse.Instances["+ i +"].CreatedTime"));
			callCenterInstance.setDirectoryId(_ctx.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].DirectoryId"));
			callCenterInstance.setTenantId(_ctx.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].TenantId"));

			List<User> admin = new ArrayList<User>();
			for (int j = 0; j < _ctx.lengthValue("ListInstancesOfUserResponse.Instances["+ i +"].Admin.Length"); j++) {
				User user = new User();
				user.setInstanceId(_ctx.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].Admin["+ j +"].InstanceId"));
				user.setRamId(_ctx.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].Admin["+ j +"].RamId"));
				user.setUserId(_ctx.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].Admin["+ j +"].UserId"));

				Detail detail = new Detail();
				detail.setDisplayName(_ctx.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].Admin["+ j +"].Detail.DisplayName"));
				detail.setEmail(_ctx.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].Admin["+ j +"].Detail.Email"));
				detail.setLoginName(_ctx.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].Admin["+ j +"].Detail.LoginName"));
				detail.setDepartment(_ctx.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].Admin["+ j +"].Detail.Department"));
				detail.setPhone(_ctx.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].Admin["+ j +"].Detail.Phone"));
				user.setDetail(detail);

				admin.add(user);
			}
			callCenterInstance.setAdmin(admin);

			List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
			for (int j = 0; j < _ctx.lengthValue("ListInstancesOfUserResponse.Instances["+ i +"].PhoneNumbers.Length"); j++) {
				PhoneNumber phoneNumber = new PhoneNumber();
				phoneNumber.setTestOnly(_ctx.booleanValue("ListInstancesOfUserResponse.Instances["+ i +"].PhoneNumbers["+ j +"].TestOnly"));
				phoneNumber.setTrunks(_ctx.integerValue("ListInstancesOfUserResponse.Instances["+ i +"].PhoneNumbers["+ j +"].Trunks"));
				phoneNumber.setRemainingTime(_ctx.integerValue("ListInstancesOfUserResponse.Instances["+ i +"].PhoneNumbers["+ j +"].RemainingTime"));
				phoneNumber.setNumber(_ctx.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].PhoneNumbers["+ j +"].Number"));
				phoneNumber.setInstanceId(_ctx.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].PhoneNumbers["+ j +"].InstanceId"));
				phoneNumber.setUsage(_ctx.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].PhoneNumbers["+ j +"].Usage"));
				phoneNumber.setAllowOutbound(_ctx.booleanValue("ListInstancesOfUserResponse.Instances["+ i +"].PhoneNumbers["+ j +"].AllowOutbound"));
				phoneNumber.setPhoneNumberDescription(_ctx.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].PhoneNumbers["+ j +"].PhoneNumberDescription"));
				phoneNumber.setPhoneNumberId(_ctx.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].PhoneNumbers["+ j +"].PhoneNumberId"));

				phoneNumbers.add(phoneNumber);
			}
			callCenterInstance.setPhoneNumbers(phoneNumbers);

			instances.add(callCenterInstance);
		}
		listInstancesOfUserResponse.setInstances(instances);
	 
	 	return listInstancesOfUserResponse;
	}
}