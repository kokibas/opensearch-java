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

package org.opensearch.client.opensearch.core;

import org.opensearch.client.opensearch._types.ErrorResponse;
import org.opensearch.client.opensearch._types.RequestBase;
import org.opensearch.client.opensearch._types.Time;
import org.opensearch.client.transport.Endpoint;
import org.opensearch.client.transport.endpoints.SimpleEndpoint;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.get_script.Request

/**
 * Returns a script.
 * 
 */

public class GetScriptRequest extends RequestBase {
	private final String id;

	@Deprecated
	@Nullable
	private final Time masterTimeout;

	@Nullable
	private final Time clusterManagerTimeout;

	// ---------------------------------------------------------------------------------------------

	private GetScriptRequest(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.masterTimeout = builder.masterTimeout;
		this.clusterManagerTimeout = builder.clusterManagerTimeout;

	}

	public static GetScriptRequest of(Function<Builder, ObjectBuilder<GetScriptRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Script ID
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Specify timeout for connection to master
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Deprecated
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Specify timeout for connection to cluster-manager
	 * <p>
	 * API name: {@code cluster_manager_timeout}
	 */
	@Nullable
	public final Time clusterManagerTimeout() {
		return this.clusterManagerTimeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetScriptRequest}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetScriptRequest> {
		private String id;

		@Deprecated
		@Nullable
		private Time masterTimeout;

		@Nullable
		private Time clusterManagerTimeout;

		/**
		 * Required - Script ID
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Specify timeout for connection to master
		 * <p>
		 * API name: {@code master_timeout}
		 */
		@Deprecated
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Specify timeout for connection to master
		 * <p>
		 * API name: {@code master_timeout}
		 */
		@Deprecated
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Specify timeout for connection to cluster-manager
		 * <p>
		 * API name: {@code cluster_manager_timeout}
		 */
		public final Builder clusterManagerTimeout(@Nullable Time value) {
			this.clusterManagerTimeout = value;
			return this;
		}

		/**
		 * Specify timeout for connection to cluster-manager
		 * <p>
		 * API name: {@code cluster_manager_timeout}
		 */
		public final Builder clusterManagerTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.clusterManagerTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Builds a {@link GetScriptRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetScriptRequest build() {
			_checkSingleUse();

			return new GetScriptRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code get_script}".
	 */
	public static final Endpoint<GetScriptRequest, GetScriptResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				propsSet |= _id;

				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_scripts");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.clusterManagerTimeout != null) {
					params.put("cluster_manager_timeout", request.clusterManagerTimeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetScriptResponse._DESERIALIZER);
}
