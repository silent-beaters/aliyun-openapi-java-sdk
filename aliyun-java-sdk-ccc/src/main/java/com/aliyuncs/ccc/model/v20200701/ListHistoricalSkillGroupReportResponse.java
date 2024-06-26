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
import com.aliyuncs.ccc.transform.v20200701.ListHistoricalSkillGroupReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListHistoricalSkillGroupReportResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<Items> list;

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<Items> getList() {
			return this.list;
		}

		public void setList(List<Items> list) {
			this.list = list;
		}

		public static class Items {

			private String skillGroupName;

			private String skillGroupId;

			private Inbound inbound;

			private Outbound outbound;

			private Overall overall;

			private Back2Back back2Back;

			public String getSkillGroupName() {
				return this.skillGroupName;
			}

			public void setSkillGroupName(String skillGroupName) {
				this.skillGroupName = skillGroupName;
			}

			public String getSkillGroupId() {
				return this.skillGroupId;
			}

			public void setSkillGroupId(String skillGroupId) {
				this.skillGroupId = skillGroupId;
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

			public static class Inbound {

				private Float averageRingTime;

				private Long callsOverflow;

				private Long callsAbandonedInRing;

				private Long callsHandled;

				private Long totalWorkTime;

				private Long totalAbandonedInRingTime;

				private Long maxWorkTime;

				private Long callsAttendedTransferOut;

				private Float averageWaitTime;

				private Long totalHoldTime;

				private Long maxAbandonTime;

				private Float averageWorkTime;

				private Long callsQueued;

				private Long callsBlindTransferIn;

				private Float satisfactionIndex;

				private Float averageAbandonedInRingTime;

				private Float averageAbandonTime;

				private Long callsRinged;

				private Long callsBlindTransferOut;

				private Long callsAttendedTransferIn;

				private Long callsAbandoned;

				private Long maxAbandonedInQueueTime;

				private Long totalWaitTime;

				private Long totalRingTime;

				private Long maxTalkTime;

				private Long maxRingTime;

				private Float abandonRate;

				private Long totalTalkTime;

				private Long totalAbandonTime;

				private Long callsOffered;

				private Long maxAbandonedInRingTime;

				private Long maxWaitTime;

				private Float averageAbandonedInQueueTime;

				private Float serviceLevel20;

				private Long maxHoldTime;

				private Float satisfactionRate;

				private Float averageTalkTime;

				private Long callsHold;

				private Long satisfactionSurveysOffered;

				private Float handleRate;

				private Long callsTimeout;

				private Long satisfactionSurveysResponded;

				private Float averageHoldTime;

				private Long totalAbandonedInQueueTime;

				private Long callsAbandonedInQueue;

				private Long callsQueuingTimeout;

				private Long callsQueuingOverflow;

				private Float averageFirstResponseTime;

				private Float averageResponseTime;

				private Long callsQueuingFailed;

				private Float serviceLevel15;

				private Float serviceLevel30;

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

				public Long getCallsOverflow() {
					return this.callsOverflow;
				}

				public void setCallsOverflow(Long callsOverflow) {
					this.callsOverflow = callsOverflow;
				}

				public Long getCallsAbandonedInRing() {
					return this.callsAbandonedInRing;
				}

				public void setCallsAbandonedInRing(Long callsAbandonedInRing) {
					this.callsAbandonedInRing = callsAbandonedInRing;
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

				public Long getTotalAbandonedInRingTime() {
					return this.totalAbandonedInRingTime;
				}

				public void setTotalAbandonedInRingTime(Long totalAbandonedInRingTime) {
					this.totalAbandonedInRingTime = totalAbandonedInRingTime;
				}

				public Long getMaxWorkTime() {
					return this.maxWorkTime;
				}

				public void setMaxWorkTime(Long maxWorkTime) {
					this.maxWorkTime = maxWorkTime;
				}

				public Long getCallsAttendedTransferOut() {
					return this.callsAttendedTransferOut;
				}

				public void setCallsAttendedTransferOut(Long callsAttendedTransferOut) {
					this.callsAttendedTransferOut = callsAttendedTransferOut;
				}

				public Float getAverageWaitTime() {
					return this.averageWaitTime;
				}

				public void setAverageWaitTime(Float averageWaitTime) {
					this.averageWaitTime = averageWaitTime;
				}

				public Long getTotalHoldTime() {
					return this.totalHoldTime;
				}

				public void setTotalHoldTime(Long totalHoldTime) {
					this.totalHoldTime = totalHoldTime;
				}

				public Long getMaxAbandonTime() {
					return this.maxAbandonTime;
				}

				public void setMaxAbandonTime(Long maxAbandonTime) {
					this.maxAbandonTime = maxAbandonTime;
				}

				public Float getAverageWorkTime() {
					return this.averageWorkTime;
				}

				public void setAverageWorkTime(Float averageWorkTime) {
					this.averageWorkTime = averageWorkTime;
				}

				public Long getCallsQueued() {
					return this.callsQueued;
				}

				public void setCallsQueued(Long callsQueued) {
					this.callsQueued = callsQueued;
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

				public Float getAverageAbandonedInRingTime() {
					return this.averageAbandonedInRingTime;
				}

				public void setAverageAbandonedInRingTime(Float averageAbandonedInRingTime) {
					this.averageAbandonedInRingTime = averageAbandonedInRingTime;
				}

				public Float getAverageAbandonTime() {
					return this.averageAbandonTime;
				}

				public void setAverageAbandonTime(Float averageAbandonTime) {
					this.averageAbandonTime = averageAbandonTime;
				}

				public Long getCallsRinged() {
					return this.callsRinged;
				}

				public void setCallsRinged(Long callsRinged) {
					this.callsRinged = callsRinged;
				}

				public Long getCallsBlindTransferOut() {
					return this.callsBlindTransferOut;
				}

				public void setCallsBlindTransferOut(Long callsBlindTransferOut) {
					this.callsBlindTransferOut = callsBlindTransferOut;
				}

				public Long getCallsAttendedTransferIn() {
					return this.callsAttendedTransferIn;
				}

				public void setCallsAttendedTransferIn(Long callsAttendedTransferIn) {
					this.callsAttendedTransferIn = callsAttendedTransferIn;
				}

				public Long getCallsAbandoned() {
					return this.callsAbandoned;
				}

				public void setCallsAbandoned(Long callsAbandoned) {
					this.callsAbandoned = callsAbandoned;
				}

				public Long getMaxAbandonedInQueueTime() {
					return this.maxAbandonedInQueueTime;
				}

				public void setMaxAbandonedInQueueTime(Long maxAbandonedInQueueTime) {
					this.maxAbandonedInQueueTime = maxAbandonedInQueueTime;
				}

				public Long getTotalWaitTime() {
					return this.totalWaitTime;
				}

				public void setTotalWaitTime(Long totalWaitTime) {
					this.totalWaitTime = totalWaitTime;
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

				public Float getAbandonRate() {
					return this.abandonRate;
				}

				public void setAbandonRate(Float abandonRate) {
					this.abandonRate = abandonRate;
				}

				public Long getTotalTalkTime() {
					return this.totalTalkTime;
				}

				public void setTotalTalkTime(Long totalTalkTime) {
					this.totalTalkTime = totalTalkTime;
				}

				public Long getTotalAbandonTime() {
					return this.totalAbandonTime;
				}

				public void setTotalAbandonTime(Long totalAbandonTime) {
					this.totalAbandonTime = totalAbandonTime;
				}

				public Long getCallsOffered() {
					return this.callsOffered;
				}

				public void setCallsOffered(Long callsOffered) {
					this.callsOffered = callsOffered;
				}

				public Long getMaxAbandonedInRingTime() {
					return this.maxAbandonedInRingTime;
				}

				public void setMaxAbandonedInRingTime(Long maxAbandonedInRingTime) {
					this.maxAbandonedInRingTime = maxAbandonedInRingTime;
				}

				public Long getMaxWaitTime() {
					return this.maxWaitTime;
				}

				public void setMaxWaitTime(Long maxWaitTime) {
					this.maxWaitTime = maxWaitTime;
				}

				public Float getAverageAbandonedInQueueTime() {
					return this.averageAbandonedInQueueTime;
				}

				public void setAverageAbandonedInQueueTime(Float averageAbandonedInQueueTime) {
					this.averageAbandonedInQueueTime = averageAbandonedInQueueTime;
				}

				public Float getServiceLevel20() {
					return this.serviceLevel20;
				}

				public void setServiceLevel20(Float serviceLevel20) {
					this.serviceLevel20 = serviceLevel20;
				}

				public Long getMaxHoldTime() {
					return this.maxHoldTime;
				}

				public void setMaxHoldTime(Long maxHoldTime) {
					this.maxHoldTime = maxHoldTime;
				}

				public Float getSatisfactionRate() {
					return this.satisfactionRate;
				}

				public void setSatisfactionRate(Float satisfactionRate) {
					this.satisfactionRate = satisfactionRate;
				}

				public Float getAverageTalkTime() {
					return this.averageTalkTime;
				}

				public void setAverageTalkTime(Float averageTalkTime) {
					this.averageTalkTime = averageTalkTime;
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

				public Long getCallsTimeout() {
					return this.callsTimeout;
				}

				public void setCallsTimeout(Long callsTimeout) {
					this.callsTimeout = callsTimeout;
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

				public Long getTotalAbandonedInQueueTime() {
					return this.totalAbandonedInQueueTime;
				}

				public void setTotalAbandonedInQueueTime(Long totalAbandonedInQueueTime) {
					this.totalAbandonedInQueueTime = totalAbandonedInQueueTime;
				}

				public Long getCallsAbandonedInQueue() {
					return this.callsAbandonedInQueue;
				}

				public void setCallsAbandonedInQueue(Long callsAbandonedInQueue) {
					this.callsAbandonedInQueue = callsAbandonedInQueue;
				}

				public Long getCallsQueuingTimeout() {
					return this.callsQueuingTimeout;
				}

				public void setCallsQueuingTimeout(Long callsQueuingTimeout) {
					this.callsQueuingTimeout = callsQueuingTimeout;
				}

				public Long getCallsQueuingOverflow() {
					return this.callsQueuingOverflow;
				}

				public void setCallsQueuingOverflow(Long callsQueuingOverflow) {
					this.callsQueuingOverflow = callsQueuingOverflow;
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

				public Long getCallsQueuingFailed() {
					return this.callsQueuingFailed;
				}

				public void setCallsQueuingFailed(Long callsQueuingFailed) {
					this.callsQueuingFailed = callsQueuingFailed;
				}

				public Float getServiceLevel15() {
					return this.serviceLevel15;
				}

				public void setServiceLevel15(Float serviceLevel15) {
					this.serviceLevel15 = serviceLevel15;
				}

				public Float getServiceLevel30() {
					return this.serviceLevel30;
				}

				public void setServiceLevel30(Float serviceLevel30) {
					this.serviceLevel30 = serviceLevel30;
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

				private Long totalTalkTime;

				private Long totalLoggedInTime;

				private Float occupancyRate;

				private Long totalWorkTime;

				private Long maxHoldTime;

				private Long maxWorkTime;

				private Float averageBreakTime;

				private Long totalHoldTime;

				private Float satisfactionRate;

				private Long maxBreakTime;

				private Float averageWorkTime;

				private Float averageTalkTime;

				private Float satisfactionIndex;

				private Long satisfactionSurveysOffered;

				private Long satisfactionSurveysResponded;

				private Long maxReadyTime;

				private Float averageReadyTime;

				private Float averageHoldTime;

				private Long totalReadyTime;

				private Long totalBreakTime;

				private Long maxTalkTime;

				private Long totalCalls;

				private List<BreakCodeDetail> breakCodeDetailList;

				public Long getTotalTalkTime() {
					return this.totalTalkTime;
				}

				public void setTotalTalkTime(Long totalTalkTime) {
					this.totalTalkTime = totalTalkTime;
				}

				public Long getTotalLoggedInTime() {
					return this.totalLoggedInTime;
				}

				public void setTotalLoggedInTime(Long totalLoggedInTime) {
					this.totalLoggedInTime = totalLoggedInTime;
				}

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

				public Long getMaxHoldTime() {
					return this.maxHoldTime;
				}

				public void setMaxHoldTime(Long maxHoldTime) {
					this.maxHoldTime = maxHoldTime;
				}

				public Long getMaxWorkTime() {
					return this.maxWorkTime;
				}

				public void setMaxWorkTime(Long maxWorkTime) {
					this.maxWorkTime = maxWorkTime;
				}

				public Float getAverageBreakTime() {
					return this.averageBreakTime;
				}

				public void setAverageBreakTime(Float averageBreakTime) {
					this.averageBreakTime = averageBreakTime;
				}

				public Long getTotalHoldTime() {
					return this.totalHoldTime;
				}

				public void setTotalHoldTime(Long totalHoldTime) {
					this.totalHoldTime = totalHoldTime;
				}

				public Float getSatisfactionRate() {
					return this.satisfactionRate;
				}

				public void setSatisfactionRate(Float satisfactionRate) {
					this.satisfactionRate = satisfactionRate;
				}

				public Long getMaxBreakTime() {
					return this.maxBreakTime;
				}

				public void setMaxBreakTime(Long maxBreakTime) {
					this.maxBreakTime = maxBreakTime;
				}

				public Float getAverageWorkTime() {
					return this.averageWorkTime;
				}

				public void setAverageWorkTime(Float averageWorkTime) {
					this.averageWorkTime = averageWorkTime;
				}

				public Float getAverageTalkTime() {
					return this.averageTalkTime;
				}

				public void setAverageTalkTime(Float averageTalkTime) {
					this.averageTalkTime = averageTalkTime;
				}

				public Float getSatisfactionIndex() {
					return this.satisfactionIndex;
				}

				public void setSatisfactionIndex(Float satisfactionIndex) {
					this.satisfactionIndex = satisfactionIndex;
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

				public Long getMaxReadyTime() {
					return this.maxReadyTime;
				}

				public void setMaxReadyTime(Long maxReadyTime) {
					this.maxReadyTime = maxReadyTime;
				}

				public Float getAverageReadyTime() {
					return this.averageReadyTime;
				}

				public void setAverageReadyTime(Float averageReadyTime) {
					this.averageReadyTime = averageReadyTime;
				}

				public Float getAverageHoldTime() {
					return this.averageHoldTime;
				}

				public void setAverageHoldTime(Float averageHoldTime) {
					this.averageHoldTime = averageHoldTime;
				}

				public Long getTotalReadyTime() {
					return this.totalReadyTime;
				}

				public void setTotalReadyTime(Long totalReadyTime) {
					this.totalReadyTime = totalReadyTime;
				}

				public Long getTotalBreakTime() {
					return this.totalBreakTime;
				}

				public void setTotalBreakTime(Long totalBreakTime) {
					this.totalBreakTime = totalBreakTime;
				}

				public Long getMaxTalkTime() {
					return this.maxTalkTime;
				}

				public void setMaxTalkTime(Long maxTalkTime) {
					this.maxTalkTime = maxTalkTime;
				}

				public Long getTotalCalls() {
					return this.totalCalls;
				}

				public void setTotalCalls(Long totalCalls) {
					this.totalCalls = totalCalls;
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
		}
	}

	@Override
	public ListHistoricalSkillGroupReportResponse getInstance(UnmarshallerContext context) {
		return	ListHistoricalSkillGroupReportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
