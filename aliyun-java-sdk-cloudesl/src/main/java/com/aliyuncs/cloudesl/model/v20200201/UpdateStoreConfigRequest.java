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

package com.aliyuncs.cloudesl.model.v20200201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudesl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateStoreConfigRequest extends RpcAcsRequest<UpdateStoreConfigResponse> {
	   

	private String extraParams;

	private String storeId;

	private String subscribeContents;

	private Boolean enableNotification;

	private String notificationWebHook;

	private String notificationSilentTimes;
	public UpdateStoreConfigRequest() {
		super("cloudesl", "2020-02-01", "UpdateStoreConfig");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExtraParams() {
		return this.extraParams;
	}

	public void setExtraParams(String extraParams) {
		this.extraParams = extraParams;
		if(extraParams != null){
			putBodyParameter("ExtraParams", extraParams);
		}
	}

	public String getStoreId() {
		return this.storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
		if(storeId != null){
			putBodyParameter("StoreId", storeId);
		}
	}

	public String getSubscribeContents() {
		return this.subscribeContents;
	}

	public void setSubscribeContents(String subscribeContents) {
		this.subscribeContents = subscribeContents;
		if(subscribeContents != null){
			putBodyParameter("SubscribeContents", subscribeContents);
		}
	}

	public Boolean getEnableNotification() {
		return this.enableNotification;
	}

	public void setEnableNotification(Boolean enableNotification) {
		this.enableNotification = enableNotification;
		if(enableNotification != null){
			putBodyParameter("EnableNotification", enableNotification.toString());
		}
	}

	public String getNotificationWebHook() {
		return this.notificationWebHook;
	}

	public void setNotificationWebHook(String notificationWebHook) {
		this.notificationWebHook = notificationWebHook;
		if(notificationWebHook != null){
			putBodyParameter("NotificationWebHook", notificationWebHook);
		}
	}

	public String getNotificationSilentTimes() {
		return this.notificationSilentTimes;
	}

	public void setNotificationSilentTimes(String notificationSilentTimes) {
		this.notificationSilentTimes = notificationSilentTimes;
		if(notificationSilentTimes != null){
			putBodyParameter("NotificationSilentTimes", notificationSilentTimes);
		}
	}

	@Override
	public Class<UpdateStoreConfigResponse> getResponseClass() {
		return UpdateStoreConfigResponse.class;
	}

}
