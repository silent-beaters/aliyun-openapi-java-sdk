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

package com.aliyuncs.airec.model.v20201126;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.airec.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListDashboardDetailsFlowsRequest extends RoaAcsRequest<ListDashboardDetailsFlowsResponse> {
	   

	private String metricType;

	private String instanceId;

	private String experimentIds;

	private String traceIds;

	private Integer endTime;

	private Integer startTime;

	private String sceneIds;
	public ListDashboardDetailsFlowsRequest() {
		super("Airec", "2020-11-26", "ListDashboardDetailsFlows", "airec");
		setUriPattern("/v2/openapi/instances/[instanceId]/dashboard/details/flows");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMetricType() {
		return this.metricType;
	}

	public void setMetricType(String metricType) {
		this.metricType = metricType;
		if(metricType != null){
			putQueryParameter("metricType", metricType);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putPathParameter("instanceId", instanceId);
		}
	}

	public String getExperimentIds() {
		return this.experimentIds;
	}

	public void setExperimentIds(String experimentIds) {
		this.experimentIds = experimentIds;
		if(experimentIds != null){
			putQueryParameter("experimentIds", experimentIds);
		}
	}

	public String getTraceIds() {
		return this.traceIds;
	}

	public void setTraceIds(String traceIds) {
		this.traceIds = traceIds;
		if(traceIds != null){
			putQueryParameter("traceIds", traceIds);
		}
	}

	public Integer getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("endTime", endTime.toString());
		}
	}

	public Integer getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("startTime", startTime.toString());
		}
	}

	public String getSceneIds() {
		return this.sceneIds;
	}

	public void setSceneIds(String sceneIds) {
		this.sceneIds = sceneIds;
		if(sceneIds != null){
			putQueryParameter("sceneIds", sceneIds);
		}
	}

	@Override
	public Class<ListDashboardDetailsFlowsResponse> getResponseClass() {
		return ListDashboardDetailsFlowsResponse.class;
	}

}
