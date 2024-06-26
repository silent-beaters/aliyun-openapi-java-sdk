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
import com.aliyuncs.ccc.transform.v20170705.DownloadAllTypeRecordingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DownloadAllTypeRecordingResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private List<MediaDownloadParam> mediaDownloadParamList;

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

	public List<MediaDownloadParam> getMediaDownloadParamList() {
		return this.mediaDownloadParamList;
	}

	public void setMediaDownloadParamList(List<MediaDownloadParam> mediaDownloadParamList) {
		this.mediaDownloadParamList = mediaDownloadParamList;
	}

	public static class MediaDownloadParam {

		private String signatureUrl;

		private String fileName;

		public String getSignatureUrl() {
			return this.signatureUrl;
		}

		public void setSignatureUrl(String signatureUrl) {
			this.signatureUrl = signatureUrl;
		}

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
	}

	@Override
	public DownloadAllTypeRecordingResponse getInstance(UnmarshallerContext context) {
		return	DownloadAllTypeRecordingResponseUnmarshaller.unmarshall(this, context);
	}
}
