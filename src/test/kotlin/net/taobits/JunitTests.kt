package net.taobits

import kotlin.test.assertEquals
import org.junit.Test

class JunitTests {
    @Test fun getGreeting_should_return_hello_world() {
        assertEquals("Hello, world!", getGreeting())
    }
}
