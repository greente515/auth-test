package com.example.oauth2.test1.entity;

import com.example.oauth2.test1.constrant.UserRole;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Collection;

/**
 * spring security 에서 사용자를 인증할때 사용되는 객체 (DB 에서 관리되는 객체)
 * UserDetailsService 에서 사용자를 load 할때 반환되는 결과객체
 */

//@ToString
//@Entity
//@Table(name = "RESOURCE_OWNER")
//@Getter@Setter
//public class ResourceOwner implements UserDetails, Serializable {
//
//    @Id
//    private Long id;
//
//    private String username;
//
//    @Column(length = 400)
//    private String password;
//
//    @Column
//    @Enumerated(EnumType.STRING)
//    private UserRole role;
//
//    @Column(length = 2000)
//    private String access_token;
//
//    private LocalDateTime access_token_validity;
//
//    @Column(length = 2000)
//    private String refresh_token;
//
//    @Transient
//    private Collection<? extends GrantedAuthority> authorities;
//
//    private boolean accountNonExpired = true;
//
//    private boolean accountNonLocked = true;
//
//    private boolean credentialsNonExpired = true;
//
//    private boolean enabled = true;
//}
