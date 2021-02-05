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

package com.aliyuncs.eais.model.v20190624;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.eais.transform.v20190624.CreateEaiResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateEaiResponse extends AcsResponse {

	private String requestId;

	private String elasticAcceleratedInstanceId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getElasticAcceleratedInstanceId() {
		return this.elasticAcceleratedInstanceId;
	}

	public void setElasticAcceleratedInstanceId(String elasticAcceleratedInstanceId) {
		this.elasticAcceleratedInstanceId = elasticAcceleratedInstanceId;
	}

	@Override
	public CreateEaiResponse getInstance(UnmarshallerContext context) {
		return	CreateEaiResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}