package com.example.oauth2.test3.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;

/**
 * 인증 서버에 대한 설정
 */
@EnableAuthorizationServer //oauth 서버에 필요한 기본 설정 세팅, oauth 관련 endpoints 가 생성됨
@Configuration
public class AuthServerConfig extends AuthorizationServerConfigurerAdapter {


    @Autowired private TokenStore tokenStore;
    @Autowired private AuthenticationManager authenticationManager;

    @Qualifier("encoder")
    @Autowired private PasswordEncoder passwordEncoder;

    @Qualifier("userService")
    @Autowired private UserDetailsService userDetailsService;

    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        security.passwordEncoder(passwordEncoder);
    }

    /*
     * 클라이언트에 대한 설정을 할 수 있음. 클라이언트 정보를 DB로 관리할 것인지, InMemory 로 관리할 것인지 등에 대한 설정,
     * 클라이언트별 제공할 scope 나 권한 등을 정의
     */
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//        super.configure(clients);
        clients.inMemory()
                .withClient("iamclient")
                .secret(passwordEncoder.encode("iamsecret"))
                .authorizedGrantTypes("authorization_code", "password", "refresh_token")
                .scopes("read", "write")
                .accessTokenValiditySeconds(60 * 60)
                .refreshTokenValiditySeconds(6 * 60 * 60)
                .autoApprove(true);
    }

    // AuthorizationServerSecurityConfigurer : token endpoint (/auth/token) 에 대한 보안관련 설정을 할 수 있음

    /*
     * 인증, 토큰 엔드포인트, 토큰 서비스를 정의
     * tokenStore, UserDetailsService 등 객체를 Bean 으로 가져와 설정에 등록해주고, 이 Bean 들은 뒤에 나올 SecurityConfig 에서 등록해주게 될 것임
     */
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
//        super.configure(endpoints);
        endpoints.tokenStore(tokenStore)
                .authenticationManager(authenticationManager)
                .userDetailsService(userDetailsService);
    }
}
