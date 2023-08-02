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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.ListCollectionsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCollectionsResponseUnmarshaller {

	public static ListCollectionsResponse unmarshall(ListCollectionsResponse listCollectionsResponse, UnmarshallerContext _ctx) {
		
		listCollectionsResponse.setRequestId(_ctx.stringValue("ListCollectionsResponse.RequestId"));
		listCollectionsResponse.setCount(_ctx.integerValue("ListCollectionsResponse.Count"));
		listCollectionsResponse.setDBInstanceId(_ctx.stringValue("ListCollectionsResponse.DBInstanceId"));
		listCollectionsResponse.setRegionId(_ctx.stringValue("ListCollectionsResponse.RegionId"));
		listCollectionsResponse.setNamespace(_ctx.stringValue("ListCollectionsResponse.Namespace"));
		listCollectionsResponse.setMessage(_ctx.stringValue("ListCollectionsResponse.Message"));
		listCollectionsResponse.setStatus(_ctx.stringValue("ListCollectionsResponse.Status"));

		List<String> collections = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListCollectionsResponse.Collections.Length"); i++) {
			collections.add(_ctx.stringValue("ListCollectionsResponse.Collections["+ i +"]"));
		}
		listCollectionsResponse.setCollections(collections);
	 
	 	return listCollectionsResponse;
	}
}