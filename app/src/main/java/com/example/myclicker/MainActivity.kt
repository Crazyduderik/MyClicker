package com.example.myclicker

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val background = findViewById<ConstraintLayout>(R.id.main_id)
        val countTextView = findViewById<TextView>(R.id.textViewCounter)
        val buttonClicker = findViewById<Button>(R.id.button)
        // cast the background to Animation Drawable
        val animation = background.background as AnimationDrawable
        animation.setEnterFadeDuration(2500)
        animation.setExitFadeDuration(5000)
        animation.start()


        var counter = 0

        buttonClicker.setOnClickListener {
            counter++
            countTextView.text = counter.toString()
        }

    }


}