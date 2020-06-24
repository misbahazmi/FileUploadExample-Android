# File Upload Example - Android
Android: Upload Image on Server using Retrofit Library

Here we have used below libs:

    /*retrofit lib for http calls*/
    implementation 'com.squareup.retrofit2:retrofit:2.1.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.1.0'
    implementation 'com.squareup:otto:1.3.8'
    implementation 'com.squareup.okhttp3:okhttp:3.7.0'
    implementation 'com.squareup.retrofit2:adapter-rxjava:2.1.0'
    //https://github.com/ReactiveX/RxAndroid
    implementation 'io.reactivex:rxandroid:1.2.1'
    implementation 'io.reactivex:rxjava:1.3.0'
    
    //Image Cropping Lib
    implementation 'com.yalantis:ucrop:2.2.0'
    //Image loading Lib
    implementation 'com.squareup.picasso:picasso:2.5.2'

Permissions needed in Manifest:

    <uses-permission android:name="android.permission.CAMERA" />
    <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
    <uses-permission android:name="android.permission.INTERNET" />
