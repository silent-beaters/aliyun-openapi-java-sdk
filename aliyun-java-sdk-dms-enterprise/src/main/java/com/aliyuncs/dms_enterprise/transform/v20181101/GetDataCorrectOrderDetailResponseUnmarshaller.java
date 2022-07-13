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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.GetDataCorrectOrderDetailResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataCorrectOrderDetailResponse.DataCorrectOrderDetail;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataCorrectOrderDetailResponse.DataCorrectOrderDetail.Database;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataCorrectOrderDetailResponse.DataCorrectOrderDetail.OrderDetail;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataCorrectOrderDetailResponse.DataCorrectOrderDetail.TaskCheckDO;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataCorrectOrderDetailResponseUnmarshaller {

	public static GetDataCorrectOrderDetailResponse unmarshall(GetDataCorrectOrderDetailResponse getDataCorrectOrderDetailResponse, UnmarshallerContext _ctx) {
		
		getDataCorrectOrderDetailResponse.setRequestId(_ctx.stringValue("GetDataCorrectOrderDetailResponse.RequestId"));
		getDataCorrectOrderDetailResponse.setErrorCode(_ctx.stringValue("GetDataCorrectOrderDetailResponse.ErrorCode"));
		getDataCorrectOrderDetailResponse.setErrorMessage(_ctx.stringValue("GetDataCorrectOrderDetailResponse.ErrorMessage"));
		getDataCorrectOrderDetailResponse.setSuccess(_ctx.booleanValue("GetDataCorrectOrderDetailResponse.Success"));

		DataCorrectOrderDetail dataCorrectOrderDetail = new DataCorrectOrderDetail();
		dataCorrectOrderDetail.setStatus(_ctx.stringValue("GetDataCorrectOrderDetailResponse.DataCorrectOrderDetail.Status"));
		dataCorrectOrderDetail.setExecMode(_ctx.stringValue("GetDataCorrectOrderDetailResponse.DataCorrectOrderDetail.ExecMode"));

		OrderDetail orderDetail = new OrderDetail();
		orderDetail.setRbSQL(_ctx.stringValue("GetDataCorrectOrderDetailResponse.DataCorrectOrderDetail.OrderDetail.RbSQL"));
		orderDetail.setRbAttachmentName(_ctx.stringValue("GetDataCorrectOrderDetailResponse.DataCorrectOrderDetail.OrderDetail.RbAttachmentName"));
		orderDetail.setClassify(_ctx.stringValue("GetDataCorrectOrderDetailResponse.DataCorrectOrderDetail.OrderDetail.Classify"));
		orderDetail.setExeSQL(_ctx.stringValue("GetDataCorrectOrderDetailResponse.DataCorrectOrderDetail.OrderDetail.ExeSQL"));
		orderDetail.setEstimateAffectRows(_ctx.longValue("GetDataCorrectOrderDetailResponse.DataCorrectOrderDetail.OrderDetail.EstimateAffectRows"));
		orderDetail.setRbSQLType(_ctx.stringValue("GetDataCorrectOrderDetailResponse.DataCorrectOrderDetail.OrderDetail.RbSQLType"));
		orderDetail.setActualAffectRows(_ctx.longValue("GetDataCorrectOrderDetailResponse.DataCorrectOrderDetail.OrderDetail.ActualAffectRows"));
		orderDetail.setIgnoreAffectRows(_ctx.booleanValue("GetDataCorrectOrderDetailResponse.DataCorrectOrderDetail.OrderDetail.IgnoreAffectRows"));
		orderDetail.setAttachmentName(_ctx.stringValue("GetDataCorrectOrderDetailResponse.DataCorrectOrderDetail.OrderDetail.AttachmentName"));
		orderDetail.setSqlType(_ctx.stringValue("GetDataCorrectOrderDetailResponse.DataCorrectOrderDetail.OrderDetail.SqlType"));
		orderDetail.setIgnoreAffectRowsReason(_ctx.stringValue("GetDataCorrectOrderDetailResponse.DataCorrectOrderDetail.OrderDetail.IgnoreAffectRowsReason"));
		dataCorrectOrderDetail.setOrderDetail(orderDetail);

		List<TaskCheckDO> preCheckDetail = new ArrayList<TaskCheckDO>();
		for (int i = 0; i < _ctx.lengthValue("GetDataCorrectOrderDetailResponse.DataCorrectOrderDetail.PreCheckDetail.Length"); i++) {
			TaskCheckDO taskCheckDO = new TaskCheckDO();
			taskCheckDO.setUserTip(_ctx.stringValue("GetDataCorrectOrderDetailResponse.DataCorrectOrderDetail.PreCheckDetail["+ i +"].UserTip"));
			taskCheckDO.setCheckStatus(_ctx.stringValue("GetDataCorrectOrderDetailResponse.DataCorrectOrderDetail.PreCheckDetail["+ i +"].CheckStatus"));
			taskCheckDO.setCheckStep(_ctx.stringValue("GetDataCorrectOrderDetailResponse.DataCorrectOrderDetail.PreCheckDetail["+ i +"].CheckStep"));

			preCheckDetail.add(taskCheckDO);
		}
		dataCorrectOrderDetail.setPreCheckDetail(preCheckDetail);

		List<Database> databaseList = new ArrayList<Database>();
		for (int i = 0; i < _ctx.lengthValue("GetDataCorrectOrderDetailResponse.DataCorrectOrderDetail.DatabaseList.Length"); i++) {
			Database database = new Database();
			database.setDbId(_ctx.integerValue("GetDataCorrectOrderDetailResponse.DataCorrectOrderDetail.DatabaseList["+ i +"].DbId"));
			database.setDbType(_ctx.stringValue("GetDataCorrectOrderDetailResponse.DataCorrectOrderDetail.DatabaseList["+ i +"].DbType"));
			database.setLogic(_ctx.booleanValue("GetDataCorrectOrderDetailResponse.DataCorrectOrderDetail.DatabaseList["+ i +"].Logic"));
			database.setSearchName(_ctx.stringValue("GetDataCorrectOrderDetailResponse.DataCorrectOrderDetail.DatabaseList["+ i +"].SearchName"));
			database.setEnvType(_ctx.stringValue("GetDataCorrectOrderDetailResponse.DataCorrectOrderDetail.DatabaseList["+ i +"].EnvType"));

			databaseList.add(database);
		}
		dataCorrectOrderDetail.setDatabaseList(databaseList);
		getDataCorrectOrderDetailResponse.setDataCorrectOrderDetail(dataCorrectOrderDetail);
	 
	 	return getDataCorrectOrderDetailResponse;
	}
}