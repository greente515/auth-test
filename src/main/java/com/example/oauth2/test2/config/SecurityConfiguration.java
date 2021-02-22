package com.example.oauth2.test2.config;

//@RequiredArgsConstructor
//@Configuration
//@EnableWebSecurity //spring security 사용 - SpringSecurityFilterChain
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    private final AccountService accountService;
//    private final PasswordEncoder passwordEncoder;
//
//    @Bean
//    @Override
//    protected AuthenticationManager authenticationManager() throws Exception {
//        return super.authenticationManager();
//    }
//
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        //swagger 관련 리소스 시큐리티 필터 제거
//        web.ignoring().antMatchers("/v2/api-docs" , "/swagger-resources/**", "/swagger-ui.html", "/webjars/**", "/swagger/**");
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(accountService)
//                .passwordEncoder(passwordEncoder);
//    }
//}
