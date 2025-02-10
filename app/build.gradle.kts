plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
//    id("com.google.devtools.ksp")
//    id("com.google.devtools.ksp") version "1.9.0-1.0.11" // Replace with the latest version

//    id("com.android.application") version "8.6.0" apply false
//    id("com.android.library") version "8.6.0" apply false
//    kotlin("android") version "1.8.0" apply false
}
kotlin{
    sourceSets{
        debug{
            kotlin.srcDirs("build/generated/ksp/debug/kotlin")
        }
        release{
            kotlin.srcDirs("build/generated/ksp/release/kotlin")
        }
    }
}

android {
    namespace = "com.example.appcompose"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.appcompose"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
//            excludes += "/META-INF/{AL2.0,LGPL2.1}"
            excludes += setOf("META-INF/DEPENDENCIES")
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.espresso.core)
    implementation(libs.androidx.espresso.core)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    val composeBom = platform("androidx.compose:compose-bom:2024.06.00")
    implementation(composeBom)

    debugImplementation(libs.ui.tooling)
    implementation(libs.ui.tooling.preview)

    implementation(libs.androidx.constraintlayout.compose)

    implementation(libs.androidx.navigation.compose)
//    implementation(libs.androidx.material.icons.extended) // Use latest version


//    implementation(libs.core)
//    ksp("io.github.raamcosta.compose-destinations:ksp:1.9.0-beta")

// V2 only: for bottom sheet destination support, also add
//    implementation(libs.bottom.sheet)


    //-------------------
    // Jetpack Compose dependencies
//    implementation("androidx.compose.ui:ui:1.3.0")
//    implementation("androidx.compose.material:material:1.3.0")
//    implementation("androidx.compose.ui:ui-tooling-preview:1.3.0")
//    debugImplementation("androidx.compose.ui:ui-tooling:1.3.0")

    // WorkManager for background processing
    implementation(libs.androidx.work.runtime.ktx)

    // Google Sign-In for OAuth 2.0
    implementation(libs.play.services.auth)

    // Google API client libraries for Drive
    implementation(libs.google.api.client.android)

//    implementation("com.google.apis:google-api-services-drive:v3-rev20220624-1.32.1") // Or latest version 'com.google.apis:google-api-services-drive:v3'
// https://mvnrepository.com/artifact/com.google.apis/google-api-services-drive
    implementation(libs.google.api.services.drive)


    implementation(libs.google.api.client) // Or latest version
    implementation(libs.google.http.client.android) // Or latest version
    implementation(libs.google.oauth.client) // Or latest version (if needed for authentication)

    // For GsonFactory
    implementation(libs.gson) // Or latest version

}