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

package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vod.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetDefaultTranscodeTemplateGroupRequest extends RpcAcsRequest<SetDefaultTranscodeTemplateGroupResponse> {
	   

	private String transcodeTemplateGroupId;
	public SetDefaultTranscodeTemplateGroupRequest() {
		super("vod", "2017-03-21", "SetDefaultTranscodeTemplateGroup", "vod");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTranscodeTemplateGroupId() {
		return this.transcodeTemplateGroupId;
	}

	public void setTranscodeTemplateGroupId(String transcodeTemplateGroupId) {
		this.transcodeTemplateGroupId = transcodeTemplateGroupId;
		if(transcodeTemplateGroupId != null){
			putQueryParameter("TranscodeTemplateGroupId", transcodeTemplateGroupId);
		}
	}

	@Override
	public Class<SetDefaultTranscodeTemplateGroupResponse> getResponseClass() {
		return SetDefaultTranscodeTemplateGroupResponse.class;
	}

}
