package com.xiao.boot.customizestarter.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author aloneMan
 * @projectName learn-customize-starter
 * @createTime 2022-11-30 17:38:06
 * @description
 */
@Data
@ConfigurationProperties(prefix = "customize.properties")
public class CustomizeProperties {

    String name;

    Integer age;
}
