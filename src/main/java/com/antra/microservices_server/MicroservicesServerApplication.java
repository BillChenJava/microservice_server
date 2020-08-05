package com.antra.microservices_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaServer
@SpringBootApplication
public class MicroservicesServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesServerApplication.class, args);
    }

}
