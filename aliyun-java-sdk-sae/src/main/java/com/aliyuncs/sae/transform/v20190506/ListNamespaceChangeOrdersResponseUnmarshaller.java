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

import com.aliyuncs.sae.model.v20190506.ListNamespaceChangeOrdersResponse;
import com.aliyuncs.sae.model.v20190506.ListNamespaceChangeOrdersResponse.Data;
import com.aliyuncs.sae.model.v20190506.ListNamespaceChangeOrdersResponse.Data.ChangeOrder;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNamespaceChangeOrdersResponseUnmarshaller {

	public static ListNamespaceChangeOrdersResponse unmarshall(ListNamespaceChangeOrdersResponse listNamespaceChangeOrdersResponse, UnmarshallerContext _ctx) {
		
		listNamespaceChangeOrdersResponse.setRequestId(_ctx.stringValue("ListNamespaceChangeOrdersResponse.RequestId"));
		listNamespaceChangeOrdersResponse.setErrorCode(_ctx.stringValue("ListNamespaceChangeOrdersResponse.ErrorCode"));
		listNamespaceChangeOrdersResponse.setSuccess(_ctx.booleanValue("ListNamespaceChangeOrdersResponse.Success"));
		listNamespaceChangeOrdersResponse.setCode(_ctx.stringValue("ListNamespaceChangeOrdersResponse.Code"));
		listNamespaceChangeOrdersResponse.setMessage(_ctx.stringValue("ListNamespaceChangeOrdersResponse.Message"));
		listNamespaceChangeOrdersResponse.setTraceId(_ctx.stringValue("ListNamespaceChangeOrdersResponse.TraceId"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("ListNamespaceChangeOrdersResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("ListNamespaceChangeOrdersResponse.Data.PageSize"));
		data.setTotalSize(_ctx.integerValue("ListNamespaceChangeOrdersResponse.Data.TotalSize"));

		List<ChangeOrder> changeOrderList = new ArrayList<ChangeOrder>();
		for (int i = 0; i < _ctx.lengthValue("ListNamespaceChangeOrdersResponse.Data.ChangeOrderList.Length"); i++) {
			ChangeOrder changeOrder = new ChangeOrder();
			changeOrder.setStatus(_ctx.integerValue("ListNamespaceChangeOrdersResponse.Data.ChangeOrderList["+ i +"].Status"));
			changeOrder.setFinishTime(_ctx.stringValue("ListNamespaceChangeOrdersResponse.Data.ChangeOrderList["+ i +"].FinishTime"));
			changeOrder.setNamespaceId(_ctx.stringValue("ListNamespaceChangeOrdersResponse.Data.ChangeOrderList["+ i +"].NamespaceId"));
			changeOrder.setCreateTime(_ctx.stringValue("ListNamespaceChangeOrdersResponse.Data.ChangeOrderList["+ i +"].CreateTime"));
			changeOrder.setUserId(_ctx.stringValue("ListNamespaceChangeOrdersResponse.Data.ChangeOrderList["+ i +"].UserId"));
			changeOrder.setSource(_ctx.stringValue("ListNamespaceChangeOrdersResponse.Data.ChangeOrderList["+ i +"].Source"));
			changeOrder.setCreateUserId(_ctx.stringValue("ListNamespaceChangeOrdersResponse.Data.ChangeOrderList["+ i +"].CreateUserId"));
			changeOrder.setBatchCount(_ctx.integerValue("ListNamespaceChangeOrdersResponse.Data.ChangeOrderList["+ i +"].BatchCount"));
			changeOrder.setCoTypeCode(_ctx.stringValue("ListNamespaceChangeOrdersResponse.Data.ChangeOrderList["+ i +"].CoTypeCode"));
			changeOrder.setChangeOrderId(_ctx.stringValue("ListNamespaceChangeOrdersResponse.Data.ChangeOrderList["+ i +"].ChangeOrderId"));
			changeOrder.setBatchType(_ctx.stringValue("ListNamespaceChangeOrdersResponse.Data.ChangeOrderList["+ i +"].BatchType"));
			changeOrder.setDescription(_ctx.stringValue("ListNamespaceChangeOrdersResponse.Data.ChangeOrderList["+ i +"].Description"));
			changeOrder.setGroupId(_ctx.stringValue("ListNamespaceChangeOrdersResponse.Data.ChangeOrderList["+ i +"].GroupId"));
			changeOrder.setCoType(_ctx.stringValue("ListNamespaceChangeOrdersResponse.Data.ChangeOrderList["+ i +"].CoType"));
			changeOrder.setPipelines(_ctx.stringValue("ListNamespaceChangeOrdersResponse.Data.ChangeOrderList["+ i +"].Pipelines"));

			changeOrderList.add(changeOrder);
		}
		data.setChangeOrderList(changeOrderList);
		listNamespaceChangeOrdersResponse.setData(data);
	 
	 	return listNamespaceChangeOrdersResponse;
	}
}