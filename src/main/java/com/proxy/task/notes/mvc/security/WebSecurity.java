package com.proxy.task.notes.mvc.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurity {

    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
        http.cors().and()
                .csrf().disable().authorizeHttpRequests()
                .requestMatchers("/users").hasRole("manager")
                .anyRequest().authenticated()
                .and()
                .formLogin();

        return http.build();
    }

}
