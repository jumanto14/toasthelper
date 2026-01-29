# ToastHelper 🍞

[![](https://jitpack.io/v/jumanto14/toasthelper.svg)](https://jitpack.io/#jumanto14/toasthelper)

Simple, clean, and production-ready **Toast helper library for Android (Kotlin)**.  
Designed for **beginners**, safe for **real production apps**, and easy to use.

---

## ✨ Features

- 🚀 Super simple API
- 🧵 Thread-safe (can be called from anywhere)
- 🛑 Auto cancel previous toast (anti spam)
- 🎯 Bottom & Center toast
- 🎨 Custom layout support
- 🔒 No memory leak (uses applicationContext)
- 📦 No external dependencies

---

## 📦 Installation

### Step 1: Add JitPack repository

**settings.gradle.kts**
```kotlin
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}
```

### Step 2: Add dependency

```kotlin
dependencies {
    implementation("com.github.jumanto14:toasthelper:v1.0.1")
}
```

---

## 🚀 Usage

### Basic toast

```kotlin
ToastHelper.show(this, "Hello World")
```

### Long toast

```kotlin
ToastHelper.long(this, "Login berhasil")
```

### Center toast

```kotlin
ToastHelper.center(this, "Data tersimpan")
```

---

## 🎨 Custom Toast

### 1️⃣ Use default custom toast (provided by library)

```kotlin
ToastHelper.custom(this)
```

Library already includes `toast_custom.xml` so you can use it instantly.

---

### 2️⃣ Fully custom layout (Advanced)

#### Create your layout

```xml
<!-- res/layout/my_toast.xml -->
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:background="@drawable/bg_toast"
    android:padding="12dp">

    <TextView
        android:id="@+id/txtToast"
        android:text="Custom Toast"
        android:textColor="@android:color/white"/>
</LinearLayout>
```

#### Show custom toast

```kotlin
ToastHelper.custom(
    context = this,
    layoutResId = R.layout.my_toast,
    duration = Toast.LENGTH_SHORT,
    gravity = Gravity.CENTER
)
```

---

## 🔒 Production Safety

- Uses `applicationContext`
- Always runs on Main Thread
- Automatically cancels previous toast
- No memory leak

---

## 🗂 Library Info

- Android Library
- No Activity
- No Permission
- No Manifest component

---

## 📄 License

MIT License — free to use in personal and commercial projects.

---

## 👨‍💻 Author

**Jumanto**  
Android Developer — Indonesia 🇮🇩  
GitHub: https://github.com/jumanto14
