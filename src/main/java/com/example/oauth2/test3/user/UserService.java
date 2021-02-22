package com.example.oauth2.test3.user;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.annotation.PostConstruct;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * UserDetailsService 를 구현하는 service
 */

@Slf4j
@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    @PostConstruct
    public void init() {
        User autumn = userRepository.findByUsername("autumn");
        if (autumn == null) {
            User user = new User();
            user.setUsername("autumn");
            user.setPassword("pass");
            log.debug("init :::: {}", this.save(user));
        }
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
                getAuthrities());
    }

    private Collection<? extends GrantedAuthority> getAuthrities() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
    }
}
