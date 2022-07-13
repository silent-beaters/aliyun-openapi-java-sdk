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

package com.aliyuncs.cr.model.v20181201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cr.transform.v20181201.GetRepoSyncTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRepoSyncTaskResponse extends AcsResponse {

	private String syncRuleId;

	private Long progress;

	private String requestId;

	private Long syncedSize;

	private String taskStatus;

	private Boolean syncTransAccelerate;

	private Boolean crossUser;

	private String syncTaskId;

	private String syncBatchTaskId;

	private String code;

	private Boolean isSuccess;

	private String taskTrigger;

	private List<LayerTasksItem> layerTasks;

	private ImageFrom imageFrom;

	private ImageTo imageTo;

	public String getSyncRuleId() {
		return this.syncRuleId;
	}

	public void setSyncRuleId(String syncRuleId) {
		this.syncRuleId = syncRuleId;
	}

	public Long getProgress() {
		return this.progress;
	}

	public void setProgress(Long progress) {
		this.progress = progress;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getSyncedSize() {
		return this.syncedSize;
	}

	public void setSyncedSize(Long syncedSize) {
		this.syncedSize = syncedSize;
	}

	public String getTaskStatus() {
		return this.taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public Boolean getSyncTransAccelerate() {
		return this.syncTransAccelerate;
	}

	public void setSyncTransAccelerate(Boolean syncTransAccelerate) {
		this.syncTransAccelerate = syncTransAccelerate;
	}

	public Boolean getCrossUser() {
		return this.crossUser;
	}

	public void setCrossUser(Boolean crossUser) {
		this.crossUser = crossUser;
	}

	public String getSyncTaskId() {
		return this.syncTaskId;
	}

	public void setSyncTaskId(String syncTaskId) {
		this.syncTaskId = syncTaskId;
	}

	public String getSyncBatchTaskId() {
		return this.syncBatchTaskId;
	}

	public void setSyncBatchTaskId(String syncBatchTaskId) {
		this.syncBatchTaskId = syncBatchTaskId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getTaskTrigger() {
		return this.taskTrigger;
	}

	public void setTaskTrigger(String taskTrigger) {
		this.taskTrigger = taskTrigger;
	}

	public List<LayerTasksItem> getLayerTasks() {
		return this.layerTasks;
	}

	public void setLayerTasks(List<LayerTasksItem> layerTasks) {
		this.layerTasks = layerTasks;
	}

	public ImageFrom getImageFrom() {
		return this.imageFrom;
	}

	public void setImageFrom(ImageFrom imageFrom) {
		this.imageFrom = imageFrom;
	}

	public ImageTo getImageTo() {
		return this.imageTo;
	}

	public void setImageTo(ImageTo imageTo) {
		this.imageTo = imageTo;
	}

	public static class LayerTasksItem {

		private String taskStatus;

		private String digest;

		private Long syncedSize;

		private Long size;

		private String syncLayerTaskId;

		private String artifactDigest;

		public String getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
		}

		public String getDigest() {
			return this.digest;
		}

		public void setDigest(String digest) {
			this.digest = digest;
		}

		public Long getSyncedSize() {
			return this.syncedSize;
		}

		public void setSyncedSize(Long syncedSize) {
			this.syncedSize = syncedSize;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public String getSyncLayerTaskId() {
			return this.syncLayerTaskId;
		}

		public void setSyncLayerTaskId(String syncLayerTaskId) {
			this.syncLayerTaskId = syncLayerTaskId;
		}

		public String getArtifactDigest() {
			return this.artifactDigest;
		}

		public void setArtifactDigest(String artifactDigest) {
			this.artifactDigest = artifactDigest;
		}
	}

	public static class ImageFrom {

		private String repoNamespaceName;

		private String instanceId;

		private String imageTag;

		private String repoName;

		private String regionId;

		public String getRepoNamespaceName() {
			return this.repoNamespaceName;
		}

		public void setRepoNamespaceName(String repoNamespaceName) {
			this.repoNamespaceName = repoNamespaceName;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getImageTag() {
			return this.imageTag;
		}

		public void setImageTag(String imageTag) {
			this.imageTag = imageTag;
		}

		public String getRepoName() {
			return this.repoName;
		}

		public void setRepoName(String repoName) {
			this.repoName = repoName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	public static class ImageTo {

		private String repoNamespaceName;

		private String instanceId;

		private String imageTag;

		private String repoName;

		private String regionId;

		public String getRepoNamespaceName() {
			return this.repoNamespaceName;
		}

		public void setRepoNamespaceName(String repoNamespaceName) {
			this.repoNamespaceName = repoNamespaceName;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getImageTag() {
			return this.imageTag;
		}

		public void setImageTag(String imageTag) {
			this.imageTag = imageTag;
		}

		public String getRepoName() {
			return this.repoName;
		}

		public void setRepoName(String repoName) {
			this.repoName = repoName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public GetRepoSyncTaskResponse getInstance(UnmarshallerContext context) {
		return	GetRepoSyncTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
