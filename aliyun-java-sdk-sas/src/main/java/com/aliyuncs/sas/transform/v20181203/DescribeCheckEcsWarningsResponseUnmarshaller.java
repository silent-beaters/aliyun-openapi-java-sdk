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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.DescribeCheckEcsWarningsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCheckEcsWarningsResponseUnmarshaller {

	public static DescribeCheckEcsWarningsResponse unmarshall(DescribeCheckEcsWarningsResponse describeCheckEcsWarningsResponse, UnmarshallerContext _ctx) {
		
		describeCheckEcsWarningsResponse.setRequestId(_ctx.stringValue("DescribeCheckEcsWarningsResponse.RequestId"));
		describeCheckEcsWarningsResponse.setSasVersion(_ctx.stringValue("DescribeCheckEcsWarningsResponse.SasVersion"));
		describeCheckEcsWarningsResponse.setCanTry(_ctx.stringValue("DescribeCheckEcsWarningsResponse.CanTry"));
		describeCheckEcsWarningsResponse.setWeakPasswordCount(_ctx.stringValue("DescribeCheckEcsWarningsResponse.WeakPasswordCount"));
	 
	 	return describeCheckEcsWarningsResponse;
	}
}