package com.example.oauth2.test2.account.dto;

import com.example.oauth2.test2.account.entity.AccountRole;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;


import java.util.Set;

@Data
public class AccountDto {

    private Long id;
    private String email;
    private String password;
    private int age;
    private Set<AccountRole> roles;

    @JsonIgnore
    public String getPassword() {
        return password;
    }
}
