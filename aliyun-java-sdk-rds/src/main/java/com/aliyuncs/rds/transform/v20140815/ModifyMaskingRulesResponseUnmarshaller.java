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

import com.aliyuncs.rds.model.v20140815.ModifyMaskingRulesResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyMaskingRulesResponseUnmarshaller {

	public static ModifyMaskingRulesResponse unmarshall(ModifyMaskingRulesResponse modifyMaskingRulesResponse, UnmarshallerContext _ctx) {
		
		modifyMaskingRulesResponse.setRequestId(_ctx.stringValue("ModifyMaskingRulesResponse.RequestId"));
		modifyMaskingRulesResponse.setSuccess(_ctx.stringValue("ModifyMaskingRulesResponse.Success"));
		modifyMaskingRulesResponse.setMessage(_ctx.stringValue("ModifyMaskingRulesResponse.Message"));
		modifyMaskingRulesResponse.setData(_ctx.mapValue("ModifyMaskingRulesResponse.Data"));
	 
	 	return modifyMaskingRulesResponse;
	}
}