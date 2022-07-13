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

package com.aliyuncs.adb.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeAllDataSourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAllDataSourceResponse extends AcsResponse {

	private String requestId;

	private List<Table> tables;

	private List<Column> columns;

	private List<Schema> schemas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Table> getTables() {
		return this.tables;
	}

	public void setTables(List<Table> tables) {
		this.tables = tables;
	}

	public List<Column> getColumns() {
		return this.columns;
	}

	public void setColumns(List<Column> columns) {
		this.columns = columns;
	}

	public List<Schema> getSchemas() {
		return this.schemas;
	}

	public void setSchemas(List<Schema> schemas) {
		this.schemas = schemas;
	}

	public static class Table {

		private String tableName;

		private String dBClusterId;

		private String schemaName;

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getDBClusterId() {
			return this.dBClusterId;
		}

		public void setDBClusterId(String dBClusterId) {
			this.dBClusterId = dBClusterId;
		}

		public String getSchemaName() {
			return this.schemaName;
		}

		public void setSchemaName(String schemaName) {
			this.schemaName = schemaName;
		}
	}

	public static class Column {

		private String type;

		private String columnName;

		private String tableName;

		private Boolean autoIncrementColumn;

		private String dBClusterId;

		private Boolean primaryKey;

		private String schemaName;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getColumnName() {
			return this.columnName;
		}

		public void setColumnName(String columnName) {
			this.columnName = columnName;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public Boolean getAutoIncrementColumn() {
			return this.autoIncrementColumn;
		}

		public void setAutoIncrementColumn(Boolean autoIncrementColumn) {
			this.autoIncrementColumn = autoIncrementColumn;
		}

		public String getDBClusterId() {
			return this.dBClusterId;
		}

		public void setDBClusterId(String dBClusterId) {
			this.dBClusterId = dBClusterId;
		}

		public Boolean getPrimaryKey() {
			return this.primaryKey;
		}

		public void setPrimaryKey(Boolean primaryKey) {
			this.primaryKey = primaryKey;
		}

		public String getSchemaName() {
			return this.schemaName;
		}

		public void setSchemaName(String schemaName) {
			this.schemaName = schemaName;
		}
	}

	public static class Schema {

		private String dBClusterId;

		private String schemaName;

		public String getDBClusterId() {
			return this.dBClusterId;
		}

		public void setDBClusterId(String dBClusterId) {
			this.dBClusterId = dBClusterId;
		}

		public String getSchemaName() {
			return this.schemaName;
		}

		public void setSchemaName(String schemaName) {
			this.schemaName = schemaName;
		}
	}

	@Override
	public DescribeAllDataSourceResponse getInstance(UnmarshallerContext context) {
		return	DescribeAllDataSourceResponseUnmarshaller.unmarshall(this, context);
	}
}
