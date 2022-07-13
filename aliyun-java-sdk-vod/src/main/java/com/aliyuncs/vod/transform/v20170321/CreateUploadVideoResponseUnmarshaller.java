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

package com.aliyuncs.vod.transform.v20170321;

import com.aliyuncs.vod.model.v20170321.CreateUploadVideoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateUploadVideoResponseUnmarshaller {

	public static CreateUploadVideoResponse unmarshall(CreateUploadVideoResponse createUploadVideoResponse, UnmarshallerContext _ctx) {
		
		createUploadVideoResponse.setRequestId(_ctx.stringValue("CreateUploadVideoResponse.RequestId"));
		createUploadVideoResponse.setUploadAddress(_ctx.stringValue("CreateUploadVideoResponse.UploadAddress"));
		createUploadVideoResponse.setVideoId(_ctx.stringValue("CreateUploadVideoResponse.VideoId"));
		createUploadVideoResponse.setUploadAuth(_ctx.stringValue("CreateUploadVideoResponse.UploadAuth"));
	 
	 	return createUploadVideoResponse;
	}
}