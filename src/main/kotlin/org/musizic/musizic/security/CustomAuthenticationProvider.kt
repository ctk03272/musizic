package org.musizic.musizic.security

import org.springframework.security.authentication.AuthenticationProvider
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.Authentication
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Component

@Component
class CustomAuthenticationProvider(
    private val passwordEncoder: PasswordEncoder
) : AuthenticationProvider {

    override fun authenticate(authentication: Authentication): Authentication {
        val username = authentication.name
        val rawPassword = authentication.credentials.toString()

//        val user = userRepository.findByUid(username)
//            ?: throw BadCredentialsException("존재하지 않는 사용자입니다.")
//
//        if (!passwordEncoder.matches(rawPassword, user.password)) {
//            throw BadCredentialsException("비밀번호가 일치하지 않습니다.")
//        }

//        val authorities = user.roles.split(",").map { SimpleGrantedAuthority(it.trim()) }
        return UsernamePasswordAuthenticationToken("tet", null, emptySet())
    }

    override fun supports(authentication: Class<*>): Boolean =
        UsernamePasswordAuthenticationToken::class.java.isAssignableFrom(authentication)
}