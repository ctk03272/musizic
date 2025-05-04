package org.musizic.musizic.dto

import com.fasterxml.jackson.annotation.JsonFormat
import io.swagger.v3.oas.annotations.media.ArraySchema
import io.swagger.v3.oas.annotations.media.Schema
import java.time.LocalDateTime

@Schema(description = "사용자 정보를 담은 DTO")
data class UserDto(
    @field:Schema(
        description = "agreeToMarketing",
        example = true.toString(),
        required = true
    )
    val agree: Boolean,
    @field:Schema(
        description = "cardslot",
        example = 1.toString(),
        required = true
    )
    val cardSlot: Int,
    @field:Schema(
        description = "crated",
        example = "2025-04-20T06:33:06.670Z",
        required = true
    )
    @field:JsonFormat(
        shape = JsonFormat.Shape.STRING,
        pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
    )
    val createdAt: LocalDateTime,
    @field:Schema(
        description = "email",
        example = "test@google.com",
        required = true
    )
    val email: String,
    @field:ArraySchema(
        arraySchema = Schema(
            description = "musicard",
            required = true
        ),
        schema = Schema(
            type = "string",
            example = "ctk0327"
        )
    )
    val musicCard: List<String>,
    @field:Schema(
        description = "name",
        example = "ctk0327",
        required = true
    )
    val name: String,
    @field:Schema(
        description = "userStatus",
        example = "ACTIVE",
        required = true
    )
    val status: UserStatus,
    @field:Schema(
        description = "userType",
        example = "EMAIL",
        required = true
    )
    val type: UserType

)

enum class UserStatus {
    ACTIVE, PENDING
}

enum class UserType {
    EMAIL, GOOGLE
}