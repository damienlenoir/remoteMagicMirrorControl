package com.magicmirror.damien.magicmirrorremotecontrol

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_message.view.*

class Message : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)
    }

    fun sendMessage(view: View) {
        val message = findViewById<EditText>(R.id.monMessage)
        println("test print")
        println(message.text)

        val email = "mon.mirroir.magique@outlook.com"
        val subject = "un test depuis android"
        val contenuMessage = ""

        val sm = SendMail(this, email, subject, contenuMessage)

        //Executing sendmail to send email
        sm.execute()
    }
}
