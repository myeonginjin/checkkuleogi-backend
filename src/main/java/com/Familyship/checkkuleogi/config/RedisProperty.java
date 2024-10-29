package com.Familyship.checkkuleogi.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties("spring.data.redis")
public class RedisProperty {
    private String host;
    private int port;
}
