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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ExecuteScriptRequest extends RpcAcsRequest<ExecuteScriptResponse> {
	   

	private String script;

	private Long tid;

	private Integer dbId;

	private Boolean logic;
	public ExecuteScriptRequest() {
		super("dms-enterprise", "2018-11-01", "ExecuteScript", "dms-enterprise");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getScript() {
		return this.script;
	}

	public void setScript(String script) {
		this.script = script;
		if(script != null){
			putQueryParameter("Script", script);
		}
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
		}
	}

	public Integer getDbId() {
		return this.dbId;
	}

	public void setDbId(Integer dbId) {
		this.dbId = dbId;
		if(dbId != null){
			putQueryParameter("DbId", dbId.toString());
		}
	}

	public Boolean getLogic() {
		return this.logic;
	}

	public void setLogic(Boolean logic) {
		this.logic = logic;
		if(logic != null){
			putQueryParameter("Logic", logic.toString());
		}
	}

	@Override
	public Class<ExecuteScriptResponse> getResponseClass() {
		return ExecuteScriptResponse.class;
	}

}
