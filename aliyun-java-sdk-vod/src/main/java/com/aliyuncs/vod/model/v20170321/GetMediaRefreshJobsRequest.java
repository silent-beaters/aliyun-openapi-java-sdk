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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vod.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetMediaRefreshJobsRequest extends RpcAcsRequest<GetMediaRefreshJobsResponse> {
	   

	private String mediaRefreshJobId;

	private String mediaId;
	public GetMediaRefreshJobsRequest() {
		super("vod", "2017-03-21", "GetMediaRefreshJobs", "vod");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMediaRefreshJobId() {
		return this.mediaRefreshJobId;
	}

	public void setMediaRefreshJobId(String mediaRefreshJobId) {
		this.mediaRefreshJobId = mediaRefreshJobId;
		if(mediaRefreshJobId != null){
			putQueryParameter("MediaRefreshJobId", mediaRefreshJobId);
		}
	}

	public String getMediaId() {
		return this.mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
		if(mediaId != null){
			putQueryParameter("MediaId", mediaId);
		}
	}

	@Override
	public Class<GetMediaRefreshJobsResponse> getResponseClass() {
		return GetMediaRefreshJobsResponse.class;
	}

}
