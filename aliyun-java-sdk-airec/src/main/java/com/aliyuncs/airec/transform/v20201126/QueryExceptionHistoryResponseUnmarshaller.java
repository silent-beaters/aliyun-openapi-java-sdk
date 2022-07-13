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

package com.aliyuncs.airec.transform.v20201126;

import com.aliyuncs.airec.model.v20201126.QueryExceptionHistoryResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryExceptionHistoryResponseUnmarshaller {

	public static QueryExceptionHistoryResponse unmarshall(QueryExceptionHistoryResponse queryExceptionHistoryResponse, UnmarshallerContext _ctx) {
		
		queryExceptionHistoryResponse.setResult(_ctx.mapValue("QueryExceptionHistoryResponse.result"));
		queryExceptionHistoryResponse.setCode(_ctx.stringValue("QueryExceptionHistoryResponse.code"));
		queryExceptionHistoryResponse.setRequestId(_ctx.stringValue("QueryExceptionHistoryResponse.requestId"));
		queryExceptionHistoryResponse.setMessage(_ctx.stringValue("QueryExceptionHistoryResponse.message"));
	 
	 	return queryExceptionHistoryResponse;
	}
}