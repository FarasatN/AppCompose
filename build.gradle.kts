// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.jetbrains.kotlin.jvm) apply false


}

// Located in your project's root directory: build.gradle
buildscript {
    repositories {
        google()
        mavenCentral()
    }
}