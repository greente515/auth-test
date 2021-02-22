package com.example.oauth2.test2.config;

//@Slf4j
//@Configuration
//public class AppConfiguration {
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
//    }
//
//    @Bean
//    public ModelMapper modelMapper() {
//        return new ModelMapper();
//    }
//
//    // Insert dummy accounts
//    // -
//    @Bean
//    public ApplicationRunner applicationRunner() {
//        return new ApplicationRunner() {
//
//            @Autowired
//            private AccountRepository accountRepository;
//
//            @Autowired
//            private ApplicationProperties appProperties;
//
//            @Autowired
//            private PasswordEncoder passwordEncoder;
//
//            @Override
//            public void run(ApplicationArguments args) throws Exception {
//                if (!accountRepository.findByEmail(appProperties.getAdminUsername()).isPresent()) {
//                    AccountEntity admin = AccountEntity.builder()
//                            .email(appProperties.getAdminUsername())
//                            .password(passwordEncoder.encode(appProperties
//                                    .getAdminPassword()))
//                            .roles(new HashSet<>(Arrays.asList(
//                                    AccountRole.ADMIN, AccountRole.USER)))
//                            .age(25)
//                            .build();
//                    admin = accountRepository.save(admin);
//                    log.info("Created a admin:{}", admin);
//                } else {
//                    log.info("Skip to save a admin because already exist.");
//                }
//
//                if (!accountRepository.findByEmail(appProperties.getUserUsername()).isPresent()) {
//                    AccountEntity user = AccountEntity.builder()
//                            .email(appProperties.getUserUsername())
//                            .password(passwordEncoder.encode(
//                                    appProperties.getUserPassword()))
//                            .roles(new HashSet<>(Arrays.asList(AccountRole.USER)))
//                            .age(20)
//                            .build();
//
//                    user = accountRepository.save(user);
//                    log.info("Created a user:{}", user);
//                } else {
//                    log.info("Skip to save a user because already exist.");
//                }
//            }
//        };
//    }
//}
