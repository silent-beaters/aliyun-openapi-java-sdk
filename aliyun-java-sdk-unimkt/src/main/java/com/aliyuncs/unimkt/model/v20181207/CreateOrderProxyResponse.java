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

package com.aliyuncs.unimkt.model.v20181207;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.unimkt.transform.v20181207.CreateOrderProxyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateOrderProxyResponse extends AcsResponse {

	private String msg;

	private Boolean status;

	private String requestId;

	private String errorCode;

	private String aliPayOrderId;

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getAliPayOrderId() {
		return this.aliPayOrderId;
	}

	public void setAliPayOrderId(String aliPayOrderId) {
		this.aliPayOrderId = aliPayOrderId;
	}

	@Override
	public CreateOrderProxyResponse getInstance(UnmarshallerContext context) {
		return	CreateOrderProxyResponseUnmarshaller.unmarshall(this, context);
	}
}
