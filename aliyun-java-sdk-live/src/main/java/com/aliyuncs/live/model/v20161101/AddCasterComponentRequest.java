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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddCasterComponentRequest extends RpcAcsRequest<AddCasterComponentResponse> {
	   

	private String htmlLayerContent;

	private String imageLayerContent;

	private String componentName;

	private String layerOrder;

	private String casterId;

	private String componentLayer;

	private Long ownerId;

	private String componentType;

	private String locationId;

	private String effect;

	private String captionLayerContent;

	private String textLayerContent;
	public AddCasterComponentRequest() {
		super("live", "2016-11-01", "AddCasterComponent", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getHtmlLayerContent() {
		return this.htmlLayerContent;
	}

	public void setHtmlLayerContent(String htmlLayerContent) {
		this.htmlLayerContent = htmlLayerContent;
		if(htmlLayerContent != null){
			putQueryParameter("HtmlLayerContent", htmlLayerContent);
		}
	}

	public String getImageLayerContent() {
		return this.imageLayerContent;
	}

	public void setImageLayerContent(String imageLayerContent) {
		this.imageLayerContent = imageLayerContent;
		if(imageLayerContent != null){
			putQueryParameter("ImageLayerContent", imageLayerContent);
		}
	}

	public String getComponentName() {
		return this.componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
		if(componentName != null){
			putQueryParameter("ComponentName", componentName);
		}
	}

	public String getLayerOrder() {
		return this.layerOrder;
	}

	public void setLayerOrder(String layerOrder) {
		this.layerOrder = layerOrder;
		if(layerOrder != null){
			putQueryParameter("LayerOrder", layerOrder);
		}
	}

	public String getCasterId() {
		return this.casterId;
	}

	public void setCasterId(String casterId) {
		this.casterId = casterId;
		if(casterId != null){
			putQueryParameter("CasterId", casterId);
		}
	}

	public String getComponentLayer() {
		return this.componentLayer;
	}

	public void setComponentLayer(String componentLayer) {
		this.componentLayer = componentLayer;
		if(componentLayer != null){
			putQueryParameter("ComponentLayer", componentLayer);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getComponentType() {
		return this.componentType;
	}

	public void setComponentType(String componentType) {
		this.componentType = componentType;
		if(componentType != null){
			putQueryParameter("ComponentType", componentType);
		}
	}

	public String getLocationId() {
		return this.locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
		if(locationId != null){
			putQueryParameter("LocationId", locationId);
		}
	}

	public String getEffect() {
		return this.effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
		if(effect != null){
			putQueryParameter("Effect", effect);
		}
	}

	public String getCaptionLayerContent() {
		return this.captionLayerContent;
	}

	public void setCaptionLayerContent(String captionLayerContent) {
		this.captionLayerContent = captionLayerContent;
		if(captionLayerContent != null){
			putQueryParameter("CaptionLayerContent", captionLayerContent);
		}
	}

	public String getTextLayerContent() {
		return this.textLayerContent;
	}

	public void setTextLayerContent(String textLayerContent) {
		this.textLayerContent = textLayerContent;
		if(textLayerContent != null){
			putQueryParameter("TextLayerContent", textLayerContent);
		}
	}

	@Override
	public Class<AddCasterComponentResponse> getResponseClass() {
		return AddCasterComponentResponse.class;
	}

}
