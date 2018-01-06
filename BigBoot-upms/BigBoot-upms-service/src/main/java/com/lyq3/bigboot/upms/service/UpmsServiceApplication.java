package com.lyq3.bigboot.upms.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan(basePackages = { "com.lyq3" })
@ImportResource(locations = {"classpath:xmlConfig/*.xml"})
public class UpmsServiceApplication extends SpringBootServletInitializer {
    private static final Logger logger = LoggerFactory.getLogger(UpmsServiceApplication.class);
    public static void main(String[] args) {
        logger.info("\n===========upms-service开始启动========\n");
        SpringApplication.run(UpmsServiceApplication.class, args);
        logger.info("\n===========upms-service启动完成========\n");
    }}
