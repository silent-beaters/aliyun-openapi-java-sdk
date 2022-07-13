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

package com.aliyuncs.airec.model.v20201126;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20201126.CreateRankingModelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateRankingModelResponse extends AcsResponse {

	private String code;

	private String requestId;

	private String message;

	private Result result;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String rankingModelId;

		private String gmtModified;

		private String gmtCreate;

		private Map<Object,Object> meta;

		public String getRankingModelId() {
			return this.rankingModelId;
		}

		public void setRankingModelId(String rankingModelId) {
			this.rankingModelId = rankingModelId;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Map<Object,Object> getMeta() {
			return this.meta;
		}

		public void setMeta(Map<Object,Object> meta) {
			this.meta = meta;
		}
	}

	@Override
	public CreateRankingModelResponse getInstance(UnmarshallerContext context) {
		return	CreateRankingModelResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
