package com.abjt.dynamictheme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)
        findViewById<Button>(R.id.button_new_activity).setOnClickListener {
            startActivity(Intent(this, Activity2::class.java))
        }
    }

    companion object {
        /*
        just using constants in this activity for convenience use it as variable inside activity2 and save the boolean in onSavedInstanceState()
        to survive configuration change and call setTheme() after onCreate() but before setContentView()

        Retrieve the variable from the bundle in the onCreate(savedInstanceState: Bundle?)
        then do check and apply theme

        by default set the theme to the app theme

        All Good to Go 👍 😁 ✌
         */

        const val DARK_THEME = 100
        const val LIGHT_THEME = 101
        var theme_style = LIGHT_THEME
    }
}