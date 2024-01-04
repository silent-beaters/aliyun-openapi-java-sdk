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

package com.aliyuncs.devops.transform.v20210625;

import com.aliyuncs.devops.model.v20210625.WorkitemAttachmentCreateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class WorkitemAttachmentCreateResponseUnmarshaller {

	public static WorkitemAttachmentCreateResponse unmarshall(WorkitemAttachmentCreateResponse workitemAttachmentCreateResponse, UnmarshallerContext _ctx) {
		
		workitemAttachmentCreateResponse.setRequestId(_ctx.stringValue("WorkitemAttachmentCreateResponse.requestId"));
		workitemAttachmentCreateResponse.setErrorCode(_ctx.stringValue("WorkitemAttachmentCreateResponse.errorCode"));
		workitemAttachmentCreateResponse.setErrorMessage(_ctx.stringValue("WorkitemAttachmentCreateResponse.errorMessage"));
		workitemAttachmentCreateResponse.setSuccess(_ctx.stringValue("WorkitemAttachmentCreateResponse.success"));
	 
	 	return workitemAttachmentCreateResponse;
	}
}