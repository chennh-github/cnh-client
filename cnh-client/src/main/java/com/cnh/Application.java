package com.cnh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author yhr
 * @version latest
 * @date 2016/7/19
 * @description
 */

@SpringBootApplication
@EnableConfigurationProperties
@EnableFeignClients
public class Application extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    //主函数
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}