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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20201126.ListLogsResponse;
import com.aliyuncs.airec.model.v20201126.ListLogsResponse.Headers;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLogsResponseUnmarshaller {

	public static ListLogsResponse unmarshall(ListLogsResponse listLogsResponse, UnmarshallerContext _ctx) {
		
		listLogsResponse.setCode(_ctx.stringValue("ListLogsResponse.code"));
		listLogsResponse.setRequestId(_ctx.stringValue("ListLogsResponse.requestId"));
		listLogsResponse.setMessage(_ctx.stringValue("ListLogsResponse.message"));

		List<Map<Object, Object>> result = _ctx.listMapValue("ListLogsResponse.result");
		listLogsResponse.setResult(result);

		Headers headers = new Headers();
		headers.setXTotalCount(_ctx.integerValue("ListLogsResponse.headers.X-Total-Count"));
		listLogsResponse.setHeaders(headers);
	 
	 	return listLogsResponse;
	}
}