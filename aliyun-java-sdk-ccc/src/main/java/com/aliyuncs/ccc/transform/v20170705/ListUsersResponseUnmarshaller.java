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

import com.aliyuncs.ccc.model.v20170705.ListUsersResponse;
import com.aliyuncs.ccc.model.v20170705.ListUsersResponse.Users;
import com.aliyuncs.ccc.model.v20170705.ListUsersResponse.Users.User;
import com.aliyuncs.ccc.model.v20170705.ListUsersResponse.Users.User.Detail;
import com.aliyuncs.ccc.model.v20170705.ListUsersResponse.Users.User.Role;
import com.aliyuncs.ccc.model.v20170705.ListUsersResponse.Users.User.SkillLevel;
import com.aliyuncs.ccc.model.v20170705.ListUsersResponse.Users.User.SkillLevel.Skill;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUsersResponseUnmarshaller {

	public static ListUsersResponse unmarshall(ListUsersResponse listUsersResponse, UnmarshallerContext _ctx) {
		
		listUsersResponse.setRequestId(_ctx.stringValue("ListUsersResponse.RequestId"));
		listUsersResponse.setHttpStatusCode(_ctx.integerValue("ListUsersResponse.HttpStatusCode"));
		listUsersResponse.setCode(_ctx.stringValue("ListUsersResponse.Code"));
		listUsersResponse.setMessage(_ctx.stringValue("ListUsersResponse.Message"));
		listUsersResponse.setSuccess(_ctx.booleanValue("ListUsersResponse.Success"));

		Users users = new Users();
		users.setPageNumber(_ctx.integerValue("ListUsersResponse.Users.PageNumber"));
		users.setPageSize(_ctx.integerValue("ListUsersResponse.Users.PageSize"));
		users.setTotalCount(_ctx.integerValue("ListUsersResponse.Users.TotalCount"));

		List<User> list = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("ListUsersResponse.Users.List.Length"); i++) {
			User user = new User();
			user.setPrivateOutboundNumberId(_ctx.stringValue("ListUsersResponse.Users.List["+ i +"].PrivateOutboundNumberId"));
			user.setPrimary(_ctx.booleanValue("ListUsersResponse.Users.List["+ i +"].Primary"));
			user.setInstanceId(_ctx.stringValue("ListUsersResponse.Users.List["+ i +"].InstanceId"));
			user.setRamId(_ctx.stringValue("ListUsersResponse.Users.List["+ i +"].RamId"));
			user.setUserId(_ctx.stringValue("ListUsersResponse.Users.List["+ i +"].UserId"));

			Detail detail = new Detail();
			detail.setDisplayName(_ctx.stringValue("ListUsersResponse.Users.List["+ i +"].Detail.DisplayName"));
			detail.setEmail(_ctx.stringValue("ListUsersResponse.Users.List["+ i +"].Detail.Email"));
			detail.setLoginName(_ctx.stringValue("ListUsersResponse.Users.List["+ i +"].Detail.LoginName"));
			detail.setDepartment(_ctx.stringValue("ListUsersResponse.Users.List["+ i +"].Detail.Department"));
			detail.setPhone(_ctx.stringValue("ListUsersResponse.Users.List["+ i +"].Detail.Phone"));
			user.setDetail(detail);

			List<Role> roles = new ArrayList<Role>();
			for (int j = 0; j < _ctx.lengthValue("ListUsersResponse.Users.List["+ i +"].Roles.Length"); j++) {
				Role role = new Role();
				role.setInstanceId(_ctx.stringValue("ListUsersResponse.Users.List["+ i +"].Roles["+ j +"].InstanceId"));
				role.setRoleName(_ctx.stringValue("ListUsersResponse.Users.List["+ i +"].Roles["+ j +"].RoleName"));
				role.setRoleDescription(_ctx.stringValue("ListUsersResponse.Users.List["+ i +"].Roles["+ j +"].RoleDescription"));
				role.setRoleId(_ctx.stringValue("ListUsersResponse.Users.List["+ i +"].Roles["+ j +"].RoleId"));

				roles.add(role);
			}
			user.setRoles(roles);

			List<SkillLevel> skillLevels = new ArrayList<SkillLevel>();
			for (int j = 0; j < _ctx.lengthValue("ListUsersResponse.Users.List["+ i +"].SkillLevels.Length"); j++) {
				SkillLevel skillLevel = new SkillLevel();
				skillLevel.setSkillLevelId(_ctx.stringValue("ListUsersResponse.Users.List["+ i +"].SkillLevels["+ j +"].SkillLevelId"));
				skillLevel.setLevel(_ctx.integerValue("ListUsersResponse.Users.List["+ i +"].SkillLevels["+ j +"].Level"));

				Skill skill = new Skill();
				skill.setInstanceId(_ctx.stringValue("ListUsersResponse.Users.List["+ i +"].SkillLevels["+ j +"].Skill.InstanceId"));
				skill.setSkillGroupDescription(_ctx.stringValue("ListUsersResponse.Users.List["+ i +"].SkillLevels["+ j +"].Skill.SkillGroupDescription"));
				skill.setSkillGroupId(_ctx.stringValue("ListUsersResponse.Users.List["+ i +"].SkillLevels["+ j +"].Skill.SkillGroupId"));
				skill.setSkillGroupName(_ctx.stringValue("ListUsersResponse.Users.List["+ i +"].SkillLevels["+ j +"].Skill.SkillGroupName"));
				skillLevel.setSkill(skill);

				skillLevels.add(skillLevel);
			}
			user.setSkillLevels(skillLevels);

			list.add(user);
		}
		users.setList(list);
		listUsersResponse.setUsers(users);
	 
	 	return listUsersResponse;
	}
}