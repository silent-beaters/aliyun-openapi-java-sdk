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
public class AddPipelineRelationsRequest extends RoaAcsRequest<AddPipelineRelationsResponse> {
	   

	private String relObjectType;

	private String relObjectIds;

	private Long pipelineId;

	private String organizationId;
	public AddPipelineRelationsRequest() {
		super("devops", "2021-06-25", "AddPipelineRelations");
		setUriPattern("/organization/[organizationId]/[pipelineId]/pipelineRelations");
		setMethod(MethodType.POST);
	}

	public String getRelObjectType() {
		return this.relObjectType;
	}

	public void setRelObjectType(String relObjectType) {
		this.relObjectType = relObjectType;
		if(relObjectType != null){
			putQueryParameter("relObjectType", relObjectType);
		}
	}

	public String getRelObjectIds() {
		return this.relObjectIds;
	}

	public void setRelObjectIds(String relObjectIds) {
		this.relObjectIds = relObjectIds;
		if(relObjectIds != null){
			putQueryParameter("relObjectIds", relObjectIds);
		}
	}

	public Long getPipelineId() {
		return this.pipelineId;
	}

	public void setPipelineId(Long pipelineId) {
		this.pipelineId = pipelineId;
		if(pipelineId != null){
			putPathParameter("pipelineId", pipelineId.toString());
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

	@Override
	public Class<AddPipelineRelationsResponse> getResponseClass() {
		return AddPipelineRelationsResponse.class;
	}

}
