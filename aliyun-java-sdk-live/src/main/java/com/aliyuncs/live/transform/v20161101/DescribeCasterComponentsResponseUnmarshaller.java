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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeCasterComponentsResponse;
import com.aliyuncs.live.model.v20161101.DescribeCasterComponentsResponse.Component;
import com.aliyuncs.live.model.v20161101.DescribeCasterComponentsResponse.Component.CaptionLayerContent;
import com.aliyuncs.live.model.v20161101.DescribeCasterComponentsResponse.Component.ComponentLayer;
import com.aliyuncs.live.model.v20161101.DescribeCasterComponentsResponse.Component.ImageLayerContent;
import com.aliyuncs.live.model.v20161101.DescribeCasterComponentsResponse.Component.TextLayerContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCasterComponentsResponseUnmarshaller {

	public static DescribeCasterComponentsResponse unmarshall(DescribeCasterComponentsResponse describeCasterComponentsResponse, UnmarshallerContext _ctx) {
		
		describeCasterComponentsResponse.setRequestId(_ctx.stringValue("DescribeCasterComponentsResponse.RequestId"));
		describeCasterComponentsResponse.setTotal(_ctx.integerValue("DescribeCasterComponentsResponse.Total"));

		List<Component> components = new ArrayList<Component>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCasterComponentsResponse.Components.Length"); i++) {
			Component component = new Component();
			component.setComponentId(_ctx.stringValue("DescribeCasterComponentsResponse.Components["+ i +"].ComponentId"));
			component.setComponentName(_ctx.stringValue("DescribeCasterComponentsResponse.Components["+ i +"].ComponentName"));
			component.setComponentType(_ctx.stringValue("DescribeCasterComponentsResponse.Components["+ i +"].ComponentType"));
			component.setEffect(_ctx.stringValue("DescribeCasterComponentsResponse.Components["+ i +"].Effect"));
			component.setLocationId(_ctx.stringValue("DescribeCasterComponentsResponse.Components["+ i +"].LocationId"));

			CaptionLayerContent captionLayerContent = new CaptionLayerContent();
			captionLayerContent.setBorderColor(_ctx.stringValue("DescribeCasterComponentsResponse.Components["+ i +"].CaptionLayerContent.BorderColor"));
			captionLayerContent.setBorderWidthNormalized(_ctx.floatValue("DescribeCasterComponentsResponse.Components["+ i +"].CaptionLayerContent.BorderWidthNormalized"));
			captionLayerContent.setColor(_ctx.stringValue("DescribeCasterComponentsResponse.Components["+ i +"].CaptionLayerContent.Color"));
			captionLayerContent.setFontName(_ctx.stringValue("DescribeCasterComponentsResponse.Components["+ i +"].CaptionLayerContent.FontName"));
			captionLayerContent.setLineSpaceNormalized(_ctx.floatValue("DescribeCasterComponentsResponse.Components["+ i +"].CaptionLayerContent.LineSpaceNormalized"));
			captionLayerContent.setLocationId(_ctx.stringValue("DescribeCasterComponentsResponse.Components["+ i +"].CaptionLayerContent.LocationId"));
			captionLayerContent.setPtsOffset(_ctx.integerValue("DescribeCasterComponentsResponse.Components["+ i +"].CaptionLayerContent.PtsOffset"));
			captionLayerContent.setShowSourceLan(_ctx.booleanValue("DescribeCasterComponentsResponse.Components["+ i +"].CaptionLayerContent.ShowSourceLan"));
			captionLayerContent.setSizeNormalized(_ctx.floatValue("DescribeCasterComponentsResponse.Components["+ i +"].CaptionLayerContent.SizeNormalized"));
			captionLayerContent.setSourceLan(_ctx.stringValue("DescribeCasterComponentsResponse.Components["+ i +"].CaptionLayerContent.SourceLan"));
			captionLayerContent.setTargetLan(_ctx.stringValue("DescribeCasterComponentsResponse.Components["+ i +"].CaptionLayerContent.TargetLan"));
			captionLayerContent.setWordCountPerLine(_ctx.integerValue("DescribeCasterComponentsResponse.Components["+ i +"].CaptionLayerContent.WordCountPerLine"));
			captionLayerContent.setWordSpaceNormalized(_ctx.floatValue("DescribeCasterComponentsResponse.Components["+ i +"].CaptionLayerContent.WordSpaceNormalized"));
			captionLayerContent.setWordsCount(_ctx.integerValue("DescribeCasterComponentsResponse.Components["+ i +"].CaptionLayerContent.WordsCount"));
			component.setCaptionLayerContent(captionLayerContent);

			ComponentLayer componentLayer = new ComponentLayer();
			componentLayer.setHeightNormalized(_ctx.floatValue("DescribeCasterComponentsResponse.Components["+ i +"].ComponentLayer.HeightNormalized"));
			componentLayer.setPositionRefer(_ctx.stringValue("DescribeCasterComponentsResponse.Components["+ i +"].ComponentLayer.PositionRefer"));
			componentLayer.setTransparency(_ctx.integerValue("DescribeCasterComponentsResponse.Components["+ i +"].ComponentLayer.Transparency"));
			componentLayer.setWidthNormalized(_ctx.floatValue("DescribeCasterComponentsResponse.Components["+ i +"].ComponentLayer.WidthNormalized"));

			List<Float> positionNormalizeds = new ArrayList<Float>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCasterComponentsResponse.Components["+ i +"].ComponentLayer.PositionNormalizeds.Length"); j++) {
				positionNormalizeds.add(_ctx.floatValue("DescribeCasterComponentsResponse.Components["+ i +"].ComponentLayer.PositionNormalizeds["+ j +"]"));
			}
			componentLayer.setPositionNormalizeds(positionNormalizeds);
			component.setComponentLayer(componentLayer);

			ImageLayerContent imageLayerContent = new ImageLayerContent();
			imageLayerContent.setMaterialId(_ctx.stringValue("DescribeCasterComponentsResponse.Components["+ i +"].ImageLayerContent.MaterialId"));
			component.setImageLayerContent(imageLayerContent);

			TextLayerContent textLayerContent = new TextLayerContent();
			textLayerContent.setBorderColor(_ctx.stringValue("DescribeCasterComponentsResponse.Components["+ i +"].TextLayerContent.BorderColor"));
			textLayerContent.setBorderWidthNormalized(_ctx.floatValue("DescribeCasterComponentsResponse.Components["+ i +"].TextLayerContent.BorderWidthNormalized"));
			textLayerContent.setColor(_ctx.stringValue("DescribeCasterComponentsResponse.Components["+ i +"].TextLayerContent.Color"));
			textLayerContent.setFontName(_ctx.stringValue("DescribeCasterComponentsResponse.Components["+ i +"].TextLayerContent.FontName"));
			textLayerContent.setSizeNormalized(_ctx.floatValue("DescribeCasterComponentsResponse.Components["+ i +"].TextLayerContent.SizeNormalized"));
			textLayerContent.setText(_ctx.stringValue("DescribeCasterComponentsResponse.Components["+ i +"].TextLayerContent.Text"));
			component.setTextLayerContent(textLayerContent);

			components.add(component);
		}
		describeCasterComponentsResponse.setComponents(components);
	 
	 	return describeCasterComponentsResponse;
	}
}