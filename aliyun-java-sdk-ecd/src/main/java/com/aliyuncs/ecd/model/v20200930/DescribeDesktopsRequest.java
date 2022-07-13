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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeDesktopsRequest extends RpcAcsRequest<DescribeDesktopsResponse> {
	   

	private String officeSiteId;

	private String desktopStatus;

	private String nextToken;

	private Boolean queryFotaUpdate;

	private String directoryId;

	private List<String> endUserIds;

	private List<String> desktopIds;

	private String desktopName;

	private String groupId;

	private String officeSiteName;

	private List<String> excludedEndUserIds;

	private Boolean filterDesktopGroup;

	private String managementFlag;

	private String expiredTime;

	private Integer maxResults;

	private String protocolType;

	private String chargeType;

	private String policyGroupId;

	private String userName;
	public DescribeDesktopsRequest() {
		super("ecd", "2020-09-30", "DescribeDesktops");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOfficeSiteId() {
		return this.officeSiteId;
	}

	public void setOfficeSiteId(String officeSiteId) {
		this.officeSiteId = officeSiteId;
		if(officeSiteId != null){
			putQueryParameter("OfficeSiteId", officeSiteId);
		}
	}

	public String getDesktopStatus() {
		return this.desktopStatus;
	}

	public void setDesktopStatus(String desktopStatus) {
		this.desktopStatus = desktopStatus;
		if(desktopStatus != null){
			putQueryParameter("DesktopStatus", desktopStatus);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public Boolean getQueryFotaUpdate() {
		return this.queryFotaUpdate;
	}

	public void setQueryFotaUpdate(Boolean queryFotaUpdate) {
		this.queryFotaUpdate = queryFotaUpdate;
		if(queryFotaUpdate != null){
			putQueryParameter("QueryFotaUpdate", queryFotaUpdate.toString());
		}
	}

	public String getDirectoryId() {
		return this.directoryId;
	}

	public void setDirectoryId(String directoryId) {
		this.directoryId = directoryId;
		if(directoryId != null){
			putQueryParameter("DirectoryId", directoryId);
		}
	}

	public List<String> getEndUserIds() {
		return this.endUserIds;
	}

	public void setEndUserIds(List<String> endUserIds) {
		this.endUserIds = endUserIds;	
		if (endUserIds != null) {
			for (int i = 0; i < endUserIds.size(); i++) {
				putQueryParameter("EndUserId." + (i + 1) , endUserIds.get(i));
			}
		}	
	}

	public List<String> getDesktopIds() {
		return this.desktopIds;
	}

	public void setDesktopIds(List<String> desktopIds) {
		this.desktopIds = desktopIds;	
		if (desktopIds != null) {
			for (int i = 0; i < desktopIds.size(); i++) {
				putQueryParameter("DesktopId." + (i + 1) , desktopIds.get(i));
			}
		}	
	}

	public String getDesktopName() {
		return this.desktopName;
	}

	public void setDesktopName(String desktopName) {
		this.desktopName = desktopName;
		if(desktopName != null){
			putQueryParameter("DesktopName", desktopName);
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getOfficeSiteName() {
		return this.officeSiteName;
	}

	public void setOfficeSiteName(String officeSiteName) {
		this.officeSiteName = officeSiteName;
		if(officeSiteName != null){
			putQueryParameter("OfficeSiteName", officeSiteName);
		}
	}

	public List<String> getExcludedEndUserIds() {
		return this.excludedEndUserIds;
	}

	public void setExcludedEndUserIds(List<String> excludedEndUserIds) {
		this.excludedEndUserIds = excludedEndUserIds;	
		if (excludedEndUserIds != null) {
			for (int i = 0; i < excludedEndUserIds.size(); i++) {
				putQueryParameter("ExcludedEndUserId." + (i + 1) , excludedEndUserIds.get(i));
			}
		}	
	}

	public Boolean getFilterDesktopGroup() {
		return this.filterDesktopGroup;
	}

	public void setFilterDesktopGroup(Boolean filterDesktopGroup) {
		this.filterDesktopGroup = filterDesktopGroup;
		if(filterDesktopGroup != null){
			putQueryParameter("FilterDesktopGroup", filterDesktopGroup.toString());
		}
	}

	public String getManagementFlag() {
		return this.managementFlag;
	}

	public void setManagementFlag(String managementFlag) {
		this.managementFlag = managementFlag;
		if(managementFlag != null){
			putQueryParameter("ManagementFlag", managementFlag);
		}
	}

	public String getExpiredTime() {
		return this.expiredTime;
	}

	public void setExpiredTime(String expiredTime) {
		this.expiredTime = expiredTime;
		if(expiredTime != null){
			putQueryParameter("ExpiredTime", expiredTime);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public String getProtocolType() {
		return this.protocolType;
	}

	public void setProtocolType(String protocolType) {
		this.protocolType = protocolType;
		if(protocolType != null){
			putQueryParameter("ProtocolType", protocolType);
		}
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
		if(chargeType != null){
			putQueryParameter("ChargeType", chargeType);
		}
	}

	public String getPolicyGroupId() {
		return this.policyGroupId;
	}

	public void setPolicyGroupId(String policyGroupId) {
		this.policyGroupId = policyGroupId;
		if(policyGroupId != null){
			putQueryParameter("PolicyGroupId", policyGroupId);
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putQueryParameter("UserName", userName);
		}
	}

	@Override
	public Class<DescribeDesktopsResponse> getResponseClass() {
		return DescribeDesktopsResponse.class;
	}

}
