package com.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>
 * </p>
 *
 * @author: WangQi
 * @since: 2021/10/22 上午9:58
 */

@SpringBootApplication
//@EnableDiscoveryClient
public class RocketApplication {
    public static void main(String[] args) {
        SpringApplication.run(RocketApplication.class, args);
    }
}
