group = "dev.jbringb"
version = "1.0-SNAPSHOT"

buildscript {
    dependencies {
        classpath("org.postgresql:postgresql:42.7.1")
        classpath("org.flywaydb:flyway-database-postgresql:10.4.1")
    }
}

repositories {
    mavenCentral()
}

plugins {
    kotlin("jvm") version "2.2.20"
    id("org.flywaydb.flyway") version "10.0.0"
    id("co.uzzu.dotenv.gradle") version "4.0.0"
}

allprojects {
    tasks.withType<DefaultTask> {
        doFirst {
            println("Project ${project.name}: DB_URL=${env.fetchOrNull("DB_URL")}")
        }
    }
}

flyway {
    url = env.fetch("DB_URL")
    user = env.fetch("DB_USER")
    password = env.fetch("DB_PASSWORD")
    locations = arrayOf("filesystem:${rootDir}/db")
}