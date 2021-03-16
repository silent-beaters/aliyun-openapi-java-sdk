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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsUpdateUserQuotaResourceRequest extends RpcAcsRequest<OpsUpdateUserQuotaResourceResponse> {
	   

	private Long deltaReservedQuota;

	private Integer networkType;

	private Long deltaBurstQuota;

	private String operator;

	private String quotaUnit;

	private Long uid;

	private Integer uidType;

	private Long resourceType;

	private String zoneId;

	private String resourceName;

	private Long deltaBaseQuota;

	private Integer payType;

	private String auditParamStr;
	public OpsUpdateUserQuotaResourceRequest() {
		super("Ecsops", "2016-04-01", "OpsUpdateUserQuotaResource", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getDeltaReservedQuota() {
		return this.deltaReservedQuota;
	}

	public void setDeltaReservedQuota(Long deltaReservedQuota) {
		this.deltaReservedQuota = deltaReservedQuota;
		if(deltaReservedQuota != null){
			putQueryParameter("DeltaReservedQuota", deltaReservedQuota.toString());
		}
	}

	public Integer getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(Integer networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putQueryParameter("NetworkType", networkType.toString());
		}
	}

	public Long getDeltaBurstQuota() {
		return this.deltaBurstQuota;
	}

	public void setDeltaBurstQuota(Long deltaBurstQuota) {
		this.deltaBurstQuota = deltaBurstQuota;
		if(deltaBurstQuota != null){
			putQueryParameter("DeltaBurstQuota", deltaBurstQuota.toString());
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public String getQuotaUnit() {
		return this.quotaUnit;
	}

	public void setQuotaUnit(String quotaUnit) {
		this.quotaUnit = quotaUnit;
		if(quotaUnit != null){
			putQueryParameter("QuotaUnit", quotaUnit);
		}
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
		if(uid != null){
			putQueryParameter("Uid", uid.toString());
		}
	}

	public Integer getUidType() {
		return this.uidType;
	}

	public void setUidType(Integer uidType) {
		this.uidType = uidType;
		if(uidType != null){
			putQueryParameter("UidType", uidType.toString());
		}
	}

	public Long getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(Long resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType.toString());
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public String getResourceName() {
		return this.resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
		if(resourceName != null){
			putQueryParameter("ResourceName", resourceName);
		}
	}

	public Long getDeltaBaseQuota() {
		return this.deltaBaseQuota;
	}

	public void setDeltaBaseQuota(Long deltaBaseQuota) {
		this.deltaBaseQuota = deltaBaseQuota;
		if(deltaBaseQuota != null){
			putQueryParameter("DeltaBaseQuota", deltaBaseQuota.toString());
		}
	}

	public Integer getPayType() {
		return this.payType;
	}

	public void setPayType(Integer payType) {
		this.payType = payType;
		if(payType != null){
			putQueryParameter("PayType", payType.toString());
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsUpdateUserQuotaResourceResponse> getResponseClass() {
		return OpsUpdateUserQuotaResourceResponse.class;
	}

}