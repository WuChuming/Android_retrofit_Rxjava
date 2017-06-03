# MyfirstAndroidProject

**MyfirstAndroidProject** is a project worked on Android device.It is my learning Record On Android. a simple way for network-request(a rookie's record).The begining of this term is my curiousity that I want to find out why our android team have more efficiency on the same project we are working for. When I find out they can make a networking request by retrofit which have a similar function with our network-request layer but better. It can dynamic implement its interface's function which I think is the biggest difference. Then, I encounter Rxjava, a reactive programming concept. Anyway, it is a excellent way for android project, And I would like to record this Demo.
 

## Usage steps
**1.** Copy the following phrases on your build.gradle which in floder called app. then, Click "Sync Now" and finish the framework-loading.

 compile 'io.reactivex:rxjava:1.2.7'
    compile 'com.wzgiceman:RxBus:1.0.2'
    compile 'com.trello:rxlifecycle-components:1.0'
    compile 'com.tbruyelle.rxpermissions:rxpermissions:0.9.3@aar'
    compile 'com.jakewharton.rxbinding:rxbinding:0.4.0'
    compile 'com.squareup.retrofit2:retrofit:2.2.0'
    compile 'com.squareup.retrofit2:converter-scalars:2.2.0'
    compile 'com.squareup.okhttp3:logging-interceptor:3.6.0'
    compile 'com.squareup.retrofit2:converter-gson:2.2.0'
    compile 'com.squareup.retrofit2:adapter-rxjava:2.2.0'
    compile 'com.android.support:recyclerview-v7:25.3.1'


**2.** Make a singleTon Class(In this project, it call APiClient), it is used for setting the basic configuration, such as basic URL, request interface, mapping,log, overtime, and so on!

**3.** Make a request interface file.(In this project, It call APiService),In this file, you need to write down you network-request interfaces with a formate It need. Of course, Before doing this, you need to set your response entity with a Tool called "GJson".PS: In this step, Using Rxjava or not is fine. Actually, I don't know the biggest difference betweeen them, I think, using Rxjava is better.

**4.** Use it! Check the the method in Demo's MainActivity, It has two kinds of usage. Using Rxjava and not using Rxjava.

Please Check the Demo!

**3.** Enjoy it！！！！！！

**PS：** It is Rookie's record!