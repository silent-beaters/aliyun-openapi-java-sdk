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

package com.aliyuncs.airec.transform.v20201126;

import com.aliyuncs.airec.model.v20201126.ModifyFilteringAlgorithmMetaResponse;
import com.aliyuncs.airec.model.v20201126.ModifyFilteringAlgorithmMetaResponse.Result;
import com.aliyuncs.airec.model.v20201126.ModifyFilteringAlgorithmMetaResponse.Result.Meta;
import com.aliyuncs.airec.model.v20201126.ModifyFilteringAlgorithmMetaResponse.Result.Meta.ExtInfo;
import com.aliyuncs.airec.model.v20201126.ModifyFilteringAlgorithmMetaResponse.Result.Meta.Threshold;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyFilteringAlgorithmMetaResponseUnmarshaller {

	public static ModifyFilteringAlgorithmMetaResponse unmarshall(ModifyFilteringAlgorithmMetaResponse modifyFilteringAlgorithmMetaResponse, UnmarshallerContext _ctx) {
		
		modifyFilteringAlgorithmMetaResponse.setRequestId(_ctx.stringValue("ModifyFilteringAlgorithmMetaResponse.requestId"));

		Result result = new Result();
		result.setGmtModified(_ctx.stringValue("ModifyFilteringAlgorithmMetaResponse.result.gmtModified"));
		result.setStatus(_ctx.stringValue("ModifyFilteringAlgorithmMetaResponse.result.status"));
		result.setGmtCreate(_ctx.stringValue("ModifyFilteringAlgorithmMetaResponse.result.gmtCreate"));
		result.setAlgorithmId(_ctx.stringValue("ModifyFilteringAlgorithmMetaResponse.result.algorithmId"));

		Meta meta = new Meta();
		meta.setTaskId(_ctx.stringValue("ModifyFilteringAlgorithmMetaResponse.result.meta.taskId"));
		meta.setMetaType(_ctx.stringValue("ModifyFilteringAlgorithmMetaResponse.result.meta.metaType"));
		meta.setType(_ctx.stringValue("ModifyFilteringAlgorithmMetaResponse.result.meta.type"));
		meta.setCategory(_ctx.stringValue("ModifyFilteringAlgorithmMetaResponse.result.meta.category"));
		meta.setTableName(_ctx.stringValue("ModifyFilteringAlgorithmMetaResponse.result.meta.tableName"));
		meta.setClusterId(_ctx.stringValue("ModifyFilteringAlgorithmMetaResponse.result.meta.clusterId"));
		meta.setCron(_ctx.stringValue("ModifyFilteringAlgorithmMetaResponse.result.meta.cron"));
		meta.setDescription(_ctx.stringValue("ModifyFilteringAlgorithmMetaResponse.result.meta.description"));
		meta.setProjectName(_ctx.stringValue("ModifyFilteringAlgorithmMetaResponse.result.meta.projectName"));
		meta.setAlgorithmName(_ctx.stringValue("ModifyFilteringAlgorithmMetaResponse.result.meta.algorithmName"));
		meta.setCronEnabled(_ctx.booleanValue("ModifyFilteringAlgorithmMetaResponse.result.meta.cronEnabled"));

		ExtInfo extInfo = new ExtInfo();
		extInfo.setKvSeparator(_ctx.stringValue("ModifyFilteringAlgorithmMetaResponse.result.meta.extInfo.kvSeparator"));
		extInfo.setItemSeparator(_ctx.stringValue("ModifyFilteringAlgorithmMetaResponse.result.meta.extInfo.itemSeparator"));
		meta.setExtInfo(extInfo);

		Threshold threshold = new Threshold();
		threshold.setSourceDataSizeThreshold(_ctx.integerValue("ModifyFilteringAlgorithmMetaResponse.result.meta.threshold.sourceDataSizeThreshold"));
		threshold.setSourceDataRecordThreshold(_ctx.integerValue("ModifyFilteringAlgorithmMetaResponse.result.meta.threshold.sourceDataRecordThreshold"));
		threshold.setIndexSizeThreshold(_ctx.integerValue("ModifyFilteringAlgorithmMetaResponse.result.meta.threshold.indexSizeThreshold"));
		threshold.setIndexLossThreshold(_ctx.integerValue("ModifyFilteringAlgorithmMetaResponse.result.meta.threshold.indexLossThreshold"));
		meta.setThreshold(threshold);
		result.setMeta(meta);
		modifyFilteringAlgorithmMetaResponse.setResult(result);
	 
	 	return modifyFilteringAlgorithmMetaResponse;
	}
}