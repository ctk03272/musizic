package org.musizic.musizic.service

import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service

@Service
class CustomUserDetailsService(
) : UserDetailsService {
    override fun loadUserByUsername(username: String): UserDetails {
        return User.withUsername("test")
            .password("test")
            .build()
    }
}