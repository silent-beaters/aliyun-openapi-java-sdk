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

package com.aliyuncs.iotcc.transform.v20210513;

import com.aliyuncs.iotcc.model.v20210513.SubmitDiagnoseTaskForSingleCardResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitDiagnoseTaskForSingleCardResponseUnmarshaller {

	public static SubmitDiagnoseTaskForSingleCardResponse unmarshall(SubmitDiagnoseTaskForSingleCardResponse submitDiagnoseTaskForSingleCardResponse, UnmarshallerContext _ctx) {
		
		submitDiagnoseTaskForSingleCardResponse.setRequestId(_ctx.stringValue("SubmitDiagnoseTaskForSingleCardResponse.RequestId"));
		submitDiagnoseTaskForSingleCardResponse.setDiagnoseTaskId(_ctx.stringValue("SubmitDiagnoseTaskForSingleCardResponse.DiagnoseTaskId"));
	 
	 	return submitDiagnoseTaskForSingleCardResponse;
	}
}