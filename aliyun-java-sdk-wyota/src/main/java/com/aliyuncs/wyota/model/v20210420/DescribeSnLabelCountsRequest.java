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

package com.aliyuncs.wyota.model.v20210420;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeSnLabelCountsRequest extends RpcAcsRequest<DescribeSnLabelCountsResponse> {
	   

	private List<String> labelLists;

	private String zoneName;

	private String tenantId;

	private String zoneId;
	public DescribeSnLabelCountsRequest() {
		super("wyota", "2021-04-20", "DescribeSnLabelCounts");
		setMethod(MethodType.POST);
	}

	public List<String> getLabelLists() {
		return this.labelLists;
	}

	public void setLabelLists(List<String> labelLists) {
		this.labelLists = labelLists;	
		if (labelLists != null) {
			for (int i = 0; i < labelLists.size(); i++) {
				putBodyParameter("LabelList." + (i + 1) , labelLists.get(i));
			}
		}	
	}

	public String getZoneName() {
		return this.zoneName;
	}

	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
		if(zoneName != null){
			putBodyParameter("ZoneName", zoneName);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putBodyParameter("ZoneId", zoneId);
		}
	}

	@Override
	public Class<DescribeSnLabelCountsResponse> getResponseClass() {
		return DescribeSnLabelCountsResponse.class;
	}

}
