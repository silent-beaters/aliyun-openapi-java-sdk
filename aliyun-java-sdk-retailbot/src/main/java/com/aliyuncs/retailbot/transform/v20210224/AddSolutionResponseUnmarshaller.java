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

package com.aliyuncs.retailbot.transform.v20210224;

import com.aliyuncs.retailbot.model.v20210224.AddSolutionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddSolutionResponseUnmarshaller {

	public static AddSolutionResponse unmarshall(AddSolutionResponse addSolutionResponse, UnmarshallerContext _ctx) {
		
		addSolutionResponse.setRequestId(_ctx.stringValue("AddSolutionResponse.RequestId"));
		addSolutionResponse.setSolutionId(_ctx.longValue("AddSolutionResponse.SolutionId"));
		addSolutionResponse.setSuccess(_ctx.booleanValue("AddSolutionResponse.Success"));
		addSolutionResponse.setCode(_ctx.stringValue("AddSolutionResponse.Code"));
		addSolutionResponse.setMessage(_ctx.stringValue("AddSolutionResponse.Message"));
	 
	 	return addSolutionResponse;
	}
}