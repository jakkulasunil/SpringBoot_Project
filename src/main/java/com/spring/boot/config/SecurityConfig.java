package com.spring.boot.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import com.spring.boot.controller.StudentController;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	Logger logger = LoggerFactory.getLogger(SecurityConfig.class);

    @Bean
   public SecurityFilterChain securityWebFilterChain(
            HttpSecurity http) throws Exception {
    	http.authorizeHttpRequests((requests) -> requests
    			.requestMatchers("/students/*","/actuator/**").permitAll()
    			.anyRequest().authenticated());
        return http.build();
		
    }

}
