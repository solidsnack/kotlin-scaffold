group = "example"
version = "1.0-SNAPSHOT"

dependencies {
    implementation(kotlin("stdlib"))
}

plugins {
    application
    id("com.github.johnrengelman.shadow") version "5.1.0"
    kotlin("jvm") version "1.3.50"
}

repositories {
    mavenCentral()
}

application {
    mainClassName = "${group}.${name}.MainKt"
}
