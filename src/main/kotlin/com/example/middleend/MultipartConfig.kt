package com.example.middleend

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.multipart.MultipartResolver
import org.springframework.web.multipart.support.StandardServletMultipartResolver


@Configuration
class MultipartConfig {
    @Bean
    fun multipartResolver(): MultipartResolver {
        return StandardServletMultipartResolver()
    }
}