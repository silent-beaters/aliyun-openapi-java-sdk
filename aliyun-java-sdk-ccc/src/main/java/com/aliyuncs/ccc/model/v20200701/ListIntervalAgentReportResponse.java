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

package com.aliyuncs.ccc.model.v20200701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.ListIntervalAgentReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListIntervalAgentReportResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private List<DataItem> data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Long statsTime;

		private Inbound inbound;

		private Outbound outbound;

		private Overall overall;

		private Back2Back back2Back;

		private Internal internal;

		public Long getStatsTime() {
			return this.statsTime;
		}

		public void setStatsTime(Long statsTime) {
			this.statsTime = statsTime;
		}

		public Inbound getInbound() {
			return this.inbound;
		}

		public void setInbound(Inbound inbound) {
			this.inbound = inbound;
		}

		public Outbound getOutbound() {
			return this.outbound;
		}

		public void setOutbound(Outbound outbound) {
			this.outbound = outbound;
		}

		public Overall getOverall() {
			return this.overall;
		}

		public void setOverall(Overall overall) {
			this.overall = overall;
		}

		public Back2Back getBack2Back() {
			return this.back2Back;
		}

		public void setBack2Back(Back2Back back2Back) {
			this.back2Back = back2Back;
		}

		public Internal getInternal() {
			return this.internal;
		}

		public void setInternal(Internal internal) {
			this.internal = internal;
		}

		public static class Inbound {

			private Float averageRingTime;

			private Long callsHandled;

			private Long totalWorkTime;

			private Long callsAttendedTransferOut;

			private Long maxWorkTime;

			private Long totalHoldTime;

			private Float averageWorkTime;

			private Long callsBlindTransferIn;

			private Float satisfactionIndex;

			private Long callsRinged;

			private Long callsAttendedTransferIn;

			private Long callsBlindTransferOut;

			private Long totalRingTime;

			private Long maxTalkTime;

			private Long maxRingTime;

			private Long totalTalkTime;

			private Long callsOffered;

			private Long maxHoldTime;

			private Float averageTalkTime;

			private Float satisfactionRate;

			private Long callsHold;

			private Long satisfactionSurveysOffered;

			private Float handleRate;

			private Long satisfactionSurveysResponded;

			private Float averageHoldTime;

			private Float averageFirstResponseTime;

			private Float averageResponseTime;

			private Float serviceLevel15;

			private Long totalMessagesSent;

			private Long totalMessagesSentByAgent;

			private Long totalMessagesSentByCustomer;

			private List<AccessChannelTypeDetail> accessChannelTypeDetails;

			public Float getAverageRingTime() {
				return this.averageRingTime;
			}

			public void setAverageRingTime(Float averageRingTime) {
				this.averageRingTime = averageRingTime;
			}

			public Long getCallsHandled() {
				return this.callsHandled;
			}

			public void setCallsHandled(Long callsHandled) {
				this.callsHandled = callsHandled;
			}

			public Long getTotalWorkTime() {
				return this.totalWorkTime;
			}

			public void setTotalWorkTime(Long totalWorkTime) {
				this.totalWorkTime = totalWorkTime;
			}

			public Long getCallsAttendedTransferOut() {
				return this.callsAttendedTransferOut;
			}

			public void setCallsAttendedTransferOut(Long callsAttendedTransferOut) {
				this.callsAttendedTransferOut = callsAttendedTransferOut;
			}

			public Long getMaxWorkTime() {
				return this.maxWorkTime;
			}

			public void setMaxWorkTime(Long maxWorkTime) {
				this.maxWorkTime = maxWorkTime;
			}

			public Long getTotalHoldTime() {
				return this.totalHoldTime;
			}

			public void setTotalHoldTime(Long totalHoldTime) {
				this.totalHoldTime = totalHoldTime;
			}

			public Float getAverageWorkTime() {
				return this.averageWorkTime;
			}

			public void setAverageWorkTime(Float averageWorkTime) {
				this.averageWorkTime = averageWorkTime;
			}

			public Long getCallsBlindTransferIn() {
				return this.callsBlindTransferIn;
			}

			public void setCallsBlindTransferIn(Long callsBlindTransferIn) {
				this.callsBlindTransferIn = callsBlindTransferIn;
			}

			public Float getSatisfactionIndex() {
				return this.satisfactionIndex;
			}

			public void setSatisfactionIndex(Float satisfactionIndex) {
				this.satisfactionIndex = satisfactionIndex;
			}

			public Long getCallsRinged() {
				return this.callsRinged;
			}

			public void setCallsRinged(Long callsRinged) {
				this.callsRinged = callsRinged;
			}

			public Long getCallsAttendedTransferIn() {
				return this.callsAttendedTransferIn;
			}

			public void setCallsAttendedTransferIn(Long callsAttendedTransferIn) {
				this.callsAttendedTransferIn = callsAttendedTransferIn;
			}

			public Long getCallsBlindTransferOut() {
				return this.callsBlindTransferOut;
			}

			public void setCallsBlindTransferOut(Long callsBlindTransferOut) {
				this.callsBlindTransferOut = callsBlindTransferOut;
			}

			public Long getTotalRingTime() {
				return this.totalRingTime;
			}

			public void setTotalRingTime(Long totalRingTime) {
				this.totalRingTime = totalRingTime;
			}

			public Long getMaxTalkTime() {
				return this.maxTalkTime;
			}

			public void setMaxTalkTime(Long maxTalkTime) {
				this.maxTalkTime = maxTalkTime;
			}

			public Long getMaxRingTime() {
				return this.maxRingTime;
			}

			public void setMaxRingTime(Long maxRingTime) {
				this.maxRingTime = maxRingTime;
			}

			public Long getTotalTalkTime() {
				return this.totalTalkTime;
			}

			public void setTotalTalkTime(Long totalTalkTime) {
				this.totalTalkTime = totalTalkTime;
			}

			public Long getCallsOffered() {
				return this.callsOffered;
			}

			public void setCallsOffered(Long callsOffered) {
				this.callsOffered = callsOffered;
			}

			public Long getMaxHoldTime() {
				return this.maxHoldTime;
			}

			public void setMaxHoldTime(Long maxHoldTime) {
				this.maxHoldTime = maxHoldTime;
			}

			public Float getAverageTalkTime() {
				return this.averageTalkTime;
			}

			public void setAverageTalkTime(Float averageTalkTime) {
				this.averageTalkTime = averageTalkTime;
			}

			public Float getSatisfactionRate() {
				return this.satisfactionRate;
			}

			public void setSatisfactionRate(Float satisfactionRate) {
				this.satisfactionRate = satisfactionRate;
			}

			public Long getCallsHold() {
				return this.callsHold;
			}

			public void setCallsHold(Long callsHold) {
				this.callsHold = callsHold;
			}

			public Long getSatisfactionSurveysOffered() {
				return this.satisfactionSurveysOffered;
			}

			public void setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
				this.satisfactionSurveysOffered = satisfactionSurveysOffered;
			}

			public Float getHandleRate() {
				return this.handleRate;
			}

			public void setHandleRate(Float handleRate) {
				this.handleRate = handleRate;
			}

			public Long getSatisfactionSurveysResponded() {
				return this.satisfactionSurveysResponded;
			}

			public void setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
				this.satisfactionSurveysResponded = satisfactionSurveysResponded;
			}

			public Float getAverageHoldTime() {
				return this.averageHoldTime;
			}

			public void setAverageHoldTime(Float averageHoldTime) {
				this.averageHoldTime = averageHoldTime;
			}

			public Float getAverageFirstResponseTime() {
				return this.averageFirstResponseTime;
			}

			public void setAverageFirstResponseTime(Float averageFirstResponseTime) {
				this.averageFirstResponseTime = averageFirstResponseTime;
			}

			public Float getAverageResponseTime() {
				return this.averageResponseTime;
			}

			public void setAverageResponseTime(Float averageResponseTime) {
				this.averageResponseTime = averageResponseTime;
			}

			public Float getServiceLevel15() {
				return this.serviceLevel15;
			}

			public void setServiceLevel15(Float serviceLevel15) {
				this.serviceLevel15 = serviceLevel15;
			}

			public Long getTotalMessagesSent() {
				return this.totalMessagesSent;
			}

			public void setTotalMessagesSent(Long totalMessagesSent) {
				this.totalMessagesSent = totalMessagesSent;
			}

			public Long getTotalMessagesSentByAgent() {
				return this.totalMessagesSentByAgent;
			}

			public void setTotalMessagesSentByAgent(Long totalMessagesSentByAgent) {
				this.totalMessagesSentByAgent = totalMessagesSentByAgent;
			}

			public Long getTotalMessagesSentByCustomer() {
				return this.totalMessagesSentByCustomer;
			}

			public void setTotalMessagesSentByCustomer(Long totalMessagesSentByCustomer) {
				this.totalMessagesSentByCustomer = totalMessagesSentByCustomer;
			}

			public List<AccessChannelTypeDetail> getAccessChannelTypeDetails() {
				return this.accessChannelTypeDetails;
			}

			public void setAccessChannelTypeDetails(List<AccessChannelTypeDetail> accessChannelTypeDetails) {
				this.accessChannelTypeDetails = accessChannelTypeDetails;
			}

			public static class AccessChannelTypeDetail {

				private String accessChannelType;

				private Long callsOffered;

				public String getAccessChannelType() {
					return this.accessChannelType;
				}

				public void setAccessChannelType(String accessChannelType) {
					this.accessChannelType = accessChannelType;
				}

				public Long getCallsOffered() {
					return this.callsOffered;
				}

				public void setCallsOffered(Long callsOffered) {
					this.callsOffered = callsOffered;
				}
			}
		}

		public static class Outbound {

			private Float averageRingTime;

			private Long callsDialed;

			private Long callsAnswered;

			private Long totalWorkTime;

			private Long callsAttendedTransferOut;

			private Long maxWorkTime;

			private Long totalDialingTime;

			private Long totalHoldTime;

			private Float averageWorkTime;

			private Long callsBlindTransferIn;

			private Float satisfactionIndex;

			private Long callsRinged;

			private Long callsAttendedTransferIn;

			private Long callsBlindTransferOut;

			private Long totalRingTime;

			private Long maxTalkTime;

			private Long maxRingTime;

			private Long totalTalkTime;

			private Long maxDialingTime;

			private Float answerRate;

			private Long maxHoldTime;

			private Float averageTalkTime;

			private Float satisfactionRate;

			private Long callsHold;

			private Long satisfactionSurveysOffered;

			private Long satisfactionSurveysResponded;

			private Float averageHoldTime;

			private Float averageDialingTime;

			public Float getAverageRingTime() {
				return this.averageRingTime;
			}

			public void setAverageRingTime(Float averageRingTime) {
				this.averageRingTime = averageRingTime;
			}

			public Long getCallsDialed() {
				return this.callsDialed;
			}

			public void setCallsDialed(Long callsDialed) {
				this.callsDialed = callsDialed;
			}

			public Long getCallsAnswered() {
				return this.callsAnswered;
			}

			public void setCallsAnswered(Long callsAnswered) {
				this.callsAnswered = callsAnswered;
			}

			public Long getTotalWorkTime() {
				return this.totalWorkTime;
			}

			public void setTotalWorkTime(Long totalWorkTime) {
				this.totalWorkTime = totalWorkTime;
			}

			public Long getCallsAttendedTransferOut() {
				return this.callsAttendedTransferOut;
			}

			public void setCallsAttendedTransferOut(Long callsAttendedTransferOut) {
				this.callsAttendedTransferOut = callsAttendedTransferOut;
			}

			public Long getMaxWorkTime() {
				return this.maxWorkTime;
			}

			public void setMaxWorkTime(Long maxWorkTime) {
				this.maxWorkTime = maxWorkTime;
			}

			public Long getTotalDialingTime() {
				return this.totalDialingTime;
			}

			public void setTotalDialingTime(Long totalDialingTime) {
				this.totalDialingTime = totalDialingTime;
			}

			public Long getTotalHoldTime() {
				return this.totalHoldTime;
			}

			public void setTotalHoldTime(Long totalHoldTime) {
				this.totalHoldTime = totalHoldTime;
			}

			public Float getAverageWorkTime() {
				return this.averageWorkTime;
			}

			public void setAverageWorkTime(Float averageWorkTime) {
				this.averageWorkTime = averageWorkTime;
			}

			public Long getCallsBlindTransferIn() {
				return this.callsBlindTransferIn;
			}

			public void setCallsBlindTransferIn(Long callsBlindTransferIn) {
				this.callsBlindTransferIn = callsBlindTransferIn;
			}

			public Float getSatisfactionIndex() {
				return this.satisfactionIndex;
			}

			public void setSatisfactionIndex(Float satisfactionIndex) {
				this.satisfactionIndex = satisfactionIndex;
			}

			public Long getCallsRinged() {
				return this.callsRinged;
			}

			public void setCallsRinged(Long callsRinged) {
				this.callsRinged = callsRinged;
			}

			public Long getCallsAttendedTransferIn() {
				return this.callsAttendedTransferIn;
			}

			public void setCallsAttendedTransferIn(Long callsAttendedTransferIn) {
				this.callsAttendedTransferIn = callsAttendedTransferIn;
			}

			public Long getCallsBlindTransferOut() {
				return this.callsBlindTransferOut;
			}

			public void setCallsBlindTransferOut(Long callsBlindTransferOut) {
				this.callsBlindTransferOut = callsBlindTransferOut;
			}

			public Long getTotalRingTime() {
				return this.totalRingTime;
			}

			public void setTotalRingTime(Long totalRingTime) {
				this.totalRingTime = totalRingTime;
			}

			public Long getMaxTalkTime() {
				return this.maxTalkTime;
			}

			public void setMaxTalkTime(Long maxTalkTime) {
				this.maxTalkTime = maxTalkTime;
			}

			public Long getMaxRingTime() {
				return this.maxRingTime;
			}

			public void setMaxRingTime(Long maxRingTime) {
				this.maxRingTime = maxRingTime;
			}

			public Long getTotalTalkTime() {
				return this.totalTalkTime;
			}

			public void setTotalTalkTime(Long totalTalkTime) {
				this.totalTalkTime = totalTalkTime;
			}

			public Long getMaxDialingTime() {
				return this.maxDialingTime;
			}

			public void setMaxDialingTime(Long maxDialingTime) {
				this.maxDialingTime = maxDialingTime;
			}

			public Float getAnswerRate() {
				return this.answerRate;
			}

			public void setAnswerRate(Float answerRate) {
				this.answerRate = answerRate;
			}

			public Long getMaxHoldTime() {
				return this.maxHoldTime;
			}

			public void setMaxHoldTime(Long maxHoldTime) {
				this.maxHoldTime = maxHoldTime;
			}

			public Float getAverageTalkTime() {
				return this.averageTalkTime;
			}

			public void setAverageTalkTime(Float averageTalkTime) {
				this.averageTalkTime = averageTalkTime;
			}

			public Float getSatisfactionRate() {
				return this.satisfactionRate;
			}

			public void setSatisfactionRate(Float satisfactionRate) {
				this.satisfactionRate = satisfactionRate;
			}

			public Long getCallsHold() {
				return this.callsHold;
			}

			public void setCallsHold(Long callsHold) {
				this.callsHold = callsHold;
			}

			public Long getSatisfactionSurveysOffered() {
				return this.satisfactionSurveysOffered;
			}

			public void setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
				this.satisfactionSurveysOffered = satisfactionSurveysOffered;
			}

			public Long getSatisfactionSurveysResponded() {
				return this.satisfactionSurveysResponded;
			}

			public void setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
				this.satisfactionSurveysResponded = satisfactionSurveysResponded;
			}

			public Float getAverageHoldTime() {
				return this.averageHoldTime;
			}

			public void setAverageHoldTime(Float averageHoldTime) {
				this.averageHoldTime = averageHoldTime;
			}

			public Float getAverageDialingTime() {
				return this.averageDialingTime;
			}

			public void setAverageDialingTime(Float averageDialingTime) {
				this.averageDialingTime = averageDialingTime;
			}
		}

		public static class Overall {

			private Float occupancyRate;

			private Long totalWorkTime;

			private Long maxWorkTime;

			private Long totalHoldTime;

			private Float averageWorkTime;

			private Long maxBreakTime;

			private Float satisfactionIndex;

			private Long maxReadyTime;

			private Long maxTalkTime;

			private Long totalReadyTime;

			private Long lastCheckoutTime;

			private Long lastCheckOutTime;

			private Long totalCalls;

			private Long totalLoggedInTime;

			private Long totalTalkTime;

			private Long maxHoldTime;

			private Float averageBreakTime;

			private Float averageTalkTime;

			private Float satisfactionRate;

			private Long satisfactionSurveysOffered;

			private Long satisfactionSurveysResponded;

			private Float averageHoldTime;

			private Float averageReadyTime;

			private Long totalBreakTime;

			private Long totalOnSiteOnlineTime;

			private Long totalOffSiteOnlineTime;

			private Long totalOfficePhoneOnlineTime;

			private Long totalOutboundScenarioTime;

			private Long totalOutboundScenarioReadyTime;

			private Long firstCheckInTime;

			private Long totalOfficePhoneLoggedInTime;

			private Long totalOffSiteLoggedInTime;

			private Long totalOnSiteLoggedInTime;

			private Long totalOutboundScenarioLoggedInTime;

			private List<BreakCodeDetail> breakCodeDetailList;

			public Float getOccupancyRate() {
				return this.occupancyRate;
			}

			public void setOccupancyRate(Float occupancyRate) {
				this.occupancyRate = occupancyRate;
			}

			public Long getTotalWorkTime() {
				return this.totalWorkTime;
			}

			public void setTotalWorkTime(Long totalWorkTime) {
				this.totalWorkTime = totalWorkTime;
			}

			public Long getMaxWorkTime() {
				return this.maxWorkTime;
			}

			public void setMaxWorkTime(Long maxWorkTime) {
				this.maxWorkTime = maxWorkTime;
			}

			public Long getTotalHoldTime() {
				return this.totalHoldTime;
			}

			public void setTotalHoldTime(Long totalHoldTime) {
				this.totalHoldTime = totalHoldTime;
			}

			public Float getAverageWorkTime() {
				return this.averageWorkTime;
			}

			public void setAverageWorkTime(Float averageWorkTime) {
				this.averageWorkTime = averageWorkTime;
			}

			public Long getMaxBreakTime() {
				return this.maxBreakTime;
			}

			public void setMaxBreakTime(Long maxBreakTime) {
				this.maxBreakTime = maxBreakTime;
			}

			public Float getSatisfactionIndex() {
				return this.satisfactionIndex;
			}

			public void setSatisfactionIndex(Float satisfactionIndex) {
				this.satisfactionIndex = satisfactionIndex;
			}

			public Long getMaxReadyTime() {
				return this.maxReadyTime;
			}

			public void setMaxReadyTime(Long maxReadyTime) {
				this.maxReadyTime = maxReadyTime;
			}

			public Long getMaxTalkTime() {
				return this.maxTalkTime;
			}

			public void setMaxTalkTime(Long maxTalkTime) {
				this.maxTalkTime = maxTalkTime;
			}

			public Long getTotalReadyTime() {
				return this.totalReadyTime;
			}

			public void setTotalReadyTime(Long totalReadyTime) {
				this.totalReadyTime = totalReadyTime;
			}

			public Long getLastCheckoutTime() {
				return this.lastCheckoutTime;
			}

			public void setLastCheckoutTime(Long lastCheckoutTime) {
				this.lastCheckoutTime = lastCheckoutTime;
			}

			public Long getLastCheckOutTime() {
				return this.lastCheckOutTime;
			}

			public void setLastCheckOutTime(Long lastCheckOutTime) {
				this.lastCheckOutTime = lastCheckOutTime;
			}

			public Long getTotalCalls() {
				return this.totalCalls;
			}

			public void setTotalCalls(Long totalCalls) {
				this.totalCalls = totalCalls;
			}

			public Long getTotalLoggedInTime() {
				return this.totalLoggedInTime;
			}

			public void setTotalLoggedInTime(Long totalLoggedInTime) {
				this.totalLoggedInTime = totalLoggedInTime;
			}

			public Long getTotalTalkTime() {
				return this.totalTalkTime;
			}

			public void setTotalTalkTime(Long totalTalkTime) {
				this.totalTalkTime = totalTalkTime;
			}

			public Long getMaxHoldTime() {
				return this.maxHoldTime;
			}

			public void setMaxHoldTime(Long maxHoldTime) {
				this.maxHoldTime = maxHoldTime;
			}

			public Float getAverageBreakTime() {
				return this.averageBreakTime;
			}

			public void setAverageBreakTime(Float averageBreakTime) {
				this.averageBreakTime = averageBreakTime;
			}

			public Float getAverageTalkTime() {
				return this.averageTalkTime;
			}

			public void setAverageTalkTime(Float averageTalkTime) {
				this.averageTalkTime = averageTalkTime;
			}

			public Float getSatisfactionRate() {
				return this.satisfactionRate;
			}

			public void setSatisfactionRate(Float satisfactionRate) {
				this.satisfactionRate = satisfactionRate;
			}

			public Long getSatisfactionSurveysOffered() {
				return this.satisfactionSurveysOffered;
			}

			public void setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
				this.satisfactionSurveysOffered = satisfactionSurveysOffered;
			}

			public Long getSatisfactionSurveysResponded() {
				return this.satisfactionSurveysResponded;
			}

			public void setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
				this.satisfactionSurveysResponded = satisfactionSurveysResponded;
			}

			public Float getAverageHoldTime() {
				return this.averageHoldTime;
			}

			public void setAverageHoldTime(Float averageHoldTime) {
				this.averageHoldTime = averageHoldTime;
			}

			public Float getAverageReadyTime() {
				return this.averageReadyTime;
			}

			public void setAverageReadyTime(Float averageReadyTime) {
				this.averageReadyTime = averageReadyTime;
			}

			public Long getTotalBreakTime() {
				return this.totalBreakTime;
			}

			public void setTotalBreakTime(Long totalBreakTime) {
				this.totalBreakTime = totalBreakTime;
			}

			public Long getTotalOnSiteOnlineTime() {
				return this.totalOnSiteOnlineTime;
			}

			public void setTotalOnSiteOnlineTime(Long totalOnSiteOnlineTime) {
				this.totalOnSiteOnlineTime = totalOnSiteOnlineTime;
			}

			public Long getTotalOffSiteOnlineTime() {
				return this.totalOffSiteOnlineTime;
			}

			public void setTotalOffSiteOnlineTime(Long totalOffSiteOnlineTime) {
				this.totalOffSiteOnlineTime = totalOffSiteOnlineTime;
			}

			public Long getTotalOfficePhoneOnlineTime() {
				return this.totalOfficePhoneOnlineTime;
			}

			public void setTotalOfficePhoneOnlineTime(Long totalOfficePhoneOnlineTime) {
				this.totalOfficePhoneOnlineTime = totalOfficePhoneOnlineTime;
			}

			public Long getTotalOutboundScenarioTime() {
				return this.totalOutboundScenarioTime;
			}

			public void setTotalOutboundScenarioTime(Long totalOutboundScenarioTime) {
				this.totalOutboundScenarioTime = totalOutboundScenarioTime;
			}

			public Long getTotalOutboundScenarioReadyTime() {
				return this.totalOutboundScenarioReadyTime;
			}

			public void setTotalOutboundScenarioReadyTime(Long totalOutboundScenarioReadyTime) {
				this.totalOutboundScenarioReadyTime = totalOutboundScenarioReadyTime;
			}

			public Long getFirstCheckInTime() {
				return this.firstCheckInTime;
			}

			public void setFirstCheckInTime(Long firstCheckInTime) {
				this.firstCheckInTime = firstCheckInTime;
			}

			public Long getTotalOfficePhoneLoggedInTime() {
				return this.totalOfficePhoneLoggedInTime;
			}

			public void setTotalOfficePhoneLoggedInTime(Long totalOfficePhoneLoggedInTime) {
				this.totalOfficePhoneLoggedInTime = totalOfficePhoneLoggedInTime;
			}

			public Long getTotalOffSiteLoggedInTime() {
				return this.totalOffSiteLoggedInTime;
			}

			public void setTotalOffSiteLoggedInTime(Long totalOffSiteLoggedInTime) {
				this.totalOffSiteLoggedInTime = totalOffSiteLoggedInTime;
			}

			public Long getTotalOnSiteLoggedInTime() {
				return this.totalOnSiteLoggedInTime;
			}

			public void setTotalOnSiteLoggedInTime(Long totalOnSiteLoggedInTime) {
				this.totalOnSiteLoggedInTime = totalOnSiteLoggedInTime;
			}

			public Long getTotalOutboundScenarioLoggedInTime() {
				return this.totalOutboundScenarioLoggedInTime;
			}

			public void setTotalOutboundScenarioLoggedInTime(Long totalOutboundScenarioLoggedInTime) {
				this.totalOutboundScenarioLoggedInTime = totalOutboundScenarioLoggedInTime;
			}

			public List<BreakCodeDetail> getBreakCodeDetailList() {
				return this.breakCodeDetailList;
			}

			public void setBreakCodeDetailList(List<BreakCodeDetail> breakCodeDetailList) {
				this.breakCodeDetailList = breakCodeDetailList;
			}

			public static class BreakCodeDetail {

				private String breakCode;

				private Long count;

				private Long duration;

				public String getBreakCode() {
					return this.breakCode;
				}

				public void setBreakCode(String breakCode) {
					this.breakCode = breakCode;
				}

				public Long getCount() {
					return this.count;
				}

				public void setCount(Long count) {
					this.count = count;
				}

				public Long getDuration() {
					return this.duration;
				}

				public void setDuration(Long duration) {
					this.duration = duration;
				}
			}
		}

		public static class Back2Back {

			private Long callsDialed;

			private Float answerRate;

			private Long callsAnswered;

			private Long totalTalkTime;

			private Long maxTalkTime;

			private Float averageTalkTime;

			private Long totalRingTime;

			private Long maxRingTime;

			private Float averageRingTime;

			private Long totalCustomerRingTime;

			private Long maxCustomerRingTime;

			private Float averageCustomerRingTime;

			private Long callsAgentHandled;

			private Float agentHandleRate;

			private Long callsCustomerAnswered;

			private Float customerAnswerRate;

			public Long getCallsDialed() {
				return this.callsDialed;
			}

			public void setCallsDialed(Long callsDialed) {
				this.callsDialed = callsDialed;
			}

			public Float getAnswerRate() {
				return this.answerRate;
			}

			public void setAnswerRate(Float answerRate) {
				this.answerRate = answerRate;
			}

			public Long getCallsAnswered() {
				return this.callsAnswered;
			}

			public void setCallsAnswered(Long callsAnswered) {
				this.callsAnswered = callsAnswered;
			}

			public Long getTotalTalkTime() {
				return this.totalTalkTime;
			}

			public void setTotalTalkTime(Long totalTalkTime) {
				this.totalTalkTime = totalTalkTime;
			}

			public Long getMaxTalkTime() {
				return this.maxTalkTime;
			}

			public void setMaxTalkTime(Long maxTalkTime) {
				this.maxTalkTime = maxTalkTime;
			}

			public Float getAverageTalkTime() {
				return this.averageTalkTime;
			}

			public void setAverageTalkTime(Float averageTalkTime) {
				this.averageTalkTime = averageTalkTime;
			}

			public Long getTotalRingTime() {
				return this.totalRingTime;
			}

			public void setTotalRingTime(Long totalRingTime) {
				this.totalRingTime = totalRingTime;
			}

			public Long getMaxRingTime() {
				return this.maxRingTime;
			}

			public void setMaxRingTime(Long maxRingTime) {
				this.maxRingTime = maxRingTime;
			}

			public Float getAverageRingTime() {
				return this.averageRingTime;
			}

			public void setAverageRingTime(Float averageRingTime) {
				this.averageRingTime = averageRingTime;
			}

			public Long getTotalCustomerRingTime() {
				return this.totalCustomerRingTime;
			}

			public void setTotalCustomerRingTime(Long totalCustomerRingTime) {
				this.totalCustomerRingTime = totalCustomerRingTime;
			}

			public Long getMaxCustomerRingTime() {
				return this.maxCustomerRingTime;
			}

			public void setMaxCustomerRingTime(Long maxCustomerRingTime) {
				this.maxCustomerRingTime = maxCustomerRingTime;
			}

			public Float getAverageCustomerRingTime() {
				return this.averageCustomerRingTime;
			}

			public void setAverageCustomerRingTime(Float averageCustomerRingTime) {
				this.averageCustomerRingTime = averageCustomerRingTime;
			}

			public Long getCallsAgentHandled() {
				return this.callsAgentHandled;
			}

			public void setCallsAgentHandled(Long callsAgentHandled) {
				this.callsAgentHandled = callsAgentHandled;
			}

			public Float getAgentHandleRate() {
				return this.agentHandleRate;
			}

			public void setAgentHandleRate(Float agentHandleRate) {
				this.agentHandleRate = agentHandleRate;
			}

			public Long getCallsCustomerAnswered() {
				return this.callsCustomerAnswered;
			}

			public void setCallsCustomerAnswered(Long callsCustomerAnswered) {
				this.callsCustomerAnswered = callsCustomerAnswered;
			}

			public Float getCustomerAnswerRate() {
				return this.customerAnswerRate;
			}

			public void setCustomerAnswerRate(Float customerAnswerRate) {
				this.customerAnswerRate = customerAnswerRate;
			}
		}

		public static class Internal {

			private Float averageTalkTime;

			private Long callsAnswered;

			private Long callsDialed;

			private Long callsHandled;

			private Long callsOffered;

			private Long callsTalked;

			public Float getAverageTalkTime() {
				return this.averageTalkTime;
			}

			public void setAverageTalkTime(Float averageTalkTime) {
				this.averageTalkTime = averageTalkTime;
			}

			public Long getCallsAnswered() {
				return this.callsAnswered;
			}

			public void setCallsAnswered(Long callsAnswered) {
				this.callsAnswered = callsAnswered;
			}

			public Long getCallsDialed() {
				return this.callsDialed;
			}

			public void setCallsDialed(Long callsDialed) {
				this.callsDialed = callsDialed;
			}

			public Long getCallsHandled() {
				return this.callsHandled;
			}

			public void setCallsHandled(Long callsHandled) {
				this.callsHandled = callsHandled;
			}

			public Long getCallsOffered() {
				return this.callsOffered;
			}

			public void setCallsOffered(Long callsOffered) {
				this.callsOffered = callsOffered;
			}

			public Long getCallsTalked() {
				return this.callsTalked;
			}

			public void setCallsTalked(Long callsTalked) {
				this.callsTalked = callsTalked;
			}
		}
	}

	@Override
	public ListIntervalAgentReportResponse getInstance(UnmarshallerContext context) {
		return	ListIntervalAgentReportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
