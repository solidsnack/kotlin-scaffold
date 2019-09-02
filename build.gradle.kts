group = "example"
version = "1.0-SNAPSHOT"

dependencies {
    implementation(kotlin("stdlib"))
}

plugins {
    application
    id("com.github.johnrengelman.shadow") version "5.1.0"
    id("org.jetbrains.dokka") version "0.9.18"
    kotlin("jvm") version "1.3.50"
}

repositories {
    jcenter()
    mavenCentral()
}

application {
    mainClassName = "${group}.${name}.MainKt"
}
