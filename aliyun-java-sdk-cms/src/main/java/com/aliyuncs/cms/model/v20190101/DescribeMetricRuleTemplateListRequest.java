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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeMetricRuleTemplateListRequest extends RpcAcsRequest<DescribeMetricRuleTemplateListResponse> {
	   

	private String orderBy;

	private Boolean history;

	private Long templateId;

	private Long pageNumber;

	private String name;

	private Long pageSize;

	private String keyword;

	private Boolean order;
	public DescribeMetricRuleTemplateListRequest() {
		super("Cms", "2019-01-01", "DescribeMetricRuleTemplateList", "cms");
		setMethod(MethodType.POST);
	}

	public String getOrderBy() {
		return this.orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
		if(orderBy != null){
			putQueryParameter("OrderBy", orderBy);
		}
	}

	public Boolean getHistory() {
		return this.history;
	}

	public void setHistory(Boolean history) {
		this.history = history;
		if(history != null){
			putQueryParameter("History", history.toString());
		}
	}

	public Long getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putQueryParameter("TemplateId", templateId.toString());
		}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putQueryParameter("Keyword", keyword);
		}
	}

	public Boolean getOrder() {
		return this.order;
	}

	public void setOrder(Boolean order) {
		this.order = order;
		if(order != null){
			putQueryParameter("Order", order.toString());
		}
	}

	@Override
	public Class<DescribeMetricRuleTemplateListResponse> getResponseClass() {
		return DescribeMetricRuleTemplateListResponse.class;
	}

}
