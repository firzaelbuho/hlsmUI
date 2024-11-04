import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.compose.compiler)

    id("maven-publish")
}

group = "io.github.firzaelbuho.hlsmui"
version = "1.0.0"

kotlin {

    jvm("desktop")



    // Define hanya sourceSet commonMain saja
    sourceSets {
        sourceSets {
            val desktopMain by getting
            val commonMain by getting


            commonMain.dependencies {

                implementation(compose.components.resources)
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material3)
                implementation(compose.ui)
                implementation(compose.components.resources)
                implementation(compose.components.uiToolingPreview)
                implementation(libs.androidx.lifecycle.viewmodel)
                implementation(libs.androidx.lifecycle.runtime.compose)
            }
            desktopMain.dependencies {
                implementation(compose.desktop.currentOs)
                implementation(libs.kotlinx.coroutines.swing)
            }
        }
    }
}

publishing {
    publications {
        create<MavenPublication>("commonMainPublication") {
            groupId = "io.github.firzaelbuho.hlsmui"
            artifactId = "hlsmui"
            version = "1.0.2"

            // Membuat artifact dari sourceSet commonMain
            val commonMainJar by tasks.creating(Jar::class) {
                archiveClassifier.set("commonMain")
                from(kotlin.sourceSets["commonMain"].kotlin)
            }
            artifact(commonMainJar)
        }
    }

    repositories {
        maven {
            url = uri("C:/data/repo")  // Path langsung ke directory tujuan
        }
    }
}


compose.desktop {
    application {
        mainClass = "io.github.firzaelbuho.hlsmui.MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "io.github.firzaelbuho.hlsmui"
            packageVersion = "1.0.0"
        }
    }
}
