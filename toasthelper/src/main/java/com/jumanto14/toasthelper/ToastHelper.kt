package com.jumanto14.toasthelper

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast

/**
 * ToastHelper
 * Simple Toast wrapper for Android (Production Ready)
 */
object ToastHelper {

    private var toast: Toast? = null
    private val handler = Handler(Looper.getMainLooper())

    /**
     * Show short toast
     */
    fun show(context: Context, message: String) {
        showInternal(context, message, Toast.LENGTH_SHORT, Gravity.BOTTOM)
    }

    /**
     * Show long toast
     */
    fun showLong(context: Context, message: String) {
        showInternal(context, message, Toast.LENGTH_LONG, Gravity.BOTTOM)
    }

    /**
     * Show toast at center
     */
    fun showCenter(context: Context, message: String) {
        showInternal(context, message, Toast.LENGTH_SHORT, Gravity.CENTER)
    }

    /**
     * Show custom layout toast
     */
    fun showCustom(
        context: Context,
        layoutResId: Int,
        duration: Int = Toast.LENGTH_SHORT,
        gravity: Int = Gravity.BOTTOM
    ) {
        handler.post {
            cancel()

            val inflater = LayoutInflater.from(context.applicationContext)
            val view = inflater.inflate(layoutResId, null)

            toast = Toast(context.applicationContext).apply {
                this.view = view
                this.duration = duration
                setGravity(gravity, 0, 100)
                show()
            }
        }
    }

    /**
     * Cancel current toast
     */
    fun cancel() {
        toast?.cancel()
        toast = null
    }

    private fun showInternal(
        context: Context,
        message: String,
        duration: Int,
        gravity: Int
    ) {
        handler.post {
            cancel()

            toast = Toast.makeText(
                context.applicationContext,
                message,
                duration
            ).apply {
                setGravity(gravity, 0, 100)
                show()
            }
        }
    }
}
