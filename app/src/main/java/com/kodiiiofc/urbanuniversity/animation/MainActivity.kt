package com.kodiiiofc.urbanuniversity.animation

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enableEdgeToEdge()
        findViewById<ImageView>(R.id.iv_logo)
            .startAnimation(AnimationUtils.loadAnimation(this, R.anim.logo))
        findViewById<TextView>(R.id.tv_far_away)
            .startAnimation(AnimationUtils.loadAnimation(this, R.anim.far_away))
        findViewById<LinearLayout>(R.id.ll_text)
            .startAnimation(AnimationUtils.loadAnimation(this,R.anim.main))
    }
}