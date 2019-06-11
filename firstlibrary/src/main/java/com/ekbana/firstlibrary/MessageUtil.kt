package com.ekbana.firstlibrary

import android.content.Context
import android.widget.Toast
import io.reactivex.Single

class MessageUtil {
    fun showToast(context: Context?, message: String?) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    fun getSingleResponse(): Single<String> {
        return Single.just("Hello from other side")
    }
}