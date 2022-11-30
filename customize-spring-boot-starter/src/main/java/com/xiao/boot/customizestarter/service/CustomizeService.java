package com.xiao.boot.customizestarter.service;

import com.xiao.boot.customizestarter.properties.CustomizeProperties;
import lombok.ToString;

/**
 * @author aloneMan
 * @projectName learn-customize-starter
 * @createTime 2022-11-30 17:44:23
 * @description
 */
@ToString
public class CustomizeService {

    private String name;
    private Integer age;

    public CustomizeService(CustomizeProperties customizeProperties) {
        this.name = customizeProperties.getName();
        this.age = customizeProperties.getAge();
    }
}
