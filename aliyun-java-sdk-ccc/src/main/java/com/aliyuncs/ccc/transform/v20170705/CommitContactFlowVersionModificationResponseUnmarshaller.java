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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.CommitContactFlowVersionModificationResponse;
import com.aliyuncs.ccc.model.v20170705.CommitContactFlowVersionModificationResponse.ContactFlowVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class CommitContactFlowVersionModificationResponseUnmarshaller {

	public static CommitContactFlowVersionModificationResponse unmarshall(CommitContactFlowVersionModificationResponse commitContactFlowVersionModificationResponse, UnmarshallerContext _ctx) {
		
		commitContactFlowVersionModificationResponse.setRequestId(_ctx.stringValue("CommitContactFlowVersionModificationResponse.RequestId"));
		commitContactFlowVersionModificationResponse.setHttpStatusCode(_ctx.integerValue("CommitContactFlowVersionModificationResponse.HttpStatusCode"));
		commitContactFlowVersionModificationResponse.setCode(_ctx.stringValue("CommitContactFlowVersionModificationResponse.Code"));
		commitContactFlowVersionModificationResponse.setMessage(_ctx.stringValue("CommitContactFlowVersionModificationResponse.Message"));
		commitContactFlowVersionModificationResponse.setSuccess(_ctx.booleanValue("CommitContactFlowVersionModificationResponse.Success"));

		ContactFlowVersion contactFlowVersion = new ContactFlowVersion();
		contactFlowVersion.setStatus(_ctx.stringValue("CommitContactFlowVersionModificationResponse.ContactFlowVersion.Status"));
		contactFlowVersion.setLastModified(_ctx.stringValue("CommitContactFlowVersionModificationResponse.ContactFlowVersion.LastModified"));
		contactFlowVersion.setCanvas(_ctx.stringValue("CommitContactFlowVersionModificationResponse.ContactFlowVersion.Canvas"));
		contactFlowVersion.setLockedBy(_ctx.stringValue("CommitContactFlowVersionModificationResponse.ContactFlowVersion.LockedBy"));
		contactFlowVersion.setVersion(_ctx.stringValue("CommitContactFlowVersionModificationResponse.ContactFlowVersion.Version"));
		contactFlowVersion.setContactFlowVersionId(_ctx.stringValue("CommitContactFlowVersionModificationResponse.ContactFlowVersion.ContactFlowVersionId"));
		contactFlowVersion.setLastModifiedBy(_ctx.stringValue("CommitContactFlowVersionModificationResponse.ContactFlowVersion.LastModifiedBy"));
		contactFlowVersion.setContactFlowVersionDescription(_ctx.stringValue("CommitContactFlowVersionModificationResponse.ContactFlowVersion.ContactFlowVersionDescription"));
		contactFlowVersion.setContent(_ctx.stringValue("CommitContactFlowVersionModificationResponse.ContactFlowVersion.Content"));
		commitContactFlowVersionModificationResponse.setContactFlowVersion(contactFlowVersion);
	 
	 	return commitContactFlowVersionModificationResponse;
	}
}