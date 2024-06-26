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

package com.aliyuncs.miniapplcdp.transform.v20200113;

import com.aliyuncs.miniapplcdp.model.v20200113.CreateCommitResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.CreateCommitResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCommitResponseUnmarshaller {

	public static CreateCommitResponse unmarshall(CreateCommitResponse createCommitResponse, UnmarshallerContext _ctx) {
		
		createCommitResponse.setRequestId(_ctx.stringValue("CreateCommitResponse.RequestId"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("CreateCommitResponse.Data.AppId"));
		data.setCommitId(_ctx.stringValue("CreateCommitResponse.Data.CommitId"));
		data.setCreateTime(_ctx.stringValue("CreateCommitResponse.Data.CreateTime"));
		data.setCommitLog(_ctx.stringValue("CreateCommitResponse.Data.CommitLog"));
		data.setMainModuleCommitId(_ctx.stringValue("CreateCommitResponse.Data.MainModuleCommitId"));
		data.setMainModuleId(_ctx.stringValue("CreateCommitResponse.Data.MainModuleId"));
		data.setModelDataPath(_ctx.stringValue("CreateCommitResponse.Data.ModelDataPath"));
		data.setModifiedTime(_ctx.stringValue("CreateCommitResponse.Data.ModifiedTime"));
		data.setModuleId(_ctx.stringValue("CreateCommitResponse.Data.ModuleId"));
		data.setResourceDataPath(_ctx.stringValue("CreateCommitResponse.Data.ResourceDataPath"));
		data.setResourceDigest(_ctx.mapValue("CreateCommitResponse.Data.ResourceDigest"));
		data.setRollbackToCommitId(_ctx.stringValue("CreateCommitResponse.Data.RollbackToCommitId"));
		data.setRollbackType(_ctx.stringValue("CreateCommitResponse.Data.RollbackType"));
		data.setSchemaVersion(_ctx.stringValue("CreateCommitResponse.Data.SchemaVersion"));
		data.setCommitType(_ctx.stringValue("CreateCommitResponse.Data.CommitType"));
		createCommitResponse.setData(data);
	 
	 	return createCommitResponse;
	}
}