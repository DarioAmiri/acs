/*******************************************************************************
 * Copyright 2017 General Electric Company
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package com.ge.predix.acs.monitoring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.stereotype.Component;

import com.ge.predix.acs.attribute.cache.AttributeCache;

@Component
@Profile({ "cloud-redis", "redis" })
// This class doesn't extend RedisHealthIndicator on purpose because we don't want to output Redis-specific properties
public class SubjectCacheHealthIndicator extends AbstractCacheHealthIndicator {

    @Autowired
    public SubjectCacheHealthIndicator(final RedisConnectionFactory subjectRedisConnectionFactory,
            @Value("${ENABLE_SUBJECT_CACHING:false}") final boolean cacheEnabled) {
        super(subjectRedisConnectionFactory, AttributeCache.SUBJECT, cacheEnabled);
    }
}
