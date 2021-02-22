package com.example.oauth2.test1.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 동적클라이언트 등록시 컨트롤러에서 매개변수로 사용되는 dto 클래스
 * @author timi121
 */

@Getter @Setter
@ToString
public class ClientDto {

    private String name;
    private String redirectUrl;
    private String clientType;

}
