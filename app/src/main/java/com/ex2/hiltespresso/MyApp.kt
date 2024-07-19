package com.ex2.hiltespresso

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import io.ionic.portals.PortalManager

@HiltAndroidApp
class MyApp : Application(){
    override fun onCreate() {
        super.onCreate()
        PortalManager.register("ADD_API_KEY")
        PortalManager.newPortal("profile")
            .setStartDir("public")
            .create()
    }
}