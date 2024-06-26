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

import com.aliyuncs.ccc.model.v20170705.FindUsersResponse;
import com.aliyuncs.ccc.model.v20170705.FindUsersResponse.Users;
import com.aliyuncs.ccc.model.v20170705.FindUsersResponse.Users.User;
import com.aliyuncs.ccc.model.v20170705.FindUsersResponse.Users.User.Detail;
import com.aliyuncs.ccc.model.v20170705.FindUsersResponse.Users.User.Role;
import com.aliyuncs.ccc.model.v20170705.FindUsersResponse.Users.User.SkillLevel;
import com.aliyuncs.ccc.model.v20170705.FindUsersResponse.Users.User.SkillLevel.Skill;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindUsersResponseUnmarshaller {

	public static FindUsersResponse unmarshall(FindUsersResponse findUsersResponse, UnmarshallerContext _ctx) {
		
		findUsersResponse.setRequestId(_ctx.stringValue("FindUsersResponse.RequestId"));
		findUsersResponse.setHttpStatusCode(_ctx.integerValue("FindUsersResponse.HttpStatusCode"));
		findUsersResponse.setCode(_ctx.stringValue("FindUsersResponse.Code"));
		findUsersResponse.setMessage(_ctx.stringValue("FindUsersResponse.Message"));
		findUsersResponse.setSuccess(_ctx.booleanValue("FindUsersResponse.Success"));

		Users users = new Users();
		users.setPageNumber(_ctx.integerValue("FindUsersResponse.Users.PageNumber"));
		users.setPageSize(_ctx.integerValue("FindUsersResponse.Users.PageSize"));
		users.setTotalCount(_ctx.integerValue("FindUsersResponse.Users.TotalCount"));

		List<User> list = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("FindUsersResponse.Users.List.Length"); i++) {
			User user = new User();
			user.setPrivateOutboundNumberId(_ctx.stringValue("FindUsersResponse.Users.List["+ i +"].PrivateOutboundNumberId"));
			user.setInstanceId(_ctx.stringValue("FindUsersResponse.Users.List["+ i +"].InstanceId"));
			user.setRamId(_ctx.stringValue("FindUsersResponse.Users.List["+ i +"].RamId"));
			user.setUserId(_ctx.stringValue("FindUsersResponse.Users.List["+ i +"].UserId"));

			Detail detail = new Detail();
			detail.setDisplayName(_ctx.stringValue("FindUsersResponse.Users.List["+ i +"].Detail.DisplayName"));
			detail.setEmail(_ctx.stringValue("FindUsersResponse.Users.List["+ i +"].Detail.Email"));
			detail.setLoginName(_ctx.stringValue("FindUsersResponse.Users.List["+ i +"].Detail.LoginName"));
			detail.setDepartment(_ctx.stringValue("FindUsersResponse.Users.List["+ i +"].Detail.Department"));
			detail.setPhone(_ctx.stringValue("FindUsersResponse.Users.List["+ i +"].Detail.Phone"));
			user.setDetail(detail);

			List<Role> roles = new ArrayList<Role>();
			for (int j = 0; j < _ctx.lengthValue("FindUsersResponse.Users.List["+ i +"].Roles.Length"); j++) {
				Role role = new Role();
				role.setInstanceId(_ctx.stringValue("FindUsersResponse.Users.List["+ i +"].Roles["+ j +"].InstanceId"));
				role.setRoleName(_ctx.stringValue("FindUsersResponse.Users.List["+ i +"].Roles["+ j +"].RoleName"));
				role.setRoleDescription(_ctx.stringValue("FindUsersResponse.Users.List["+ i +"].Roles["+ j +"].RoleDescription"));
				role.setRoleId(_ctx.stringValue("FindUsersResponse.Users.List["+ i +"].Roles["+ j +"].RoleId"));

				roles.add(role);
			}
			user.setRoles(roles);

			List<SkillLevel> skillLevels = new ArrayList<SkillLevel>();
			for (int j = 0; j < _ctx.lengthValue("FindUsersResponse.Users.List["+ i +"].SkillLevels.Length"); j++) {
				SkillLevel skillLevel = new SkillLevel();
				skillLevel.setSkillLevelId(_ctx.stringValue("FindUsersResponse.Users.List["+ i +"].SkillLevels["+ j +"].SkillLevelId"));
				skillLevel.setLevel(_ctx.integerValue("FindUsersResponse.Users.List["+ i +"].SkillLevels["+ j +"].Level"));

				Skill skill = new Skill();
				skill.setInstanceId(_ctx.stringValue("FindUsersResponse.Users.List["+ i +"].SkillLevels["+ j +"].Skill.InstanceId"));
				skill.setSkillGroupDescription(_ctx.stringValue("FindUsersResponse.Users.List["+ i +"].SkillLevels["+ j +"].Skill.SkillGroupDescription"));
				skill.setSkillGroupId(_ctx.stringValue("FindUsersResponse.Users.List["+ i +"].SkillLevels["+ j +"].Skill.SkillGroupId"));
				skill.setSkillGroupName(_ctx.stringValue("FindUsersResponse.Users.List["+ i +"].SkillLevels["+ j +"].Skill.SkillGroupName"));
				skillLevel.setSkill(skill);

				skillLevels.add(skillLevel);
			}
			user.setSkillLevels(skillLevels);

			list.add(user);
		}
		users.setList(list);
		findUsersResponse.setUsers(users);
	 
	 	return findUsersResponse;
	}
}