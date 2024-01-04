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
public class GetCustomFieldOptionRequest extends RoaAcsRequest<GetCustomFieldOptionResponse> {
	   

	private String organizationId;

	private String spaceType;

	private String workitemTypeIdentifier;

	private String spaceIdentifier;

	private String fieldId;
	public GetCustomFieldOptionRequest() {
		super("devops", "2021-06-25", "GetCustomFieldOption");
		setUriPattern("/organization/[organizationId]/fields/[fieldId]/getCustomOption");
		setMethod(MethodType.GET);
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

	public String getSpaceType() {
		return this.spaceType;
	}

	public void setSpaceType(String spaceType) {
		this.spaceType = spaceType;
		if(spaceType != null){
			putQueryParameter("spaceType", spaceType);
		}
	}

	public String getWorkitemTypeIdentifier() {
		return this.workitemTypeIdentifier;
	}

	public void setWorkitemTypeIdentifier(String workitemTypeIdentifier) {
		this.workitemTypeIdentifier = workitemTypeIdentifier;
		if(workitemTypeIdentifier != null){
			putQueryParameter("workitemTypeIdentifier", workitemTypeIdentifier);
		}
	}

	public String getSpaceIdentifier() {
		return this.spaceIdentifier;
	}

	public void setSpaceIdentifier(String spaceIdentifier) {
		this.spaceIdentifier = spaceIdentifier;
		if(spaceIdentifier != null){
			putQueryParameter("spaceIdentifier", spaceIdentifier);
		}
	}

	public String getFieldId() {
		return this.fieldId;
	}

	public void setFieldId(String fieldId) {
		this.fieldId = fieldId;
		if(fieldId != null){
			putPathParameter("fieldId", fieldId);
		}
	}

	@Override
	public Class<GetCustomFieldOptionResponse> getResponseClass() {
		return GetCustomFieldOptionResponse.class;
	}

}
