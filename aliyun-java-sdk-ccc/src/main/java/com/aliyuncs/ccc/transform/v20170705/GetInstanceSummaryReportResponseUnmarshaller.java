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

import com.aliyuncs.ccc.model.v20170705.GetInstanceSummaryReportResponse;
import com.aliyuncs.ccc.model.v20170705.GetInstanceSummaryReportResponse.InstanceSummaryReport;
import com.aliyuncs.ccc.model.v20170705.GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound;
import com.aliyuncs.ccc.model.v20170705.GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound;
import com.aliyuncs.ccc.model.v20170705.GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceSummaryReportResponseUnmarshaller {

	public static GetInstanceSummaryReportResponse unmarshall(GetInstanceSummaryReportResponse getInstanceSummaryReportResponse, UnmarshallerContext _ctx) {
		
		getInstanceSummaryReportResponse.setRequestId(_ctx.stringValue("GetInstanceSummaryReportResponse.RequestId"));
		getInstanceSummaryReportResponse.setHttpStatusCode(_ctx.integerValue("GetInstanceSummaryReportResponse.HttpStatusCode"));
		getInstanceSummaryReportResponse.setCode(_ctx.stringValue("GetInstanceSummaryReportResponse.Code"));
		getInstanceSummaryReportResponse.setMessage(_ctx.stringValue("GetInstanceSummaryReportResponse.Message"));
		getInstanceSummaryReportResponse.setSuccess(_ctx.booleanValue("GetInstanceSummaryReportResponse.Success"));

		InstanceSummaryReport instanceSummaryReport = new InstanceSummaryReport();
		instanceSummaryReport.setInstanceId(_ctx.stringValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.InstanceId"));

		Overall overall = new Overall();
		overall.setTotalLoggedInTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.TotalLoggedInTime"));
		overall.setTotalTalkTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.TotalTalkTime"));
		overall.setOccupancyRate(_ctx.floatValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.OccupancyRate"));
		overall.setTotalWorkTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.TotalWorkTime"));
		overall.setMaxWorkTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.MaxWorkTime"));
		overall.setAverageWorkTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.AverageWorkTime"));
		overall.setAverageTalkTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.AverageTalkTime"));
		overall.setSatisfactionIndex(_ctx.floatValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.SatisfactionIndex"));
		overall.setSatisfactionSurveysOffered(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.SatisfactionSurveysOffered"));
		overall.setSatisfactionSurveysResponded(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.SatisfactionSurveysResponded"));
		overall.setMaxReadyTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.MaxReadyTime"));
		overall.setAverageReadyTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.AverageReadyTime"));
		overall.setTotalBreakTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.TotalBreakTime"));
		overall.setTotalReadyTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.TotalReadyTime"));
		overall.setMaxTalkTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.MaxTalkTime"));
		overall.setTotalCalls(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.TotalCalls"));
		instanceSummaryReport.setOverall(overall);

		Inbound inbound = new Inbound();
		inbound.setCallsIncomingLine(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.CallsIncomingLine"));
		inbound.setAverageRingTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.AverageRingTime"));
		inbound.setCallsHandled(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.CallsHandled"));
		inbound.setTotalWorkTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.TotalWorkTime"));
		inbound.setCallsAbandonedInIVR(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.CallsAbandonedInIVR"));
		inbound.setMaxWorkTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.MaxWorkTime"));
		inbound.setAverageWaitTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.AverageWaitTime"));
		inbound.setCallsIncomingQueue(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.CallsIncomingQueue"));
		inbound.setAverageWorkTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.AverageWorkTime"));
		inbound.setSatisfactionIndex(_ctx.floatValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.SatisfactionIndex"));
		inbound.setTotalWaitTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.TotalWaitTime"));
		inbound.setTotalRingTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.TotalRingTime"));
		inbound.setMaxTalkTime(_ctx.stringValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.MaxTalkTime"));
		inbound.setMaxRingTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.MaxRingTime"));
		inbound.setCallsIncomingIVR(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.CallsIncomingIVR"));
		inbound.setTotalTalkTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.TotalTalkTime"));
		inbound.setCallsOffered(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.CallsOffered"));
		inbound.setMaxWaitTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.MaxWaitTime"));
		inbound.setServiceLevel20(_ctx.floatValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.ServiceLevel20"));
		inbound.setAverageTalkTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.AverageTalkTime"));
		inbound.setSatisfactionSurveysOffered(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.SatisfactionSurveysOffered"));
		inbound.setHandleRate(_ctx.floatValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.HandleRate"));
		inbound.setSatisfactionSurveysResponded(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.SatisfactionSurveysResponded"));
		inbound.setCallsAbandonedInQueue(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.CallsAbandonedInQueue"));
		instanceSummaryReport.setInbound(inbound);

		Outbound outbound = new Outbound();
		outbound.setTotalTalkTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.TotalTalkTime"));
		outbound.setMaxDialingTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.MaxDialingTime"));
		outbound.setCallsDialed(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.CallsDialed"));
		outbound.setCallsAnswered(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.CallsAnswered"));
		outbound.setAnswerRate(_ctx.floatValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.AnswerRate"));
		outbound.setTotalWorkTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.TotalWorkTime"));
		outbound.setMaxWorkTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.MaxWorkTime"));
		outbound.setTotalDialingTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.TotalDialingTime"));
		outbound.setAverageTalkTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.AverageTalkTime"));
		outbound.setAverageWorkTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.AverageWorkTime"));
		outbound.setSatisfactionIndex(_ctx.floatValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.SatisfactionIndex"));
		outbound.setSatisfactionSurveysOffered(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.SatisfactionSurveysOffered"));
		outbound.setSatisfactionSurveysResponded(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.SatisfactionSurveysResponded"));
		outbound.setMaxTalkTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.MaxTalkTime"));
		outbound.setAverageDialingTime(_ctx.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.AverageDialingTime"));
		instanceSummaryReport.setOutbound(outbound);
		getInstanceSummaryReportResponse.setInstanceSummaryReport(instanceSummaryReport);
	 
	 	return getInstanceSummaryReportResponse;
	}
}