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

package com.aliyuncs.dds.model.v20151201;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribeDBInstanceTDEInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceTDEInfoResponse extends AcsResponse {

	private String tDEStatus;

	private String requestId;

	private String roleARN;

	private String encryptionKey;

	private String encryptorName;

	public String getTDEStatus() {
		return this.tDEStatus;
	}

	public void setTDEStatus(String tDEStatus) {
		this.tDEStatus = tDEStatus;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRoleARN() {
		return this.roleARN;
	}

	public void setRoleARN(String roleARN) {
		this.roleARN = roleARN;
	}

	public String getEncryptionKey() {
		return this.encryptionKey;
	}

	public void setEncryptionKey(String encryptionKey) {
		this.encryptionKey = encryptionKey;
	}

	public String getEncryptorName() {
		return this.encryptorName;
	}

	public void setEncryptorName(String encryptorName) {
		this.encryptorName = encryptorName;
	}

	@Override
	public DescribeDBInstanceTDEInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceTDEInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
