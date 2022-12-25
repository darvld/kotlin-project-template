package io.github.darvld.sample

// Entry point for our application, arguments are optional
// and can be removed from the declaration
fun main(vararg args: String) {
    // Print all cli arguments
    args.forEach { println("Using command-line argument: $it") }

    // Select a random greeting and print it to console
    println(Greetings.getAll().random())
}

object Greetings {
    fun getAll(): List<String> {
        // Read a file from the application JAR's resources
        // See the example file at `<project-root>/resources/greetings.csv`
        val csv = javaClass.getResource("/greetings.csv")
            ?.readText()
            ?: error("Resource not found")

        // Decode the csv file into two lists
        val (greetings, names) = csv.lines().map { it.split(",") }

        // Return a list containing every combination of greeting + name
        return greetings.flatMap { greeting ->
            names.map { name -> "$greeting, $name!" }
        }
    }
}