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

package com.aliyuncs.aimath.model.v20241114;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateRelatedConversationRequest extends RpcAcsRequest<CreateRelatedConversationResponse> {
	   

	private String outerBizId;

	private String userId;

	private String exerciseCode;
	public CreateRelatedConversationRequest() {
		super("AIMath", "2024-11-14", "CreateRelatedConversation");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getOuterBizId() {
		return this.outerBizId;
	}

	public void setOuterBizId(String outerBizId) {
		this.outerBizId = outerBizId;
		if(outerBizId != null){
			putBodyParameter("OuterBizId", outerBizId);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putBodyParameter("UserId", userId);
		}
	}

	public String getExerciseCode() {
		return this.exerciseCode;
	}

	public void setExerciseCode(String exerciseCode) {
		this.exerciseCode = exerciseCode;
		if(exerciseCode != null){
			putBodyParameter("ExerciseCode", exerciseCode);
		}
	}

	@Override
	public Class<CreateRelatedConversationResponse> getResponseClass() {
		return CreateRelatedConversationResponse.class;
	}

}
