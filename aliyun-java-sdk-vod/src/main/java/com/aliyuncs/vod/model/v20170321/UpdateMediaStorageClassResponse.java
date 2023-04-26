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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.UpdateMediaStorageClassResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateMediaStorageClassResponse extends AcsResponse {

	private String requestId;

	private String status;

	private List<MediaForbiddenReasonDTO> forbiddenList;

	private List<String> ignoredList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<MediaForbiddenReasonDTO> getForbiddenList() {
		return this.forbiddenList;
	}

	public void setForbiddenList(List<MediaForbiddenReasonDTO> forbiddenList) {
		this.forbiddenList = forbiddenList;
	}

	public List<String> getIgnoredList() {
		return this.ignoredList;
	}

	public void setIgnoredList(List<String> ignoredList) {
		this.ignoredList = ignoredList;
	}

	public static class MediaForbiddenReasonDTO {

		private String mediaId;

		private String reason;

		public String getMediaId() {
			return this.mediaId;
		}

		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}
	}

	@Override
	public UpdateMediaStorageClassResponse getInstance(UnmarshallerContext context) {
		return	UpdateMediaStorageClassResponseUnmarshaller.unmarshall(this, context);
	}
}
