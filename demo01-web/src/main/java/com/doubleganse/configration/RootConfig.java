package com.doubleganse.configration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages={"com.doubleganse.service, com.doubleganse.dao"},
		excludeFilters={
				@Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class)
		})
@ImportResource(locations = {"classpath*:applicationContent.xml","classpath*:spring-service.xml"})
public class RootConfig {

}
