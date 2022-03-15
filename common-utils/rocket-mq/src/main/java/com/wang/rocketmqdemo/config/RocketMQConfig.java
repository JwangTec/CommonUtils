package com.wang.rocketmqdemo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * </p>
 *
 * @author: WangQi
 * @since: 2021/10/20 下午5:32
 */

@Data
@ConfigurationProperties(prefix = "rocketmq.producer")
@Configuration
public class RocketMQConfig {
    private String namesrvAddr;
    private String groupName;
}
