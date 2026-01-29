# ToastHelper 🍞

[![](https://jitpack.io/v/jumanto14/toasthelper.svg)](https://jitpack.io/#jumanto14/toasthelper)

Simple, lightweight, and production-ready **Toast helper library for
Android (Kotlin)**.\
Designed for **beginners**, but safe and clean enough for **real
production apps**.

------------------------------------------------------------------------

## ✨ Features

-   🚀 Super simple API
-   🧵 Thread-safe (can be called from anywhere)
-   🛑 Auto cancel previous toast (anti spam)
-   🎯 Bottom & Center toast
-   🎨 Custom layout support
-   🔒 No memory leak (uses applicationContext)
-   📦 No external dependencies

------------------------------------------------------------------------

## 📦 Installation

### Step 1: Add JitPack to your root `settings.gradle.kts`

``` kotlin
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}
```

### Step 2: Add dependency

``` kotlin
dependencies {
    implementation("com.github.jumanto14:toasthelper:1.0.0")
}
```

> Replace `1.0.0` with the latest version.

------------------------------------------------------------------------

## 🚀 Usage

### Show default toast

``` kotlin
ToastHelper.show(this, "Hello World")
```

### Show long toast

``` kotlin
ToastHelper.showLong(this, "Login berhasil")
```

### Show center toast

``` kotlin
ToastHelper.showCenter(this, "Data tersimpan")
```

### Show custom layout toast

``` kotlin
ToastHelper.showCustom(this, R.layout.toast_custom)
```

------------------------------------------------------------------------

## 🧠 Why ToastHelper?

-   No boilerplate
-   No repeated `Toast.makeText`
-   Safe for production
-   Beginner-friendly

Perfect for: - Learning Android - Starter projects - Utility libraries
collection

------------------------------------------------------------------------

## 🔒 Production Safety

-   Uses `applicationContext`
-   Automatically cancels previous toast
-   Always runs on Main Thread

------------------------------------------------------------------------

## 🗂 Module Type

-   Android Library
-   No Activity
-   No Permission
-   No Manifest component

------------------------------------------------------------------------

## 📄 License

MIT License --- free to use in personal and commercial projects.

------------------------------------------------------------------------

## 👨‍💻 Author

Jumanto\
Android Developer --- Indonesia\
GitHub: https://github.com/jumanto14
