package com.xnoelsv.school.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class ProjectSecurityConfig {

//    @Bean
//    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests((requests) -> requests.anyRequest().permitAll())
//                .formLogin(withDefaults())
//                .httpBasic(withDefaults());
//        return http.build();
//    }

    /*
    /home
    /holidays
    /contact
    /saveMsg
    /courses
    /about
     */
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(
                        (requests) -> requests.disable())
                .authorizeHttpRequests(
                        (requests) -> requests
                                .requestMatchers("/", "/home").permitAll()
                                .requestMatchers("/holidays/**").permitAll()
                                .requestMatchers("/contact").permitAll()
                                .requestMatchers("/saveMsg").permitAll()
                                .requestMatchers("/courses").permitAll()
                                .requestMatchers("/about").permitAll()
                                .requestMatchers("/assets/**").permitAll()

                        )
                .formLogin(withDefaults())
                .httpBasic(withDefaults());

        return http.build();
    }

}
