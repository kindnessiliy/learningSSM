package com.example.demo.config;

import org.apache.dubbo.config.ApplicationConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author:zyh
 * @Time:2020-12-07-21:39
 * @email:1269231889@qq.com
 */
@Configuration
public class PublicConfiguration {
    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("providers");
        return applicationConfig;
    }

}
