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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.ListIngressesResponse;
import com.aliyuncs.sae.model.v20190506.ListIngressesResponse.Data;
import com.aliyuncs.sae.model.v20190506.ListIngressesResponse.Data.Ingress;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIngressesResponseUnmarshaller {

	public static ListIngressesResponse unmarshall(ListIngressesResponse listIngressesResponse, UnmarshallerContext _ctx) {
		
		listIngressesResponse.setRequestId(_ctx.stringValue("ListIngressesResponse.RequestId"));
		listIngressesResponse.setMessage(_ctx.stringValue("ListIngressesResponse.Message"));
		listIngressesResponse.setTraceId(_ctx.stringValue("ListIngressesResponse.TraceId"));
		listIngressesResponse.setErrorCode(_ctx.stringValue("ListIngressesResponse.ErrorCode"));
		listIngressesResponse.setCode(_ctx.stringValue("ListIngressesResponse.Code"));
		listIngressesResponse.setSuccess(_ctx.booleanValue("ListIngressesResponse.Success"));

		Data data = new Data();

		List<Ingress> ingressList = new ArrayList<Ingress>();
		for (int i = 0; i < _ctx.lengthValue("ListIngressesResponse.Data.IngressList.Length"); i++) {
			Ingress ingress = new Ingress();
			ingress.setSlbId(_ctx.stringValue("ListIngressesResponse.Data.IngressList["+ i +"].SlbId"));
			ingress.setNamespaceId(_ctx.stringValue("ListIngressesResponse.Data.IngressList["+ i +"].NamespaceId"));
			ingress.setDescription(_ctx.stringValue("ListIngressesResponse.Data.IngressList["+ i +"].Description"));
			ingress.setListenerPort(_ctx.stringValue("ListIngressesResponse.Data.IngressList["+ i +"].ListenerPort"));
			ingress.setSlbType(_ctx.stringValue("ListIngressesResponse.Data.IngressList["+ i +"].SlbType"));
			ingress.setCertId(_ctx.stringValue("ListIngressesResponse.Data.IngressList["+ i +"].CertId"));
			ingress.setName(_ctx.stringValue("ListIngressesResponse.Data.IngressList["+ i +"].Name"));
			ingress.setId(_ctx.longValue("ListIngressesResponse.Data.IngressList["+ i +"].Id"));
			ingress.setLoadBalanceType(_ctx.stringValue("ListIngressesResponse.Data.IngressList["+ i +"].LoadBalanceType"));
			ingress.setListenerProtocol(_ctx.stringValue("ListIngressesResponse.Data.IngressList["+ i +"].ListenerProtocol"));

			ingressList.add(ingress);
		}
		data.setIngressList(ingressList);
		listIngressesResponse.setData(data);
	 
	 	return listIngressesResponse;
	}
}