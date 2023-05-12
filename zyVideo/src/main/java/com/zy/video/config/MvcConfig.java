package com.zy.video.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Ryan
 * @date 2023/5/11 10:14
 * @description
 */
@Slf4j
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String property = System.getProperties().getProperty("os.name");
        //保证swagger正常运行
        registry.addResourceHandler("doc.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");

        if (property.contains("Windows")) {
            registry.addResourceHandler("/**").addResourceLocations("file:D:/Projects/video/");
        } else if (property.contains("Linux")) {

        } else {
            log.error("【无法识别该系统】" + property);
        }
    }


}
