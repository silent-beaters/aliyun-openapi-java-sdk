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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RemoveUserFromDesktopOversoldUserGroupRequest extends RpcAcsRequest<RemoveUserFromDesktopOversoldUserGroupResponse> {
	   

	private String oversoldGroupId;

	private String userDesktopId;

	private String userGroupId;

	private String endUserId;
	public RemoveUserFromDesktopOversoldUserGroupRequest() {
		super("ecd", "2020-09-30", "RemoveUserFromDesktopOversoldUserGroup", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOversoldGroupId() {
		return this.oversoldGroupId;
	}

	public void setOversoldGroupId(String oversoldGroupId) {
		this.oversoldGroupId = oversoldGroupId;
		if(oversoldGroupId != null){
			putQueryParameter("OversoldGroupId", oversoldGroupId);
		}
	}

	public String getUserDesktopId() {
		return this.userDesktopId;
	}

	public void setUserDesktopId(String userDesktopId) {
		this.userDesktopId = userDesktopId;
		if(userDesktopId != null){
			putQueryParameter("UserDesktopId", userDesktopId);
		}
	}

	public String getUserGroupId() {
		return this.userGroupId;
	}

	public void setUserGroupId(String userGroupId) {
		this.userGroupId = userGroupId;
		if(userGroupId != null){
			putQueryParameter("UserGroupId", userGroupId);
		}
	}

	public String getEndUserId() {
		return this.endUserId;
	}

	public void setEndUserId(String endUserId) {
		this.endUserId = endUserId;
		if(endUserId != null){
			putQueryParameter("EndUserId", endUserId);
		}
	}

	@Override
	public Class<RemoveUserFromDesktopOversoldUserGroupResponse> getResponseClass() {
		return RemoveUserFromDesktopOversoldUserGroupResponse.class;
	}

}
