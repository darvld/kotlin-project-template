@file: Suppress("UnstableApiUsage", "LocalVariableName")

import org.gradle.api.initialization.resolve.RepositoriesMode.FAIL_ON_PROJECT_REPOS

// Basic configuration
rootProject.name = "kotlin-project-template"

pluginManagement {
    // Plugins will be fetched from these repositories
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
    }
}

dependencyResolutionManagement {
    // Dependencies will be sourced from these repositories
    repositories {
        mavenLocal()
        mavenCentral()
        google()
    }

    // Don't allow projects to declare their own sources
    repositoriesMode.set(FAIL_ON_PROJECT_REPOS)
}