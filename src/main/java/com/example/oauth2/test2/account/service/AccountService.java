package com.example.oauth2.test2.account.service;

//@Slf4j
//@Service
//@RequiredArgsConstructor
//@Transactional(readOnly = true)
//public class AccountService implements UserDetailsService {
//
//    private final AccountRepository accountRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        AccountEntity account = accountRepository.findByEmail(username)
//                .orElseThrow(() -> new UsernameNotFoundException(username));
//
//        return new Account(account);
//    }
//}
