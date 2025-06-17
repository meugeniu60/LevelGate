plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.nevermind.levelgate"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.nevermind.levelgate"
        minSdk = 34
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)


    //Retrofit and GSON
    implementation (libs.retrofit)
    implementation (libs.converter.gson)

    //Kotlin Coroutines
    implementation (libs.kotlinx.coroutines.android)
    implementation (libs.kotlinx.coroutines.core)

    // ViewModel and LiveData
    implementation (libs.androidx.lifecycle.extensions)

    //New Material Design
    implementation (libs.material.v120alpha06)

    //Kodein Dependency Injection
    implementation (libs.kodein.di.generic.jvm)
    implementation (libs.kodein.di.framework.android.x)

    //Android Room
    implementation (libs.androidx.room.runtime)
    implementation (libs.androidx.room.ktx)

    //Android Navigation Architecture
    implementation (libs.androidx.navigation.fragment.ktx.v230alpha06)
    implementation (libs.androidx.navigation.ui.ktx.v230alpha06)

    implementation (libs.groupie)
    implementation (libs.groupie.kotlin.android.extensions)
    implementation (libs.groupie.databinding)

    implementation (libs.androidx.preference.ktx)
}