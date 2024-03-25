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

package com.aliyuncs.oceanbasepro.model.v20190901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstancesResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private List<Data> instances;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getInstances() {
		return this.instances;
	}

	public void setInstances(List<Data> instances) {
		this.instances = instances;
	}

	public static class Data {

		private String vpcId;

		private String commodityCode;

		private String expireTime;

		private String state;

		private String instanceClass;

		private String createTime;

		private String deployMode;

		private String cpuArchitecture;

		private String maintainTime;

		private String deployType;

		private String payType;

		private String diskSize;

		private String diskType;

		private String instanceId;

		private Integer expireSeconds;

		private Long mem;

		private Boolean enableUpgradeNodes;

		private Integer cpu;

		private String version;

		private String instanceName;

		private String series;

		private Long usedDiskSize;

		private String resourceGroupId;

		private String instanceType;

		private String instanceRole;

		private Boolean inTempCapacityStatus;

		private Boolean enableReadOnlyReplicaManagement;

		private List<String> availableZones;

		private Resource resource;

		private DataDiskAutoScaleConfig dataDiskAutoScaleConfig;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getInstanceClass() {
			return this.instanceClass;
		}

		public void setInstanceClass(String instanceClass) {
			this.instanceClass = instanceClass;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getDeployMode() {
			return this.deployMode;
		}

		public void setDeployMode(String deployMode) {
			this.deployMode = deployMode;
		}

		public String getCpuArchitecture() {
			return this.cpuArchitecture;
		}

		public void setCpuArchitecture(String cpuArchitecture) {
			this.cpuArchitecture = cpuArchitecture;
		}

		public String getMaintainTime() {
			return this.maintainTime;
		}

		public void setMaintainTime(String maintainTime) {
			this.maintainTime = maintainTime;
		}

		public String getDeployType() {
			return this.deployType;
		}

		public void setDeployType(String deployType) {
			this.deployType = deployType;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getDiskSize() {
			return this.diskSize;
		}

		public void setDiskSize(String diskSize) {
			this.diskSize = diskSize;
		}

		public String getDiskType() {
			return this.diskType;
		}

		public void setDiskType(String diskType) {
			this.diskType = diskType;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getExpireSeconds() {
			return this.expireSeconds;
		}

		public void setExpireSeconds(Integer expireSeconds) {
			this.expireSeconds = expireSeconds;
		}

		public Long getMem() {
			return this.mem;
		}

		public void setMem(Long mem) {
			this.mem = mem;
		}

		public Boolean getEnableUpgradeNodes() {
			return this.enableUpgradeNodes;
		}

		public void setEnableUpgradeNodes(Boolean enableUpgradeNodes) {
			this.enableUpgradeNodes = enableUpgradeNodes;
		}

		public Integer getCpu() {
			return this.cpu;
		}

		public void setCpu(Integer cpu) {
			this.cpu = cpu;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getSeries() {
			return this.series;
		}

		public void setSeries(String series) {
			this.series = series;
		}

		public Long getUsedDiskSize() {
			return this.usedDiskSize;
		}

		public void setUsedDiskSize(Long usedDiskSize) {
			this.usedDiskSize = usedDiskSize;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getInstanceRole() {
			return this.instanceRole;
		}

		public void setInstanceRole(String instanceRole) {
			this.instanceRole = instanceRole;
		}

		public Boolean getInTempCapacityStatus() {
			return this.inTempCapacityStatus;
		}

		public void setInTempCapacityStatus(Boolean inTempCapacityStatus) {
			this.inTempCapacityStatus = inTempCapacityStatus;
		}

		public Boolean getEnableReadOnlyReplicaManagement() {
			return this.enableReadOnlyReplicaManagement;
		}

		public void setEnableReadOnlyReplicaManagement(Boolean enableReadOnlyReplicaManagement) {
			this.enableReadOnlyReplicaManagement = enableReadOnlyReplicaManagement;
		}

		public List<String> getAvailableZones() {
			return this.availableZones;
		}

		public void setAvailableZones(List<String> availableZones) {
			this.availableZones = availableZones;
		}

		public Resource getResource() {
			return this.resource;
		}

		public void setResource(Resource resource) {
			this.resource = resource;
		}

		public DataDiskAutoScaleConfig getDataDiskAutoScaleConfig() {
			return this.dataDiskAutoScaleConfig;
		}

		public void setDataDiskAutoScaleConfig(DataDiskAutoScaleConfig dataDiskAutoScaleConfig) {
			this.dataDiskAutoScaleConfig = dataDiskAutoScaleConfig;
		}

		public static class Resource {

			private Long unitCount;

			private Cpu cpu;

			private Memory memory;

			private DiskSize diskSize;

			private CapacityUnit capacityUnit;

			public Long getUnitCount() {
				return this.unitCount;
			}

			public void setUnitCount(Long unitCount) {
				this.unitCount = unitCount;
			}

			public Cpu getCpu() {
				return this.cpu;
			}

			public void setCpu(Cpu cpu) {
				this.cpu = cpu;
			}

			public Memory getMemory() {
				return this.memory;
			}

			public void setMemory(Memory memory) {
				this.memory = memory;
			}

			public DiskSize getDiskSize() {
				return this.diskSize;
			}

			public void setDiskSize(DiskSize diskSize) {
				this.diskSize = diskSize;
			}

			public CapacityUnit getCapacityUnit() {
				return this.capacityUnit;
			}

			public void setCapacityUnit(CapacityUnit capacityUnit) {
				this.capacityUnit = capacityUnit;
			}

			public static class Cpu {

				private Long totalCpu;

				private Long usedCpu;

				private Long unitCpu;

				private Long originalTotalCpu;

				public Long getTotalCpu() {
					return this.totalCpu;
				}

				public void setTotalCpu(Long totalCpu) {
					this.totalCpu = totalCpu;
				}

				public Long getUsedCpu() {
					return this.usedCpu;
				}

				public void setUsedCpu(Long usedCpu) {
					this.usedCpu = usedCpu;
				}

				public Long getUnitCpu() {
					return this.unitCpu;
				}

				public void setUnitCpu(Long unitCpu) {
					this.unitCpu = unitCpu;
				}

				public Long getOriginalTotalCpu() {
					return this.originalTotalCpu;
				}

				public void setOriginalTotalCpu(Long originalTotalCpu) {
					this.originalTotalCpu = originalTotalCpu;
				}
			}

			public static class Memory {

				private Long totalMemory;

				private Long usedMemory;

				private Long unitMemory;

				private Long originalTotalMemory;

				public Long getTotalMemory() {
					return this.totalMemory;
				}

				public void setTotalMemory(Long totalMemory) {
					this.totalMemory = totalMemory;
				}

				public Long getUsedMemory() {
					return this.usedMemory;
				}

				public void setUsedMemory(Long usedMemory) {
					this.usedMemory = usedMemory;
				}

				public Long getUnitMemory() {
					return this.unitMemory;
				}

				public void setUnitMemory(Long unitMemory) {
					this.unitMemory = unitMemory;
				}

				public Long getOriginalTotalMemory() {
					return this.originalTotalMemory;
				}

				public void setOriginalTotalMemory(Long originalTotalMemory) {
					this.originalTotalMemory = originalTotalMemory;
				}
			}

			public static class DiskSize {

				private Long totalDiskSize;

				private Long usedDiskSize;

				private Long unitDiskSize;

				private Long originalTotalDiskSize;

				public Long getTotalDiskSize() {
					return this.totalDiskSize;
				}

				public void setTotalDiskSize(Long totalDiskSize) {
					this.totalDiskSize = totalDiskSize;
				}

				public Long getUsedDiskSize() {
					return this.usedDiskSize;
				}

				public void setUsedDiskSize(Long usedDiskSize) {
					this.usedDiskSize = usedDiskSize;
				}

				public Long getUnitDiskSize() {
					return this.unitDiskSize;
				}

				public void setUnitDiskSize(Long unitDiskSize) {
					this.unitDiskSize = unitDiskSize;
				}

				public Long getOriginalTotalDiskSize() {
					return this.originalTotalDiskSize;
				}

				public void setOriginalTotalDiskSize(Long originalTotalDiskSize) {
					this.originalTotalDiskSize = originalTotalDiskSize;
				}
			}

			public static class CapacityUnit {

				private Integer maxCapacityUnit;

				private Integer minCapacityUnit;

				private Integer usedCapacityUnit;

				public Integer getMaxCapacityUnit() {
					return this.maxCapacityUnit;
				}

				public void setMaxCapacityUnit(Integer maxCapacityUnit) {
					this.maxCapacityUnit = maxCapacityUnit;
				}

				public Integer getMinCapacityUnit() {
					return this.minCapacityUnit;
				}

				public void setMinCapacityUnit(Integer minCapacityUnit) {
					this.minCapacityUnit = minCapacityUnit;
				}

				public Integer getUsedCapacityUnit() {
					return this.usedCapacityUnit;
				}

				public void setUsedCapacityUnit(Integer usedCapacityUnit) {
					this.usedCapacityUnit = usedCapacityUnit;
				}
			}
		}

		public static class DataDiskAutoScaleConfig {

			private Boolean autoScale;

			private Long upperbound;

			private Long upperThreshold;

			private Long upperMergeThreshold;

			private Long maxDiskSize;

			private Long scaleStepInNormal;

			private Long scaleStepInMerge;

			private String upperScaleStrategy;

			public Boolean getAutoScale() {
				return this.autoScale;
			}

			public void setAutoScale(Boolean autoScale) {
				this.autoScale = autoScale;
			}

			public Long getUpperbound() {
				return this.upperbound;
			}

			public void setUpperbound(Long upperbound) {
				this.upperbound = upperbound;
			}

			public Long getUpperThreshold() {
				return this.upperThreshold;
			}

			public void setUpperThreshold(Long upperThreshold) {
				this.upperThreshold = upperThreshold;
			}

			public Long getUpperMergeThreshold() {
				return this.upperMergeThreshold;
			}

			public void setUpperMergeThreshold(Long upperMergeThreshold) {
				this.upperMergeThreshold = upperMergeThreshold;
			}

			public Long getMaxDiskSize() {
				return this.maxDiskSize;
			}

			public void setMaxDiskSize(Long maxDiskSize) {
				this.maxDiskSize = maxDiskSize;
			}

			public Long getScaleStepInNormal() {
				return this.scaleStepInNormal;
			}

			public void setScaleStepInNormal(Long scaleStepInNormal) {
				this.scaleStepInNormal = scaleStepInNormal;
			}

			public Long getScaleStepInMerge() {
				return this.scaleStepInMerge;
			}

			public void setScaleStepInMerge(Long scaleStepInMerge) {
				this.scaleStepInMerge = scaleStepInMerge;
			}

			public String getUpperScaleStrategy() {
				return this.upperScaleStrategy;
			}

			public void setUpperScaleStrategy(String upperScaleStrategy) {
				this.upperScaleStrategy = upperScaleStrategy;
			}
		}
	}

	@Override
	public DescribeInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
