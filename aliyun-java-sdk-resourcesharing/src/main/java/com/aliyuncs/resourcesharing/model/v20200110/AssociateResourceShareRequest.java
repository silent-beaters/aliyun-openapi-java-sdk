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
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.resourcesharing.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AssociateResourceShareRequest extends RpcAcsRequest<AssociateResourceShareResponse> {
	   

	private List<Resources> resourcess;

	private List<String> targetss;

	private String resourceShareId;

	private List<String> permissionNamess;
	public AssociateResourceShareRequest() {
		super("ResourceSharing", "2020-01-10", "AssociateResourceShare", "ressharing");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Resources> getResourcess() {
		return this.resourcess;
	}

	public void setResourcess(List<Resources> resourcess) {
		this.resourcess = resourcess;	
		if (resourcess != null) {
			for (int depth1 = 0; depth1 < resourcess.size(); depth1++) {
				putQueryParameter("Resources." + (depth1 + 1) + ".ResourceId" , resourcess.get(depth1).getResourceId());
				putQueryParameter("Resources." + (depth1 + 1) + ".ResourceType" , resourcess.get(depth1).getResourceType());
			}
		}	
	}

	public List<String> getTargetss() {
		return this.targetss;
	}

	public void setTargetss(List<String> targetss) {
		this.targetss = targetss;	
		if (targetss != null) {
			for (int i = 0; i < targetss.size(); i++) {
				putQueryParameter("Targets." + (i + 1) , targetss.get(i));
			}
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

	public List<String> getPermissionNamess() {
		return this.permissionNamess;
	}

	public void setPermissionNamess(List<String> permissionNamess) {
		this.permissionNamess = permissionNamess;	
		if (permissionNamess != null) {
			for (int i = 0; i < permissionNamess.size(); i++) {
				putQueryParameter("PermissionNames." + (i + 1) , permissionNamess.get(i));
			}
		}	
	}

	public static class Resources {

		private String resourceId;

		private String resourceType;

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}
	}

	@Override
	public Class<AssociateResourceShareResponse> getResponseClass() {
		return AssociateResourceShareResponse.class;
	}

}
