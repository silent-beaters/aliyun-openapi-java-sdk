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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.DescribeInstanceLogResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceLogResponseUnmarshaller {

	public static DescribeInstanceLogResponse unmarshall(DescribeInstanceLogResponse describeInstanceLogResponse, UnmarshallerContext _ctx) {
		
		describeInstanceLogResponse.setRequestId(_ctx.stringValue("DescribeInstanceLogResponse.RequestId"));
		describeInstanceLogResponse.setMessage(_ctx.stringValue("DescribeInstanceLogResponse.Message"));
		describeInstanceLogResponse.setTraceId(_ctx.stringValue("DescribeInstanceLogResponse.TraceId"));
		describeInstanceLogResponse.setData(_ctx.stringValue("DescribeInstanceLogResponse.Data"));
		describeInstanceLogResponse.setErrorCode(_ctx.stringValue("DescribeInstanceLogResponse.ErrorCode"));
		describeInstanceLogResponse.setCode(_ctx.stringValue("DescribeInstanceLogResponse.Code"));
		describeInstanceLogResponse.setSuccess(_ctx.booleanValue("DescribeInstanceLogResponse.Success"));
	 
	 	return describeInstanceLogResponse;
	}
}