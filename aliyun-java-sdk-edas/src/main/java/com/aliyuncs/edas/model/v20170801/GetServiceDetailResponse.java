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

package com.aliyuncs.edas.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.GetServiceDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetServiceDetailResponse extends AcsResponse {

	private Integer code;

	private String message;

	private Boolean success;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String edasAppName;

		private String dubboApplicationName;

		private String version;

		private String registryType;

		private String springApplicationName;

		private String serviceType;

		private String serviceName;

		private String metadata;

		private String group;

		private List<Method> methods;

		public String getEdasAppName() {
			return this.edasAppName;
		}

		public void setEdasAppName(String edasAppName) {
			this.edasAppName = edasAppName;
		}

		public String getDubboApplicationName() {
			return this.dubboApplicationName;
		}

		public void setDubboApplicationName(String dubboApplicationName) {
			this.dubboApplicationName = dubboApplicationName;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getRegistryType() {
			return this.registryType;
		}

		public void setRegistryType(String registryType) {
			this.registryType = registryType;
		}

		public String getSpringApplicationName() {
			return this.springApplicationName;
		}

		public void setSpringApplicationName(String springApplicationName) {
			this.springApplicationName = springApplicationName;
		}

		public String getServiceType() {
			return this.serviceType;
		}

		public void setServiceType(String serviceType) {
			this.serviceType = serviceType;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getMetadata() {
			return this.metadata;
		}

		public void setMetadata(String metadata) {
			this.metadata = metadata;
		}

		public String getGroup() {
			return this.group;
		}

		public void setGroup(String group) {
			this.group = group;
		}

		public List<Method> getMethods() {
			return this.methods;
		}

		public void setMethods(List<Method> methods) {
			this.methods = methods;
		}

		public static class Method {

			private String parameterDetails;

			private String nameDetail;

			private String parameterNames;

			private String parameterDefinitions;

			private String paths;

			private String parameterTypes;

			private String requestMethods;

			private String returnDetails;

			private String name;

			private String methodController;

			private String returnType;

			private ReturnDefinition returnDefinition;

			public String getParameterDetails() {
				return this.parameterDetails;
			}

			public void setParameterDetails(String parameterDetails) {
				this.parameterDetails = parameterDetails;
			}

			public String getNameDetail() {
				return this.nameDetail;
			}

			public void setNameDetail(String nameDetail) {
				this.nameDetail = nameDetail;
			}

			public String getParameterNames() {
				return this.parameterNames;
			}

			public void setParameterNames(String parameterNames) {
				this.parameterNames = parameterNames;
			}

			public String getParameterDefinitions() {
				return this.parameterDefinitions;
			}

			public void setParameterDefinitions(String parameterDefinitions) {
				this.parameterDefinitions = parameterDefinitions;
			}

			public String getPaths() {
				return this.paths;
			}

			public void setPaths(String paths) {
				this.paths = paths;
			}

			public String getParameterTypes() {
				return this.parameterTypes;
			}

			public void setParameterTypes(String parameterTypes) {
				this.parameterTypes = parameterTypes;
			}

			public String getRequestMethods() {
				return this.requestMethods;
			}

			public void setRequestMethods(String requestMethods) {
				this.requestMethods = requestMethods;
			}

			public String getReturnDetails() {
				return this.returnDetails;
			}

			public void setReturnDetails(String returnDetails) {
				this.returnDetails = returnDetails;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getMethodController() {
				return this.methodController;
			}

			public void setMethodController(String methodController) {
				this.methodController = methodController;
			}

			public String getReturnType() {
				return this.returnType;
			}

			public void setReturnType(String returnType) {
				this.returnType = returnType;
			}

			public ReturnDefinition getReturnDefinition() {
				return this.returnDefinition;
			}

			public void setReturnDefinition(ReturnDefinition returnDefinition) {
				this.returnDefinition = returnDefinition;
			}

			public static class ReturnDefinition {

				private String type;

				private String id;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}
			}
		}
	}

	@Override
	public GetServiceDetailResponse getInstance(UnmarshallerContext context) {
		return	GetServiceDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
