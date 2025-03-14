/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

package org.opensearch.client.opensearch._types.analysis;

import org.opensearch.client.json.JsonEnum;
import org.opensearch.client.json.JsonpDeserializable;


@JsonpDeserializable
public enum SnowballLanguage implements JsonEnum {
	Armenian("Armenian"),

	Basque("Basque"),

	Catalan("Catalan"),

	Danish("Danish"),

	Dutch("Dutch"),

	English("English"),

	Finnish("Finnish"),

	French("French"),

	German("German"),

	German2("German2"),

	Hungarian("Hungarian"),

	Italian("Italian"),

	Kp("Kp"),

	Lovins("Lovins"),

	Norwegian("Norwegian"),

	Porter("Porter"),

	Portuguese("Portuguese"),

	Romanian("Romanian"),

	Russian("Russian"),

	Spanish("Spanish"),

	Swedish("Swedish"),

	Turkish("Turkish"),

	;

	private final String jsonValue;

	SnowballLanguage(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<SnowballLanguage> _DESERIALIZER = new JsonEnum.Deserializer<>(
			SnowballLanguage.values());
}
