plugins {
    // Apply the Kotlin JVM plugin, ids and versions
    // are defined in `gradle/libs.versions.toml`
    alias(libs.plugins.kotlin)

    // Apply the Gradle Application plugin
    // to run and package our project
    application
}

// Configure custom source sets
sourceSets {
    // By default, Gradle detects sources inside the
    // `src/main/kotlin` directory, but we can define
    // our own sources root
    main {
        kotlin.srcDir("src")
        resources.srcDir("resources")
    }

    test {
        kotlin.srcDir("test")
        resources.srcDir("testResources")
    }
}

// Declare our project's dependencies
dependencies {
    // See the version catalog at `gradle/libs.versions.toml`
    // for more information about how to define dependencies

    // Kotlin test dependencies (JUnit 5)
    testImplementation(kotlin("test"))
}

// Use JUnit 5's test runner
tasks.test {
    useJUnitPlatform()
}

// Configure our app's distribution
application {
    // The main class is the entry point to our application, it should
    // be either a file containing a top-level `main` function, or an
    // object (or class companion) with a @JvmStatic `main` function.ø
    mainClass.set("io.github.darvld.sample.MainKt")
}