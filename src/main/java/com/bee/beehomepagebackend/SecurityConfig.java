package com.bee.beehomepagebackend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable() // CSRF 보호 비활성화 (개발 시에만)
                .authorizeRequests()
                .anyRequest().permitAll(); // 모든 요청 허용 (인증 필요 없음)
        return http.build();
    }
}
