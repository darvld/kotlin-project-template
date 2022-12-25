package io.github.darvld.sample

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.fail

class GreetingTest {
    @Test
    fun `say hello using resource file`() {
        // Read the test data from a resource, we could also
        // use a parameterized test for more dynamic scenarios
        val csv = javaClass.getResource("/dataset.csv")
            ?.readText()
            ?: fail("Resource not found")

        // Simply split the csv's first (and only) line
        val (greeting, name) = csv.lines().single().split(",")

        // Run our assertions
        assertEquals("Hello", greeting)
        assertEquals("Bob", name)
    }
}