
buildscript {
    repositories {
        gradleScriptKotlin()
    }
    dependencies {
        classpath(kotlinModule("gradle-plugin"))
    }
}

plugins {
    application
}

apply {
    plugin("kotlin")
}

configure<ApplicationPluginConvention> {
    mainClassName = "net.taobits.HelloWorldKt"
}

repositories {
    gradleScriptKotlin()
}

dependencies {
    compile(kotlinModule("stdlib", "1.1-M04"))
    compile(kotlinModule("test-junit", "1.1-M04"))
    testCompile("junit:junit:4.11")
    testCompile("io.kotlintest:kotlintest:1.3.5")
}
