package com.example.MakingBoard;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.header.writers.frameoptions.XFrameOptionsHeaderWriter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration // 스프링 환경설정 파일임 명시
@EnableWebSecurity // 모든 요청 URL이 스프링 시큐리티의 제어를 받도록 만드는 어노테이션
public class SecurityConfig {

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests().requestMatchers(
                new AntPathRequestMatcher("/**")).permitAll()
                .and()
                .csrf().ignoringRequestMatchers(
                new AntPathRequestMatcher("/h2-console/**")
        )
                .and()
                .headers()
                .addHeaderWriter(new XFrameOptionsHeaderWriter(
                        XFrameOptionsHeaderWriter.XFrameOptionsMode.SAMEORIGIN
                ));
        return http.build();
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
