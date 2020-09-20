package com.example.flutter_sensors_wearos

// Except the package name
// Replace everything

import android.os.Bundle

import io.flutter.app.FlutterActivity
import io.flutter.plugins.GeneratedPluginRegistrant

import androidx.wear.ambient.AmbientMode

import com.souvikbiswas.flutter_wear.FlutterAmbientCallback
import com.souvikbiswas.flutter_wear.getChannel

class MainActivity: FlutterActivity(), AmbientMode.AmbientCallbackProvider {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        GeneratedPluginRegistrant.registerWith(this)

        // Wire up the activity for ambient callbacks
        AmbientMode.attachAmbientSupport(this)
    }

    override fun getAmbientCallback(): AmbientMode.AmbientCallback {
        return FlutterAmbientCallback(getChannel(flutterView))
    }
}