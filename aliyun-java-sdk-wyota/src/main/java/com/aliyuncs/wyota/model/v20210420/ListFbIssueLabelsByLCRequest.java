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

package com.aliyuncs.wyota.model.v20210420;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListFbIssueLabelsByLCRequest extends RpcAcsRequest<ListFbIssueLabelsByLCResponse> {
	   

	private String caller;

	private String languageType;
	public ListFbIssueLabelsByLCRequest() {
		super("wyota", "2021-04-20", "ListFbIssueLabelsByLC");
		setMethod(MethodType.POST);
	}

	public String getCaller() {
		return this.caller;
	}

	public void setCaller(String caller) {
		this.caller = caller;
		if(caller != null){
			putBodyParameter("Caller", caller);
		}
	}

	public String getLanguageType() {
		return this.languageType;
	}

	public void setLanguageType(String languageType) {
		this.languageType = languageType;
		if(languageType != null){
			putBodyParameter("LanguageType", languageType);
		}
	}

	@Override
	public Class<ListFbIssueLabelsByLCResponse> getResponseClass() {
		return ListFbIssueLabelsByLCResponse.class;
	}

}
