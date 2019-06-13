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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.GetTransferableNodesResponse;
import com.aliyuncs.elasticsearch.model.v20170613.GetTransferableNodesResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTransferableNodesResponseUnmarshaller {

	public static GetTransferableNodesResponse unmarshall(GetTransferableNodesResponse getTransferableNodesResponse, UnmarshallerContext context) {
		
		getTransferableNodesResponse.setRequestId(context.stringValue("GetTransferableNodesResponse.RequestId"));
		getTransferableNodesResponse.setCode(context.stringValue("GetTransferableNodesResponse.Code"));
		getTransferableNodesResponse.setMessage(context.stringValue("GetTransferableNodesResponse.Message"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < context.lengthValue("GetTransferableNodesResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setHost(context.stringValue("GetTransferableNodesResponse.Result["+ i +"].host"));
			resultItem.setPort(context.integerValue("GetTransferableNodesResponse.Result["+ i +"].port"));

			result.add(resultItem);
		}
		getTransferableNodesResponse.setResult(result);
	 
	 	return getTransferableNodesResponse;
	}
}