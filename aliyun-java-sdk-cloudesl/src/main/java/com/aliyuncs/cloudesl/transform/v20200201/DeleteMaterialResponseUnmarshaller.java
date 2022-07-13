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

package com.aliyuncs.cloudesl.transform.v20200201;

import com.aliyuncs.cloudesl.model.v20200201.DeleteMaterialResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMaterialResponseUnmarshaller {

	public static DeleteMaterialResponse unmarshall(DeleteMaterialResponse deleteMaterialResponse, UnmarshallerContext _ctx) {
		
		deleteMaterialResponse.setRequestId(_ctx.stringValue("DeleteMaterialResponse.RequestId"));
		deleteMaterialResponse.setSuccess(_ctx.booleanValue("DeleteMaterialResponse.Success"));
		deleteMaterialResponse.setMessage(_ctx.stringValue("DeleteMaterialResponse.Message"));
		deleteMaterialResponse.setErrorCode(_ctx.stringValue("DeleteMaterialResponse.ErrorCode"));
		deleteMaterialResponse.setErrorMessage(_ctx.stringValue("DeleteMaterialResponse.ErrorMessage"));
		deleteMaterialResponse.setCode(_ctx.stringValue("DeleteMaterialResponse.Code"));
		deleteMaterialResponse.setDynamicCode(_ctx.stringValue("DeleteMaterialResponse.DynamicCode"));
		deleteMaterialResponse.setDynamicMessage(_ctx.stringValue("DeleteMaterialResponse.DynamicMessage"));
	 
	 	return deleteMaterialResponse;
	}
}