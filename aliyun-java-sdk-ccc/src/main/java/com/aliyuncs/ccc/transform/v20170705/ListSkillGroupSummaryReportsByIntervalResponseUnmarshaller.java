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

import com.aliyuncs.ccc.model.v20170705.ListSkillGroupSummaryReportsByIntervalResponse;
import com.aliyuncs.ccc.model.v20170705.ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport;
import com.aliyuncs.ccc.model.v20170705.ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.SkillGroupTimeIntervalReport;
import com.aliyuncs.ccc.model.v20170705.ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.SkillGroupTimeIntervalReport.SkillGroupSummaryReport;
import com.aliyuncs.ccc.model.v20170705.ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.SkillGroupTimeIntervalReport.SkillGroupSummaryReport.Inbound;
import com.aliyuncs.ccc.model.v20170705.ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.SkillGroupTimeIntervalReport.SkillGroupSummaryReport.Outbound;
import com.aliyuncs.ccc.model.v20170705.ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.SkillGroupTimeIntervalReport.SkillGroupSummaryReport.Overall;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSkillGroupSummaryReportsByIntervalResponseUnmarshaller {

	public static ListSkillGroupSummaryReportsByIntervalResponse unmarshall(ListSkillGroupSummaryReportsByIntervalResponse listSkillGroupSummaryReportsByIntervalResponse, UnmarshallerContext _ctx) {
		
		listSkillGroupSummaryReportsByIntervalResponse.setRequestId(_ctx.stringValue("ListSkillGroupSummaryReportsByIntervalResponse.RequestId"));
		listSkillGroupSummaryReportsByIntervalResponse.setHttpStatusCode(_ctx.integerValue("ListSkillGroupSummaryReportsByIntervalResponse.HttpStatusCode"));
		listSkillGroupSummaryReportsByIntervalResponse.setCode(_ctx.stringValue("ListSkillGroupSummaryReportsByIntervalResponse.Code"));
		listSkillGroupSummaryReportsByIntervalResponse.setMessage(_ctx.stringValue("ListSkillGroupSummaryReportsByIntervalResponse.Message"));
		listSkillGroupSummaryReportsByIntervalResponse.setSuccess(_ctx.booleanValue("ListSkillGroupSummaryReportsByIntervalResponse.Success"));

		PagedSkillGroupSummaryReport pagedSkillGroupSummaryReport = new PagedSkillGroupSummaryReport();
		pagedSkillGroupSummaryReport.setPageNumber(_ctx.integerValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.PageNumber"));
		pagedSkillGroupSummaryReport.setPageSize(_ctx.integerValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.PageSize"));
		pagedSkillGroupSummaryReport.setTotalCount(_ctx.integerValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.TotalCount"));

		List<SkillGroupTimeIntervalReport> list = new ArrayList<SkillGroupTimeIntervalReport>();
		for (int i = 0; i < _ctx.lengthValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List.Length"); i++) {
			SkillGroupTimeIntervalReport skillGroupTimeIntervalReport = new SkillGroupTimeIntervalReport();
			skillGroupTimeIntervalReport.setSkillGroupId(_ctx.stringValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].SkillGroupId"));

			List<SkillGroupSummaryReport> intervalList = new ArrayList<SkillGroupSummaryReport>();
			for (int j = 0; j < _ctx.lengthValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList.Length"); j++) {
				SkillGroupSummaryReport skillGroupSummaryReport = new SkillGroupSummaryReport();
				skillGroupSummaryReport.setTimestamp(_ctx.stringValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Timestamp"));
				skillGroupSummaryReport.setInstanceId(_ctx.stringValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].InstanceId"));
				skillGroupSummaryReport.setSkillGroupName(_ctx.stringValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].SkillGroupName"));
				skillGroupSummaryReport.setSkillGroupId(_ctx.stringValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].SkillGroupId"));

				Overall overall = new Overall();
				overall.setTotalLoggedInTime(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.TotalLoggedInTime"));
				overall.setTotalTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.TotalTalkTime"));
				overall.setOccupancyRate(_ctx.floatValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.OccupancyRate"));
				overall.setTotalWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.TotalWorkTime"));
				overall.setMaxWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.MaxWorkTime"));
				overall.setAverageWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.AverageWorkTime"));
				overall.setAverageTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.AverageTalkTime"));
				overall.setSatisfactionIndex(_ctx.floatValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.SatisfactionIndex"));
				overall.setSatisfactionSurveysOffered(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.SatisfactionSurveysOffered"));
				overall.setSatisfactionSurveysResponded(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.SatisfactionSurveysResponded"));
				overall.setMaxReadyTime(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.MaxReadyTime"));
				overall.setAverageReadyTime(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.AverageReadyTime"));
				overall.setTotalBreakTime(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.TotalBreakTime"));
				overall.setTotalReadyTime(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.TotalReadyTime"));
				overall.setMaxTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.MaxTalkTime"));
				overall.setTotalCalls(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.TotalCalls"));
				skillGroupSummaryReport.setOverall(overall);

				Inbound inbound = new Inbound();
				inbound.setAverageRingTime(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.AverageRingTime"));
				inbound.setCallsHandled(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.CallsHandled"));
				inbound.setTotalWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.TotalWorkTime"));
				inbound.setMaxWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.MaxWorkTime"));
				inbound.setQueueMaxWaitTimeDuration(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.QueueMaxWaitTimeDuration"));
				inbound.setAverageWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.AverageWorkTime"));
				inbound.setSatisfactionIndex(_ctx.floatValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.SatisfactionIndex"));
				inbound.setAnsweredByAgentOfQueueWaitTimeDuration(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.AnsweredByAgentOfQueueWaitTimeDuration"));
				inbound.setTotalRingTime(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.TotalRingTime"));
				inbound.setInComingQueueOfQueueCount(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.InComingQueueOfQueueCount"));
				inbound.setMaxTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.MaxTalkTime"));
				inbound.setMaxRingTime(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.MaxRingTime"));
				inbound.setTotalTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.TotalTalkTime"));
				inbound.setCallsOffered(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.CallsOffered"));
				inbound.setAbandonedInQueueOfQueueCount(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.AbandonedInQueueOfQueueCount"));
				inbound.setOverFlowInQueueOfQueueCount(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.OverFlowInQueueOfQueueCount"));
				inbound.setAnsweredByAgentOfQueueMaxWaitTimeDuration(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.AnsweredByAgentOfQueueMaxWaitTimeDuration"));
				inbound.setServiceLevel20(_ctx.floatValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.ServiceLevel20"));
				inbound.setAverageTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.AverageTalkTime"));
				inbound.setAnsweredByAgentOfQueueCount(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.AnsweredByAgentOfQueueCount"));
				inbound.setSatisfactionSurveysOffered(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.SatisfactionSurveysOffered"));
				inbound.setHandleRate(_ctx.floatValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.HandleRate"));
				inbound.setSatisfactionSurveysResponded(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.SatisfactionSurveysResponded"));
				inbound.setGiveUpByAgentOfQueueCount(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.GiveUpByAgentOfQueueCount"));
				inbound.setQueueWaitTimeDuration(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.QueueWaitTimeDuration"));
				skillGroupSummaryReport.setInbound(inbound);

				Outbound outbound = new Outbound();
				outbound.setTotalTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.TotalTalkTime"));
				outbound.setMaxDialingTime(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.MaxDialingTime"));
				outbound.setCallsDialed(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.CallsDialed"));
				outbound.setCallsAnswered(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.CallsAnswered"));
				outbound.setAnswerRate(_ctx.floatValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.AnswerRate"));
				outbound.setTotalWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.TotalWorkTime"));
				outbound.setMaxWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.MaxWorkTime"));
				outbound.setTotalDialingTime(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.TotalDialingTime"));
				outbound.setAverageTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.AverageTalkTime"));
				outbound.setAverageWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.AverageWorkTime"));
				outbound.setSatisfactionIndex(_ctx.floatValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.SatisfactionIndex"));
				outbound.setSatisfactionSurveysOffered(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.SatisfactionSurveysOffered"));
				outbound.setSatisfactionSurveysResponded(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.SatisfactionSurveysResponded"));
				outbound.setMaxTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.MaxTalkTime"));
				outbound.setAverageDialingTime(_ctx.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.AverageDialingTime"));
				skillGroupSummaryReport.setOutbound(outbound);

				intervalList.add(skillGroupSummaryReport);
			}
			skillGroupTimeIntervalReport.setIntervalList(intervalList);

			list.add(skillGroupTimeIntervalReport);
		}
		pagedSkillGroupSummaryReport.setList(list);
		listSkillGroupSummaryReportsByIntervalResponse.setPagedSkillGroupSummaryReport(pagedSkillGroupSummaryReport);
	 
	 	return listSkillGroupSummaryReportsByIntervalResponse;
	}
}