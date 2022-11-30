package com.xiao.boot.customizestarter.config;

import com.xiao.boot.customizestarter.properties.CustomizeProperties;
import com.xiao.boot.customizestarter.service.CustomizeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author aloneMan
 * @projectName learn-customize-starter
 * @createTime 2022-11-30 17:37:12
 * @description
 */
@Configuration
public class CustomizeStarterConfig {

    @Bean
    public CustomizeProperties customizeProperties() {
        return new CustomizeProperties();
    }

    @Bean
    public CustomizeService customizeService(CustomizeProperties customizeProperties) {
        return new CustomizeService(customizeProperties);
    }
}
