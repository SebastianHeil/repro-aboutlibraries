plugins {
    kotlin("android") version "2.1.20"
    id("com.mikepenz.aboutlibraries.plugin") version "12.0.0"
    id("com.android.application") version "8.9.2"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.mikepenz:aboutlibraries:12.0.0")
    implementation("jakarta.inject:jakarta.inject-api:2.0.1")
}

kotlin {
    jvmToolchain(21)
}

android {
    compileSdk = 35
    namespace = "com.example"
}