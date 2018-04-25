package com.frogensource.mx.webapp.configuration

import org.springframework.core.Ordered
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry



@EnableWebMvc
@ComponentScan("com.frogensource.mx")
class WebMvcConfiguration : WebMvcConfigurer {

    override fun addViewControllers(registry: ViewControllerRegistry) {
        // registry!!.addViewController("/login").setViewName("login")
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE)
    }

    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        registry!!
                .addResourceHandler("/resources/**")
                .addResourceLocations("/resources/")
    }

}
