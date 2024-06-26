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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ImportAppAlertRulesRequest extends RpcAcsRequest<ImportAppAlertRulesResponse> {
	   

	private Boolean isAutoStart;

	private List<Tags> tagss;

	private String contactGroupIds;

	private String pids;

	private String templageAlertConfig;

	private String templateAlertId;
	public ImportAppAlertRulesRequest() {
		super("ARMS", "2019-08-08", "ImportAppAlertRules", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getIsAutoStart() {
		return this.isAutoStart;
	}

	public void setIsAutoStart(Boolean isAutoStart) {
		this.isAutoStart = isAutoStart;
		if(isAutoStart != null){
			putQueryParameter("IsAutoStart", isAutoStart.toString());
		}
	}

	public List<Tags> getTagss() {
		return this.tagss;
	}

	public void setTagss(List<Tags> tagss) {
		this.tagss = tagss;	
		if (tagss != null) {
			for (int depth1 = 0; depth1 < tagss.size(); depth1++) {
				putQueryParameter("Tags." + (depth1 + 1) + ".Value" , tagss.get(depth1).getValue());
				putQueryParameter("Tags." + (depth1 + 1) + ".Key" , tagss.get(depth1).getKey());
			}
		}	
	}

	public String getContactGroupIds() {
		return this.contactGroupIds;
	}

	public void setContactGroupIds(String contactGroupIds) {
		this.contactGroupIds = contactGroupIds;
		if(contactGroupIds != null){
			putQueryParameter("ContactGroupIds", contactGroupIds);
		}
	}

	public String getPids() {
		return this.pids;
	}

	public void setPids(String pids) {
		this.pids = pids;
		if(pids != null){
			putQueryParameter("Pids", pids);
		}
	}

	public String getTemplageAlertConfig() {
		return this.templageAlertConfig;
	}

	public void setTemplageAlertConfig(String templageAlertConfig) {
		this.templageAlertConfig = templageAlertConfig;
		if(templageAlertConfig != null){
			putQueryParameter("TemplageAlertConfig", templageAlertConfig);
		}
	}

	public String getTemplateAlertId() {
		return this.templateAlertId;
	}

	public void setTemplateAlertId(String templateAlertId) {
		this.templateAlertId = templateAlertId;
		if(templateAlertId != null){
			putQueryParameter("TemplateAlertId", templateAlertId);
		}
	}

	public static class Tags {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<ImportAppAlertRulesResponse> getResponseClass() {
		return ImportAppAlertRulesResponse.class;
	}

}
