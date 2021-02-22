package com.example.oauth2.test3.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;

/**
 * 리소스 서버에 대한 설정
 * OAuth 토큰에 의해 보호되고 있는 자원 서버에 대한 설정
 * Spring OAuth 에서는 자원에 대한 보호를 구현하는 Spring Security Filter 를 제공
 *
 * @EnableResourceServer 를 사용함으로써 해당 필터를 활성화 할 수 있음
 * 각 리소스에 대한 접근 권한을 설정해주고 있음 (여기서는 user 정보)
 */
@EnableResourceServer
@Configuration
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
//        super.configure(http);
        http.anonymous().disable()
                .authorizeRequests()
                .antMatchers("/users/**").authenticated()
                .and()
                .exceptionHandling()
                .accessDeniedHandler(new OAuth2AccessDeniedHandler());
    }
}
