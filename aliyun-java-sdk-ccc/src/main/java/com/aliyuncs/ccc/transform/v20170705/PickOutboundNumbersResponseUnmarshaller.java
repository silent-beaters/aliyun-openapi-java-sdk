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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.PickOutboundNumbersResponse;
import com.aliyuncs.ccc.model.v20170705.PickOutboundNumbersResponse.DialNumberPair;
import com.aliyuncs.ccc.model.v20170705.PickOutboundNumbersResponse.DialNumberPair.Callee;
import com.aliyuncs.ccc.model.v20170705.PickOutboundNumbersResponse.DialNumberPair.Caller;
import com.aliyuncs.transform.UnmarshallerContext;


public class PickOutboundNumbersResponseUnmarshaller {

	public static PickOutboundNumbersResponse unmarshall(PickOutboundNumbersResponse pickOutboundNumbersResponse, UnmarshallerContext _ctx) {
		
		pickOutboundNumbersResponse.setRequestId(_ctx.stringValue("PickOutboundNumbersResponse.RequestId"));
		pickOutboundNumbersResponse.setHttpStatusCode(_ctx.integerValue("PickOutboundNumbersResponse.HttpStatusCode"));
		pickOutboundNumbersResponse.setCode(_ctx.stringValue("PickOutboundNumbersResponse.Code"));
		pickOutboundNumbersResponse.setMessage(_ctx.stringValue("PickOutboundNumbersResponse.Message"));
		pickOutboundNumbersResponse.setSuccess(_ctx.booleanValue("PickOutboundNumbersResponse.Success"));

		List<DialNumberPair> dialNumberPairs = new ArrayList<DialNumberPair>();
		for (int i = 0; i < _ctx.lengthValue("PickOutboundNumbersResponse.DialNumberPairs.Length"); i++) {
			DialNumberPair dialNumberPair = new DialNumberPair();

			Callee callee = new Callee();
			callee.setNumber(_ctx.stringValue("PickOutboundNumbersResponse.DialNumberPairs["+ i +"].Callee.Number"));
			callee.setCity(_ctx.stringValue("PickOutboundNumbersResponse.DialNumberPairs["+ i +"].Callee.City"));
			callee.setProvince(_ctx.stringValue("PickOutboundNumbersResponse.DialNumberPairs["+ i +"].Callee.Province"));
			dialNumberPair.setCallee(callee);

			Caller caller = new Caller();
			caller.setNumber(_ctx.stringValue("PickOutboundNumbersResponse.DialNumberPairs["+ i +"].Caller.Number"));
			caller.setCity(_ctx.stringValue("PickOutboundNumbersResponse.DialNumberPairs["+ i +"].Caller.City"));
			caller.setProvince(_ctx.stringValue("PickOutboundNumbersResponse.DialNumberPairs["+ i +"].Caller.Province"));
			dialNumberPair.setCaller(caller);

			dialNumberPairs.add(dialNumberPair);
		}
		pickOutboundNumbersResponse.setDialNumberPairs(dialNumberPairs);
	 
	 	return pickOutboundNumbersResponse;
	}
}