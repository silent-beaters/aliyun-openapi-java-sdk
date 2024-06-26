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

package com.aliyuncs.live.transform.v20161101;

import com.aliyuncs.live.model.v20161101.GetEdgeTranscodeTemplateResponse;
import com.aliyuncs.live.model.v20161101.GetEdgeTranscodeTemplateResponse.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEdgeTranscodeTemplateResponseUnmarshaller {

	public static GetEdgeTranscodeTemplateResponse unmarshall(GetEdgeTranscodeTemplateResponse getEdgeTranscodeTemplateResponse, UnmarshallerContext _ctx) {
		
		getEdgeTranscodeTemplateResponse.setRequestId(_ctx.stringValue("GetEdgeTranscodeTemplateResponse.RequestId"));

		Template template = new Template();
		template.setBitrate(_ctx.stringValue("GetEdgeTranscodeTemplateResponse.Template.Bitrate"));
		template.setCodec(_ctx.stringValue("GetEdgeTranscodeTemplateResponse.Template.Codec"));
		template.setCreateTime(_ctx.stringValue("GetEdgeTranscodeTemplateResponse.Template.CreateTime"));
		template.setFps(_ctx.stringValue("GetEdgeTranscodeTemplateResponse.Template.Fps"));
		template.setGop(_ctx.stringValue("GetEdgeTranscodeTemplateResponse.Template.Gop"));
		template.setName(_ctx.stringValue("GetEdgeTranscodeTemplateResponse.Template.Name"));
		template.setResolution(_ctx.stringValue("GetEdgeTranscodeTemplateResponse.Template.Resolution"));
		template.setTemplateId(_ctx.stringValue("GetEdgeTranscodeTemplateResponse.Template.TemplateId"));
		template.setType(_ctx.stringValue("GetEdgeTranscodeTemplateResponse.Template.Type"));
		getEdgeTranscodeTemplateResponse.setTemplate(template);
	 
	 	return getEdgeTranscodeTemplateResponse;
	}
}