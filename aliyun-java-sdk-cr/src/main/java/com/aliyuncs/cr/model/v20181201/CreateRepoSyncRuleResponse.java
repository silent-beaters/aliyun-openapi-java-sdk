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

package com.aliyuncs.cr.model.v20181201;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cr.transform.v20181201.CreateRepoSyncRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateRepoSyncRuleResponse extends AcsResponse {

	private String code;

	private String syncRuleId;

	private Boolean isSuccess;

	private String requestId;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSyncRuleId() {
		return this.syncRuleId;
	}

	public void setSyncRuleId(String syncRuleId) {
		this.syncRuleId = syncRuleId;
	}

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public CreateRepoSyncRuleResponse getInstance(UnmarshallerContext context) {
		return	CreateRepoSyncRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
