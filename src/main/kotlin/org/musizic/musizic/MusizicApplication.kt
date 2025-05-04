package org.musizic.musizic

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@OpenAPIDefinition(info = Info(title = "Musizic API", version = "v1", description = "Musizic API 문서"))
class MusizicApplication

fun main(args: Array<String>) {
	runApplication<MusizicApplication>(*args)
}
