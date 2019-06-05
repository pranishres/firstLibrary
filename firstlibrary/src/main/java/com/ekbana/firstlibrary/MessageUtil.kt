package com.ekbana.firstlibrary

import android.content.Context
import android.widget.Toast

class MessageUtil {
    fun showToast(context: Context?, message: String?) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT)
    }
}