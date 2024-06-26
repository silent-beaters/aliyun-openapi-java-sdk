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

import com.aliyuncs.ccc.model.v20170705.ModifySkillGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifySkillGroupResponseUnmarshaller {

	public static ModifySkillGroupResponse unmarshall(ModifySkillGroupResponse modifySkillGroupResponse, UnmarshallerContext _ctx) {
		
		modifySkillGroupResponse.setRequestId(_ctx.stringValue("ModifySkillGroupResponse.RequestId"));
		modifySkillGroupResponse.setHttpStatusCode(_ctx.integerValue("ModifySkillGroupResponse.HttpStatusCode"));
		modifySkillGroupResponse.setCode(_ctx.stringValue("ModifySkillGroupResponse.Code"));
		modifySkillGroupResponse.setMessage(_ctx.stringValue("ModifySkillGroupResponse.Message"));
		modifySkillGroupResponse.setSuccess(_ctx.booleanValue("ModifySkillGroupResponse.Success"));
	 
	 	return modifySkillGroupResponse;
	}
}