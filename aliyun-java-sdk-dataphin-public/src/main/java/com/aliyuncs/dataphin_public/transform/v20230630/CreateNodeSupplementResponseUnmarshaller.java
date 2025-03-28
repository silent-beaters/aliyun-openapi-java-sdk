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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.CreateNodeSupplementResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateNodeSupplementResponseUnmarshaller {

	public static CreateNodeSupplementResponse unmarshall(CreateNodeSupplementResponse createNodeSupplementResponse, UnmarshallerContext _ctx) {
		
		createNodeSupplementResponse.setRequestId(_ctx.stringValue("CreateNodeSupplementResponse.RequestId"));
		createNodeSupplementResponse.setSuccess(_ctx.booleanValue("CreateNodeSupplementResponse.Success"));
		createNodeSupplementResponse.setHttpStatusCode(_ctx.integerValue("CreateNodeSupplementResponse.HttpStatusCode"));
		createNodeSupplementResponse.setCode(_ctx.stringValue("CreateNodeSupplementResponse.Code"));
		createNodeSupplementResponse.setMessage(_ctx.stringValue("CreateNodeSupplementResponse.Message"));
		createNodeSupplementResponse.setSubmitId(_ctx.stringValue("CreateNodeSupplementResponse.SubmitId"));
	 
	 	return createNodeSupplementResponse;
	}
}