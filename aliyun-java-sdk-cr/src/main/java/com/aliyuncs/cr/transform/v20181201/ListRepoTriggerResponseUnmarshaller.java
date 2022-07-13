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

package com.aliyuncs.cr.transform.v20181201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cr.model.v20181201.ListRepoTriggerResponse;
import com.aliyuncs.cr.model.v20181201.ListRepoTriggerResponse.TriggersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRepoTriggerResponseUnmarshaller {

	public static ListRepoTriggerResponse unmarshall(ListRepoTriggerResponse listRepoTriggerResponse, UnmarshallerContext _ctx) {
		
		listRepoTriggerResponse.setRequestId(_ctx.stringValue("ListRepoTriggerResponse.RequestId"));
		listRepoTriggerResponse.setCode(_ctx.stringValue("ListRepoTriggerResponse.Code"));
		listRepoTriggerResponse.setIsSuccess(_ctx.booleanValue("ListRepoTriggerResponse.IsSuccess"));

		List<TriggersItem> triggers = new ArrayList<TriggersItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRepoTriggerResponse.Triggers.Length"); i++) {
			TriggersItem triggersItem = new TriggersItem();
			triggersItem.setTriggerName(_ctx.stringValue("ListRepoTriggerResponse.Triggers["+ i +"].TriggerName"));
			triggersItem.setRepoEvent(_ctx.stringValue("ListRepoTriggerResponse.Triggers["+ i +"].RepoEvent"));
			triggersItem.setTriggerId(_ctx.stringValue("ListRepoTriggerResponse.Triggers["+ i +"].TriggerId"));
			triggersItem.setTriggerUrl(_ctx.stringValue("ListRepoTriggerResponse.Triggers["+ i +"].TriggerUrl"));
			triggersItem.setTriggerType(_ctx.stringValue("ListRepoTriggerResponse.Triggers["+ i +"].TriggerType"));
			triggersItem.setTriggerTag(_ctx.stringValue("ListRepoTriggerResponse.Triggers["+ i +"].TriggerTag"));

			triggers.add(triggersItem);
		}
		listRepoTriggerResponse.setTriggers(triggers);
	 
	 	return listRepoTriggerResponse;
	}
}