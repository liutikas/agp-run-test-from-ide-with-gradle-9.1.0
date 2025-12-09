pluginManagement {
    repositories {
        maven {
            url = uri("https://androidx.dev/studio/builds/14559705/artifacts/artifacts/repository")
        }
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven {
            url = uri("https://androidx.dev/studio/builds/14559705/artifacts/artifacts/repository")
        }
        google()
        mavenCentral()
    }
}

rootProject.name = "My Application"
include(":app")
 