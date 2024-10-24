package com.noel.curso.springboot.webapp.springboot_web;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
	@PropertySource (
    value="classpath:values.properties", 
    encoding = "UTF-8"
  )
})
public class ValuesConfig {

}
