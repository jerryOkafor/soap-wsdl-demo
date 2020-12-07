plugins {
    kotlin("jvm")
}
repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    // https://mvnrepository.com/artifact/javax.xml.ws/jaxws-api
    implementation("javax.xml.ws:jaxws-api:2.3.1")

    // https://mvnrepository.com/artifact/com.sun.xml.ws/jaxws-rt
    implementation("com.sun.xml.ws:jaxws-rt:3.0.0")

    // https://mvnrepository.com/artifact/com.sun.xml.ws/rt
    implementation("com.sun.xml.ws:rt:3.0.0")


    testImplementation("junit", "junit", "4.12")
}
