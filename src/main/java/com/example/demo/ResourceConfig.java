package com.example.demo;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class ResourceConfig {
	@Bean("messageSource")
	public MessageSource getMessageSource()
	{
		ReloadableResourceBundleMessageSource ms =
			new ReloadableResourceBundleMessageSource();
		
		ms.setBasenames("classpath:messages/user");
		ms.setDefaultEncoding("UTF-8");
		
		return ms;
	}
	
}