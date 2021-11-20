package com.example.candycrushtooltips

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import androidx.core.content.ContextCompat
import com.example.candycrushtooltips.databinding.ActivityTutorial3Binding
import com.skydoves.balloon.ArrowOrientation
import com.skydoves.balloon.Balloon
import com.skydoves.balloon.BalloonAnimation
import com.skydoves.balloon.showAlignRight
import io.github.douglasjunior.androidSimpleTooltip.SimpleTooltip

class TutorialActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityTutorial3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTutorial3Binding.inflate(layoutInflater)
        val root = binding.root
        setContentView(root)

        displayTooltip()
    }
    private fun displayTooltip() {

        val balloon = Balloon.Builder(this)
            .setBalloonAnimation(BalloonAnimation.CIRCULAR)
            .setDismissWhenClicked(true)
            .setLayout(R.layout.third_custom_layout)
            .setIsVisibleArrow(false)
            .setBackgroundColor(ContextCompat.getColor(this,R.color.transparent))
            .setBalloonHighlightAnimationResource(android.R.anim.slide_out_right)
            .setCornerRadius(12f)
            .setMarginRight(24)
            .build()


        binding.textView.showAlignRight(balloon)

    }
}