package com.example.customizetest.controller;

import com.xiao.boot.customizestarter.service.CustomizeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aloneMan
 * @projectName learn-customize-starter
 * @createTime 2022-11-30 18:11:06
 * @description
 */
@RestController
@Slf4j(topic = "CustomizeController")
public class CustomizeController {

    private final CustomizeService customizeService;

    public CustomizeController(CustomizeService customizeService) {
        this.customizeService = customizeService;
    }

    @PostMapping("/test")
    public String test() {
        log.info("{} ", customizeService);
        return customizeService.toString();
    }
}
