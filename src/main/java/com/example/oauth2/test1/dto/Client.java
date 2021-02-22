package com.example.oauth2.test1.dto;

import com.example.oauth2.test1.constrant.ClientType;
import lombok.Getter;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;

import java.io.Serializable;

/**
 * Oauth2.0에서 클라이언트 인증에 사용되는 객체
 * ClientDetailsService에서 load하면 반환하는 객체
 * spring security의 UserDetails와 동일한 역할을 하는 객체
 * @author timi121
 */

public class Client extends BaseClientDetails implements Serializable {

    @Getter
    private ClientType clientType;

    public void setClientType(ClientType clientType){
        this.clientType = clientType;
        this.addAdditionalInformation("client_type", clientType.name());
    }
}
