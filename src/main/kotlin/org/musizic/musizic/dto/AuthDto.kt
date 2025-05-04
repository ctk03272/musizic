package org.musizic.musizic.dto

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "Email Login을 위한 DTO")
data class LoginEmailRequestDto(
    @field:Schema(
        description = "id",
        example = "id",
        required = true
    )
    val id: String,
    @field:Schema(
        description = "password",
        example = "password",
        required = true
    )
    val password: String,
)

data class LoginResponseDto(val token: String)