package com.stackroute.newz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.stackroute.newz.jwtfilter.JwtFilter;



@SpringBootApplication
public class NewsSourceServiceApplication {

	
	@Bean
	public FilterRegistrationBean<JwtFilter> jwtFilter() {

		final FilterRegistrationBean<JwtFilter> registrationBean = new FilterRegistrationBean<JwtFilter>();
		registrationBean.setFilter(new JwtFilter());
		registrationBean.addUrlPatterns("/api/*");
		return registrationBean;
	}

   
	public static void main(String[] args) {
		SpringApplication.run(NewsSourceServiceApplication.class, args);
	}

}
