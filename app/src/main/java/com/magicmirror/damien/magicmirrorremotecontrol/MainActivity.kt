package com.magicmirror.damien.magicmirrorremotecontrol

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {
        val message = findViewById<EditText>(R.id.monMessage)
        val stringMessage = message.text.toString()
        val email = "mon.miroir.magique@outlook.com"
        val contenuMessage = ""
        val sm = SendMail(this, email, stringMessage, contenuMessage)
        sm.execute()
    }
}
