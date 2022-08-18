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

package com.aliyuncs.eiam.transform.v20211201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eiam.model.v20211201.ListUsersForApplicationResponse;
import com.aliyuncs.eiam.model.v20211201.ListUsersForApplicationResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUsersForApplicationResponseUnmarshaller {

	public static ListUsersForApplicationResponse unmarshall(ListUsersForApplicationResponse listUsersForApplicationResponse, UnmarshallerContext _ctx) {
		
		listUsersForApplicationResponse.setRequestId(_ctx.stringValue("ListUsersForApplicationResponse.RequestId"));
		listUsersForApplicationResponse.setTotalCount(_ctx.longValue("ListUsersForApplicationResponse.TotalCount"));

		List<User> users = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("ListUsersForApplicationResponse.Users.Length"); i++) {
			User user = new User();
			user.setUserId(_ctx.stringValue("ListUsersForApplicationResponse.Users["+ i +"].UserId"));

			users.add(user);
		}
		listUsersForApplicationResponse.setUsers(users);
	 
	 	return listUsersForApplicationResponse;
	}
}