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

import com.aliyuncs.airec.model.v20201126.DescribeFilteringAlgorithmResponse;
import com.aliyuncs.airec.model.v20201126.DescribeFilteringAlgorithmResponse.Result;
import com.aliyuncs.airec.model.v20201126.DescribeFilteringAlgorithmResponse.Result.Meta;
import com.aliyuncs.airec.model.v20201126.DescribeFilteringAlgorithmResponse.Result.Meta.ExtInfo;
import com.aliyuncs.airec.model.v20201126.DescribeFilteringAlgorithmResponse.Result.Meta.Threshold;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFilteringAlgorithmResponseUnmarshaller {

	public static DescribeFilteringAlgorithmResponse unmarshall(DescribeFilteringAlgorithmResponse describeFilteringAlgorithmResponse, UnmarshallerContext _ctx) {
		
		describeFilteringAlgorithmResponse.setRequestId(_ctx.stringValue("DescribeFilteringAlgorithmResponse.requestId"));

		Result result = new Result();
		result.setGmtModified(_ctx.stringValue("DescribeFilteringAlgorithmResponse.result.gmtModified"));
		result.setStatus(_ctx.stringValue("DescribeFilteringAlgorithmResponse.result.status"));
		result.setGmtCreate(_ctx.stringValue("DescribeFilteringAlgorithmResponse.result.gmtCreate"));
		result.setAlgorithmId(_ctx.stringValue("DescribeFilteringAlgorithmResponse.result.algorithmId"));

		Meta meta = new Meta();
		meta.setTaskId(_ctx.stringValue("DescribeFilteringAlgorithmResponse.result.meta.taskId"));
		meta.setMetaType(_ctx.stringValue("DescribeFilteringAlgorithmResponse.result.meta.metaType"));
		meta.setType(_ctx.stringValue("DescribeFilteringAlgorithmResponse.result.meta.type"));
		meta.setCategory(_ctx.stringValue("DescribeFilteringAlgorithmResponse.result.meta.category"));
		meta.setTableName(_ctx.stringValue("DescribeFilteringAlgorithmResponse.result.meta.tableName"));
		meta.setClusterId(_ctx.stringValue("DescribeFilteringAlgorithmResponse.result.meta.clusterId"));
		meta.setCron(_ctx.stringValue("DescribeFilteringAlgorithmResponse.result.meta.cron"));
		meta.setDescription(_ctx.stringValue("DescribeFilteringAlgorithmResponse.result.meta.description"));
		meta.setProjectName(_ctx.stringValue("DescribeFilteringAlgorithmResponse.result.meta.projectName"));
		meta.setAlgorithmName(_ctx.stringValue("DescribeFilteringAlgorithmResponse.result.meta.algorithmName"));
		meta.setCronEnabled(_ctx.booleanValue("DescribeFilteringAlgorithmResponse.result.meta.cronEnabled"));

		ExtInfo extInfo = new ExtInfo();
		extInfo.setKvSeparator(_ctx.stringValue("DescribeFilteringAlgorithmResponse.result.meta.extInfo.kvSeparator"));
		extInfo.setItemSeparator(_ctx.stringValue("DescribeFilteringAlgorithmResponse.result.meta.extInfo.itemSeparator"));
		meta.setExtInfo(extInfo);

		Threshold threshold = new Threshold();
		threshold.setSourceDataSizeThreshold(_ctx.integerValue("DescribeFilteringAlgorithmResponse.result.meta.threshold.sourceDataSizeThreshold"));
		threshold.setSourceDataRecordThreshold(_ctx.integerValue("DescribeFilteringAlgorithmResponse.result.meta.threshold.sourceDataRecordThreshold"));
		threshold.setIndexSizeThreshold(_ctx.integerValue("DescribeFilteringAlgorithmResponse.result.meta.threshold.indexSizeThreshold"));
		threshold.setIndexLossThreshold(_ctx.integerValue("DescribeFilteringAlgorithmResponse.result.meta.threshold.indexLossThreshold"));
		meta.setThreshold(threshold);
		result.setMeta(meta);
		describeFilteringAlgorithmResponse.setResult(result);
	 
	 	return describeFilteringAlgorithmResponse;
	}
}