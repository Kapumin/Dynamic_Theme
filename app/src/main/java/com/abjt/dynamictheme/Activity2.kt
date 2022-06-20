package com.abjt.dynamictheme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.abjt.dynamictheme.Activity1.Companion.DARK_THEME
import com.abjt.dynamictheme.Activity1.Companion.LIGHT_THEME
import com.abjt.dynamictheme.Activity1.Companion.theme_style

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Apply the default theme according to the app theme
        when (theme_style) {
            LIGHT_THEME -> setTheme(R.style.Activity2LightTheme)
            DARK_THEME -> setTheme(R.style.Activity2DarkTheme)
        }
        setContentView(R.layout.activity_2)

        findViewById<TextView>(R.id.light_mode).setOnClickListener {
            theme_style = LIGHT_THEME
            customRecreateActivity()
        }

        findViewById<TextView>(R.id.dark_mode).setOnClickListener {
            theme_style = DARK_THEME
            customRecreateActivity()
        }
    }

    private fun customRecreateActivity() {
        startActivity(intent)
        finish()
        overridePendingTransition(0, 0)
    }
}