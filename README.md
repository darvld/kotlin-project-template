# Kotlin project template

A minimal Kotlin JVM project template.

## Using this template

This is a Template repository, which means instead of cloning it, you can click on the `Use this template`
button, and GitHub will automatically create a repository for you with this template's code. After the repository is
created, a pre-defined cleanup workflow will run, replacing the default project name with your repository's name.
Allow this workflow to run before cloning your repository.

## Structure:

This project uses a custom directory structure to reduce nesting. The Gradle project is configured to detect the custom
locations for source sets:

```kotlin
sourceSets {
    main {
        kotlin.srcDir("src")
        resources.srcDir("resources")
    }

    test {
        kotlin.srcDir("test")
        resources.srcDir("testResources")
    }
}
```

See the full configuration in the
project's [build script](https://github.com/darvld/kotlin-project-template/blob/main/build.gradle.kts).

## Declaring dependencies

This project uses
Gradle's [Version Catalogs](https://docs.gradle.org/current/userguide/platforms.html#sub:version-catalog)
feature to declare dependencies. See the
project's [`libs.versions.toml`](https://github.com/darvld/kotlin-project-template/blob/main/gradle/libs.versions.toml)
file for instructions on how to use this feature.

## Running the sample code

Use the Gradle Application plugin to run the sample app:

```commandline
gradle run
```