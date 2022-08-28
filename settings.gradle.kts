rootProject.name = "SurvivalDiscordbot"

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}
include("survival-discordbot-common")
include("survival-discordbot-api")
include("survival-discordbot-launcher")
