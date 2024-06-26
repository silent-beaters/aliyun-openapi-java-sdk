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

package com.aliyuncs.dms_dg.transform.v20230914;

import com.aliyuncs.dms_dg.model.v20230914.RetryDatabaseResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RetryDatabaseResponseUnmarshaller {

	public static RetryDatabaseResponse unmarshall(RetryDatabaseResponse retryDatabaseResponse, UnmarshallerContext _ctx) {
		
		retryDatabaseResponse.setRequestId(_ctx.stringValue("RetryDatabaseResponse.RequestId"));
		retryDatabaseResponse.setCode(_ctx.stringValue("RetryDatabaseResponse.Code"));
		retryDatabaseResponse.setData(_ctx.stringValue("RetryDatabaseResponse.Data"));
		retryDatabaseResponse.setErrorMsg(_ctx.stringValue("RetryDatabaseResponse.ErrorMsg"));
		retryDatabaseResponse.setSuccess(_ctx.booleanValue("RetryDatabaseResponse.Success"));
	 
	 	return retryDatabaseResponse;
	}
}