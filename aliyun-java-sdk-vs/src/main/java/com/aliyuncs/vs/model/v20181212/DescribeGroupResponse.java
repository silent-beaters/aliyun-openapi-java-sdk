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

package com.aliyuncs.vs.model.v20181212;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vs.transform.v20181212.DescribeGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGroupResponse extends AcsResponse {

	private String status;

	private Boolean lazyPull;

	private String callback;

	private String requestId;

	private String description;

	private String app;

	private String region;

	private Boolean enabled;

	private String inProtocol;

	private String outProtocol;

	private String name;

	private String pushDomain;

	private String createdTime;

	private Integer captureVideo;

	private String playDomain;

	private Integer captureInterval;

	private Long gbPort;

	private String gbId;

	private String gbIp;

	private Integer captureImage;

	private String aliasId;

	private String captureOssBucket;

	private String captureOssPath;

	private String id;

	private List<String> gbTcpPorts;

	private List<String> gbUdpPorts;

	private Stats stats;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getLazyPull() {
		return this.lazyPull;
	}

	public void setLazyPull(Boolean lazyPull) {
		this.lazyPull = lazyPull;
	}

	public String getCallback() {
		return this.callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getApp() {
		return this.app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getInProtocol() {
		return this.inProtocol;
	}

	public void setInProtocol(String inProtocol) {
		this.inProtocol = inProtocol;
	}

	public String getOutProtocol() {
		return this.outProtocol;
	}

	public void setOutProtocol(String outProtocol) {
		this.outProtocol = outProtocol;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPushDomain() {
		return this.pushDomain;
	}

	public void setPushDomain(String pushDomain) {
		this.pushDomain = pushDomain;
	}

	public String getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public Integer getCaptureVideo() {
		return this.captureVideo;
	}

	public void setCaptureVideo(Integer captureVideo) {
		this.captureVideo = captureVideo;
	}

	public String getPlayDomain() {
		return this.playDomain;
	}

	public void setPlayDomain(String playDomain) {
		this.playDomain = playDomain;
	}

	public Integer getCaptureInterval() {
		return this.captureInterval;
	}

	public void setCaptureInterval(Integer captureInterval) {
		this.captureInterval = captureInterval;
	}

	public Long getGbPort() {
		return this.gbPort;
	}

	public void setGbPort(Long gbPort) {
		this.gbPort = gbPort;
	}

	public String getGbId() {
		return this.gbId;
	}

	public void setGbId(String gbId) {
		this.gbId = gbId;
	}

	public String getGbIp() {
		return this.gbIp;
	}

	public void setGbIp(String gbIp) {
		this.gbIp = gbIp;
	}

	public Integer getCaptureImage() {
		return this.captureImage;
	}

	public void setCaptureImage(Integer captureImage) {
		this.captureImage = captureImage;
	}

	public String getAliasId() {
		return this.aliasId;
	}

	public void setAliasId(String aliasId) {
		this.aliasId = aliasId;
	}

	public String getCaptureOssBucket() {
		return this.captureOssBucket;
	}

	public void setCaptureOssBucket(String captureOssBucket) {
		this.captureOssBucket = captureOssBucket;
	}

	public String getCaptureOssPath() {
		return this.captureOssPath;
	}

	public void setCaptureOssPath(String captureOssPath) {
		this.captureOssPath = captureOssPath;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<String> getGbTcpPorts() {
		return this.gbTcpPorts;
	}

	public void setGbTcpPorts(List<String> gbTcpPorts) {
		this.gbTcpPorts = gbTcpPorts;
	}

	public List<String> getGbUdpPorts() {
		return this.gbUdpPorts;
	}

	public void setGbUdpPorts(List<String> gbUdpPorts) {
		this.gbUdpPorts = gbUdpPorts;
	}

	public Stats getStats() {
		return this.stats;
	}

	public void setStats(Stats stats) {
		this.stats = stats;
	}

	public static class Stats {

		private Long platformNum;

		private Long deviceNum;

		private Long ipcNum;

		private Long iedNum;

		public Long getPlatformNum() {
			return this.platformNum;
		}

		public void setPlatformNum(Long platformNum) {
			this.platformNum = platformNum;
		}

		public Long getDeviceNum() {
			return this.deviceNum;
		}

		public void setDeviceNum(Long deviceNum) {
			this.deviceNum = deviceNum;
		}

		public Long getIpcNum() {
			return this.ipcNum;
		}

		public void setIpcNum(Long ipcNum) {
			this.ipcNum = ipcNum;
		}

		public Long getIedNum() {
			return this.iedNum;
		}

		public void setIedNum(Long iedNum) {
			this.iedNum = iedNum;
		}
	}

	@Override
	public DescribeGroupResponse getInstance(UnmarshallerContext context) {
		return	DescribeGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
