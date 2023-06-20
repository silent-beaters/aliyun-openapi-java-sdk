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

package com.aliyuncs.cd.model.v2021127;

import com.aliyuncs.RoaAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddShopToGroupRequest extends RoaAcsRequest<AddShopToGroupResponse> {
	   

	private String country;

	private String shopGroupId;

	@SerializedName("shopIdList")
	private List<String> shopIdList;
	public AddShopToGroupRequest() {
		super("cd", "2021-12-7", "AddShopToGroup");
		setUriPattern("/AddShopToGroup");
		setMethod(MethodType.POST);
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
		if(country != null){
			putBodyParameter("Country", country);
		}
	}

	public String getShopGroupId() {
		return this.shopGroupId;
	}

	public void setShopGroupId(String shopGroupId) {
		this.shopGroupId = shopGroupId;
		if(shopGroupId != null){
			putBodyParameter("ShopGroupId", shopGroupId);
		}
	}

	public List<String> getShopIdList() {
		return this.shopIdList;
	}

	public void setShopIdList(List<String> shopIdList) {
		this.shopIdList = shopIdList;	
		if (shopIdList != null) {
			putBodyParameter("ShopIdList" , new Gson().toJson(shopIdList));
		}	
	}

	@Override
	public Class<AddShopToGroupResponse> getResponseClass() {
		return AddShopToGroupResponse.class;
	}

}
