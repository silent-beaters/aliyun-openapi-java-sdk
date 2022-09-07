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

package com.aliyuncs.smartsales.transform.v20220818;

import com.aliyuncs.smartsales.model.v20220818.UploadVoiceDataResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadVoiceDataResponseUnmarshaller {

	public static UploadVoiceDataResponse unmarshall(UploadVoiceDataResponse uploadVoiceDataResponse, UnmarshallerContext _ctx) {
		
		uploadVoiceDataResponse.setRequestId(_ctx.stringValue("UploadVoiceDataResponse.RequestId"));
		uploadVoiceDataResponse.setJobId(_ctx.stringValue("UploadVoiceDataResponse.JobId"));
	 
	 	return uploadVoiceDataResponse;
	}
}