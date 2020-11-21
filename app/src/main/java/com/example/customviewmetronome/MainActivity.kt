package com.example.customviewmetronome

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private var mMetronomeView: MetronomeView? = null
    private var mBpmText: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBpmText = findViewById<View>(R.id.bpm_text) as TextView
        mMetronomeView = findViewById<View>(R.id.metronome_view) as MetronomeView
        mMetronomeView?.bpm = 120f
    }

    fun setDegree(){

    }
}