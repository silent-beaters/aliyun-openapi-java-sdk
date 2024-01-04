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

package com.aliyuncs.devops.model.v20210625;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListVariableGroupsRequest extends RoaAcsRequest<ListVariableGroupsResponse> {
	   

	private String pageSort;

	private String organizationId;

	private String pageOrder;

	private String nextToken;

	private Integer maxResults;
	public ListVariableGroupsRequest() {
		super("devops", "2021-06-25", "ListVariableGroups");
		setUriPattern("/organization/[organizationId]/variableGroups");
		setMethod(MethodType.GET);
	}

	public String getPageSort() {
		return this.pageSort;
	}

	public void setPageSort(String pageSort) {
		this.pageSort = pageSort;
		if(pageSort != null){
			putQueryParameter("pageSort", pageSort);
		}
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putPathParameter("organizationId", organizationId);
		}
	}

	public String getPageOrder() {
		return this.pageOrder;
	}

	public void setPageOrder(String pageOrder) {
		this.pageOrder = pageOrder;
		if(pageOrder != null){
			putQueryParameter("pageOrder", pageOrder);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("nextToken", nextToken);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("maxResults", maxResults.toString());
		}
	}

	@Override
	public Class<ListVariableGroupsResponse> getResponseClass() {
		return ListVariableGroupsResponse.class;
	}

}
