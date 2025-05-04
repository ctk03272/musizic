package org.musizic.musizic.config

import com.google.auth.oauth2.GoogleCredentials
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.io.ClassPathResource


@Configuration
class FirebaseConfig {

    @Bean
    fun firebaseApp(): FirebaseApp {
        val resource = ClassPathResource("firebase-service-account.json")
        require(resource.exists()) {
            "ClassPathResource 에 firebase-service-account.json 이 없습니다!"
        }

        resource.inputStream.use { stream ->
            val options = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.fromStream(stream))
                .build()
            return FirebaseApp.initializeApp(options)
        }
    }
}

