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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeStrategyTargetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeStrategyTargetResponse extends AcsResponse {

	private String requestId;

	private List<StrategyTarget> strategyTargets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<StrategyTarget> getStrategyTargets() {
		return this.strategyTargets;
	}

	public void setStrategyTargets(List<StrategyTarget> strategyTargets) {
		this.strategyTargets = strategyTargets;
	}

	public static class StrategyTarget {

		private Integer bindUuidCount;

		private String flag;

		private String target;

		private String targetType;

		public Integer getBindUuidCount() {
			return this.bindUuidCount;
		}

		public void setBindUuidCount(Integer bindUuidCount) {
			this.bindUuidCount = bindUuidCount;
		}

		public String getFlag() {
			return this.flag;
		}

		public void setFlag(String flag) {
			this.flag = flag;
		}

		public String getTarget() {
			return this.target;
		}

		public void setTarget(String target) {
			this.target = target;
		}

		public String getTargetType() {
			return this.targetType;
		}

		public void setTargetType(String targetType) {
			this.targetType = targetType;
		}
	}

	@Override
	public DescribeStrategyTargetResponse getInstance(UnmarshallerContext context) {
		return	DescribeStrategyTargetResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
