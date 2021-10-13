package com.fahimezv.wetest

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.FrameLayout
import android.widget.TextView

class MainActivity:AppCompatActivity() {
    //UI
    private lateinit var mTextView:TextView
    private lateinit var mRootView:FrameLayout


    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)
        mRootView = FrameLayout(this).apply {
            mTextView = TextView(context).apply {
                text = "Hello"
                setTextColor(Color.RED)
                setBackgroundColor(Color.GRAY)
                gravity = Gravity.CENTER
            }

            addView(mTextView ,NZLayout.Frame.fullScreen())

        }

        setContentView(mRootView)
    }
}