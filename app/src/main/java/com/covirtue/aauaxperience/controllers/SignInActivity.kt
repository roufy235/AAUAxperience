package com.covirtue.aauaxperience.controllers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.covirtue.aauaxperience.R
import com.covirtue.aauaxperience.utilities.roufy235ActivityTransition
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignInActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        signInBtn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        v?.let {
            when(it.id) {
                R.id.signInBtn -> {
                    startActivity(Intent(this, UserDashboard::class.java))
                    this.roufy235ActivityTransition(true)
                }
            }
        }
    }
}
