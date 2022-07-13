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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.GetBackupStorageCountResponse;
import com.aliyuncs.sas.model.v20181203.GetBackupStorageCountResponse.BackupStorageCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBackupStorageCountResponseUnmarshaller {

	public static GetBackupStorageCountResponse unmarshall(GetBackupStorageCountResponse getBackupStorageCountResponse, UnmarshallerContext _ctx) {
		
		getBackupStorageCountResponse.setRequestId(_ctx.stringValue("GetBackupStorageCountResponse.RequestId"));

		BackupStorageCount backupStorageCount = new BackupStorageCount();
		backupStorageCount.setOverflow(_ctx.integerValue("GetBackupStorageCountResponse.BackupStorageCount.Overflow"));
		backupStorageCount.setUniUsageStorageByte(_ctx.longValue("GetBackupStorageCountResponse.BackupStorageCount.UniUsageStorageByte"));
		backupStorageCount.setBuyStorageByte(_ctx.longValue("GetBackupStorageCountResponse.BackupStorageCount.BuyStorageByte"));
		backupStorageCount.setUsageStorageByte(_ctx.longValue("GetBackupStorageCountResponse.BackupStorageCount.UsageStorageByte"));
		backupStorageCount.setEcsUsageStorageByte(_ctx.longValue("GetBackupStorageCountResponse.BackupStorageCount.EcsUsageStorageByte"));
		getBackupStorageCountResponse.setBackupStorageCount(backupStorageCount);
	 
	 	return getBackupStorageCountResponse;
	}
}