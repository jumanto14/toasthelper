package com.jumanto14.toasthelper

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Toast

/**
 * ToastHelper
 * Simple, clean, and production-ready Toast library
 */
object ToastHelper {

    private var toast: Toast? = null
    private val mainHandler = Handler(Looper.getMainLooper())

    /* ---------------------------------------------------
     * Public API (Simple & Clean)
     * --------------------------------------------------- */

    fun show(context: Context, message: String) {
        text(context, message, Toast.LENGTH_SHORT, Gravity.BOTTOM)
    }

    fun long(context: Context, message: String) {
        text(context, message, Toast.LENGTH_LONG, Gravity.BOTTOM)
    }

    fun center(context: Context, message: String) {
        text(context, message, Toast.LENGTH_SHORT, Gravity.CENTER)
    }

    /**
     * Default custom toast provided by library
     */
    fun custom(context: Context) {
        custom(
            context = context,
            layoutResId = R.layout.toast_custom,
            duration = Toast.LENGTH_SHORT,
            gravity = Gravity.BOTTOM
        )
    }

    /**
     * Advanced custom toast (optional)
     */
    fun custom(
        context: Context,
        layoutResId: Int,
        duration: Int = Toast.LENGTH_SHORT,
        gravity: Int = Gravity.BOTTOM
    ) {
        mainHandler.post {
            cancelInternal()

            val appContext = context.applicationContext
            val view = LayoutInflater.from(appContext).inflate(layoutResId, null)

            toast = Toast(appContext).apply {
                this.view = view
                this.duration = duration
                setGravity(gravity, 0, 100)
                show()
            }
        }
    }

    fun cancel() {
        mainHandler.post {
            cancelInternal()
        }
    }

    /* ---------------------------------------------------
     * Internal helpers
     * --------------------------------------------------- */

    private fun text(
        context: Context,
        message: String,
        duration: Int,
        gravity: Int
    ) {
        mainHandler.post {
            cancelInternal()

            val appContext = context.applicationContext
            toast = Toast.makeText(appContext, message, duration).apply {
                setGravity(gravity, 0, 100)
                show()
            }
        }
    }

    private fun cancelInternal() {
        toast?.cancel()
        toast = null
    }
}
