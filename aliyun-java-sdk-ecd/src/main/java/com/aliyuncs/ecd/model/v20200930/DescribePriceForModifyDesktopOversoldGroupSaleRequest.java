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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribePriceForModifyDesktopOversoldGroupSaleRequest extends RpcAcsRequest<DescribePriceForModifyDesktopOversoldGroupSaleResponse> {
	   

	private String oversoldGroupId;

	private Integer oversoldUserCount;

	private Integer concurrenceCount;
	public DescribePriceForModifyDesktopOversoldGroupSaleRequest() {
		super("ecd", "2020-09-30", "DescribePriceForModifyDesktopOversoldGroupSale", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOversoldGroupId() {
		return this.oversoldGroupId;
	}

	public void setOversoldGroupId(String oversoldGroupId) {
		this.oversoldGroupId = oversoldGroupId;
		if(oversoldGroupId != null){
			putQueryParameter("OversoldGroupId", oversoldGroupId);
		}
	}

	public Integer getOversoldUserCount() {
		return this.oversoldUserCount;
	}

	public void setOversoldUserCount(Integer oversoldUserCount) {
		this.oversoldUserCount = oversoldUserCount;
		if(oversoldUserCount != null){
			putQueryParameter("OversoldUserCount", oversoldUserCount.toString());
		}
	}

	public Integer getConcurrenceCount() {
		return this.concurrenceCount;
	}

	public void setConcurrenceCount(Integer concurrenceCount) {
		this.concurrenceCount = concurrenceCount;
		if(concurrenceCount != null){
			putQueryParameter("ConcurrenceCount", concurrenceCount.toString());
		}
	}

	@Override
	public Class<DescribePriceForModifyDesktopOversoldGroupSaleResponse> getResponseClass() {
		return DescribePriceForModifyDesktopOversoldGroupSaleResponse.class;
	}

}
