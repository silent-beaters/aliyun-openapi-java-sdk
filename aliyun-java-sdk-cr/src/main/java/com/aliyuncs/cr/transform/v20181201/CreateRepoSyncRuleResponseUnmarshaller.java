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

package com.aliyuncs.cr.transform.v20181201;

import com.aliyuncs.cr.model.v20181201.CreateRepoSyncRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRepoSyncRuleResponseUnmarshaller {

	public static CreateRepoSyncRuleResponse unmarshall(CreateRepoSyncRuleResponse createRepoSyncRuleResponse, UnmarshallerContext _ctx) {
		
		createRepoSyncRuleResponse.setRequestId(_ctx.stringValue("CreateRepoSyncRuleResponse.RequestId"));
		createRepoSyncRuleResponse.setCode(_ctx.stringValue("CreateRepoSyncRuleResponse.Code"));
		createRepoSyncRuleResponse.setSyncRuleId(_ctx.stringValue("CreateRepoSyncRuleResponse.SyncRuleId"));
		createRepoSyncRuleResponse.setIsSuccess(_ctx.booleanValue("CreateRepoSyncRuleResponse.IsSuccess"));
	 
	 	return createRepoSyncRuleResponse;
	}
}