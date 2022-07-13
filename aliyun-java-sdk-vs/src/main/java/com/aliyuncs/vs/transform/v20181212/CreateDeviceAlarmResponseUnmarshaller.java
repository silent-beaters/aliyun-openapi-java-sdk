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

package com.aliyuncs.vs.transform.v20181212;

import com.aliyuncs.vs.model.v20181212.CreateDeviceAlarmResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDeviceAlarmResponseUnmarshaller {

	public static CreateDeviceAlarmResponse unmarshall(CreateDeviceAlarmResponse createDeviceAlarmResponse, UnmarshallerContext _ctx) {
		
		createDeviceAlarmResponse.setRequestId(_ctx.stringValue("CreateDeviceAlarmResponse.RequestId"));
		createDeviceAlarmResponse.setUrl(_ctx.stringValue("CreateDeviceAlarmResponse.Url"));
		createDeviceAlarmResponse.setAlarmId(_ctx.stringValue("CreateDeviceAlarmResponse.AlarmId"));
		createDeviceAlarmResponse.setExpire(_ctx.longValue("CreateDeviceAlarmResponse.Expire"));
		createDeviceAlarmResponse.setAlarmDelay(_ctx.longValue("CreateDeviceAlarmResponse.AlarmDelay"));
	 
	 	return createDeviceAlarmResponse;
	}
}