package com.example.oauth2.test3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

import javax.annotation.Resource;

/**
 * OAuth 와 별개인 전반적인 서버에 대한 인증 설정
 * 서버에 대한 전반적인 security 설정
 * 대부분 spring security 와 관련된 설정들이며, OAuth 관련 설정은 TokenStore Bean 을 등록해주는 부분
 * 여기서는 inMemory token을 사용하는것으로 설정
 * UserDetailsService 는 spring security 에서 제공하는 interface 로, 해당 interface 를 구현해 회원정보를 관리할 수 있다
 */
@EnableWebSecurity @Configuration public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Resource(name = "userService") private UserDetailsService userDetailsService;

    @Bean @Override protected AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }

    //    @Bean(name="encoder")
    //    public PasswordEncoder encoder() {
    //        DelegatingPasswordEncoder delPasswordEncoder=  (DelegatingPasswordEncoder)PasswordEncoderFactories.createDelegatingPasswordEncoder();
    //        BCryptPasswordEncoder bcryptPasswordEncoder =new BCryptPasswordEncoder();
    //        delPasswordEncoder.setDefaultPasswordEncoderForMatches(bcryptPasswordEncoder);
    //        return delPasswordEncoder;
    //    }

    @Bean public static NoOpPasswordEncoder encoder() {
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }

    @Bean public TokenStore tokenStore() {
        return new InMemoryTokenStore();
    }

    @Override protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //        super.configure(auth);
        auth.userDetailsService(userDetailsService).passwordEncoder(encoder());
    }

    @Override protected void configure(HttpSecurity http) throws Exception {
        //        super.configure(http);
        http.cors()
                .and()
                .csrf()
                .disable()
                .anonymous()
                .disable()
                .authorizeRequests()
                .antMatchers("/api-docs/**")
                .permitAll();
    }
}
