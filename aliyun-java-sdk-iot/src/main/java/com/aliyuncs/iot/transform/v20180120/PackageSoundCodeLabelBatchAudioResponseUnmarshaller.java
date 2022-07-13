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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.PackageSoundCodeLabelBatchAudioResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PackageSoundCodeLabelBatchAudioResponseUnmarshaller {

	public static PackageSoundCodeLabelBatchAudioResponse unmarshall(PackageSoundCodeLabelBatchAudioResponse packageSoundCodeLabelBatchAudioResponse, UnmarshallerContext _ctx) {
		
		packageSoundCodeLabelBatchAudioResponse.setRequestId(_ctx.stringValue("PackageSoundCodeLabelBatchAudioResponse.RequestId"));
		packageSoundCodeLabelBatchAudioResponse.setSuccess(_ctx.booleanValue("PackageSoundCodeLabelBatchAudioResponse.Success"));
		packageSoundCodeLabelBatchAudioResponse.setCode(_ctx.stringValue("PackageSoundCodeLabelBatchAudioResponse.Code"));
		packageSoundCodeLabelBatchAudioResponse.setErrorMessage(_ctx.stringValue("PackageSoundCodeLabelBatchAudioResponse.ErrorMessage"));
		packageSoundCodeLabelBatchAudioResponse.setData(_ctx.stringValue("PackageSoundCodeLabelBatchAudioResponse.Data"));
	 
	 	return packageSoundCodeLabelBatchAudioResponse;
	}
}