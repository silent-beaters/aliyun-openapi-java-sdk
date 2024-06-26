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

package com.aliyuncs.ccc.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20170705.GetCallMeasureSummaryReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCallMeasureSummaryReportResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private SummaryReport summaryReport;

	private NumberReports numberReports;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public SummaryReport getSummaryReport() {
		return this.summaryReport;
	}

	public void setSummaryReport(SummaryReport summaryReport) {
		this.summaryReport = summaryReport;
	}

	public NumberReports getNumberReports() {
		return this.numberReports;
	}

	public void setNumberReports(NumberReports numberReports) {
		this.numberReports = numberReports;
	}

	public static class SummaryReport {

		private Integer day;

		private Integer year;

		private Long inboundDurationByMinute;

		private Long outboundCount;

		private Long outboundDurationByMinute;

		private Long inboundCount;

		private Integer month;

		public Integer getDay() {
			return this.day;
		}

		public void setDay(Integer day) {
			this.day = day;
		}

		public Integer getYear() {
			return this.year;
		}

		public void setYear(Integer year) {
			this.year = year;
		}

		public Long getInboundDurationByMinute() {
			return this.inboundDurationByMinute;
		}

		public void setInboundDurationByMinute(Long inboundDurationByMinute) {
			this.inboundDurationByMinute = inboundDurationByMinute;
		}

		public Long getOutboundCount() {
			return this.outboundCount;
		}

		public void setOutboundCount(Long outboundCount) {
			this.outboundCount = outboundCount;
		}

		public Long getOutboundDurationByMinute() {
			return this.outboundDurationByMinute;
		}

		public void setOutboundDurationByMinute(Long outboundDurationByMinute) {
			this.outboundDurationByMinute = outboundDurationByMinute;
		}

		public Long getInboundCount() {
			return this.inboundCount;
		}

		public void setInboundCount(Long inboundCount) {
			this.inboundCount = inboundCount;
		}

		public Integer getMonth() {
			return this.month;
		}

		public void setMonth(Integer month) {
			this.month = month;
		}
	}

	public static class NumberReports {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<NumberReport> list;

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

		public List<NumberReport> getList() {
			return this.list;
		}

		public void setList(List<NumberReport> list) {
			this.list = list;
		}

		public static class NumberReport {

			private Integer day;

			private Integer year;

			private Long inboundDurationByMinute;

			private Long outboundCount;

			private Long outboundDurationByMinute;

			private String number;

			private Long inboundCount;

			private Integer month;

			public Integer getDay() {
				return this.day;
			}

			public void setDay(Integer day) {
				this.day = day;
			}

			public Integer getYear() {
				return this.year;
			}

			public void setYear(Integer year) {
				this.year = year;
			}

			public Long getInboundDurationByMinute() {
				return this.inboundDurationByMinute;
			}

			public void setInboundDurationByMinute(Long inboundDurationByMinute) {
				this.inboundDurationByMinute = inboundDurationByMinute;
			}

			public Long getOutboundCount() {
				return this.outboundCount;
			}

			public void setOutboundCount(Long outboundCount) {
				this.outboundCount = outboundCount;
			}

			public Long getOutboundDurationByMinute() {
				return this.outboundDurationByMinute;
			}

			public void setOutboundDurationByMinute(Long outboundDurationByMinute) {
				this.outboundDurationByMinute = outboundDurationByMinute;
			}

			public String getNumber() {
				return this.number;
			}

			public void setNumber(String number) {
				this.number = number;
			}

			public Long getInboundCount() {
				return this.inboundCount;
			}

			public void setInboundCount(Long inboundCount) {
				this.inboundCount = inboundCount;
			}

			public Integer getMonth() {
				return this.month;
			}

			public void setMonth(Integer month) {
				this.month = month;
			}
		}
	}

	@Override
	public GetCallMeasureSummaryReportResponse getInstance(UnmarshallerContext context) {
		return	GetCallMeasureSummaryReportResponseUnmarshaller.unmarshall(this, context);
	}
}
