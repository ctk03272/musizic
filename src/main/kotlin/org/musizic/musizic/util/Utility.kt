package org.musizic.musizic.util

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


fun LocalDateTime.toZuluString(): String =
    this.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"))