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

import com.aliyuncs.ccc.model.v20170705.ListUsersOfSkillGroupResponse;
import com.aliyuncs.ccc.model.v20170705.ListUsersOfSkillGroupResponse.Users;
import com.aliyuncs.ccc.model.v20170705.ListUsersOfSkillGroupResponse.Users.User;
import com.aliyuncs.ccc.model.v20170705.ListUsersOfSkillGroupResponse.Users.User.Detail;
import com.aliyuncs.ccc.model.v20170705.ListUsersOfSkillGroupResponse.Users.User.Role;
import com.aliyuncs.ccc.model.v20170705.ListUsersOfSkillGroupResponse.Users.User.Role.Privilege;
import com.aliyuncs.ccc.model.v20170705.ListUsersOfSkillGroupResponse.Users.User.SkillLevel;
import com.aliyuncs.ccc.model.v20170705.ListUsersOfSkillGroupResponse.Users.User.SkillLevel.Skill;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUsersOfSkillGroupResponseUnmarshaller {

	public static ListUsersOfSkillGroupResponse unmarshall(ListUsersOfSkillGroupResponse listUsersOfSkillGroupResponse, UnmarshallerContext _ctx) {
		
		listUsersOfSkillGroupResponse.setRequestId(_ctx.stringValue("ListUsersOfSkillGroupResponse.RequestId"));
		listUsersOfSkillGroupResponse.setHttpStatusCode(_ctx.integerValue("ListUsersOfSkillGroupResponse.HttpStatusCode"));
		listUsersOfSkillGroupResponse.setCode(_ctx.stringValue("ListUsersOfSkillGroupResponse.Code"));
		listUsersOfSkillGroupResponse.setMessage(_ctx.stringValue("ListUsersOfSkillGroupResponse.Message"));
		listUsersOfSkillGroupResponse.setSuccess(_ctx.booleanValue("ListUsersOfSkillGroupResponse.Success"));

		Users users = new Users();
		users.setPageNumber(_ctx.integerValue("ListUsersOfSkillGroupResponse.Users.PageNumber"));
		users.setPageSize(_ctx.integerValue("ListUsersOfSkillGroupResponse.Users.PageSize"));
		users.setTotalCount(_ctx.integerValue("ListUsersOfSkillGroupResponse.Users.TotalCount"));

		List<User> list = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("ListUsersOfSkillGroupResponse.Users.List.Length"); i++) {
			User user = new User();
			user.setInstanceId(_ctx.stringValue("ListUsersOfSkillGroupResponse.Users.List["+ i +"].InstanceId"));
			user.setRamId(_ctx.stringValue("ListUsersOfSkillGroupResponse.Users.List["+ i +"].RamId"));
			user.setUserId(_ctx.stringValue("ListUsersOfSkillGroupResponse.Users.List["+ i +"].UserId"));

			Detail detail = new Detail();
			detail.setDisplayName(_ctx.stringValue("ListUsersOfSkillGroupResponse.Users.List["+ i +"].Detail.DisplayName"));
			detail.setEmail(_ctx.stringValue("ListUsersOfSkillGroupResponse.Users.List["+ i +"].Detail.Email"));
			detail.setLoginName(_ctx.stringValue("ListUsersOfSkillGroupResponse.Users.List["+ i +"].Detail.LoginName"));
			detail.setDepartment(_ctx.stringValue("ListUsersOfSkillGroupResponse.Users.List["+ i +"].Detail.Department"));
			detail.setPhone(_ctx.stringValue("ListUsersOfSkillGroupResponse.Users.List["+ i +"].Detail.Phone"));
			user.setDetail(detail);

			List<Role> roles = new ArrayList<Role>();
			for (int j = 0; j < _ctx.lengthValue("ListUsersOfSkillGroupResponse.Users.List["+ i +"].Roles.Length"); j++) {
				Role role = new Role();
				role.setUserCount(_ctx.integerValue("ListUsersOfSkillGroupResponse.Users.List["+ i +"].Roles["+ j +"].UserCount"));
				role.setRoleName(_ctx.stringValue("ListUsersOfSkillGroupResponse.Users.List["+ i +"].Roles["+ j +"].RoleName"));
				role.setInstanceId(_ctx.stringValue("ListUsersOfSkillGroupResponse.Users.List["+ i +"].Roles["+ j +"].InstanceId"));
				role.setRoleDescription(_ctx.stringValue("ListUsersOfSkillGroupResponse.Users.List["+ i +"].Roles["+ j +"].RoleDescription"));
				role.setRoleId(_ctx.stringValue("ListUsersOfSkillGroupResponse.Users.List["+ i +"].Roles["+ j +"].RoleId"));

				List<Privilege> privileges = new ArrayList<Privilege>();
				for (int k = 0; k < _ctx.lengthValue("ListUsersOfSkillGroupResponse.Users.List["+ i +"].Roles["+ j +"].Privileges.Length"); k++) {
					Privilege privilege = new Privilege();
					privilege.setPrivilegeName(_ctx.stringValue("ListUsersOfSkillGroupResponse.Users.List["+ i +"].Roles["+ j +"].Privileges["+ k +"].PrivilegeName"));
					privilege.setPrivilegeId(_ctx.stringValue("ListUsersOfSkillGroupResponse.Users.List["+ i +"].Roles["+ j +"].Privileges["+ k +"].PrivilegeId"));
					privilege.setPrivilegeDescription(_ctx.stringValue("ListUsersOfSkillGroupResponse.Users.List["+ i +"].Roles["+ j +"].Privileges["+ k +"].PrivilegeDescription"));

					privileges.add(privilege);
				}
				role.setPrivileges(privileges);

				roles.add(role);
			}
			user.setRoles(roles);

			List<SkillLevel> skillLevels = new ArrayList<SkillLevel>();
			for (int j = 0; j < _ctx.lengthValue("ListUsersOfSkillGroupResponse.Users.List["+ i +"].SkillLevels.Length"); j++) {
				SkillLevel skillLevel = new SkillLevel();
				skillLevel.setSkillLevelId(_ctx.stringValue("ListUsersOfSkillGroupResponse.Users.List["+ i +"].SkillLevels["+ j +"].SkillLevelId"));
				skillLevel.setLevel(_ctx.integerValue("ListUsersOfSkillGroupResponse.Users.List["+ i +"].SkillLevels["+ j +"].Level"));

				Skill skill = new Skill();
				skill.setInstanceId(_ctx.stringValue("ListUsersOfSkillGroupResponse.Users.List["+ i +"].SkillLevels["+ j +"].Skill.InstanceId"));
				skill.setSkillGroupDescription(_ctx.stringValue("ListUsersOfSkillGroupResponse.Users.List["+ i +"].SkillLevels["+ j +"].Skill.SkillGroupDescription"));
				skill.setSkillGroupId(_ctx.stringValue("ListUsersOfSkillGroupResponse.Users.List["+ i +"].SkillLevels["+ j +"].Skill.SkillGroupId"));
				skill.setSkillGroupName(_ctx.stringValue("ListUsersOfSkillGroupResponse.Users.List["+ i +"].SkillLevels["+ j +"].Skill.SkillGroupName"));
				skillLevel.setSkill(skill);

				skillLevels.add(skillLevel);
			}
			user.setSkillLevels(skillLevels);

			list.add(user);
		}
		users.setList(list);
		listUsersOfSkillGroupResponse.setUsers(users);
	 
	 	return listUsersOfSkillGroupResponse;
	}
}