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

package com.aliyuncs.config.transform.v20200907;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20200907.ListAggregateConfigRuleEvaluationResultsResponse;
import com.aliyuncs.config.model.v20200907.ListAggregateConfigRuleEvaluationResultsResponse.EvaluationResults;
import com.aliyuncs.config.model.v20200907.ListAggregateConfigRuleEvaluationResultsResponse.EvaluationResults.EvaluationResult;
import com.aliyuncs.config.model.v20200907.ListAggregateConfigRuleEvaluationResultsResponse.EvaluationResults.EvaluationResult.EvaluationResultIdentifier;
import com.aliyuncs.config.model.v20200907.ListAggregateConfigRuleEvaluationResultsResponse.EvaluationResults.EvaluationResult.EvaluationResultIdentifier.EvaluationResultQualifier;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAggregateConfigRuleEvaluationResultsResponseUnmarshaller {

	public static ListAggregateConfigRuleEvaluationResultsResponse unmarshall(ListAggregateConfigRuleEvaluationResultsResponse listAggregateConfigRuleEvaluationResultsResponse, UnmarshallerContext _ctx) {
		
		listAggregateConfigRuleEvaluationResultsResponse.setRequestId(_ctx.stringValue("ListAggregateConfigRuleEvaluationResultsResponse.RequestId"));

		EvaluationResults evaluationResults = new EvaluationResults();
		evaluationResults.setNextToken(_ctx.stringValue("ListAggregateConfigRuleEvaluationResultsResponse.EvaluationResults.NextToken"));
		evaluationResults.setMaxResults(_ctx.integerValue("ListAggregateConfigRuleEvaluationResultsResponse.EvaluationResults.MaxResults"));

		List<EvaluationResult> evaluationResultList = new ArrayList<EvaluationResult>();
		for (int i = 0; i < _ctx.lengthValue("ListAggregateConfigRuleEvaluationResultsResponse.EvaluationResults.EvaluationResultList.Length"); i++) {
			EvaluationResult evaluationResult = new EvaluationResult();
			evaluationResult.setRiskLevel(_ctx.integerValue("ListAggregateConfigRuleEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].RiskLevel"));
			evaluationResult.setComplianceType(_ctx.stringValue("ListAggregateConfigRuleEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].ComplianceType"));
			evaluationResult.setResultRecordedTimestamp(_ctx.longValue("ListAggregateConfigRuleEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].ResultRecordedTimestamp"));
			evaluationResult.setAnnotation(_ctx.stringValue("ListAggregateConfigRuleEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].Annotation"));
			evaluationResult.setConfigRuleInvokedTimestamp(_ctx.longValue("ListAggregateConfigRuleEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].ConfigRuleInvokedTimestamp"));
			evaluationResult.setInvokingEventMessageType(_ctx.stringValue("ListAggregateConfigRuleEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].InvokingEventMessageType"));
			evaluationResult.setRemediationEnabled(_ctx.booleanValue("ListAggregateConfigRuleEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].RemediationEnabled"));

			EvaluationResultIdentifier evaluationResultIdentifier = new EvaluationResultIdentifier();
			evaluationResultIdentifier.setOrderingTimestamp(_ctx.longValue("ListAggregateConfigRuleEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].EvaluationResultIdentifier.OrderingTimestamp"));

			EvaluationResultQualifier evaluationResultQualifier = new EvaluationResultQualifier();
			evaluationResultQualifier.setResourceOwnerId(_ctx.longValue("ListAggregateConfigRuleEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].EvaluationResultIdentifier.EvaluationResultQualifier.ResourceOwnerId"));
			evaluationResultQualifier.setConfigRuleArn(_ctx.stringValue("ListAggregateConfigRuleEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].EvaluationResultIdentifier.EvaluationResultQualifier.ConfigRuleArn"));
			evaluationResultQualifier.setResourceType(_ctx.stringValue("ListAggregateConfigRuleEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].EvaluationResultIdentifier.EvaluationResultQualifier.ResourceType"));
			evaluationResultQualifier.setConfigRuleName(_ctx.stringValue("ListAggregateConfigRuleEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].EvaluationResultIdentifier.EvaluationResultQualifier.ConfigRuleName"));
			evaluationResultQualifier.setResourceId(_ctx.stringValue("ListAggregateConfigRuleEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].EvaluationResultIdentifier.EvaluationResultQualifier.ResourceId"));
			evaluationResultQualifier.setConfigRuleId(_ctx.stringValue("ListAggregateConfigRuleEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].EvaluationResultIdentifier.EvaluationResultQualifier.ConfigRuleId"));
			evaluationResultQualifier.setResourceName(_ctx.stringValue("ListAggregateConfigRuleEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].EvaluationResultIdentifier.EvaluationResultQualifier.ResourceName"));
			evaluationResultQualifier.setRegionId(_ctx.stringValue("ListAggregateConfigRuleEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].EvaluationResultIdentifier.EvaluationResultQualifier.RegionId"));
			evaluationResultQualifier.setCompliancePackId(_ctx.stringValue("ListAggregateConfigRuleEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].EvaluationResultIdentifier.EvaluationResultQualifier.CompliancePackId"));
			evaluationResultQualifier.setIgnoreDate(_ctx.stringValue("ListAggregateConfigRuleEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].EvaluationResultIdentifier.EvaluationResultQualifier.IgnoreDate"));
			evaluationResultIdentifier.setEvaluationResultQualifier(evaluationResultQualifier);
			evaluationResult.setEvaluationResultIdentifier(evaluationResultIdentifier);

			evaluationResultList.add(evaluationResult);
		}
		evaluationResults.setEvaluationResultList(evaluationResultList);
		listAggregateConfigRuleEvaluationResultsResponse.setEvaluationResults(evaluationResults);
	 
	 	return listAggregateConfigRuleEvaluationResultsResponse;
	}
}