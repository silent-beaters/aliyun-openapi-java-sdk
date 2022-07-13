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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.ModifyStrategyResponse;
import com.aliyuncs.sas.model.v20181203.ModifyStrategyResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyStrategyResponseUnmarshaller {

	public static ModifyStrategyResponse unmarshall(ModifyStrategyResponse modifyStrategyResponse, UnmarshallerContext _ctx) {
		
		modifyStrategyResponse.setRequestId(_ctx.stringValue("ModifyStrategyResponse.RequestId"));
		modifyStrategyResponse.setHttpStatusCode(_ctx.integerValue("ModifyStrategyResponse.HttpStatusCode"));
		modifyStrategyResponse.setTotalCount(_ctx.integerValue("ModifyStrategyResponse.TotalCount"));
		modifyStrategyResponse.setSuccess(_ctx.booleanValue("ModifyStrategyResponse.Success"));

		Result result = new Result();
		result.setStrategyId(_ctx.integerValue("ModifyStrategyResponse.Result.StrategyId"));
		modifyStrategyResponse.setResult(result);
	 
	 	return modifyStrategyResponse;
	}
}