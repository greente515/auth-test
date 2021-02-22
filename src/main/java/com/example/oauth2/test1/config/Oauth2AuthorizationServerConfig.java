package com.example.oauth2.test1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationService;
import org.springframework.security.oauth2.provider.approval.JdbcApprovalStore;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.code.JdbcAuthorizationCodeServices;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.nio.file.AccessDeniedException;

/**
 * Authorization Server Config
 *
 * @author timi121
 */

//@Configuration
//@EnableAuthorizationServer
//public class Oauth2AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
//
//    private DataSource dataSource;
//
//    @Qualifier("clientDetailsServiceImpl")
//    ClientDetailsService clientDetailsService;
//
//    private UserDetailsService userDetailsService;
//
//    @Autowired
//    public Oauth2AuthorizationServerConfig(DataSource dataSource, ClientDetailsService clientDetailsService, UserDetailsService userDetailsService) {
//        this.dataSource = dataSource;
//        this.clientDetailsService = clientDetailsService;
//        this.userDetailsService = userDetailsService;
//    }
//
//    /**
//     * client 에 대한 인증 처리를 위한 설정
//     * In-Memory 설정 - 기본 구현체 InMemoryClientDetailsService(Map에 클라이언트를 저장)
//     * JDBC 설정 - 기본 구현체 JdbcClientDetailsService(JdbcTemplate를 이용한 DB이용)
//     * ClientDetailsService 설정
//     */
//    @Override
//    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
//        security.accessDeniedHandler((request, response, exception) -> {
//            response.setContentType("application/json;charset=UTF-8");
//            response.setHeader("Cache-Control", "no-cache");
//            PrintWriter writer = response.getWriter();
//            writer.println(new AccessDeniedException("access denied"));
//        });
//    }
//
//    @Override
//    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//        /**
//         * client를 DB에서 관리하기 위하여 DataSource 주입
//         * UserDetailsService와 동일한 역할을 하는 객체
//         */
//        clients.withClientDetails(clientDetailsService);
//    }
//
//    @Override
//    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
//        endpoints.userDetailsService(userDetailsService) //refresh token  발급 위해서 UserDetailsService(AuthenticationManager authenticate()에서 사용) 필요
//                .authorizationCodeServices(new JdbcAuthorizationCodeServices(dataSource)) //authorization code를 DB로 관리 코드 테이블의 authentication 은 blob 데이터타입으로
//                .approvalStore(approvalStore()) //리소스 소유자의 승인을 추가, 검색, 취소하기 위한 메소드를 정의
//                .tokenStore(tokenStore()) //토큰과 관련된 인증 데이터를 저장, 검색, 제거, 읽기를 정의
//                .accessTokenConverter(accessTokenConverter());
//    }
//
//    @Bean
//    public JwtTokenStore tokenStore() {
//        return new JwtTokenStore(accessTokenConverter());
//    }
//
//    @Bean
//    public JdbcApprovalStore approvalStore() {
//        return new JdbcApprovalStore(dataSource);
//    }
//
//    @Bean
//    public JwtAccessTokenConverter accessTokenConverter() {
//        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
//        converter.setSigningKey("non-prod-signature");
//        return converter;
//    }
//
//    /**
//     * 새로운 클라이언트 등록을 위한 bean
//     */
//    @Bean
//    public ClientRegistrationService clientRegistrationService() {
//        return new JdbcClientDetailsService(dataSource);
//    }
//}
