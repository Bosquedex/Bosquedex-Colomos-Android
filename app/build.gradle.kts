plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.kotlin.compose)


    id("com.google.gms.google-services")

//    id("kotlin-kapt")
//    alias(libs.plugins.kotlin.serialization)

    //id("com.google.dagger.hilt.android")

    //Koin

//    alias(libs.plugins.ksp)
}

android {
    namespace = "com.example.bosquedexcolomos"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.bosquedexcolomos"
        minSdk = 29
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
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
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)



    // Import the Firebase BoM
    implementation(platform("com.google.firebase:firebase-bom:33.13.0"))


    // When using the BoM, don't specify versions in Firebase dependencies
    implementation("com.google.firebase:firebase-analytics")

    //Serialization
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")


    //Dagger Hilt
//    implementation("com.google.dagger:hilt-android:2.51.1")
//    implementation ("androidx.hilt:hilt-navigation-compose:1.0.0")
//    kapt("com.google.dagger:hilt-android-compiler:2.51.1")

    //Koin
    implementation(project.dependencies.platform("io.insert-koin:koin-bom:4.0.0"))
    implementation("io.insert-koin:koin-core")

    // Koin Test features
    testImplementation("io.insert-koin:koin-test")
    // Koin for JUnit 4
    testImplementation("io.insert-koin:koin-test-junit4")
    // Koin for JUnit 5
    testImplementation("io.insert-koin:koin-test-junit5")
    //Android
    implementation("io.insert-koin:koin-android")
    //ComposeMP
    implementation("io.insert-koin:koin-compose")
    implementation("io.insert-koin:koin-compose-viewmodel")
    implementation("io.insert-koin:koin-compose-viewmodel-navigation")

}
// Compile time check
//ksp {
//    arg("KOIN_CONFIG_CHECK","true")
//}

// Allow references to generated code
//kapt {
//    correctErrorTypes = true
//}