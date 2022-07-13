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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.InsertApplicationResponse;
import com.aliyuncs.edas.model.v20170801.InsertApplicationResponse.ApplicationInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class InsertApplicationResponseUnmarshaller {

	public static InsertApplicationResponse unmarshall(InsertApplicationResponse insertApplicationResponse, UnmarshallerContext _ctx) {
		
		insertApplicationResponse.setRequestId(_ctx.stringValue("InsertApplicationResponse.RequestId"));
		insertApplicationResponse.setCode(_ctx.integerValue("InsertApplicationResponse.Code"));
		insertApplicationResponse.setMessage(_ctx.stringValue("InsertApplicationResponse.Message"));

		ApplicationInfo applicationInfo = new ApplicationInfo();
		applicationInfo.setChangeOrderId(_ctx.stringValue("InsertApplicationResponse.ApplicationInfo.ChangeOrderId"));
		applicationInfo.setAppName(_ctx.stringValue("InsertApplicationResponse.ApplicationInfo.AppName"));
		applicationInfo.setOwner(_ctx.stringValue("InsertApplicationResponse.ApplicationInfo.Owner"));
		applicationInfo.setDockerize(_ctx.booleanValue("InsertApplicationResponse.ApplicationInfo.Dockerize"));
		applicationInfo.setRegionName(_ctx.stringValue("InsertApplicationResponse.ApplicationInfo.RegionName"));
		applicationInfo.setAppId(_ctx.stringValue("InsertApplicationResponse.ApplicationInfo.AppId"));
		applicationInfo.setUserId(_ctx.stringValue("InsertApplicationResponse.ApplicationInfo.UserId"));
		applicationInfo.setPort(_ctx.integerValue("InsertApplicationResponse.ApplicationInfo.Port"));
		insertApplicationResponse.setApplicationInfo(applicationInfo);
	 
	 	return insertApplicationResponse;
	}
}