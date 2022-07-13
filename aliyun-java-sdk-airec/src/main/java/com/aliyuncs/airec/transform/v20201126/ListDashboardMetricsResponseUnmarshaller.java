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

package com.aliyuncs.airec.transform.v20201126;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20201126.ListDashboardMetricsResponse;
import com.aliyuncs.airec.model.v20201126.ListDashboardMetricsResponse.ResultItem;
import com.aliyuncs.airec.model.v20201126.ListDashboardMetricsResponse.ResultItem.DetailItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDashboardMetricsResponseUnmarshaller {

	public static ListDashboardMetricsResponse unmarshall(ListDashboardMetricsResponse listDashboardMetricsResponse, UnmarshallerContext _ctx) {
		
		listDashboardMetricsResponse.setCode(_ctx.stringValue("ListDashboardMetricsResponse.code"));
		listDashboardMetricsResponse.setRequestId(_ctx.stringValue("ListDashboardMetricsResponse.requestId"));
		listDashboardMetricsResponse.setMessage(_ctx.stringValue("ListDashboardMetricsResponse.message"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDashboardMetricsResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setTotal(_ctx.mapValue("ListDashboardMetricsResponse.result["+ i +"].total"));

			List<DetailItem> detail = new ArrayList<DetailItem>();
			for (int j = 0; j < _ctx.lengthValue("ListDashboardMetricsResponse.result["+ i +"].detail.Length"); j++) {
				DetailItem detailItem = new DetailItem();
				detailItem.setVal(_ctx.stringValue("ListDashboardMetricsResponse.result["+ i +"].detail["+ j +"].val"));
				detailItem.setStartTime(_ctx.stringValue("ListDashboardMetricsResponse.result["+ i +"].detail["+ j +"].startTime"));
				detailItem.setEndTime(_ctx.stringValue("ListDashboardMetricsResponse.result["+ i +"].detail["+ j +"].endTime"));

				detail.add(detailItem);
			}
			resultItem.setDetail(detail);

			result.add(resultItem);
		}
		listDashboardMetricsResponse.setResult(result);
	 
	 	return listDashboardMetricsResponse;
	}
}