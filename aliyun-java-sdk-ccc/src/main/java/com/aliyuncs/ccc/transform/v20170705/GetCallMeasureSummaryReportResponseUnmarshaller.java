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

import com.aliyuncs.ccc.model.v20170705.GetCallMeasureSummaryReportResponse;
import com.aliyuncs.ccc.model.v20170705.GetCallMeasureSummaryReportResponse.NumberReports;
import com.aliyuncs.ccc.model.v20170705.GetCallMeasureSummaryReportResponse.NumberReports.NumberReport;
import com.aliyuncs.ccc.model.v20170705.GetCallMeasureSummaryReportResponse.SummaryReport;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCallMeasureSummaryReportResponseUnmarshaller {

	public static GetCallMeasureSummaryReportResponse unmarshall(GetCallMeasureSummaryReportResponse getCallMeasureSummaryReportResponse, UnmarshallerContext _ctx) {
		
		getCallMeasureSummaryReportResponse.setRequestId(_ctx.stringValue("GetCallMeasureSummaryReportResponse.RequestId"));
		getCallMeasureSummaryReportResponse.setHttpStatusCode(_ctx.integerValue("GetCallMeasureSummaryReportResponse.HttpStatusCode"));
		getCallMeasureSummaryReportResponse.setCode(_ctx.stringValue("GetCallMeasureSummaryReportResponse.Code"));
		getCallMeasureSummaryReportResponse.setMessage(_ctx.stringValue("GetCallMeasureSummaryReportResponse.Message"));
		getCallMeasureSummaryReportResponse.setSuccess(_ctx.booleanValue("GetCallMeasureSummaryReportResponse.Success"));

		SummaryReport summaryReport = new SummaryReport();
		summaryReport.setDay(_ctx.integerValue("GetCallMeasureSummaryReportResponse.SummaryReport.Day"));
		summaryReport.setYear(_ctx.integerValue("GetCallMeasureSummaryReportResponse.SummaryReport.Year"));
		summaryReport.setInboundDurationByMinute(_ctx.longValue("GetCallMeasureSummaryReportResponse.SummaryReport.InboundDurationByMinute"));
		summaryReport.setOutboundCount(_ctx.longValue("GetCallMeasureSummaryReportResponse.SummaryReport.OutboundCount"));
		summaryReport.setOutboundDurationByMinute(_ctx.longValue("GetCallMeasureSummaryReportResponse.SummaryReport.OutboundDurationByMinute"));
		summaryReport.setInboundCount(_ctx.longValue("GetCallMeasureSummaryReportResponse.SummaryReport.InboundCount"));
		summaryReport.setMonth(_ctx.integerValue("GetCallMeasureSummaryReportResponse.SummaryReport.Month"));
		getCallMeasureSummaryReportResponse.setSummaryReport(summaryReport);

		NumberReports numberReports = new NumberReports();
		numberReports.setPageNumber(_ctx.integerValue("GetCallMeasureSummaryReportResponse.NumberReports.PageNumber"));
		numberReports.setPageSize(_ctx.integerValue("GetCallMeasureSummaryReportResponse.NumberReports.PageSize"));
		numberReports.setTotalCount(_ctx.integerValue("GetCallMeasureSummaryReportResponse.NumberReports.TotalCount"));

		List<NumberReport> list = new ArrayList<NumberReport>();
		for (int i = 0; i < _ctx.lengthValue("GetCallMeasureSummaryReportResponse.NumberReports.List.Length"); i++) {
			NumberReport numberReport = new NumberReport();
			numberReport.setDay(_ctx.integerValue("GetCallMeasureSummaryReportResponse.NumberReports.List["+ i +"].Day"));
			numberReport.setYear(_ctx.integerValue("GetCallMeasureSummaryReportResponse.NumberReports.List["+ i +"].Year"));
			numberReport.setInboundDurationByMinute(_ctx.longValue("GetCallMeasureSummaryReportResponse.NumberReports.List["+ i +"].InboundDurationByMinute"));
			numberReport.setOutboundCount(_ctx.longValue("GetCallMeasureSummaryReportResponse.NumberReports.List["+ i +"].OutboundCount"));
			numberReport.setOutboundDurationByMinute(_ctx.longValue("GetCallMeasureSummaryReportResponse.NumberReports.List["+ i +"].OutboundDurationByMinute"));
			numberReport.setNumber(_ctx.stringValue("GetCallMeasureSummaryReportResponse.NumberReports.List["+ i +"].Number"));
			numberReport.setInboundCount(_ctx.longValue("GetCallMeasureSummaryReportResponse.NumberReports.List["+ i +"].InboundCount"));
			numberReport.setMonth(_ctx.integerValue("GetCallMeasureSummaryReportResponse.NumberReports.List["+ i +"].Month"));

			list.add(numberReport);
		}
		numberReports.setList(list);
		getCallMeasureSummaryReportResponse.setNumberReports(numberReports);
	 
	 	return getCallMeasureSummaryReportResponse;
	}
}