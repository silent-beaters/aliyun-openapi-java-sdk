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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.GetDISyncTaskResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetDISyncTaskResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.GetDISyncTaskResponse.Data.SolutionDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDISyncTaskResponseUnmarshaller {

	public static GetDISyncTaskResponse unmarshall(GetDISyncTaskResponse getDISyncTaskResponse, UnmarshallerContext _ctx) {
		
		getDISyncTaskResponse.setRequestId(_ctx.stringValue("GetDISyncTaskResponse.RequestId"));
		getDISyncTaskResponse.setSuccess(_ctx.booleanValue("GetDISyncTaskResponse.Success"));

		Data data = new Data();
		data.setCode(_ctx.stringValue("GetDISyncTaskResponse.Data.Code"));
		data.setStatus(_ctx.stringValue("GetDISyncTaskResponse.Data.Status"));
		data.setMessage(_ctx.stringValue("GetDISyncTaskResponse.Data.Message"));

		SolutionDetail solutionDetail = new SolutionDetail();
		solutionDetail.setStatus(_ctx.stringValue("GetDISyncTaskResponse.Data.SolutionDetail.Status"));
		solutionDetail.setType(_ctx.stringValue("GetDISyncTaskResponse.Data.SolutionDetail.Type"));
		solutionDetail.setStartTime(_ctx.stringValue("GetDISyncTaskResponse.Data.SolutionDetail.StartTime"));
		solutionDetail.setCreatorName(_ctx.stringValue("GetDISyncTaskResponse.Data.SolutionDetail.CreatorName"));
		solutionDetail.setProjectId(_ctx.longValue("GetDISyncTaskResponse.Data.SolutionDetail.ProjectId"));
		solutionDetail.setSourceType(_ctx.stringValue("GetDISyncTaskResponse.Data.SolutionDetail.SourceType"));
		solutionDetail.setProcessContent(_ctx.stringValue("GetDISyncTaskResponse.Data.SolutionDetail.ProcessContent"));
		solutionDetail.setName(_ctx.stringValue("GetDISyncTaskResponse.Data.SolutionDetail.Name"));
		solutionDetail.setProcessExtra(_ctx.stringValue("GetDISyncTaskResponse.Data.SolutionDetail.ProcessExtra"));
		solutionDetail.setSubmitTime(_ctx.stringValue("GetDISyncTaskResponse.Data.SolutionDetail.SubmitTime"));
		solutionDetail.setId(_ctx.longValue("GetDISyncTaskResponse.Data.SolutionDetail.Id"));
		data.setSolutionDetail(solutionDetail);
		getDISyncTaskResponse.setData(data);
	 
	 	return getDISyncTaskResponse;
	}
}