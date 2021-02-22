package com.example.oauth2.test2.config;

//@RequiredArgsConstructor
//@Configuration
//@EnableAuthorizationServer
//public class AuthServerConfiguration  extends AuthorizationServerConfigurerAdapter {
//    // required
//    private final PasswordEncoder passwordEncoder;
//    private final AuthenticationManager authenticationManager;
//    private final AccountService accountService;
//    private final DataSource dataSource;
//
//    @Override
//    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
//        security.passwordEncoder(passwordEncoder);
//    }
//
//    @Override
//    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//        clients.jdbc(dataSource);
////        clients.inMemory()
////               .withClient(appProperties.getClientId())
////               .authorizedGrantTypes("password", "refresh_token")
////               .scopes("read", "write")
////               .secret("{noop}" + appProperties.getClientSecret())
////               .accessTokenValiditySeconds(10 * 60)
////               .refreshTokenValiditySeconds(6 * 10 * 60);
//    }
//
//    @Override
//    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
//        endpoints.authenticationManager(authenticationManager)
//                .userDetailsService(accountService)
//                .tokenStore(tokenStore())
//                .approvalStore(approvalStore());
//    }
//
//    @Bean
//    public TokenStore tokenStore() {
//        return new JdbcTokenStore(dataSource);
//        // return new InMemoryTokenStore();
//    }
//
//    @Bean
//    public ApprovalStore approvalStore() {
//        return new JdbcApprovalStore(dataSource);
//    }
//}
