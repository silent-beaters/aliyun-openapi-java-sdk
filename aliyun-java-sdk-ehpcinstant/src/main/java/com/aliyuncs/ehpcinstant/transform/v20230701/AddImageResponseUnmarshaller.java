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

package com.aliyuncs.ehpcinstant.transform.v20230701;

import com.aliyuncs.ehpcinstant.model.v20230701.AddImageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddImageResponseUnmarshaller {

	public static AddImageResponse unmarshall(AddImageResponse addImageResponse, UnmarshallerContext _ctx) {
		
		addImageResponse.setRequestId(_ctx.stringValue("AddImageResponse.RequestId"));
		addImageResponse.setSuccess(_ctx.booleanValue("AddImageResponse.Success"));
		addImageResponse.setImageId(_ctx.stringValue("AddImageResponse.ImageId"));
		addImageResponse.setAppId(_ctx.stringValue("AddImageResponse.AppId"));
	 
	 	return addImageResponse;
	}
}