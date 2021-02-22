package com.example.oauth2.test2.account.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

//public class Account  extends User {
//
//    private AccountEntity account;
//
//    public Account(AccountEntity account) {
//        super(account.getEmail(), account.getPassword(), authorities(account.getRoles()));
//        this.account = account;
//    }
//
//    private static Collection<? extends GrantedAuthority> authorities(Set<AccountRole> roles) {
//        return roles.stream()
//                .map(r -> new SimpleGrantedAuthority("ROLE_" + r.name()))
//                .collect(Collectors.toSet());
//    }
//
//    public AccountEntity getAccount() {
//        return account;
//    }
//}
