plugins {
    java
    maven
}

group = "net.socialhub.misskey4j"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(uri("https://jitpack.io"))
}

dependencies {

    // J2ObjC
    compile("com.github.uakihir0", "JLogger", "1.4")
    compile("com.github.uakihir0", "JHttpClient", "1.1.6")

    // Library
    compile("com.google.code.gson", "gson", "2.8.6")
    compile("com.github.uakihir0", "Java-WebSocket", "1.4.1.1")

    // Test
    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}