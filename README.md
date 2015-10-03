# Activity Lifecycle Introduction (with Logcat output)
activitylifecycleintroduction-rybackpo created by Classroom for GitHub

This assignment illustrates the Android activity lifecycle using Logcat.

## Problem:

Implement an Android application that displays Logs in Logcat when the following methods are called:

1. *onCreate()* - handles the creation of the activity object, and the loading of any static resources like themes, images, layouts, set up menus, and the like.

2. *onStart()* - executes every time the activity begins.

3. *onResume()* - executes when the activity is making a transition from the Paused state and into the Running state again.

4. *onPause()* - called when the activity is still partially visible.

5. *onSaveInstanceState()* - called before the activity gets destroyed, which means you get an opportunity to save any variables you want to retain.

6. *onStop()* - called when the activity is no longer visible on the screen.

7. *onRestart()* - called when activity was stopped but is started again later.

8. *onDestroy()* - called when the entire app is being shut down and unloaded from memory.

## Basig Logging:

```Java
  private static final String LOG_TAG = "MainActivity";
  ...
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(LOG_TAG, "onStop() method was called");
    }
    ...
```

## Sample Solution:

https://github.com/DeLaSalleUniversity-Manila/activitylifecycleintroduction-rybackpo

## Keypoints:

On App Launch:

```shell
10-03 17:05:49.007  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/MainActivity﹕ onCreate() method was called
10-03 17:05:49.007  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/MainActivity﹕ onStart() method was called
10-03 17:05:49.007  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/MainActivity﹕ onResume() method was called
```

On Android 'Home' button press: 
```shell
10-03 17:05:54.366  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/MainActivity﹕ onPause() method was called
10-03 17:05:54.451  26732-26738/com.example.rybackpo.activitylifecycleintroduction D/jdwp﹕ processIncoming
10-03 17:05:54.451  26732-26738/com.example.rybackpo.activitylifecycleintroduction D/jdwp﹕ handlePacket : cmd=0x1, cmdSet=0xC7, len=0x14, id=0x4000A525, flags=0x0, dataLen=0x9
10-03 17:05:54.451  26732-26738/com.example.rybackpo.activitylifecycleintroduction D/jdwp﹕ sendBufferedRequest : len=0x34
10-03 17:05:54.495  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/OpenGLRenderer﹕ Flushing caches (mode 0)
10-03 17:05:54.519  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/OpenGLRenderer﹕ Flushing caches (mode 1)
10-03 17:05:54.901  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/MainActivity﹕ onSaveInstanceState() method was called
10-03 17:05:54.901  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/MainActivity﹕ onStop() method was called
```

On relaunch of the App: 
```shell
10-03 17:05:57.674  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/MainActivity﹕ onRestart() method was called
10-03 17:05:57.674  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/MainActivity﹕ onStart() method was called
10-03 17:05:57.674  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/MainActivity﹕ onResume() method was called
```

On Android 'Back' button press:
```shell
10-03 17:05:58.960  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/MainActivity﹕ onPause() method was called
10-03 17:05:58.962  26732-26738/com.example.rybackpo.activitylifecycleintroduction D/jdwp﹕ processIncoming
10-03 17:05:58.962  26732-26738/com.example.rybackpo.activitylifecycleintroduction D/jdwp﹕ handlePacket : cmd=0x1, cmdSet=0xC7, len=0x14, id=0x4000A540, flags=0x0, dataLen=0x9
10-03 17:05:58.962  26732-26738/com.example.rybackpo.activitylifecycleintroduction D/jdwp﹕ sendBufferedRequest : len=0x34
10-03 17:05:59.065  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/OpenGLRenderer﹕ Flushing caches (mode 0)
10-03 17:05:59.464  26732-26738/com.example.rybackpo.activitylifecycleintroduction D/jdwp﹕ processIncoming
10-03 17:05:59.464  26732-26738/com.example.rybackpo.activitylifecycleintroduction D/jdwp﹕ handlePacket : cmd=0x1, cmdSet=0xC7, len=0x14, id=0x4000A543, flags=0x0, dataLen=0x9
10-03 17:05:59.465  26732-26738/com.example.rybackpo.activitylifecycleintroduction D/jdwp﹕ sendBufferedRequest : len=0x34
10-03 17:05:59.485  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/OpenGLRenderer﹕ Flushing caches (mode 1)
10-03 17:05:59.487  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/MainActivity﹕ onStop() method was called
10-03 17:05:59.488  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/MainActivity﹕ onDestroy() method was called
```

On relaunch after being destroyed:
```shell
10-03 17:06:00.236  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/MainActivity﹕ onCreate() method was called
10-03 17:06:00.236  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/MainActivity﹕ onStart() method was called
10-03 17:06:00.236  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/MainActivity﹕ onResume() method was called
```

On configuration change (Rotating the Screen)
```shell
10-03 17:06:03.574  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/MainActivity﹕ onPause() method was called
10-03 17:06:03.575  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/MainActivity﹕ onSaveInstanceState() method was called
10-03 17:06:03.575  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/MainActivity﹕ onStop() method was called
10-03 17:06:03.575  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/MainActivity﹕ onDestroy() method was called
10-03 17:06:03.577  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/OpenGLRenderer﹕ Flushing caches (mode 0)
10-03 17:06:03.649  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/skia﹕ Flag is not 10
10-03 17:06:03.658  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/skia﹕ Flag is not 10
10-03 17:06:03.663  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/skia﹕ Flag is not 10
10-03 17:06:03.666  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/skia﹕ Flag is not 10
10-03 17:06:03.667  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/skia﹕ Flag is not 10
10-03 17:06:03.668  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/skia﹕ Flag is not 10
10-03 17:06:03.671  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/skia﹕ Flag is not 10
10-03 17:06:03.678  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/MainActivity﹕ onCreate() method was called
10-03 17:06:03.678  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/MainActivity﹕ onStart() method was called
10-03 17:06:03.678  26732-26732/com.example.rybackpo.activitylifecycleintroduction D/MainActivity﹕ onResume() method was called
```

## Screenshots:

![alt tag](https://github.com/DeLaSalleUniversity-Manila/activitylifecycleintroduction-rybackpo/blob/master/2015-10-03-14%3B57%3B47.png)

![alt tag](https://github.com/DeLaSalleUniversity-Manila/activitylifecycleintroduction-rybackpo/blob/master/2015-10-03-14%3B58%3B44.png)

![alt tag](https://github.com/DeLaSalleUniversity-Manila/activitylifecycleintroduction-rybackpo/blob/master/device-2015-10-03-150017.png)
