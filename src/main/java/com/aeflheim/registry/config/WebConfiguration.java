package com.aeflheim.registry.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration {

    @Bean
    public FilterRegistrationBean<SimpleCORSFilter> loggingFilter() {
        FilterRegistrationBean<SimpleCORSFilter> registrationBean = new FilterRegistrationBean<>();

        registrationBean.setFilter(new SimpleCORSFilter());
        registrationBean.addUrlPatterns("/**"); // Apply filter to specific URL patterns
        registrationBean.setOrder(1); // Set precedence (lower number = higher precedence)

        return registrationBean;
    }
}
