plugins {
	id("org.springframework.boot") version "3.3.3"
	id("io.spring.dependency-management") version "1.1.3"
	kotlin("jvm") version "1.9.0"
	kotlin("kapt") version "1.9.0"
	kotlin("plugin.spring") version "1.8.22"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}
dependencies {
	// Spring Boot 기본 기능: 웹, 보안, JPA
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-security")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	kapt("org.springframework.boot:spring-boot-configuration-processor")


	// Flyway: DB 스키마 마이그레이션 관리
	implementation("org.flywaydb:flyway-core")
	implementation("org.flywaydb:flyway-mysql")

	// Swagger: SpringDoc OpenAPI Starter (Spring Boot 3.x 환경)
	implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.2.0")

	// Firebase Admin SDK: Firebase 인증 토큰 검증 및 사용자 관리
	implementation("com.google.firebase:firebase-admin:9.1.1")

	// Kotlin 관련 라이브러리
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

	// MySQL Connector와 Cloud SQL Socket Factory (GCP Cloud SQL 연동)
	runtimeOnly("mysql:mysql-connector-java:8.0.33")
	runtimeOnly("com.google.cloud.sql:mysql-socket-factory-connector-j-8:1.11.0")

	// Actuator, DevTools, Validation
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	implementation("org.springframework.boot:spring-boot-starter-validation")

	// JSON 직렬화용
	implementation("io.jsonwebtoken:jjwt-api:0.11.5")
	runtimeOnly("io.jsonwebtoken:jjwt-impl:0.11.5")
	runtimeOnly("io.jsonwebtoken:jjwt-jackson:0.11.5")

	// MapStruct
	implementation("org.mapstruct:mapstruct:1.5.5.Final")


	// 테스트 관련 라이브러리 (Mockk, Testcontainers)
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.security:spring-security-test")
	testImplementation("io.mockk:mockk:1.13.4")
	testImplementation("org.testcontainers:junit-jupiter:1.17.6")
	testImplementation("org.testcontainers:mysql:1.17.6")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs += "-Xjvm-default=all"
	}
}
