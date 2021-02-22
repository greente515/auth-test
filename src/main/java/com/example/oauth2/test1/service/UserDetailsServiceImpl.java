package com.example.oauth2.test1.service;

/**
 * UserDetailsService 구현체
 * Resource Owner 인증에 사용되는 서비스 클랙스
 * @author timi121
 */

//@Slf4j
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService {
//
//    private ResourceOwnerRepository repository;
//
//    @Autowired
//    public UserDetailsServiceImpl(ResourceOwnerRepository repository) {
//        this.repository = repository;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        log.info("UserDetailsServiceImpl.loadUserByUsername :::: {}", username);
//
//        ResourceOwner user = repository.findByUsername(username);
//        if(ObjectUtils.isEmpty(user)){
//            throw new UsernameNotFoundException("Invalid resource owner, please check resource owner info");
//        }
//        user.setAuthorities(AuthorityUtils.createAuthorityList(String.valueOf(user.getRole())));
//        return user;
//    }
//}
