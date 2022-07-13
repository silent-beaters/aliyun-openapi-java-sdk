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

package com.aliyuncs.cbn.model.v20170912;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cbn.transform.v20170912.CreateTransitRouterMulticastDomainResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateTransitRouterMulticastDomainResponse extends AcsResponse {

	private String transitRouterMulticastDomainId;

	private String requestId;

	public String getTransitRouterMulticastDomainId() {
		return this.transitRouterMulticastDomainId;
	}

	public void setTransitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
		this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public CreateTransitRouterMulticastDomainResponse getInstance(UnmarshallerContext context) {
		return	CreateTransitRouterMulticastDomainResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
