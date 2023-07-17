
plugins {
    id("java")
    id("io.qameta.allure") version "2.11.2"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.seleniumhq.selenium:selenium-java:4.9.1")
    testImplementation("org.testng:testng:7.7.1")
    testImplementation("org.seleniumhq.selenium:selenium-api:4.9.1")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.4.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.4.2")
    testImplementation("org.apache.logging.log4j:log4j-slf4j-impl:2.20.0")
    testImplementation ("io.cucumber:cucumber-java:7.12.0")
    testImplementation ("io.cucumber:cucumber-junit:7.12.0")

    testImplementation("io.qameta.allure:allure-junit5:2.14.0")
    testImplementation("io.qameta.allure:allure-commandline:2.14.0")
    testImplementation("io.qameta.allure:allure-assertj:2.14.0")
    testImplementation("io.qameta.allure:allure-rest-assured:2.14.0")
    testImplementation("io.qameta.allure:allure-java-commons:2.14.0")
    testImplementation("org.aspectj:aspectjweaver:1.9.8")
    testImplementation("io.qameta.allure:allure-cucumber7-jvm:2.21.0")


}


tasks.test {
    useJUnitPlatform()
}

