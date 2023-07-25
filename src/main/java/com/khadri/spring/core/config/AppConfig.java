package com.khadri.spring.core.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.khadri.spring.core")
@EnableAspectJAutoProxy
public class AppConfig {
}