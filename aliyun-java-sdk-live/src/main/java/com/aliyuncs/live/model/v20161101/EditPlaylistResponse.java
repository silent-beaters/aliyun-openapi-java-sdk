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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.EditPlaylistResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class EditPlaylistResponse extends AcsResponse {

	private String casterId;

	private String programId;

	private String requestId;

	private Items items;

	public String getCasterId() {
		return this.casterId;
	}

	public void setCasterId(String casterId) {
		this.casterId = casterId;
	}

	public String getProgramId() {
		return this.programId;
	}

	public void setProgramId(String programId) {
		this.programId = programId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Items getItems() {
		return this.items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	public static class Items {

		private List<FailedItem> failedItems;

		private List<SuccessItem> successItems;

		public List<FailedItem> getFailedItems() {
			return this.failedItems;
		}

		public void setFailedItems(List<FailedItem> failedItems) {
			this.failedItems = failedItems;
		}

		public List<SuccessItem> getSuccessItems() {
			return this.successItems;
		}

		public void setSuccessItems(List<SuccessItem> successItems) {
			this.successItems = successItems;
		}

		public static class FailedItem {

			private String itemId;

			private String itemName;

			public String getItemId() {
				return this.itemId;
			}

			public void setItemId(String itemId) {
				this.itemId = itemId;
			}

			public String getItemName() {
				return this.itemName;
			}

			public void setItemName(String itemName) {
				this.itemName = itemName;
			}
		}

		public static class SuccessItem {

			private String itemId;

			private String itemName;

			public String getItemId() {
				return this.itemId;
			}

			public void setItemId(String itemId) {
				this.itemId = itemId;
			}

			public String getItemName() {
				return this.itemName;
			}

			public void setItemName(String itemName) {
				this.itemName = itemName;
			}
		}
	}

	@Override
	public EditPlaylistResponse getInstance(UnmarshallerContext context) {
		return	EditPlaylistResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
