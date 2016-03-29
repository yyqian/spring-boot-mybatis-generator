package com.yyqian.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by yyqian on 3/19/16.
 */
@Configuration
@ImportResource({"classpath:/config/spring-mybatis.xml"})
public class MybatisConfig {
}