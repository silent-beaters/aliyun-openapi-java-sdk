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

import com.aliyuncs.airec.model.v20201126.CreateFilteringAlgorithmResponse;
import com.aliyuncs.airec.model.v20201126.CreateFilteringAlgorithmResponse.Result;
import com.aliyuncs.airec.model.v20201126.CreateFilteringAlgorithmResponse.Result.Meta;
import com.aliyuncs.airec.model.v20201126.CreateFilteringAlgorithmResponse.Result.Meta.Threshold;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFilteringAlgorithmResponseUnmarshaller {

	public static CreateFilteringAlgorithmResponse unmarshall(CreateFilteringAlgorithmResponse createFilteringAlgorithmResponse, UnmarshallerContext _ctx) {
		
		createFilteringAlgorithmResponse.setRequestId(_ctx.stringValue("CreateFilteringAlgorithmResponse.requestId"));

		Result result = new Result();
		result.setGmtModified(_ctx.stringValue("CreateFilteringAlgorithmResponse.result.gmtModified"));
		result.setStatus(_ctx.stringValue("CreateFilteringAlgorithmResponse.result.status"));
		result.setGmtCreate(_ctx.stringValue("CreateFilteringAlgorithmResponse.result.gmtCreate"));
		result.setAlgorithmId(_ctx.stringValue("CreateFilteringAlgorithmResponse.result.algorithmId"));

		Meta meta = new Meta();
		meta.setType(_ctx.stringValue("CreateFilteringAlgorithmResponse.result.meta.type"));
		meta.setExtInfo(_ctx.mapValue("CreateFilteringAlgorithmResponse.result.meta.extInfo"));
		meta.setCategory(_ctx.stringValue("CreateFilteringAlgorithmResponse.result.meta.category"));
		meta.setStatus(_ctx.stringValue("CreateFilteringAlgorithmResponse.result.meta.status"));
		meta.setGmtCreate(_ctx.stringValue("CreateFilteringAlgorithmResponse.result.meta.gmtCreate"));
		meta.setTableName(_ctx.stringValue("CreateFilteringAlgorithmResponse.result.meta.tableName"));
		meta.setCron(_ctx.stringValue("CreateFilteringAlgorithmResponse.result.meta.cron"));
		meta.setDescription(_ctx.stringValue("CreateFilteringAlgorithmResponse.result.meta.description"));
		meta.setGmtModified(_ctx.stringValue("CreateFilteringAlgorithmResponse.result.meta.gmtModified"));
		meta.setProjectName(_ctx.stringValue("CreateFilteringAlgorithmResponse.result.meta.projectName"));
		meta.setAlgorithmName(_ctx.stringValue("CreateFilteringAlgorithmResponse.result.meta.algorithmName"));
		meta.setCronEnabled(_ctx.booleanValue("CreateFilteringAlgorithmResponse.result.meta.cronEnabled"));

		Threshold threshold = new Threshold();
		threshold.setSourceDataSizeThreshold(_ctx.integerValue("CreateFilteringAlgorithmResponse.result.meta.threshold.sourceDataSizeThreshold"));
		threshold.setSourceDataRecordThreshold(_ctx.integerValue("CreateFilteringAlgorithmResponse.result.meta.threshold.sourceDataRecordThreshold"));
		threshold.setIndexSizeThreshold(_ctx.integerValue("CreateFilteringAlgorithmResponse.result.meta.threshold.indexSizeThreshold"));
		threshold.setIndexLossThreshold(_ctx.integerValue("CreateFilteringAlgorithmResponse.result.meta.threshold.indexLossThreshold"));
		meta.setThreshold(threshold);
		result.setMeta(meta);
		createFilteringAlgorithmResponse.setResult(result);
	 
	 	return createFilteringAlgorithmResponse;
	}
}