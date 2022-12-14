// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        mavenCentral()
        maven {
            url = uri("https://maven.google.com/")
            name = "Google"
        }
        google()
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:7.2.2")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:2.5.1")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

//allprojects {
//    repositories {
//        mavenCentral()
//        maven {
//            url = uri("https://maven.google.com/")
//            name = "Google"
//        }
//    }
//}