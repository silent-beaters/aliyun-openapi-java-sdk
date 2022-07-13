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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.GetServiceMethodPageResponse;
import com.aliyuncs.edas.model.v20170801.GetServiceMethodPageResponse.Data;
import com.aliyuncs.edas.model.v20170801.GetServiceMethodPageResponse.Data.Method;
import com.aliyuncs.edas.model.v20170801.GetServiceMethodPageResponse.Data.Method.ReturnDefinition;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServiceMethodPageResponseUnmarshaller {

	public static GetServiceMethodPageResponse unmarshall(GetServiceMethodPageResponse getServiceMethodPageResponse, UnmarshallerContext _ctx) {
		
		getServiceMethodPageResponse.setRequestId(_ctx.stringValue("GetServiceMethodPageResponse.RequestId"));
		getServiceMethodPageResponse.setCode(_ctx.stringValue("GetServiceMethodPageResponse.Code"));
		getServiceMethodPageResponse.setMessage(_ctx.stringValue("GetServiceMethodPageResponse.Message"));
		getServiceMethodPageResponse.setHttpCode(_ctx.stringValue("GetServiceMethodPageResponse.HttpCode"));
		getServiceMethodPageResponse.setSuccess(_ctx.booleanValue("GetServiceMethodPageResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("GetServiceMethodPageResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("GetServiceMethodPageResponse.Data.PageSize"));
		data.setTotalSize(_ctx.integerValue("GetServiceMethodPageResponse.Data.TotalSize"));

		List<Method> result = new ArrayList<Method>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceMethodPageResponse.Data.Result.Length"); i++) {
			Method method = new Method();
			method.setParameterDetails(_ctx.stringValue("GetServiceMethodPageResponse.Data.Result["+ i +"].ParameterDetails"));
			method.setNameDetail(_ctx.stringValue("GetServiceMethodPageResponse.Data.Result["+ i +"].NameDetail"));
			method.setParameterNames(_ctx.stringValue("GetServiceMethodPageResponse.Data.Result["+ i +"].ParameterNames"));
			method.setParameterDefinitions(_ctx.stringValue("GetServiceMethodPageResponse.Data.Result["+ i +"].ParameterDefinitions"));
			method.setPaths(_ctx.stringValue("GetServiceMethodPageResponse.Data.Result["+ i +"].Paths"));
			method.setParameterTypes(_ctx.stringValue("GetServiceMethodPageResponse.Data.Result["+ i +"].ParameterTypes"));
			method.setRequestMethods(_ctx.stringValue("GetServiceMethodPageResponse.Data.Result["+ i +"].RequestMethods"));
			method.setReturnDetails(_ctx.stringValue("GetServiceMethodPageResponse.Data.Result["+ i +"].ReturnDetails"));
			method.setName(_ctx.stringValue("GetServiceMethodPageResponse.Data.Result["+ i +"].Name"));
			method.setMethodController(_ctx.stringValue("GetServiceMethodPageResponse.Data.Result["+ i +"].MethodController"));
			method.setReturnType(_ctx.stringValue("GetServiceMethodPageResponse.Data.Result["+ i +"].ReturnType"));

			ReturnDefinition returnDefinition = new ReturnDefinition();
			returnDefinition.setType(_ctx.stringValue("GetServiceMethodPageResponse.Data.Result["+ i +"].ReturnDefinition.Type"));
			returnDefinition.setId(_ctx.stringValue("GetServiceMethodPageResponse.Data.Result["+ i +"].ReturnDefinition.Id"));
			method.setReturnDefinition(returnDefinition);

			result.add(method);
		}
		data.setResult(result);
		getServiceMethodPageResponse.setData(data);
	 
	 	return getServiceMethodPageResponse;
	}
}