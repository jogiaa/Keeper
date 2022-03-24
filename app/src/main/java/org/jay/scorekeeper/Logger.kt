package org.jay.scorekeeper

import android.util.Log

object Logger {
    operator fun invoke(tag: String, msg: String) {
        Log.e("$tag[${Thread.currentThread().name}]", msg)
    }
}