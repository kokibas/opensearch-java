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

package org.opensearch.client.opensearch._types.aggregations;

import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.util.ObjectBuilder;

import java.util.function.Function;

// typedef: _types.aggregations.DateRangeAggregate

/**
 * Result of a <code>date_range</code> aggregation. Same format as a for a
 * <code>range</code> aggregation: <code>from</code> and <code>to</code> in
 * <code>buckets</code> are milliseconds since the Epoch, represented as a
 * floating point number.
 * 
 */
@JsonpDeserializable
public class DateRangeAggregate extends RangeAggregate implements AggregateVariant {
	// ---------------------------------------------------------------------------------------------

	private DateRangeAggregate(Builder builder) {
		super(builder);

	}

	public static DateRangeAggregate of(Function<Builder, ObjectBuilder<DateRangeAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.DateRange;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DateRangeAggregate}.
	 */

	public static class Builder extends RangeAggregate.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DateRangeAggregate> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DateRangeAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DateRangeAggregate build() {
			_checkSingleUse();

			return new DateRangeAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DateRangeAggregate}
	 */
	public static final JsonpDeserializer<DateRangeAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DateRangeAggregate::setupDateRangeAggregateDeserializer);

	protected static void setupDateRangeAggregateDeserializer(ObjectDeserializer<DateRangeAggregate.Builder> op) {
		RangeAggregate.setupRangeAggregateDeserializer(op);

	}

}
