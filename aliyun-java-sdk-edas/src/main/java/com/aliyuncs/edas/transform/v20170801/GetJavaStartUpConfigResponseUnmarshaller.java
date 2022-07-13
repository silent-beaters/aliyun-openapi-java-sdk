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

import com.aliyuncs.edas.model.v20170801.GetJavaStartUpConfigResponse;
import com.aliyuncs.edas.model.v20170801.GetJavaStartUpConfigResponse.JavaStartUpConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJavaStartUpConfigResponseUnmarshaller {

	public static GetJavaStartUpConfigResponse unmarshall(GetJavaStartUpConfigResponse getJavaStartUpConfigResponse, UnmarshallerContext _ctx) {
		
		getJavaStartUpConfigResponse.setRequestId(_ctx.stringValue("GetJavaStartUpConfigResponse.RequestId"));
		getJavaStartUpConfigResponse.setCode(_ctx.integerValue("GetJavaStartUpConfigResponse.Code"));
		getJavaStartUpConfigResponse.setMessage(_ctx.stringValue("GetJavaStartUpConfigResponse.Message"));

		JavaStartUpConfig javaStartUpConfig = new JavaStartUpConfig();
		javaStartUpConfig.setStartUpArgs(_ctx.stringValue("GetJavaStartUpConfigResponse.JavaStartUpConfig.StartUpArgs"));
		javaStartUpConfig.setOriginalConfigs(_ctx.stringValue("GetJavaStartUpConfigResponse.JavaStartUpConfig.OriginalConfigs"));
		getJavaStartUpConfigResponse.setJavaStartUpConfig(javaStartUpConfig);
	 
	 	return getJavaStartUpConfigResponse;
	}
}