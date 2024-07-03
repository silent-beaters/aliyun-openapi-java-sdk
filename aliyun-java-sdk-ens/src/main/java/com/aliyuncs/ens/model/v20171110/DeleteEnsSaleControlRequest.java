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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteEnsSaleControlRequest extends RpcAcsRequest<DeleteEnsSaleControlResponse> {
	   

	@SerializedName("saleControls")
	private List<SaleControls> saleControls;

	private String customAccount;

	private String commodityCode;

	private String aliUidAccount;
	public DeleteEnsSaleControlRequest() {
		super("Ens", "2017-11-10", "DeleteEnsSaleControl", "ens");
		setMethod(MethodType.POST);
	}

	public List<SaleControls> getSaleControls() {
		return this.saleControls;
	}

	public void setSaleControls(List<SaleControls> saleControls) {
		this.saleControls = saleControls;	
		if (saleControls != null) {
			putQueryParameter("SaleControls" , new Gson().toJson(saleControls));
		}	
	}

	public String getCustomAccount() {
		return this.customAccount;
	}

	public void setCustomAccount(String customAccount) {
		this.customAccount = customAccount;
		if(customAccount != null){
			putQueryParameter("CustomAccount", customAccount);
		}
	}

	public String getCommodityCode() {
		return this.commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
		if(commodityCode != null){
			putQueryParameter("CommodityCode", commodityCode);
		}
	}

	public String getAliUidAccount() {
		return this.aliUidAccount;
	}

	public void setAliUidAccount(String aliUidAccount) {
		this.aliUidAccount = aliUidAccount;
		if(aliUidAccount != null){
			putQueryParameter("AliUidAccount", aliUidAccount);
		}
	}

	public static class SaleControls {

		@SerializedName("ModuleCode")
		private String moduleCode;

		@SerializedName("OrderType")
		private String orderType;

		public String getModuleCode() {
			return this.moduleCode;
		}

		public void setModuleCode(String moduleCode) {
			this.moduleCode = moduleCode;
		}

		public String getOrderType() {
			return this.orderType;
		}

		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}
	}

	@Override
	public Class<DeleteEnsSaleControlResponse> getResponseClass() {
		return DeleteEnsSaleControlResponse.class;
	}

}
