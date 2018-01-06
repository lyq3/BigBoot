package com.lyq3.bigboot.upms.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * 启动类
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.lyq3" })
@ImportResource(locations = {"classpath:xmlConfig/*.xml"})
public class UpmsWebApplication extends SpringBootServletInitializer {
    private static final Logger logger = LoggerFactory.getLogger(UpmsWebApplication.class);
    public static void main(String[] args) {
        logger.info("\n===========upms-web开始启动========\n");
        SpringApplication.run(UpmsWebApplication.class, args);
        logger.info("\n===========upms-web启动完成========\n");
    }}
