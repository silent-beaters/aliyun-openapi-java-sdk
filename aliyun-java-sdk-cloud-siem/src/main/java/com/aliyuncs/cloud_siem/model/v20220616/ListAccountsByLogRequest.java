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

package com.aliyuncs.cloud_siem.model.v20220616;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListAccountsByLogRequest extends RpcAcsRequest<ListAccountsByLogResponse> {
	   

	private String cloudCode;

	private Long roleFor;

	private Integer roleType;

	private List<String> logCodess;

	private String prodCode;
	public ListAccountsByLogRequest() {
		super("cloud-siem", "2022-06-16", "ListAccountsByLog", "cloud-siem");
		setMethod(MethodType.POST);
	}

	public String getCloudCode() {
		return this.cloudCode;
	}

	public void setCloudCode(String cloudCode) {
		this.cloudCode = cloudCode;
		if(cloudCode != null){
			putBodyParameter("CloudCode", cloudCode);
		}
	}

	public Long getRoleFor() {
		return this.roleFor;
	}

	public void setRoleFor(Long roleFor) {
		this.roleFor = roleFor;
		if(roleFor != null){
			putBodyParameter("RoleFor", roleFor.toString());
		}
	}

	public Integer getRoleType() {
		return this.roleType;
	}

	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
		if(roleType != null){
			putBodyParameter("RoleType", roleType.toString());
		}
	}

	public List<String> getLogCodess() {
		return this.logCodess;
	}

	public void setLogCodess(List<String> logCodess) {
		this.logCodess = logCodess;	
		if (logCodess != null) {
			for (int i = 0; i < logCodess.size(); i++) {
				putBodyParameter("LogCodes." + (i + 1) , logCodess.get(i));
			}
		}	
	}

	public String getProdCode() {
		return this.prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
		if(prodCode != null){
			putBodyParameter("ProdCode", prodCode);
		}
	}

	@Override
	public Class<ListAccountsByLogResponse> getResponseClass() {
		return ListAccountsByLogResponse.class;
	}

}
