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

package com.aliyuncs.resourcesharing.model.v20200110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.resourcesharing.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListResourceSharePermissionsRequest extends RpcAcsRequest<ListResourceSharePermissionsResponse> {
	   

	private String resourceOwner;

	private String nextToken;

	private Integer maxResults;

	private String resourceShareId;
	public ListResourceSharePermissionsRequest() {
		super("ResourceSharing", "2020-01-10", "ListResourceSharePermissions", "ressharing");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getResourceOwner() {
		return this.resourceOwner;
	}

	public void setResourceOwner(String resourceOwner) {
		this.resourceOwner = resourceOwner;
		if(resourceOwner != null){
			putQueryParameter("ResourceOwner", resourceOwner);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public String getResourceShareId() {
		return this.resourceShareId;
	}

	public void setResourceShareId(String resourceShareId) {
		this.resourceShareId = resourceShareId;
		if(resourceShareId != null){
			putQueryParameter("ResourceShareId", resourceShareId);
		}
	}

	@Override
	public Class<ListResourceSharePermissionsResponse> getResponseClass() {
		return ListResourceSharePermissionsResponse.class;
	}

}
