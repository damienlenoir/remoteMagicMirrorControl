package com.magicmirror.damien.magicmirrorremotecontrol

import java.io.FileInputStream
import java.util.*

class Conf {
    private val prop = Properties()
    val email: String by lazy { getProperties("email")}
    val password: String by lazy { getProperties("password")}

    init {
        val fis = FileInputStream("../../../../../assets/mail.properties")
        prop.load(fis)
    }
    private fun getProperties(name: String) = prop.getProperty(name)
}
