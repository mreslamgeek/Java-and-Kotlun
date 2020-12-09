package com.eslam.javakotlun.myKotlin

import android.widget.TextView

class KotlinClass {

    fun hellofromKotlin(myTextView: TextView) {
        val myText = "Hello From Kotlin"
        myTextView.text = myText
    }

}