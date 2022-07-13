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

package com.aliyuncs.quickbi_public.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryUserGroupListByParentIdRequest extends RpcAcsRequest<QueryUserGroupListByParentIdResponse> {
	   

	private String parentUserGroupId;
	public QueryUserGroupListByParentIdRequest() {
		super("quickbi-public", "2022-01-01", "QueryUserGroupListByParentId", "quickbi");
		setMethod(MethodType.POST);
	}

	public String getParentUserGroupId() {
		return this.parentUserGroupId;
	}

	public void setParentUserGroupId(String parentUserGroupId) {
		this.parentUserGroupId = parentUserGroupId;
		if(parentUserGroupId != null){
			putQueryParameter("ParentUserGroupId", parentUserGroupId);
		}
	}

	@Override
	public Class<QueryUserGroupListByParentIdResponse> getResponseClass() {
		return QueryUserGroupListByParentIdResponse.class;
	}

}
