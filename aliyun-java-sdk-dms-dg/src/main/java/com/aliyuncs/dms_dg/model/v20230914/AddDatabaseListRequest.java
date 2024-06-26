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

package com.aliyuncs.dms_dg.model.v20230914;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddDatabaseListRequest extends RpcAcsRequest<AddDatabaseListResponse> {
	   

	private String databaseString;

	private String clientToken;
	public AddDatabaseListRequest() {
		super("dms-dg", "2023-09-14", "AddDatabaseList");
		setMethod(MethodType.POST);
	}

	public String getDatabaseString() {
		return this.databaseString;
	}

	public void setDatabaseString(String databaseString) {
		this.databaseString = databaseString;
		if(databaseString != null){
			putBodyParameter("DatabaseString", databaseString);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	@Override
	public Class<AddDatabaseListResponse> getResponseClass() {
		return AddDatabaseListResponse.class;
	}

}
