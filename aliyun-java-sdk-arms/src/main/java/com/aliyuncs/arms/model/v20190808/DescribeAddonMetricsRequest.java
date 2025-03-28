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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeAddonMetricsRequest extends RpcAcsRequest<DescribeAddonMetricsResponse> {
	   

	private String addonVersion;

	private String aliyunLang;

	private String environmentType;

	private String name;
	public DescribeAddonMetricsRequest() {
		super("ARMS", "2019-08-08", "DescribeAddonMetrics", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAddonVersion() {
		return this.addonVersion;
	}

	public void setAddonVersion(String addonVersion) {
		this.addonVersion = addonVersion;
		if(addonVersion != null){
			putQueryParameter("AddonVersion", addonVersion);
		}
	}

	public String getAliyunLang() {
		return this.aliyunLang;
	}

	public void setAliyunLang(String aliyunLang) {
		this.aliyunLang = aliyunLang;
		if(aliyunLang != null){
			putQueryParameter("AliyunLang", aliyunLang);
		}
	}

	public String getEnvironmentType() {
		return this.environmentType;
	}

	public void setEnvironmentType(String environmentType) {
		this.environmentType = environmentType;
		if(environmentType != null){
			putQueryParameter("EnvironmentType", environmentType);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	@Override
	public Class<DescribeAddonMetricsResponse> getResponseClass() {
		return DescribeAddonMetricsResponse.class;
	}

}
