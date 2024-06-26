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

import com.aliyuncs.ccc.model.v20170705.GetInstanceSummaryReportSinceMidnightResponse;
import com.aliyuncs.ccc.model.v20170705.GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport;
import com.aliyuncs.ccc.model.v20170705.GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound;
import com.aliyuncs.ccc.model.v20170705.GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound;
import com.aliyuncs.ccc.model.v20170705.GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceSummaryReportSinceMidnightResponseUnmarshaller {

	public static GetInstanceSummaryReportSinceMidnightResponse unmarshall(GetInstanceSummaryReportSinceMidnightResponse getInstanceSummaryReportSinceMidnightResponse, UnmarshallerContext _ctx) {
		
		getInstanceSummaryReportSinceMidnightResponse.setRequestId(_ctx.stringValue("GetInstanceSummaryReportSinceMidnightResponse.RequestId"));
		getInstanceSummaryReportSinceMidnightResponse.setHttpStatusCode(_ctx.integerValue("GetInstanceSummaryReportSinceMidnightResponse.HttpStatusCode"));
		getInstanceSummaryReportSinceMidnightResponse.setCode(_ctx.stringValue("GetInstanceSummaryReportSinceMidnightResponse.Code"));
		getInstanceSummaryReportSinceMidnightResponse.setMessage(_ctx.stringValue("GetInstanceSummaryReportSinceMidnightResponse.Message"));
		getInstanceSummaryReportSinceMidnightResponse.setSuccess(_ctx.booleanValue("GetInstanceSummaryReportSinceMidnightResponse.Success"));

		InstanceSummaryReport instanceSummaryReport = new InstanceSummaryReport();
		instanceSummaryReport.setInstanceId(_ctx.stringValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.InstanceId"));
		instanceSummaryReport.setTimestamp(_ctx.stringValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Timestamp"));

		Overall overall = new Overall();
		overall.setTotalLoggedInTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.TotalLoggedInTime"));
		overall.setTotalTalkTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.TotalTalkTime"));
		overall.setOccupancyRate(_ctx.floatValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.OccupancyRate"));
		overall.setTotalWorkTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.TotalWorkTime"));
		overall.setMaxWorkTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.MaxWorkTime"));
		overall.setAverageWorkTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.AverageWorkTime"));
		overall.setAverageTalkTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.AverageTalkTime"));
		overall.setSatisfactionIndex(_ctx.floatValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.SatisfactionIndex"));
		overall.setSatisfactionSurveysOffered(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.SatisfactionSurveysOffered"));
		overall.setSatisfactionSurveysResponded(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.SatisfactionSurveysResponded"));
		overall.setMaxReadyTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.MaxReadyTime"));
		overall.setAverageReadyTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.AverageReadyTime"));
		overall.setTotalBreakTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.TotalBreakTime"));
		overall.setTotalReadyTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.TotalReadyTime"));
		overall.setMaxTalkTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.MaxTalkTime"));
		overall.setTotalCalls(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.TotalCalls"));
		instanceSummaryReport.setOverall(overall);

		Inbound inbound = new Inbound();
		inbound.setCallsIncomingLine(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.CallsIncomingLine"));
		inbound.setAverageRingTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.AverageRingTime"));
		inbound.setCallsHandled(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.CallsHandled"));
		inbound.setTotalWorkTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.TotalWorkTime"));
		inbound.setCallsAbandonedInIVR(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.CallsAbandonedInIVR"));
		inbound.setMaxWorkTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.MaxWorkTime"));
		inbound.setAverageWaitTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.AverageWaitTime"));
		inbound.setCallsIncomingQueue(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.CallsIncomingQueue"));
		inbound.setAverageWorkTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.AverageWorkTime"));
		inbound.setSatisfactionIndex(_ctx.floatValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.SatisfactionIndex"));
		inbound.setTotalWaitTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.TotalWaitTime"));
		inbound.setTotalRingTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.TotalRingTime"));
		inbound.setMaxTalkTime(_ctx.stringValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.MaxTalkTime"));
		inbound.setMaxRingTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.MaxRingTime"));
		inbound.setCallsIncomingIVR(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.CallsIncomingIVR"));
		inbound.setTotalTalkTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.TotalTalkTime"));
		inbound.setCallsOffered(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.CallsOffered"));
		inbound.setMaxWaitTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.MaxWaitTime"));
		inbound.setServiceLevel20(_ctx.floatValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.ServiceLevel20"));
		inbound.setAverageTalkTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.AverageTalkTime"));
		inbound.setSatisfactionSurveysOffered(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.SatisfactionSurveysOffered"));
		inbound.setHandleRate(_ctx.floatValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.HandleRate"));
		inbound.setSatisfactionSurveysResponded(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.SatisfactionSurveysResponded"));
		inbound.setCallsAbandonedInQueue(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.CallsAbandonedInQueue"));
		instanceSummaryReport.setInbound(inbound);

		Outbound outbound = new Outbound();
		outbound.setTotalTalkTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.TotalTalkTime"));
		outbound.setMaxDialingTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.MaxDialingTime"));
		outbound.setCallsDialed(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.CallsDialed"));
		outbound.setCallsAnswered(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.CallsAnswered"));
		outbound.setAnswerRate(_ctx.floatValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.AnswerRate"));
		outbound.setTotalWorkTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.TotalWorkTime"));
		outbound.setMaxWorkTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.MaxWorkTime"));
		outbound.setTotalDialingTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.TotalDialingTime"));
		outbound.setAverageTalkTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.AverageTalkTime"));
		outbound.setAverageWorkTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.AverageWorkTime"));
		outbound.setSatisfactionIndex(_ctx.floatValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.SatisfactionIndex"));
		outbound.setSatisfactionSurveysOffered(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.SatisfactionSurveysOffered"));
		outbound.setSatisfactionSurveysResponded(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.SatisfactionSurveysResponded"));
		outbound.setMaxTalkTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.MaxTalkTime"));
		outbound.setAverageDialingTime(_ctx.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.AverageDialingTime"));
		instanceSummaryReport.setOutbound(outbound);
		getInstanceSummaryReportSinceMidnightResponse.setInstanceSummaryReport(instanceSummaryReport);
	 
	 	return getInstanceSummaryReportSinceMidnightResponse;
	}
}