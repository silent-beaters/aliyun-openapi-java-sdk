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

package com.aliyuncs.mindlive_biz.model.v20210214;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateItemBackgroundRequest extends RpcAcsRequest<UpdateItemBackgroundResponse> {
	   

	private String itemId;

	private String liveType;

	private String userSource;

	private String userId;

	private String liveId;

	private String deviceId;

	private String resourceUuid;
	public UpdateItemBackgroundRequest() {
		super("mindlive-biz", "2021-02-14", "UpdateItemBackground");
		setMethod(MethodType.POST);
	}

	public String getItemId() {
		return this.itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
		if(itemId != null){
			putQueryParameter("ItemId", itemId);
		}
	}

	public String getLiveType() {
		return this.liveType;
	}

	public void setLiveType(String liveType) {
		this.liveType = liveType;
		if(liveType != null){
			putQueryParameter("LiveType", liveType);
		}
	}

	public String getUserSource() {
		return this.userSource;
	}

	public void setUserSource(String userSource) {
		this.userSource = userSource;
		if(userSource != null){
			putQueryParameter("UserSource", userSource);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getLiveId() {
		return this.liveId;
	}

	public void setLiveId(String liveId) {
		this.liveId = liveId;
		if(liveId != null){
			putQueryParameter("LiveId", liveId);
		}
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
		if(deviceId != null){
			putQueryParameter("DeviceId", deviceId);
		}
	}

	public String getResourceUuid() {
		return this.resourceUuid;
	}

	public void setResourceUuid(String resourceUuid) {
		this.resourceUuid = resourceUuid;
		if(resourceUuid != null){
			putQueryParameter("ResourceUuid", resourceUuid);
		}
	}

	@Override
	public Class<UpdateItemBackgroundResponse> getResponseClass() {
		return UpdateItemBackgroundResponse.class;
	}

}
