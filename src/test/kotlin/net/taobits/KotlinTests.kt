package net.taobits

import io.kotlintest.KTestJUnitRunner
import io.kotlintest.specs.ShouldSpec
import org.junit.runner.RunWith

@RunWith(KTestJUnitRunner::class)
class KotlinTests : ShouldSpec() { init {
    should("return hello world") {
        getGreeting() shouldBe "Hello, world!"
    }
}}
