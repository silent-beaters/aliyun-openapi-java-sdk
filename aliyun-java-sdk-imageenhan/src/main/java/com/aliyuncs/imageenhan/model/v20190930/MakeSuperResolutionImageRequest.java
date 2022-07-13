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

package com.aliyuncs.imageenhan.model.v20190930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imageenhan.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class MakeSuperResolutionImageRequest extends RpcAcsRequest<MakeSuperResolutionImageResponse> {
	   

	private Long upscaleFactor;

	private String mode;

	private String outputFormat;

	private String url;

	private Long outputQuality;
	public MakeSuperResolutionImageRequest() {
		super("imageenhan", "2019-09-30", "MakeSuperResolutionImage", "imageenhan");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getUpscaleFactor() {
		return this.upscaleFactor;
	}

	public void setUpscaleFactor(Long upscaleFactor) {
		this.upscaleFactor = upscaleFactor;
		if(upscaleFactor != null){
			putBodyParameter("UpscaleFactor", upscaleFactor.toString());
		}
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putBodyParameter("Mode", mode);
		}
	}

	public String getOutputFormat() {
		return this.outputFormat;
	}

	public void setOutputFormat(String outputFormat) {
		this.outputFormat = outputFormat;
		if(outputFormat != null){
			putBodyParameter("OutputFormat", outputFormat);
		}
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
		if(url != null){
			putBodyParameter("Url", url);
		}
	}

	public Long getOutputQuality() {
		return this.outputQuality;
	}

	public void setOutputQuality(Long outputQuality) {
		this.outputQuality = outputQuality;
		if(outputQuality != null){
			putBodyParameter("OutputQuality", outputQuality.toString());
		}
	}

	@Override
	public Class<MakeSuperResolutionImageResponse> getResponseClass() {
		return MakeSuperResolutionImageResponse.class;
	}

}
