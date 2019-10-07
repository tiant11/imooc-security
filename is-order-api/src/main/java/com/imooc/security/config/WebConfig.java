/**
 * 
 */
package com.imooc.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.imooc.security.web.PrometheusMetricsInterceptor;

/**
 * @author jojo
 *
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
	
	@Autowired
	private PrometheusMetricsInterceptor prometheusMetricsInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(prometheusMetricsInterceptor).addPathPatterns("/**");
	}
	
}
