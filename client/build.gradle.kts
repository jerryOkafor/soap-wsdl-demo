plugins {
    kotlin("jvm")
}

repositories {
    mavenCentral()
}

val jaxws by configurations.creating

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("junit", "junit", "4.12")
    jaxws("com.sun.xml.ws:jaxws-tools:2.1.4")
}

task("wsimport-myservice") {
    group = BasePlugin.BUILD_GROUP
    val destDir = file("$projectDir/src/main/generated")
    destDir.mkdirs()
    val sourcedestdir = file("$projectDir/src/main/java")
    sourcedestdir.mkdirs()
    doLast {
        ant.withGroovyBuilder {
            "taskdef"(
                "name" to "wsimport",
                "classname" to "com.sun.tools.ws.ant.WsImport",
                "classpath" to jaxws.asPath
            )

            "wsimport"(
                "keep" to true,
                "sourcedestdir" to sourcedestdir,
                "destDir" to destDir,
                "package" to "com.example.myproject",
                "wsdl" to "src/main/resources/META-INF/wsdl/server.wsdl",
                "wsdlLocation" to "http://localhost:8084/?wsdl"
            ) {
                "xjcarg"("value" to "-XautoNameResolution")
            }
        }
    }
}