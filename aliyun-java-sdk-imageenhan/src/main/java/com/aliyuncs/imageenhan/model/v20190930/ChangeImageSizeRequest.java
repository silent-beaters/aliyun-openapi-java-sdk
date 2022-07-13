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
public class ChangeImageSizeRequest extends RpcAcsRequest<ChangeImageSizeResponse> {
	   

	private Integer height;

	private String url;

	private Integer width;
	public ChangeImageSizeRequest() {
		super("imageenhan", "2019-09-30", "ChangeImageSize", "imageenhan");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getHeight() {
		return this.height;
	}

	public void setHeight(Integer height) {
		this.height = height;
		if(height != null){
			putBodyParameter("Height", height.toString());
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

	public Integer getWidth() {
		return this.width;
	}

	public void setWidth(Integer width) {
		this.width = width;
		if(width != null){
			putBodyParameter("Width", width.toString());
		}
	}

	@Override
	public Class<ChangeImageSizeResponse> getResponseClass() {
		return ChangeImageSizeResponse.class;
	}

}
