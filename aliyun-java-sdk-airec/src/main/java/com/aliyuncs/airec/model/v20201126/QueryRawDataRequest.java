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

package com.aliyuncs.airec.model.v20201126;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.airec.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryRawDataRequest extends RoaAcsRequest<QueryRawDataResponse> {
	   

	private String itemId;

	private String instanceId;

	private String itemType;

	private String userType;

	private String imei;

	private String userId;

	private String table;
	public QueryRawDataRequest() {
		super("Airec", "2020-11-26", "QueryRawData", "airec");
		setUriPattern("/v2/openapi/instances/[instanceId]/tables/[table]/raw-data");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getItemId() {
		return this.itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
		if(itemId != null){
			putQueryParameter("itemId", itemId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putPathParameter("instanceId", instanceId);
		}
	}

	public String getItemType() {
		return this.itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
		if(itemType != null){
			putQueryParameter("itemType", itemType);
		}
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
		if(userType != null){
			putQueryParameter("userType", userType);
		}
	}

	public String getImei() {
		return this.imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
		if(imei != null){
			putQueryParameter("imei", imei);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("userId", userId);
		}
	}

	public String getTable() {
		return this.table;
	}

	public void setTable(String table) {
		this.table = table;
		if(table != null){
			putPathParameter("table", table);
		}
	}

	@Override
	public Class<QueryRawDataResponse> getResponseClass() {
		return QueryRawDataResponse.class;
	}

}
