pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()

        // مخازن واسط برای دور زدن تحریم (که خودت قبلا اضافه کرده بودی)
        maven { url = uri("https://maven.myket.ir") }
        maven { url = uri("https://maven.aliyun.com/repository/google") }
        maven { url = uri("https://maven.aliyun.com/repository/public") }

        // 🎯 مخزن نقشه مپ
        maven { url = uri("https://maven.map.ir/") }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()

        // مخازن واسط
        maven { url = uri("https://maven.myket.ir") }
        maven { url = uri("https://maven.aliyun.com/repository/google") }
        maven { url = uri("https://maven.aliyun.com/repository/public") }

        // 🎯 مخزن نقشه مپ (Map.ir)
        maven { url = uri("https://maven.map.ir/") }
    }
}

rootProject.name = "SuperApp"
include(":app")