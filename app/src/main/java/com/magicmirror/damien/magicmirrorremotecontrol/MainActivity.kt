package com.magicmirror.damien.magicmirrorremotecontrol

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        // val myToast = Toast.makeText(this, message, duration);
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun startMessageActivity(view: View) {
        // Create an Intent to start the second activity
        val randomIntent = Intent(this, Message::class.java)

        // Start the new activity.
        startActivity(randomIntent)
    }
}
