package com.zhourup.guard.manage.config;

import com.zhourup.guard.manage.interceptor.SystemAuthenticationInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 解决跨域问题
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private SystemAuthenticationInterceptor systemAuthenticationInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(systemAuthenticationInterceptor).addPathPatterns("/**");
    }
}

