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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.UnbindSlbResponse;
import com.aliyuncs.sae.model.v20190506.UnbindSlbResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnbindSlbResponseUnmarshaller {

	public static UnbindSlbResponse unmarshall(UnbindSlbResponse unbindSlbResponse, UnmarshallerContext _ctx) {
		
		unbindSlbResponse.setRequestId(_ctx.stringValue("UnbindSlbResponse.RequestId"));
		unbindSlbResponse.setMessage(_ctx.stringValue("UnbindSlbResponse.Message"));
		unbindSlbResponse.setTraceId(_ctx.stringValue("UnbindSlbResponse.TraceId"));
		unbindSlbResponse.setErrorCode(_ctx.stringValue("UnbindSlbResponse.ErrorCode"));
		unbindSlbResponse.setCode(_ctx.stringValue("UnbindSlbResponse.Code"));
		unbindSlbResponse.setSuccess(_ctx.booleanValue("UnbindSlbResponse.Success"));

		Data data = new Data();
		data.setChangeOrderId(_ctx.stringValue("UnbindSlbResponse.Data.ChangeOrderId"));
		unbindSlbResponse.setData(data);
	 
	 	return unbindSlbResponse;
	}
}