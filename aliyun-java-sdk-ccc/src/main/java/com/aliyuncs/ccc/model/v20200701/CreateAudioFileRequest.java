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

package com.aliyuncs.ccc.model.v20200701;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAudioFileRequest extends RpcAcsRequest<CreateAudioFileResponse> {
	   

	private String ossFileKey;

	private String instanceId;

	private String audioFileName;

	private String name;
	public CreateAudioFileRequest() {
		super("CCC", "2020-07-01", "CreateAudioFile", "CCC");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOssFileKey() {
		return this.ossFileKey;
	}

	public void setOssFileKey(String ossFileKey) {
		this.ossFileKey = ossFileKey;
		if(ossFileKey != null){
			putQueryParameter("OssFileKey", ossFileKey);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getAudioFileName() {
		return this.audioFileName;
	}

	public void setAudioFileName(String audioFileName) {
		this.audioFileName = audioFileName;
		if(audioFileName != null){
			putQueryParameter("AudioFileName", audioFileName);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	@Override
	public Class<CreateAudioFileResponse> getResponseClass() {
		return CreateAudioFileResponse.class;
	}

}
