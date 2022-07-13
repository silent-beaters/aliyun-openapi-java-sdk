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

package com.aliyuncs.ddoscoo.transform.v20200101;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeDomainStatusCodeCountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainStatusCodeCountResponseUnmarshaller {

	public static DescribeDomainStatusCodeCountResponse unmarshall(DescribeDomainStatusCodeCountResponse describeDomainStatusCodeCountResponse, UnmarshallerContext _ctx) {
		
		describeDomainStatusCodeCountResponse.setRequestId(_ctx.stringValue("DescribeDomainStatusCodeCountResponse.RequestId"));
		describeDomainStatusCodeCountResponse.setStatus502(_ctx.longValue("DescribeDomainStatusCodeCountResponse.Status502"));
		describeDomainStatusCodeCountResponse.setStatus405(_ctx.longValue("DescribeDomainStatusCodeCountResponse.Status405"));
		describeDomainStatusCodeCountResponse.setStatus3XX(_ctx.longValue("DescribeDomainStatusCodeCountResponse.Status3XX"));
		describeDomainStatusCodeCountResponse.setStatus503(_ctx.longValue("DescribeDomainStatusCodeCountResponse.Status503"));
		describeDomainStatusCodeCountResponse.setStatus4XX(_ctx.longValue("DescribeDomainStatusCodeCountResponse.Status4XX"));
		describeDomainStatusCodeCountResponse.setStatus2XX(_ctx.longValue("DescribeDomainStatusCodeCountResponse.Status2XX"));
		describeDomainStatusCodeCountResponse.setStatus5XX(_ctx.longValue("DescribeDomainStatusCodeCountResponse.Status5XX"));
		describeDomainStatusCodeCountResponse.setStatus504(_ctx.longValue("DescribeDomainStatusCodeCountResponse.Status504"));
		describeDomainStatusCodeCountResponse.setStatus200(_ctx.longValue("DescribeDomainStatusCodeCountResponse.Status200"));
		describeDomainStatusCodeCountResponse.setStatus403(_ctx.longValue("DescribeDomainStatusCodeCountResponse.Status403"));
		describeDomainStatusCodeCountResponse.setStatus404(_ctx.longValue("DescribeDomainStatusCodeCountResponse.Status404"));
		describeDomainStatusCodeCountResponse.setStatus501(_ctx.longValue("DescribeDomainStatusCodeCountResponse.Status501"));
	 
	 	return describeDomainStatusCodeCountResponse;
	}
}