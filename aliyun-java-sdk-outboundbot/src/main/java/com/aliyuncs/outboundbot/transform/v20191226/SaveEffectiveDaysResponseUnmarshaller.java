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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.SaveEffectiveDaysResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveEffectiveDaysResponseUnmarshaller {

	public static SaveEffectiveDaysResponse unmarshall(SaveEffectiveDaysResponse saveEffectiveDaysResponse, UnmarshallerContext _ctx) {
		
		saveEffectiveDaysResponse.setRequestId(_ctx.stringValue("SaveEffectiveDaysResponse.RequestId"));
		saveEffectiveDaysResponse.setHttpStatusCode(_ctx.integerValue("SaveEffectiveDaysResponse.HttpStatusCode"));
		saveEffectiveDaysResponse.setCode(_ctx.stringValue("SaveEffectiveDaysResponse.Code"));
		saveEffectiveDaysResponse.setMessage(_ctx.stringValue("SaveEffectiveDaysResponse.Message"));
		saveEffectiveDaysResponse.setSuccess(_ctx.booleanValue("SaveEffectiveDaysResponse.Success"));
	 
	 	return saveEffectiveDaysResponse;
	}
}