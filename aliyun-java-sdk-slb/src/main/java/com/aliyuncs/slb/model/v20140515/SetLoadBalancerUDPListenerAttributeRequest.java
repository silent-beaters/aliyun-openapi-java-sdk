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

package com.aliyuncs.slb.model.v20140515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.slb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetLoadBalancerUDPListenerAttributeRequest extends RpcAcsRequest<SetLoadBalancerUDPListenerAttributeResponse> {
	   

	private Long resourceOwnerId;

	private String aclStatus;

	private String aclType;

	private String masterSlaveServerGroup;

	private String vServerGroupId;

	private String aclId;

	private Long ownerId;

	private String loadBalancerId;

	private String masterSlaveServerGroupId;

	private String healthCheckReq;

	private Integer healthCheckInterval;

	private String healthCheckExp;

	private Integer healthCheckConnectTimeout;

	private String description;

	private Integer unhealthyThreshold;

	private Integer healthyThreshold;

	private String scheduler;

	private Integer listenerPort;

	private String resourceOwnerAccount;

	private Integer bandwidth;

	private String ownerAccount;

	private Integer healthCheckConnectPort;

	private String vServerGroup;
	public SetLoadBalancerUDPListenerAttributeRequest() {
		super("Slb", "2014-05-15", "SetLoadBalancerUDPListenerAttribute", "slb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getAclStatus() {
		return this.aclStatus;
	}

	public void setAclStatus(String aclStatus) {
		this.aclStatus = aclStatus;
		if(aclStatus != null){
			putQueryParameter("AclStatus", aclStatus);
		}
	}

	public String getAclType() {
		return this.aclType;
	}

	public void setAclType(String aclType) {
		this.aclType = aclType;
		if(aclType != null){
			putQueryParameter("AclType", aclType);
		}
	}

	public String getMasterSlaveServerGroup() {
		return this.masterSlaveServerGroup;
	}

	public void setMasterSlaveServerGroup(String masterSlaveServerGroup) {
		this.masterSlaveServerGroup = masterSlaveServerGroup;
		if(masterSlaveServerGroup != null){
			putQueryParameter("MasterSlaveServerGroup", masterSlaveServerGroup);
		}
	}

	public String getVServerGroupId() {
		return this.vServerGroupId;
	}

	public void setVServerGroupId(String vServerGroupId) {
		this.vServerGroupId = vServerGroupId;
		if(vServerGroupId != null){
			putQueryParameter("VServerGroupId", vServerGroupId);
		}
	}

	public String getAclId() {
		return this.aclId;
	}

	public void setAclId(String aclId) {
		this.aclId = aclId;
		if(aclId != null){
			putQueryParameter("AclId", aclId);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
		if(loadBalancerId != null){
			putQueryParameter("LoadBalancerId", loadBalancerId);
		}
	}

	public String getMasterSlaveServerGroupId() {
		return this.masterSlaveServerGroupId;
	}

	public void setMasterSlaveServerGroupId(String masterSlaveServerGroupId) {
		this.masterSlaveServerGroupId = masterSlaveServerGroupId;
		if(masterSlaveServerGroupId != null){
			putQueryParameter("MasterSlaveServerGroupId", masterSlaveServerGroupId);
		}
	}

	public String getHealthCheckReq() {
		return this.healthCheckReq;
	}

	public void setHealthCheckReq(String healthCheckReq) {
		this.healthCheckReq = healthCheckReq;
		if(healthCheckReq != null){
			putQueryParameter("healthCheckReq", healthCheckReq);
		}
	}

	public Integer getHealthCheckInterval() {
		return this.healthCheckInterval;
	}

	public void setHealthCheckInterval(Integer healthCheckInterval) {
		this.healthCheckInterval = healthCheckInterval;
		if(healthCheckInterval != null){
			putQueryParameter("HealthCheckInterval", healthCheckInterval.toString());
		}
	}

	public String getHealthCheckExp() {
		return this.healthCheckExp;
	}

	public void setHealthCheckExp(String healthCheckExp) {
		this.healthCheckExp = healthCheckExp;
		if(healthCheckExp != null){
			putQueryParameter("healthCheckExp", healthCheckExp);
		}
	}

	public Integer getHealthCheckConnectTimeout() {
		return this.healthCheckConnectTimeout;
	}

	public void setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
		this.healthCheckConnectTimeout = healthCheckConnectTimeout;
		if(healthCheckConnectTimeout != null){
			putQueryParameter("HealthCheckConnectTimeout", healthCheckConnectTimeout.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Integer getUnhealthyThreshold() {
		return this.unhealthyThreshold;
	}

	public void setUnhealthyThreshold(Integer unhealthyThreshold) {
		this.unhealthyThreshold = unhealthyThreshold;
		if(unhealthyThreshold != null){
			putQueryParameter("UnhealthyThreshold", unhealthyThreshold.toString());
		}
	}

	public Integer getHealthyThreshold() {
		return this.healthyThreshold;
	}

	public void setHealthyThreshold(Integer healthyThreshold) {
		this.healthyThreshold = healthyThreshold;
		if(healthyThreshold != null){
			putQueryParameter("HealthyThreshold", healthyThreshold.toString());
		}
	}

	public String getScheduler() {
		return this.scheduler;
	}

	public void setScheduler(String scheduler) {
		this.scheduler = scheduler;
		if(scheduler != null){
			putQueryParameter("Scheduler", scheduler);
		}
	}

	public Integer getListenerPort() {
		return this.listenerPort;
	}

	public void setListenerPort(Integer listenerPort) {
		this.listenerPort = listenerPort;
		if(listenerPort != null){
			putQueryParameter("ListenerPort", listenerPort.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
		if(bandwidth != null){
			putQueryParameter("Bandwidth", bandwidth.toString());
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Integer getHealthCheckConnectPort() {
		return this.healthCheckConnectPort;
	}

	public void setHealthCheckConnectPort(Integer healthCheckConnectPort) {
		this.healthCheckConnectPort = healthCheckConnectPort;
		if(healthCheckConnectPort != null){
			putQueryParameter("HealthCheckConnectPort", healthCheckConnectPort.toString());
		}
	}

	public String getVServerGroup() {
		return this.vServerGroup;
	}

	public void setVServerGroup(String vServerGroup) {
		this.vServerGroup = vServerGroup;
		if(vServerGroup != null){
			putQueryParameter("VServerGroup", vServerGroup);
		}
	}

	@Override
	public Class<SetLoadBalancerUDPListenerAttributeResponse> getResponseClass() {
		return SetLoadBalancerUDPListenerAttributeResponse.class;
	}

}
