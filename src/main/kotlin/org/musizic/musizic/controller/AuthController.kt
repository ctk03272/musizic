package org.musizic.musizic.controller


import org.musizic.musizic.model.LoginRequest
import org.musizic.musizic.model.LoginResponse
import org.musizic.musizic.security.JwtTokenProvider
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.Authentication
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthController(
    private val authenticationManager: AuthenticationManager,
    private val jwtTokenProvider: JwtTokenProvider
) {

    @PostMapping("/api/auth/login")
    fun authenticateUser(@RequestBody loginRequest: LoginRequest): LoginResponse {
        val authentication: Authentication = authenticationManager.authenticate(
            UsernamePasswordAuthenticationToken(
                loginRequest.username,
                loginRequest.password
            )
        )

        // 인증 성공 시 JWT 토큰 생성
        val token = jwtTokenProvider.generateToken(authentication.name)
        return LoginResponse(accessToken = token)
    }
}