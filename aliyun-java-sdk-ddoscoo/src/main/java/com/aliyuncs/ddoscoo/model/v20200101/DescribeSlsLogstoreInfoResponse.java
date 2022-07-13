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

package com.aliyuncs.ddoscoo.model.v20200101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeSlsLogstoreInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSlsLogstoreInfoResponse extends AcsResponse {

	private Integer ttl;

	private String requestId;

	private Long quota;

	private String logStore;

	private Long used;

	private String project;

	public Integer getTtl() {
		return this.ttl;
	}

	public void setTtl(Integer ttl) {
		this.ttl = ttl;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getQuota() {
		return this.quota;
	}

	public void setQuota(Long quota) {
		this.quota = quota;
	}

	public String getLogStore() {
		return this.logStore;
	}

	public void setLogStore(String logStore) {
		this.logStore = logStore;
	}

	public Long getUsed() {
		return this.used;
	}

	public void setUsed(Long used) {
		this.used = used;
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	@Override
	public DescribeSlsLogstoreInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeSlsLogstoreInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
