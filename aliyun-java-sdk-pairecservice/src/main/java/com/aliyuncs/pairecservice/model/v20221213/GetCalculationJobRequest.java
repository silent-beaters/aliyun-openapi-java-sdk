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

package com.aliyuncs.pairecservice.model.v20221213;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetCalculationJobRequest extends RoaAcsRequest<GetCalculationJobResponse> {
	   

	private String instanceId;

	private String calculationJobId;
	public GetCalculationJobRequest() {
		super("PaiRecService", "2022-12-13", "GetCalculationJob");
		setUriPattern("/api/v1/calculationjobs/[CalculationJobId]");
		setMethod(MethodType.GET);
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getCalculationJobId() {
		return this.calculationJobId;
	}

	public void setCalculationJobId(String calculationJobId) {
		this.calculationJobId = calculationJobId;
		if(calculationJobId != null){
			putPathParameter("CalculationJobId", calculationJobId);
		}
	}

	@Override
	public Class<GetCalculationJobResponse> getResponseClass() {
		return GetCalculationJobResponse.class;
	}

}
