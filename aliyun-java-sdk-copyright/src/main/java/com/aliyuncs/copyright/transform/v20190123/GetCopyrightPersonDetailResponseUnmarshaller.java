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

package com.aliyuncs.copyright.transform.v20190123;

import com.aliyuncs.copyright.model.v20190123.GetCopyrightPersonDetailResponse;
import com.aliyuncs.copyright.model.v20190123.GetCopyrightPersonDetailResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCopyrightPersonDetailResponseUnmarshaller {

	public static GetCopyrightPersonDetailResponse unmarshall(GetCopyrightPersonDetailResponse getCopyrightPersonDetailResponse, UnmarshallerContext _ctx) {
		
		getCopyrightPersonDetailResponse.setRequestId(_ctx.stringValue("GetCopyrightPersonDetailResponse.RequestId"));
		getCopyrightPersonDetailResponse.setSuccess(_ctx.booleanValue("GetCopyrightPersonDetailResponse.Success"));

		Data data = new Data();
		data.setAddress(_ctx.stringValue("GetCopyrightPersonDetailResponse.Data.Address"));
		data.setCardNum(_ctx.stringValue("GetCopyrightPersonDetailResponse.Data.CardNum"));
		data.setCardType(_ctx.stringValue("GetCopyrightPersonDetailResponse.Data.CardType"));
		data.setCity(_ctx.stringValue("GetCopyrightPersonDetailResponse.Data.City"));
		data.setCounty(_ctx.stringValue("GetCopyrightPersonDetailResponse.Data.County"));
		data.setEmail(_ctx.stringValue("GetCopyrightPersonDetailResponse.Data.Email"));
		data.setEnterpriseLicensePath(_ctx.stringValue("GetCopyrightPersonDetailResponse.Data.EnterpriseLicensePath"));
		data.setEnterprisePark(_ctx.stringValue("GetCopyrightPersonDetailResponse.Data.EnterprisePark"));
		data.setEnterpriseTime(_ctx.stringValue("GetCopyrightPersonDetailResponse.Data.EnterpriseTime"));
		data.setEnterpriseType(_ctx.stringValue("GetCopyrightPersonDetailResponse.Data.EnterpriseType"));
		data.setIdBackImage(_ctx.stringValue("GetCopyrightPersonDetailResponse.Data.IdBackImage"));
		data.setIdFrontImage(_ctx.stringValue("GetCopyrightPersonDetailResponse.Data.IdFrontImage"));
		data.setIdHandedImage(_ctx.stringValue("GetCopyrightPersonDetailResponse.Data.IdHandedImage"));
		data.setLegalPersonType(_ctx.stringValue("GetCopyrightPersonDetailResponse.Data.LegalPersonType"));
		data.setName(_ctx.stringValue("GetCopyrightPersonDetailResponse.Data.Name"));
		data.setOwnerType(_ctx.integerValue("GetCopyrightPersonDetailResponse.Data.OwnerType"));
		data.setPersonId(_ctx.stringValue("GetCopyrightPersonDetailResponse.Data.PersonId"));
		data.setPhone(_ctx.stringValue("GetCopyrightPersonDetailResponse.Data.Phone"));
		data.setProvince(_ctx.stringValue("GetCopyrightPersonDetailResponse.Data.Province"));
		data.setRoleType(_ctx.integerValue("GetCopyrightPersonDetailResponse.Data.RoleType"));
		data.setUserPk(_ctx.stringValue("GetCopyrightPersonDetailResponse.Data.UserPk"));
		data.setUseType(_ctx.integerValue("GetCopyrightPersonDetailResponse.Data.UseType"));
		data.setAuditStatus(_ctx.integerValue("GetCopyrightPersonDetailResponse.Data.AuditStatus"));
		data.setExpiredDate(_ctx.stringValue("GetCopyrightPersonDetailResponse.Data.ExpiredDate"));
		getCopyrightPersonDetailResponse.setData(data);
	 
	 	return getCopyrightPersonDetailResponse;
	}
}