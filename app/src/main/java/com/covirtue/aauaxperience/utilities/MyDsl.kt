package com.covirtue.aauaxperience.utilities

import android.app.Activity
import android.widget.EditText
import com.google.android.gms.tasks.Task
import com.google.firebase.database.DatabaseReference

fun Activity.roufy235ActivityTransition(isFinish : Boolean = false) {
    this.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    if (isFinish) this.finish()
}

fun EditText.roufy235ValidateEditText() : Boolean {
    return if (this.text.toString().isNotEmpty()) {
        true;
    } else {
        this.error = "required"
        false;
    }
}