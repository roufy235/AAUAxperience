package com.covirtue.aauaxperience.controllers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.covirtue.aauaxperience.R
import com.covirtue.aauaxperience.utilities.roufy235ActivityTransition
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        Handler().postDelayed({
            loader.visibility = View.VISIBLE
        }, 1000)

        Handler().postDelayed({
            startActivity(Intent(this, InfoActivity::class.java))
            this.roufy235ActivityTransition(true)
        }, 3000)
    }
}
