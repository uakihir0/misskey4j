plugins {
    // Apply the java-library plugin for API and implementation separation.
    `java-library`
}

group = "net.socialhub.misskey4j"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(uri("https://jitpack.io"))
}

dependencies {

    // J2ObjC
    implementation("com.github.uakihir0", "JLogger", "1.4")
    implementation("com.github.uakihir0", "JHttpClient", "1.1.8")

    // Library
    implementation("com.google.code.gson", "gson", "2.8.2")

    // Test
    testImplementation("junit:junit:4.13.2")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}