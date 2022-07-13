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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeCheckEcsWarningsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCheckEcsWarningsResponse extends AcsResponse {

	private String sasVersion;

	private String canTry;

	private String weakPasswordCount;

	private String requestId;

	public String getSasVersion() {
		return this.sasVersion;
	}

	public void setSasVersion(String sasVersion) {
		this.sasVersion = sasVersion;
	}

	public String getCanTry() {
		return this.canTry;
	}

	public void setCanTry(String canTry) {
		this.canTry = canTry;
	}

	public String getWeakPasswordCount() {
		return this.weakPasswordCount;
	}

	public void setWeakPasswordCount(String weakPasswordCount) {
		this.weakPasswordCount = weakPasswordCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public DescribeCheckEcsWarningsResponse getInstance(UnmarshallerContext context) {
		return	DescribeCheckEcsWarningsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
