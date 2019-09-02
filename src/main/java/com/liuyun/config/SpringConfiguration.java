/*
 * Copyright (c) 2019, wenwenliuyun@163.com All Rights Reserved. 
 */    
  
package com.liuyun.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/** 
 * @author liuyun
 * @since 2019年9月1日下午10:27:37
 */
@Configuration
@ComponentScan("com.liuyun")
@PropertySource("classpath:db.properties")
@Import(Beans.class)
@EnableAspectJAutoProxy
public class SpringConfiguration {
	//高版本的spring容器中会自动加入该bean
//	@Bean
//	PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer () {
//		return new PropertySourcesPlaceholderConfigurer();
//	}
}
  