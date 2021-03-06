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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeImageCopyingTasksResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeImageCopyingTasksResponse.ImageTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeImageCopyingTasksResponseUnmarshaller {

	public static OpsDescribeImageCopyingTasksResponse unmarshall(OpsDescribeImageCopyingTasksResponse opsDescribeImageCopyingTasksResponse, UnmarshallerContext _ctx) {
		
		opsDescribeImageCopyingTasksResponse.setRequestId(_ctx.stringValue("OpsDescribeImageCopyingTasksResponse.RequestId"));
		opsDescribeImageCopyingTasksResponse.setTotalCount(_ctx.integerValue("OpsDescribeImageCopyingTasksResponse.TotalCount"));
		opsDescribeImageCopyingTasksResponse.setPageNumber(_ctx.integerValue("OpsDescribeImageCopyingTasksResponse.PageNumber"));
		opsDescribeImageCopyingTasksResponse.setPageSize(_ctx.integerValue("OpsDescribeImageCopyingTasksResponse.PageSize"));

		List<ImageTask> imageTasks = new ArrayList<ImageTask>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeImageCopyingTasksResponse.ImageTasks.Length"); i++) {
			ImageTask imageTask = new ImageTask();
			imageTask.setResourceOwnerId(_ctx.longValue("OpsDescribeImageCopyingTasksResponse.ImageTasks["+ i +"].ResourceOwnerId"));
			imageTask.setTaskId(_ctx.stringValue("OpsDescribeImageCopyingTasksResponse.ImageTasks["+ i +"].TaskId"));
			imageTask.setTaskType(_ctx.stringValue("OpsDescribeImageCopyingTasksResponse.ImageTasks["+ i +"].TaskType"));
			imageTask.setStatus(_ctx.stringValue("OpsDescribeImageCopyingTasksResponse.ImageTasks["+ i +"].Status"));
			imageTask.setCopiedBlock(_ctx.integerValue("OpsDescribeImageCopyingTasksResponse.ImageTasks["+ i +"].CopiedBlock"));
			imageTask.setTotalBlock(_ctx.integerValue("OpsDescribeImageCopyingTasksResponse.ImageTasks["+ i +"].TotalBlock"));
			imageTask.setSrcRegionId(_ctx.stringValue("OpsDescribeImageCopyingTasksResponse.ImageTasks["+ i +"].SrcRegionId"));
			imageTask.setSrcInfo(_ctx.stringValue("OpsDescribeImageCopyingTasksResponse.ImageTasks["+ i +"].SrcInfo"));
			imageTask.setDstRegionId(_ctx.stringValue("OpsDescribeImageCopyingTasksResponse.ImageTasks["+ i +"].DstRegionId"));
			imageTask.setDstInfo(_ctx.stringValue("OpsDescribeImageCopyingTasksResponse.ImageTasks["+ i +"].DstInfo"));
			imageTask.setCreatedTime(_ctx.longValue("OpsDescribeImageCopyingTasksResponse.ImageTasks["+ i +"].CreatedTime"));
			imageTask.setModifiedTime(_ctx.longValue("OpsDescribeImageCopyingTasksResponse.ImageTasks["+ i +"].ModifiedTime"));

			imageTasks.add(imageTask);
		}
		opsDescribeImageCopyingTasksResponse.setImageTasks(imageTasks);
	 
	 	return opsDescribeImageCopyingTasksResponse;
	}
}