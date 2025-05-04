package org.musizic.musizic.controller.user

import org.musizic.musizic.dto.UserDto
import org.musizic.musizic.dto.UserStatus
import org.musizic.musizic.dto.UserType
import org.springframework.web.bind.annotation.*
import java.time.LocalDateTime

@RestController
@RequestMapping("/api/users")
class UserController {

    @GetMapping
    fun getUser(): UserDto {
        return UserDto(
            status = UserStatus.ACTIVE,
            cardSlot = 1,
            createdAt = LocalDateTime.now(),
            agree = true,
            email = "ctk0327@Naver.com",
            musicCard = listOf("ctk0327"),
            name = "전태경",
            type = UserType.EMAIL,
        )
    }
}