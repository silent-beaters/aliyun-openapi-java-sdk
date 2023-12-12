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

package com.aliyuncs.hitsdb.transform.v20200615;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hitsdb.model.v20200615.GetEngineDefaultAuthResponse;
import com.aliyuncs.hitsdb.model.v20200615.GetEngineDefaultAuthResponse.AuthInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEngineDefaultAuthResponseUnmarshaller {

	public static GetEngineDefaultAuthResponse unmarshall(GetEngineDefaultAuthResponse getEngineDefaultAuthResponse, UnmarshallerContext _ctx) {
		
		getEngineDefaultAuthResponse.setRequestId(_ctx.stringValue("GetEngineDefaultAuthResponse.RequestId"));
		getEngineDefaultAuthResponse.setInstanceId(_ctx.stringValue("GetEngineDefaultAuthResponse.InstanceId"));

		List<AuthInfo> authInfos = new ArrayList<AuthInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetEngineDefaultAuthResponse.AuthInfos.Length"); i++) {
			AuthInfo authInfo = new AuthInfo();
			authInfo.setEngine(_ctx.stringValue("GetEngineDefaultAuthResponse.AuthInfos["+ i +"].Engine"));
			authInfo.setUsername(_ctx.stringValue("GetEngineDefaultAuthResponse.AuthInfos["+ i +"].Username"));
			authInfo.setPassword(_ctx.stringValue("GetEngineDefaultAuthResponse.AuthInfos["+ i +"].Password"));

			authInfos.add(authInfo);
		}
		getEngineDefaultAuthResponse.setAuthInfos(authInfos);
	 
	 	return getEngineDefaultAuthResponse;
	}
}