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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.ListCallDetailRecordsResponse;
import com.aliyuncs.ccc.model.v20170705.ListCallDetailRecordsResponse.CallDetailRecords;
import com.aliyuncs.ccc.model.v20170705.ListCallDetailRecordsResponse.CallDetailRecords.CallDetailRecord;
import com.aliyuncs.ccc.model.v20170705.ListCallDetailRecordsResponse.CallDetailRecords.CallDetailRecord.CallDetailAgent;
import com.aliyuncs.ccc.model.v20170705.ListCallDetailRecordsResponse.CallDetailRecords.CallDetailRecord.Recording;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCallDetailRecordsResponseUnmarshaller {

	public static ListCallDetailRecordsResponse unmarshall(ListCallDetailRecordsResponse listCallDetailRecordsResponse, UnmarshallerContext _ctx) {
		
		listCallDetailRecordsResponse.setRequestId(_ctx.stringValue("ListCallDetailRecordsResponse.RequestId"));
		listCallDetailRecordsResponse.setHttpStatusCode(_ctx.integerValue("ListCallDetailRecordsResponse.HttpStatusCode"));
		listCallDetailRecordsResponse.setCode(_ctx.stringValue("ListCallDetailRecordsResponse.Code"));
		listCallDetailRecordsResponse.setMessage(_ctx.stringValue("ListCallDetailRecordsResponse.Message"));
		listCallDetailRecordsResponse.setSuccess(_ctx.booleanValue("ListCallDetailRecordsResponse.Success"));

		CallDetailRecords callDetailRecords = new CallDetailRecords();
		callDetailRecords.setPageNumber(_ctx.integerValue("ListCallDetailRecordsResponse.CallDetailRecords.PageNumber"));
		callDetailRecords.setPageSize(_ctx.integerValue("ListCallDetailRecordsResponse.CallDetailRecords.PageSize"));
		callDetailRecords.setTotalCount(_ctx.integerValue("ListCallDetailRecordsResponse.CallDetailRecords.TotalCount"));

		List<CallDetailRecord> list = new ArrayList<CallDetailRecord>();
		for (int i = 0; i < _ctx.lengthValue("ListCallDetailRecordsResponse.CallDetailRecords.List.Length"); i++) {
			CallDetailRecord callDetailRecord = new CallDetailRecord();
			callDetailRecord.setContactDisposition(_ctx.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].ContactDisposition"));
			callDetailRecord.setContactType(_ctx.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].ContactType"));
			callDetailRecord.setSkillGroupIdList(_ctx.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].SkillGroupIdList"));
			callDetailRecord.setInstanceId(_ctx.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].InstanceId"));
			callDetailRecord.setCalledNumber(_ctx.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].CalledNumber"));
			callDetailRecord.setAgentNames(_ctx.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].AgentNames"));
			callDetailRecord.setSatisfaction(_ctx.integerValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Satisfaction"));
			callDetailRecord.setStartTime(_ctx.longValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].StartTime"));
			callDetailRecord.setSatisfactionDesc(_ctx.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].SatisfactionDesc"));
			callDetailRecord.setContactId(_ctx.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].ContactId"));
			callDetailRecord.setCallingNumber(_ctx.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].CallingNumber"));
			callDetailRecord.setDuration(_ctx.integerValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Duration"));
			callDetailRecord.setSkillGroupNames(_ctx.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].SkillGroupNames"));
			callDetailRecord.setFeedback(_ctx.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Feedback"));

			List<CallDetailAgent> agents = new ArrayList<CallDetailAgent>();
			for (int j = 0; j < _ctx.lengthValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Agents.Length"); j++) {
				CallDetailAgent callDetailAgent = new CallDetailAgent();
				callDetailAgent.setSatisfaction(_ctx.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].Satisfaction"));
				callDetailAgent.setFeedback(_ctx.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].Feedback"));
				callDetailAgent.setAgentId(_ctx.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].AgentId"));

				agents.add(callDetailAgent);
			}
			callDetailRecord.setAgents(agents);

			List<Recording> recordings = new ArrayList<Recording>();
			for (int j = 0; j < _ctx.lengthValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Recordings.Length"); j++) {
				Recording recording = new Recording();
				recording.setStartTime(_ctx.longValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].StartTime"));
				recording.setContactId(_ctx.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].ContactId"));
				recording.setQualityCheckTaskId(_ctx.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].QualityCheckTaskId"));
				recording.setAgentId(_ctx.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].AgentId"));
				recording.setFileDescription(_ctx.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].FileDescription"));
				recording.setDuration(_ctx.integerValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].Duration"));
				recording.setAgentName(_ctx.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].AgentName"));
				recording.setFileName(_ctx.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].FileName"));
				recording.setQualityCheckTid(_ctx.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].QualityCheckTid"));

				recordings.add(recording);
			}
			callDetailRecord.setRecordings(recordings);

			list.add(callDetailRecord);
		}
		callDetailRecords.setList(list);
		listCallDetailRecordsResponse.setCallDetailRecords(callDetailRecords);
	 
	 	return listCallDetailRecordsResponse;
	}
}