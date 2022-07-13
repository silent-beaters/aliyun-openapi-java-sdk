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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.GetTranscodeTemplateGroupResponse;
import com.aliyuncs.vod.model.v20170321.GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup;
import com.aliyuncs.vod.model.v20170321.GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplate;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTranscodeTemplateGroupResponseUnmarshaller {

	public static GetTranscodeTemplateGroupResponse unmarshall(GetTranscodeTemplateGroupResponse getTranscodeTemplateGroupResponse, UnmarshallerContext _ctx) {
		
		getTranscodeTemplateGroupResponse.setRequestId(_ctx.stringValue("GetTranscodeTemplateGroupResponse.RequestId"));

		TranscodeTemplateGroup transcodeTemplateGroup = new TranscodeTemplateGroup();
		transcodeTemplateGroup.setCreationTime(_ctx.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.CreationTime"));
		transcodeTemplateGroup.setTranscodeMode(_ctx.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeMode"));
		transcodeTemplateGroup.setIsDefault(_ctx.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.IsDefault"));
		transcodeTemplateGroup.setAppId(_ctx.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.AppId"));
		transcodeTemplateGroup.setTranscodeTemplateGroupId(_ctx.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateGroupId"));
		transcodeTemplateGroup.setName(_ctx.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.Name"));
		transcodeTemplateGroup.setModifyTime(_ctx.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.ModifyTime"));
		transcodeTemplateGroup.setLocked(_ctx.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.Locked"));

		List<TranscodeTemplate> transcodeTemplateList = new ArrayList<TranscodeTemplate>();
		for (int i = 0; i < _ctx.lengthValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList.Length"); i++) {
			TranscodeTemplate transcodeTemplate = new TranscodeTemplate();
			transcodeTemplate.setType(_ctx.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].Type"));
			transcodeTemplate.setVideo(_ctx.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].Video"));
			transcodeTemplate.setTransConfig(_ctx.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].TransConfig"));
			transcodeTemplate.setRotate(_ctx.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].Rotate"));
			transcodeTemplate.setTranscodeTemplateId(_ctx.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].TranscodeTemplateId"));
			transcodeTemplate.setTemplateName(_ctx.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].TemplateName"));
			transcodeTemplate.setEncryptSetting(_ctx.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].EncryptSetting"));
			transcodeTemplate.setAudio(_ctx.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].Audio"));
			transcodeTemplate.setTranscodeFileRegular(_ctx.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].TranscodeFileRegular"));
			transcodeTemplate.setContainer(_ctx.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].Container"));
			transcodeTemplate.setClip(_ctx.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].Clip"));
			transcodeTemplate.setDefinition(_ctx.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].Definition"));
			transcodeTemplate.setPackageSetting(_ctx.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].PackageSetting"));
			transcodeTemplate.setOpeningList(_ctx.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].OpeningList"));
			transcodeTemplate.setUserData(_ctx.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].UserData"));
			transcodeTemplate.setSubtitleList(_ctx.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].SubtitleList"));
			transcodeTemplate.setMuxConfig(_ctx.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].MuxConfig"));
			transcodeTemplate.setTailSlateList(_ctx.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].TailSlateList"));

			List<String> watermarkIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].WatermarkIds.Length"); j++) {
				watermarkIds.add(_ctx.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].WatermarkIds["+ j +"]"));
			}
			transcodeTemplate.setWatermarkIds(watermarkIds);

			transcodeTemplateList.add(transcodeTemplate);
		}
		transcodeTemplateGroup.setTranscodeTemplateList(transcodeTemplateList);
		getTranscodeTemplateGroupResponse.setTranscodeTemplateGroup(transcodeTemplateGroup);
	 
	 	return getTranscodeTemplateGroupResponse;
	}
}