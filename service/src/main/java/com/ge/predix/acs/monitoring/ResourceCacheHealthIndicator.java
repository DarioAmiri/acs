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
public class ResourceCacheHealthIndicator extends AbstractCacheHealthIndicator {

    @Autowired
    public ResourceCacheHealthIndicator(final RedisConnectionFactory resourceRedisConnectionFactory,
            @Value("${ENABLE_RESOURCE_CACHING:false}") final boolean cacheEnabled) {
        super(resourceRedisConnectionFactory, AttributeCache.RESOURCE, cacheEnabled);
    }
}
