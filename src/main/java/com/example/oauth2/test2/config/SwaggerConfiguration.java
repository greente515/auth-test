package com.example.oauth2.test2.config;

//@RequiredArgsConstructor
//@Configuration
//@EnableSwagger2
//public class SwaggerConfiguration {
//    private final ApplicationProperties properties;
//
//    @Bean
//    public Docket api() {
//        final ApiInfo apiInfo = new ApiInfoBuilder()
//                .title("SpringBoot OAuth2 Example")
//                .description("Support OAuth2 Server based on Database")
//                .build();
//
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo)
//                .ignoredParameterTypes(AuthPrincipal.class)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("server"))
//                .paths(PathSelectors.any())
//                .build()
//                .securityContexts(Collections.singletonList(securityContext()))
//                .securitySchemes(Arrays.asList(securitySchema()));
//    }
//
//    private SecurityContext securityContext() {
//        return SecurityContext.builder()
//                .securityReferences(defaultAuth())
//                .build();
//    }
//
//    private List<SecurityReference> defaultAuth() {
//        final AuthorizationScope[] authorizationScopes = new AuthorizationScope[] {
//                new AuthorizationScope("read", "read all"),
//                new AuthorizationScope("write", "write all")
//        };
//
//        return Collections.singletonList(new SecurityReference("oauth2", authorizationScopes));
//    }
//
//    private OAuth securitySchema() {
//        final List<AuthorizationScope> authorizationScopeList = new ArrayList<>(2);
//
//        authorizationScopeList.add(new AuthorizationScope("read", "read all"));
//        authorizationScopeList.add(new AuthorizationScope("write", "access all"));
//
//        final List<GrantType> grantTypes = new ArrayList<>(1);
//        grantTypes.add(new ResourceOwnerPasswordCredentialsGrant(properties.getSwagger().getAccessTokenUri()));
//
//        return new OAuth("oauth2", authorizationScopeList, grantTypes);
//    }
//}
