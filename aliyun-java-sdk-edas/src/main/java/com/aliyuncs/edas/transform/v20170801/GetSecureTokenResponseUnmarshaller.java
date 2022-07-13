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

import com.aliyuncs.edas.model.v20170801.GetSecureTokenResponse;
import com.aliyuncs.edas.model.v20170801.GetSecureTokenResponse.SecureToken;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSecureTokenResponseUnmarshaller {

	public static GetSecureTokenResponse unmarshall(GetSecureTokenResponse getSecureTokenResponse, UnmarshallerContext _ctx) {
		
		getSecureTokenResponse.setRequestId(_ctx.stringValue("GetSecureTokenResponse.RequestId"));
		getSecureTokenResponse.setCode(_ctx.integerValue("GetSecureTokenResponse.Code"));
		getSecureTokenResponse.setMessage(_ctx.stringValue("GetSecureTokenResponse.Message"));

		SecureToken secureToken = new SecureToken();
		secureToken.setSecretKey(_ctx.stringValue("GetSecureTokenResponse.SecureToken.SecretKey"));
		secureToken.setAccessKey(_ctx.stringValue("GetSecureTokenResponse.SecureToken.AccessKey"));
		secureToken.setBelongRegion(_ctx.stringValue("GetSecureTokenResponse.SecureToken.BelongRegion"));
		secureToken.setDescription(_ctx.stringValue("GetSecureTokenResponse.SecureToken.Description"));
		secureToken.setRegionName(_ctx.stringValue("GetSecureTokenResponse.SecureToken.RegionName"));
		secureToken.setEdasId(_ctx.stringValue("GetSecureTokenResponse.SecureToken.EdasId"));
		secureToken.setAddressServerHost(_ctx.stringValue("GetSecureTokenResponse.SecureToken.AddressServerHost"));
		secureToken.setUserId(_ctx.stringValue("GetSecureTokenResponse.SecureToken.UserId"));
		secureToken.setId(_ctx.longValue("GetSecureTokenResponse.SecureToken.Id"));
		secureToken.setTenantId(_ctx.stringValue("GetSecureTokenResponse.SecureToken.TenantId"));
		secureToken.setRegionId(_ctx.stringValue("GetSecureTokenResponse.SecureToken.RegionId"));
		secureToken.setMseRegistryType(_ctx.stringValue("GetSecureTokenResponse.SecureToken.MseRegistryType"));
		secureToken.setMseInstanceId(_ctx.stringValue("GetSecureTokenResponse.SecureToken.MseInstanceId"));
		secureToken.setMseInternetAddress(_ctx.stringValue("GetSecureTokenResponse.SecureToken.MseInternetAddress"));
		secureToken.setMseIntranetAddress(_ctx.stringValue("GetSecureTokenResponse.SecureToken.MseIntranetAddress"));
		getSecureTokenResponse.setSecureToken(secureToken);
	 
	 	return getSecureTokenResponse;
	}
}