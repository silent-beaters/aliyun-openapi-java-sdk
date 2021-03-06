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

package com.aliyuncs.ecsops.transform.v20160401;

import com.aliyuncs.ecsops.model.v20160401.OpsEccGetNcTemplateInfoResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsEccGetNcTemplateInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsEccGetNcTemplateInfoResponseUnmarshaller {

	public static OpsEccGetNcTemplateInfoResponse unmarshall(OpsEccGetNcTemplateInfoResponse opsEccGetNcTemplateInfoResponse, UnmarshallerContext _ctx) {
		
		opsEccGetNcTemplateInfoResponse.setRequestId(_ctx.stringValue("OpsEccGetNcTemplateInfoResponse.RequestId"));
		opsEccGetNcTemplateInfoResponse.setMessage(_ctx.stringValue("OpsEccGetNcTemplateInfoResponse.Message"));

		Data data = new Data();
		data.setTemplateName(_ctx.stringValue("OpsEccGetNcTemplateInfoResponse.Data.TemplateName"));
		data.setTemplateDesc(_ctx.stringValue("OpsEccGetNcTemplateInfoResponse.Data.TemplateDesc"));
		data.setGmtModified(_ctx.longValue("OpsEccGetNcTemplateInfoResponse.Data.GmtModified"));
		data.setGmtCreate(_ctx.longValue("OpsEccGetNcTemplateInfoResponse.Data.GmtCreate"));
		data.setAdjustStandModels(_ctx.stringValue("OpsEccGetNcTemplateInfoResponse.Data.AdjustStandModels"));
		data.setTemplateAliasName(_ctx.stringValue("OpsEccGetNcTemplateInfoResponse.Data.TemplateAliasName"));
		data.setConfigs(_ctx.stringValue("OpsEccGetNcTemplateInfoResponse.Data.Configs"));
		opsEccGetNcTemplateInfoResponse.setData(data);
	 
	 	return opsEccGetNcTemplateInfoResponse;
	}
}