package com.example.oauth2.test1.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 로그인 실패시 행동을 재정의할 클래스 (추상 클래스가 아닌 인터페이스로 구현해도 됨)
 * Or Interface - AuthenticationFailureHandler
 * @author timi121
 */

@Slf4j
public class CustomAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        log.info("CustomAuthenticationFailureHandler.onAuthenticationFailure ::::");
        super.onAuthenticationFailure(request, response, exception);
    }


}
