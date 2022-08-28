import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

dependencies {
    compileOnly("org.mongodb:mongodb-driver-legacy:4.7.1")
    compileOnly("redis.clients:jedis:4.3.0-m1")
    compileOnly("com.google.code.gson:gson:2.9.1")
    compileOnly("org.jetbrains:annotations:23.0.0")
    compileOnly("org.apache.commons:commons-lang3:3.12.0")
    compileOnly("commons-io:commons-io:2.11.0")
    compileOnly("org.jline:jline:3.21.0")
    compileOnly("net.dv8tion:JDA:5.0.0-alpha.18")
    implementation(project(":survival-discordbot-api"))
    implementation(project(":survival-discordbot-common"))
}

tasks.named<ShadowJar>("shadowJar") {
    // Get rid of all the libs which are 100% unused.
    minimize()
    mergeServiceFiles()

    doFirst {
        manifest {
            attributes["Main-Class"] = "fun.surviv.discord.Bootstrap"
            attributes["Premain-Class"] = "fun.surviv.discord.Agent"
            attributes["Can-Retransform-Classes"] = true
        }
    }

    doLast {
        copy {
            from("$projectDir/../out/shaded/${project.name}-${project.version}-shaded.jar")
            rename("${project.name}-${project.version}-shaded.jar", "${rootProject.name}-${rootProject.version}.jar")
            into("$projectDir/../out/")
        }
    }

}


