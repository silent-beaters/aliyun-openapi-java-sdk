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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeDomainViewSourceProvincesResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeDomainViewSourceProvincesResponse.Province;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainViewSourceProvincesResponseUnmarshaller {

	public static DescribeDomainViewSourceProvincesResponse unmarshall(DescribeDomainViewSourceProvincesResponse describeDomainViewSourceProvincesResponse, UnmarshallerContext _ctx) {
		
		describeDomainViewSourceProvincesResponse.setRequestId(_ctx.stringValue("DescribeDomainViewSourceProvincesResponse.RequestId"));

		List<Province> sourceProvinces = new ArrayList<Province>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainViewSourceProvincesResponse.SourceProvinces.Length"); i++) {
			Province province = new Province();
			province.setProvinceId(_ctx.stringValue("DescribeDomainViewSourceProvincesResponse.SourceProvinces["+ i +"].ProvinceId"));
			province.setCount(_ctx.longValue("DescribeDomainViewSourceProvincesResponse.SourceProvinces["+ i +"].Count"));

			sourceProvinces.add(province);
		}
		describeDomainViewSourceProvincesResponse.setSourceProvinces(sourceProvinces);
	 
	 	return describeDomainViewSourceProvincesResponse;
	}
}