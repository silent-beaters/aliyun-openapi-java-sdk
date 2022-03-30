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

package com.aliyuncs.eci.transform.v20180808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerSpec;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerSpec.ContainerCpu;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerSpec.ContainerMemory;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerStatsItem;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerStatsItem.AcceleratorStatsItem;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerStatsItem.CpuStats;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerStatsItem.CpuStats.CpuCFS;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerStatsItem.CpuStats.CpuUsage;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerStatsItem.DiskIoStats;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerStatsItem.DiskIoStats.IoMergedItem;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerStatsItem.DiskIoStats.IoQueuedItem;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerStatsItem.DiskIoStats.IoServiceByte;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerStatsItem.DiskIoStats.IoServiceTimeItem;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerStatsItem.DiskIoStats.IoServicedItem;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerStatsItem.DiskIoStats.IoTimeItem;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerStatsItem.DiskIoStats.IoWaitTimeItem;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerStatsItem.DiskIoStats.Sector;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerStatsItem.FsStatsItem;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerStatsItem.MemoryStats;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerStatsItem.MemoryStats.ContainerData;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerStatsItem.MemoryStats.HierarchicalData;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerStatsItem.NetworkStats;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerStatsItem.NetworkStats.InterfaceStatsItem;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerStatsItem.NetworkStats.Tcp;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerStatsItem.NetworkStats.Tcp6;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerStatsItem.NetworkStats.Udp;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerStatsItem.NetworkStats.Udp6;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerStatsItem.TaskStats;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.PodStat;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.PodStat.CPU;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.PodStat.Container;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.PodStat.Container.CPU1;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.PodStat.Container.Memory2;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.PodStat.DiskStats;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.PodStat.FsStats;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.PodStat.Memory;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.PodStat.Network;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.PodStat.Network._Interface;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMultiContainerGroupMetricResponseUnmarshaller {

	public static DescribeMultiContainerGroupMetricResponse unmarshall(DescribeMultiContainerGroupMetricResponse describeMultiContainerGroupMetricResponse, UnmarshallerContext _ctx) {

		describeMultiContainerGroupMetricResponse.setRequestId(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.RequestId"));

		List<Record> monitorDatas = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas.Length"); i++) {
			Record record = new Record();
			record.setContainerGroupId(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerGroupId"));

			List<PodStat> records = new ArrayList<PodStat>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records.Length"); j++) {
				PodStat podStat = new PodStat();
				podStat.setTimestamp(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Timestamp"));

				Network network = new Network();

				List<_Interface> interfaces = new ArrayList<_Interface>();
				for (int k = 0; k < _ctx.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Network.Interfaces.Length"); k++) {
					_Interface _interface = new _Interface();
					_interface.setRxErrors(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Network.Interfaces["+ k +"].RxErrors"));
					_interface.setTxDrops(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Network.Interfaces["+ k +"].TxDrops"));
					_interface.setTxBytes(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Network.Interfaces["+ k +"].TxBytes"));
					_interface.setRxPackets(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Network.Interfaces["+ k +"].RxPackets"));
					_interface.setTxPackets(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Network.Interfaces["+ k +"].TxPackets"));
					_interface.setName(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Network.Interfaces["+ k +"].Name"));
					_interface.setTxErrors(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Network.Interfaces["+ k +"].TxErrors"));
					_interface.setRxBytes(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Network.Interfaces["+ k +"].RxBytes"));
					_interface.setRxDrops(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Network.Interfaces["+ k +"].RxDrops"));

					interfaces.add(_interface);
				}
				network.setInterfaces(interfaces);
				podStat.setNetwork(network);

				CPU cPU = new CPU();
				cPU.setUsageNanoCores(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].CPU.UsageNanoCores"));
				cPU.setLimit(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].CPU.Limit"));
				cPU.setUsageCoreNanoSeconds(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].CPU.UsageCoreNanoSeconds"));
				cPU.setLoad(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].CPU.Load"));
				podStat.setCPU(cPU);

				Memory memory = new Memory();
				memory.setRss(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Memory.Rss"));
				memory.setUsageBytes(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Memory.UsageBytes"));
				memory.setWorkingSet(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Memory.WorkingSet"));
				memory.setAvailableBytes(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Memory.AvailableBytes"));
				memory.setCache(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Memory.Cache"));
				podStat.setMemory(memory);

				List<DiskStats> disk = new ArrayList<DiskStats>();
				for (int k = 0; k < _ctx.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Disk.Length"); k++) {
					DiskStats diskStats = new DiskStats();
					diskStats.setWriteBytes(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Disk["+ k +"].WriteBytes"));
					diskStats.setDevice(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Disk["+ k +"].Device"));
					diskStats.setWriteIo(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Disk["+ k +"].WriteIo"));
					diskStats.setReadBytes(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Disk["+ k +"].ReadBytes"));
					diskStats.setReadIo(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Disk["+ k +"].ReadIo"));

					disk.add(diskStats);
				}
				podStat.setDisk(disk);

				List<Container> containers = new ArrayList<Container>();
				for (int k = 0; k < _ctx.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Containers.Length"); k++) {
					Container container = new Container();
					container.setName(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Containers["+ k +"].Name"));

					CPU1 cPU1 = new CPU1();
					cPU1.setUsageNanoCores(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Containers["+ k +"].CPU.UsageNanoCores"));
					cPU1.setLimit(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Containers["+ k +"].CPU.Limit"));
					cPU1.setUsageCoreNanoSeconds(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Containers["+ k +"].CPU.UsageCoreNanoSeconds"));
					cPU1.setLoad(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Containers["+ k +"].CPU.Load"));
					container.setCPU1(cPU1);

					Memory2 memory2 = new Memory2();
					memory2.setRss(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Containers["+ k +"].Memory.Rss"));
					memory2.setUsageBytes(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Containers["+ k +"].Memory.UsageBytes"));
					memory2.setWorkingSet(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Containers["+ k +"].Memory.WorkingSet"));
					memory2.setAvailableBytes(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Containers["+ k +"].Memory.AvailableBytes"));
					memory2.setCache(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Containers["+ k +"].Memory.Cache"));
					container.setMemory2(memory2);

					containers.add(container);
				}
				podStat.setContainers(containers);

				List<FsStats> filesystem = new ArrayList<FsStats>();
				for (int k = 0; k < _ctx.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Filesystem.Length"); k++) {
					FsStats fsStats = new FsStats();
					fsStats.setCapacity(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Filesystem["+ k +"].Capacity"));
					fsStats.setAvailable(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Filesystem["+ k +"].Available"));
					fsStats.setFsName(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Filesystem["+ k +"].FsName"));
					fsStats.setUsage(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Filesystem["+ k +"].Usage"));

					filesystem.add(fsStats);
				}
				podStat.setFilesystem(filesystem);

				records.add(podStat);
			}
			record.setRecords(records);

			List<ContainerInfo> containerInfos = new ArrayList<ContainerInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos.Length"); j++) {
				ContainerInfo containerInfo = new ContainerInfo();
				containerInfo.setLabels(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].Labels"));
				containerInfo.setNamespace(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].Namespace"));
				containerInfo.setName(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].Name"));
				containerInfo.setId(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].Id"));

				List<String> aliases = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].Aliases.Length"); k++) {
					aliases.add(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].Aliases["+ k +"]"));
				}
				containerInfo.setAliases(aliases);

				ContainerSpec containerSpec = new ContainerSpec();
				containerSpec.setCreationTime(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerSpec.CreationTime"));
				containerSpec.setImage(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerSpec.Image"));
				containerSpec.setLabels(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerSpec.Labels"));
				containerSpec.setHasCustomMetrics(_ctx.booleanValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerSpec.HasCustomMetrics"));
				containerSpec.setHasCpu(_ctx.booleanValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerSpec.HasCpu"));
				containerSpec.setEnvs(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerSpec.Envs"));
				containerSpec.setHasDiskIo(_ctx.booleanValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerSpec.HasDiskIo"));
				containerSpec.setHasFilesystem(_ctx.booleanValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerSpec.HasFilesystem"));
				containerSpec.setHasNetwork(_ctx.booleanValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerSpec.HasNetwork"));
				containerSpec.setHasMemory(_ctx.booleanValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerSpec.HasMemory"));

				ContainerMemory containerMemory = new ContainerMemory();
				containerMemory.setLimit(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerSpec.ContainerMemory.Limit"));
				containerMemory.setSwapLimit(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerSpec.ContainerMemory.SwapLimit"));
				containerMemory.setReservation(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerSpec.ContainerMemory.Reservation"));
				containerSpec.setContainerMemory(containerMemory);

				ContainerCpu containerCpu = new ContainerCpu();
				containerCpu.setQuota(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerSpec.ContainerCpu.Quota"));
				containerCpu.setMask(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerSpec.ContainerCpu.Mask"));
				containerCpu.setLimit(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerSpec.ContainerCpu.Limit"));
				containerCpu.setMaxLimit(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerSpec.ContainerCpu.MaxLimit"));
				containerCpu.setPeriod(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerSpec.ContainerCpu.Period"));
				containerSpec.setContainerCpu(containerCpu);
				containerInfo.setContainerSpec(containerSpec);

				List<ContainerStatsItem> containerStats = new ArrayList<ContainerStatsItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats.Length"); k++) {
					ContainerStatsItem containerStatsItem = new ContainerStatsItem();
					containerStatsItem.setTimestamp(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].Timestamp"));

					NetworkStats networkStats = new NetworkStats();
					networkStats.setRxDropped(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.RxDropped"));
					networkStats.setTxErrors(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.TxErrors"));
					networkStats.setRxErrors(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.RxErrors"));
					networkStats.setTxDropped(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.TxDropped"));
					networkStats.setTxBytes(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.TxBytes"));
					networkStats.setRxPackets(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.RxPackets"));
					networkStats.setName(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Name"));
					networkStats.setRxBytes(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.RxBytes"));
					networkStats.setTxPackets(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.TxPackets"));

					Tcp tcp = new Tcp();
					tcp.setCloseWait(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Tcp.CloseWait"));
					tcp.setFinWait2(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Tcp.FinWait2"));
					tcp.setLastAck(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Tcp.LastAck"));
					tcp.setClosing(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Tcp.Closing"));
					tcp.setListen(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Tcp.Listen"));
					tcp.setTimeWait(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Tcp.TimeWait"));
					tcp.setEstablished(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Tcp.Established"));
					tcp.setFinWait1(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Tcp.FinWait1"));
					tcp.setClose(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Tcp.Close"));
					tcp.setSynRecv(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Tcp.SynRecv"));
					tcp.setSynSent(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Tcp.SynSent"));
					networkStats.setTcp(tcp);

					Tcp6 tcp6 = new Tcp6();
					tcp6.setCloseWait(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Tcp6.CloseWait"));
					tcp6.setFinWait2(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Tcp6.FinWait2"));
					tcp6.setLastAck(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Tcp6.LastAck"));
					tcp6.setClosing(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Tcp6.Closing"));
					tcp6.setListen(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Tcp6.Listen"));
					tcp6.setTimeWait(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Tcp6.TimeWait"));
					tcp6.setEstablished(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Tcp6.Established"));
					tcp6.setFinWait1(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Tcp6.FinWait1"));
					tcp6.setClose(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Tcp6.Close"));
					tcp6.setSynRecv(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Tcp6.SynRecv"));
					tcp6.setSynSent(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Tcp6.SynSent"));
					networkStats.setTcp6(tcp6);

					Udp udp = new Udp();
					udp.setTxQueued(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Udp.TxQueued"));
					udp.setListen(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Udp.Listen"));
					udp.setDropped(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Udp.Dropped"));
					udp.setRxQueued(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Udp.RxQueued"));
					networkStats.setUdp(udp);

					Udp6 udp6 = new Udp6();
					udp6.setTxQueued(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Udp6.TxQueued"));
					udp6.setListen(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Udp6.Listen"));
					udp6.setDropped(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Udp6.Dropped"));
					udp6.setRxQueued(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.Udp6.RxQueued"));
					networkStats.setUdp6(udp6);

					List<InterfaceStatsItem> interfaceStats = new ArrayList<InterfaceStatsItem>();
					for (int l = 0; l < _ctx.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.InterfaceStats.Length"); l++) {
						InterfaceStatsItem interfaceStatsItem = new InterfaceStatsItem();
						interfaceStatsItem.setRxErrors(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.InterfaceStats["+ l +"].RxErrors"));
						interfaceStatsItem.setRxDropped(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.InterfaceStats["+ l +"].RxDropped"));
						interfaceStatsItem.setTxDropped(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.InterfaceStats["+ l +"].TxDropped"));
						interfaceStatsItem.setTxBytes(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.InterfaceStats["+ l +"].TxBytes"));
						interfaceStatsItem.setRxPackets(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.InterfaceStats["+ l +"].RxPackets"));
						interfaceStatsItem.setTxErrors(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.InterfaceStats["+ l +"].TxErrors"));
						interfaceStatsItem.setTxPackets(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.InterfaceStats["+ l +"].TxPackets"));
						interfaceStatsItem.setRxBytes(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.InterfaceStats["+ l +"].RxBytes"));
						interfaceStatsItem.setName(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].NetworkStats.InterfaceStats["+ l +"].Name"));

						interfaceStats.add(interfaceStatsItem);
					}
					networkStats.setInterfaceStats(interfaceStats);
					containerStatsItem.setNetworkStats(networkStats);

					CpuStats cpuStats = new CpuStats();
					cpuStats.setLoadAverage(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].CpuStats.LoadAverage"));

					CpuUsage cpuUsage = new CpuUsage();
					cpuUsage.setUser(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].CpuStats.CpuUsage.User"));
					cpuUsage.setTotal(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].CpuStats.CpuUsage.Total"));
					cpuUsage.setSystem(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].CpuStats.CpuUsage.System"));

					List<Long> perCpuUsages = new ArrayList<Long>();
					for (int l = 0; l < _ctx.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].CpuStats.CpuUsage.PerCpuUsages.Length"); l++) {
						perCpuUsages.add(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].CpuStats.CpuUsage.PerCpuUsages["+ l +"]"));
					}
					cpuUsage.setPerCpuUsages(perCpuUsages);
					cpuStats.setCpuUsage(cpuUsage);

					CpuCFS cpuCFS = new CpuCFS();
					cpuCFS.setThrottledTime(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].CpuStats.CpuCFS.ThrottledTime"));
					cpuCFS.setPeriods(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].CpuStats.CpuCFS.Periods"));
					cpuCFS.setThrottledPeriods(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].CpuStats.CpuCFS.ThrottledPeriods"));
					cpuStats.setCpuCFS(cpuCFS);
					containerStatsItem.setCpuStats(cpuStats);

					MemoryStats memoryStats = new MemoryStats();
					memoryStats.setFailCnt(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].MemoryStats.FailCnt"));
					memoryStats.setMaxUsage(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].MemoryStats.MaxUsage"));
					memoryStats.setRss(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].MemoryStats.Rss"));
					memoryStats.setWorkingSet(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].MemoryStats.WorkingSet"));
					memoryStats.setSwap(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].MemoryStats.Swap"));
					memoryStats.setCache(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].MemoryStats.Cache"));
					memoryStats.setUsage(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].MemoryStats.Usage"));

					HierarchicalData hierarchicalData = new HierarchicalData();
					hierarchicalData.setPgmajFault(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].MemoryStats.HierarchicalData.PgmajFault"));
					hierarchicalData.setPgFault(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].MemoryStats.HierarchicalData.PgFault"));
					memoryStats.setHierarchicalData(hierarchicalData);

					ContainerData containerData = new ContainerData();
					containerData.setPgmajFault(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].MemoryStats.ContainerData.PgmajFault"));
					containerData.setPgFault(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].MemoryStats.ContainerData.PgFault"));
					memoryStats.setContainerData(containerData);
					containerStatsItem.setMemoryStats(memoryStats);

					TaskStats taskStats = new TaskStats();
					taskStats.setNrUninterruptible(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].TaskStats.NrUninterruptible"));
					taskStats.setNrRunning(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].TaskStats.NrRunning"));
					taskStats.setNrSleeping(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].TaskStats.NrSleeping"));
					taskStats.setNrIoWait(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].TaskStats.NrIoWait"));
					taskStats.setNrStopped(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].TaskStats.NrStopped"));
					containerStatsItem.setTaskStats(taskStats);

					DiskIoStats diskIoStats = new DiskIoStats();

					List<IoServicedItem> ioServiced = new ArrayList<IoServicedItem>();
					for (int l = 0; l < _ctx.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoServiced.Length"); l++) {
						IoServicedItem ioServicedItem = new IoServicedItem();
						ioServicedItem.setStats(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoServiced["+ l +"].Stats"));
						ioServicedItem.setMinor(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoServiced["+ l +"].Minor"));
						ioServicedItem.setMajor(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoServiced["+ l +"].Major"));
						ioServicedItem.setDevice(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoServiced["+ l +"].Device"));

						ioServiced.add(ioServicedItem);
					}
					diskIoStats.setIoServiced(ioServiced);

					List<IoServiceTimeItem> ioServiceTime = new ArrayList<IoServiceTimeItem>();
					for (int l = 0; l < _ctx.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoServiceTime.Length"); l++) {
						IoServiceTimeItem ioServiceTimeItem = new IoServiceTimeItem();
						ioServiceTimeItem.setStats(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoServiceTime["+ l +"].Stats"));
						ioServiceTimeItem.setMinor(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoServiceTime["+ l +"].Minor"));
						ioServiceTimeItem.setMajor(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoServiceTime["+ l +"].Major"));
						ioServiceTimeItem.setDevice(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoServiceTime["+ l +"].Device"));

						ioServiceTime.add(ioServiceTimeItem);
					}
					diskIoStats.setIoServiceTime(ioServiceTime);

					List<IoServiceByte> ioServiceBytes = new ArrayList<IoServiceByte>();
					for (int l = 0; l < _ctx.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoServiceBytes.Length"); l++) {
						IoServiceByte ioServiceByte = new IoServiceByte();
						ioServiceByte.setStats(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoServiceBytes["+ l +"].Stats"));
						ioServiceByte.setMinor(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoServiceBytes["+ l +"].Minor"));
						ioServiceByte.setMajor(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoServiceBytes["+ l +"].Major"));
						ioServiceByte.setDevice(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoServiceBytes["+ l +"].Device"));

						ioServiceBytes.add(ioServiceByte);
					}
					diskIoStats.setIoServiceBytes(ioServiceBytes);

					List<IoMergedItem> ioMerged = new ArrayList<IoMergedItem>();
					for (int l = 0; l < _ctx.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoMerged.Length"); l++) {
						IoMergedItem ioMergedItem = new IoMergedItem();
						ioMergedItem.setStats(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoMerged["+ l +"].Stats"));
						ioMergedItem.setMinor(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoMerged["+ l +"].Minor"));
						ioMergedItem.setMajor(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoMerged["+ l +"].Major"));
						ioMergedItem.setDevice(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoMerged["+ l +"].Device"));

						ioMerged.add(ioMergedItem);
					}
					diskIoStats.setIoMerged(ioMerged);

					List<Sector> sectors = new ArrayList<Sector>();
					for (int l = 0; l < _ctx.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.Sectors.Length"); l++) {
						Sector sector = new Sector();
						sector.setStats(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.Sectors["+ l +"].Stats"));
						sector.setMinor(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.Sectors["+ l +"].Minor"));
						sector.setMajor(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.Sectors["+ l +"].Major"));
						sector.setDevice(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.Sectors["+ l +"].Device"));

						sectors.add(sector);
					}
					diskIoStats.setSectors(sectors);

					List<IoQueuedItem> ioQueued = new ArrayList<IoQueuedItem>();
					for (int l = 0; l < _ctx.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoQueued.Length"); l++) {
						IoQueuedItem ioQueuedItem = new IoQueuedItem();
						ioQueuedItem.setStats(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoQueued["+ l +"].Stats"));
						ioQueuedItem.setMinor(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoQueued["+ l +"].Minor"));
						ioQueuedItem.setMajor(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoQueued["+ l +"].Major"));
						ioQueuedItem.setDevice(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoQueued["+ l +"].Device"));

						ioQueued.add(ioQueuedItem);
					}
					diskIoStats.setIoQueued(ioQueued);

					List<IoTimeItem> ioTime = new ArrayList<IoTimeItem>();
					for (int l = 0; l < _ctx.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoTime.Length"); l++) {
						IoTimeItem ioTimeItem = new IoTimeItem();
						ioTimeItem.setStats(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoTime["+ l +"].Stats"));
						ioTimeItem.setMinor(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoTime["+ l +"].Minor"));
						ioTimeItem.setMajor(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoTime["+ l +"].Major"));
						ioTimeItem.setDevice(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoTime["+ l +"].Device"));

						ioTime.add(ioTimeItem);
					}
					diskIoStats.setIoTime(ioTime);

					List<IoWaitTimeItem> ioWaitTime = new ArrayList<IoWaitTimeItem>();
					for (int l = 0; l < _ctx.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoWaitTime.Length"); l++) {
						IoWaitTimeItem ioWaitTimeItem = new IoWaitTimeItem();
						ioWaitTimeItem.setStats(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoWaitTime["+ l +"].Stats"));
						ioWaitTimeItem.setMinor(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoWaitTime["+ l +"].Minor"));
						ioWaitTimeItem.setMajor(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoWaitTime["+ l +"].Major"));
						ioWaitTimeItem.setDevice(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].DiskIoStats.IoWaitTime["+ l +"].Device"));

						ioWaitTime.add(ioWaitTimeItem);
					}
					diskIoStats.setIoWaitTime(ioWaitTime);
					containerStatsItem.setDiskIoStats(diskIoStats);

					List<FsStatsItem> fsStats = new ArrayList<FsStatsItem>();
					for (int l = 0; l < _ctx.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].FsStats.Length"); l++) {
						com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerStatsItem.FsStatsItem containerStatsItemFsStatsItem = new com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.ContainerInfo.ContainerStatsItem.FsStatsItem();
						containerStatsItemFsStatsItem.setType(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].FsStats["+ l +"].Type"));
						containerStatsItemFsStatsItem.setReadsMerged(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].FsStats["+ l +"].ReadsMerged"));
						containerStatsItemFsStatsItem.setHasInodes(_ctx.booleanValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].FsStats["+ l +"].HasInodes"));
						containerStatsItemFsStatsItem.setReadsCompleted(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].FsStats["+ l +"].ReadsCompleted"));
						containerStatsItemFsStatsItem.setWritesMerged(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].FsStats["+ l +"].WritesMerged"));
						containerStatsItemFsStatsItem.setInodesFree(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].FsStats["+ l +"].InodesFree"));
						containerStatsItemFsStatsItem.setAvailable(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].FsStats["+ l +"].Available"));
						containerStatsItemFsStatsItem.setUsage(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].FsStats["+ l +"].Usage"));
						containerStatsItemFsStatsItem.setInodes(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].FsStats["+ l +"].Inodes"));
						containerStatsItemFsStatsItem.setBaseUsage(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].FsStats["+ l +"].BaseUsage"));
						containerStatsItemFsStatsItem.setSectorsRead(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].FsStats["+ l +"].SectorsRead"));
						containerStatsItemFsStatsItem.setWriteTime(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].FsStats["+ l +"].WriteTime"));
						containerStatsItemFsStatsItem.setSectorsWritten(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].FsStats["+ l +"].SectorsWritten"));
						containerStatsItemFsStatsItem.setReadTime(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].FsStats["+ l +"].ReadTime"));
						containerStatsItemFsStatsItem.setLimit(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].FsStats["+ l +"].Limit"));
						containerStatsItemFsStatsItem.setDevice(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].FsStats["+ l +"].Device"));
						containerStatsItemFsStatsItem.setWritesCompleted(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].FsStats["+ l +"].WritesCompleted"));
						containerStatsItemFsStatsItem.setIoTime(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].FsStats["+ l +"].IoTime"));
						containerStatsItemFsStatsItem.setWeightedIoTime(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].FsStats["+ l +"].WeightedIoTime"));
						containerStatsItemFsStatsItem.setIoInProgress(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].FsStats["+ l +"].IoInProgress"));

						fsStats.add(containerStatsItemFsStatsItem);
					}
					containerStatsItem.setFsStats(fsStats);

					List<AcceleratorStatsItem> acceleratorStats = new ArrayList<AcceleratorStatsItem>();
					for (int l = 0; l < _ctx.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].AcceleratorStats.Length"); l++) {
						AcceleratorStatsItem acceleratorStatsItem = new AcceleratorStatsItem();
						acceleratorStatsItem.setModel(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].AcceleratorStats["+ l +"].Model"));
						acceleratorStatsItem.setMinor(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].AcceleratorStats["+ l +"].Minor"));
						acceleratorStatsItem.setTemperature(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].AcceleratorStats["+ l +"].Temperature"));
						acceleratorStatsItem.setPowerUsage(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].AcceleratorStats["+ l +"].PowerUsage"));
						acceleratorStatsItem.setMemoryTotal(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].AcceleratorStats["+ l +"].MemoryTotal"));
						acceleratorStatsItem.setMake(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].AcceleratorStats["+ l +"].Make"));
						acceleratorStatsItem.setDutyCycle(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].AcceleratorStats["+ l +"].DutyCycle"));
						acceleratorStatsItem.setMemoryUsed(_ctx.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].AcceleratorStats["+ l +"].MemoryUsed"));
						acceleratorStatsItem.setId(_ctx.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerInfos["+ j +"].ContainerStats["+ k +"].AcceleratorStats["+ l +"].Id"));

						acceleratorStats.add(acceleratorStatsItem);
					}
					containerStatsItem.setAcceleratorStats(acceleratorStats);

					containerStats.add(containerStatsItem);
				}
				containerInfo.setContainerStats(containerStats);

				containerInfos.add(containerInfo);
			}
			record.setContainerInfos(containerInfos);

			monitorDatas.add(record);
		}
		describeMultiContainerGroupMetricResponse.setMonitorDatas(monitorDatas);

		return describeMultiContainerGroupMetricResponse;
	}
}