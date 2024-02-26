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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeImagesRequest extends RpcAcsRequest<DescribeImagesResponse> {
	   

	private List<String> imageIds;

	private Boolean gpuCategory;

	private String desktopInstanceType;

	private String languageType;

	private String nextToken;

	private String imageName;

	private String imageType;

	private String fotaVersion;

	private String sessionType;

	private String osType;

	private String imageStatus;

	private Integer maxResults;

	private String protocolType;

	private String gpuDriverVersion;
	public DescribeImagesRequest() {
		super("ecd", "2020-09-30", "DescribeImages", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getImageIds() {
		return this.imageIds;
	}

	public void setImageIds(List<String> imageIds) {
		this.imageIds = imageIds;	
		if (imageIds != null) {
			for (int i = 0; i < imageIds.size(); i++) {
				putQueryParameter("ImageId." + (i + 1) , imageIds.get(i));
			}
		}	
	}

	public Boolean getGpuCategory() {
		return this.gpuCategory;
	}

	public void setGpuCategory(Boolean gpuCategory) {
		this.gpuCategory = gpuCategory;
		if(gpuCategory != null){
			putQueryParameter("GpuCategory", gpuCategory.toString());
		}
	}

	public String getDesktopInstanceType() {
		return this.desktopInstanceType;
	}

	public void setDesktopInstanceType(String desktopInstanceType) {
		this.desktopInstanceType = desktopInstanceType;
		if(desktopInstanceType != null){
			putQueryParameter("DesktopInstanceType", desktopInstanceType);
		}
	}

	public String getLanguageType() {
		return this.languageType;
	}

	public void setLanguageType(String languageType) {
		this.languageType = languageType;
		if(languageType != null){
			putQueryParameter("LanguageType", languageType);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
		if(imageName != null){
			putQueryParameter("ImageName", imageName);
		}
	}

	public String getImageType() {
		return this.imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
		if(imageType != null){
			putQueryParameter("ImageType", imageType);
		}
	}

	public String getFotaVersion() {
		return this.fotaVersion;
	}

	public void setFotaVersion(String fotaVersion) {
		this.fotaVersion = fotaVersion;
		if(fotaVersion != null){
			putQueryParameter("FotaVersion", fotaVersion);
		}
	}

	public String getSessionType() {
		return this.sessionType;
	}

	public void setSessionType(String sessionType) {
		this.sessionType = sessionType;
		if(sessionType != null){
			putQueryParameter("SessionType", sessionType);
		}
	}

	public String getOsType() {
		return this.osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
		if(osType != null){
			putQueryParameter("OsType", osType);
		}
	}

	public String getImageStatus() {
		return this.imageStatus;
	}

	public void setImageStatus(String imageStatus) {
		this.imageStatus = imageStatus;
		if(imageStatus != null){
			putQueryParameter("ImageStatus", imageStatus);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public String getProtocolType() {
		return this.protocolType;
	}

	public void setProtocolType(String protocolType) {
		this.protocolType = protocolType;
		if(protocolType != null){
			putQueryParameter("ProtocolType", protocolType);
		}
	}

	public String getGpuDriverVersion() {
		return this.gpuDriverVersion;
	}

	public void setGpuDriverVersion(String gpuDriverVersion) {
		this.gpuDriverVersion = gpuDriverVersion;
		if(gpuDriverVersion != null){
			putQueryParameter("GpuDriverVersion", gpuDriverVersion);
		}
	}

	@Override
	public Class<DescribeImagesResponse> getResponseClass() {
		return DescribeImagesResponse.class;
	}

}
