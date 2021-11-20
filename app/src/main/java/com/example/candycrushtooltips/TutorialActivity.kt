package com.example.candycrushtooltips

import android.app.Application
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.dynamicanimation.animation.DynamicAnimation
import androidx.dynamicanimation.animation.SpringAnimation
import androidx.dynamicanimation.animation.SpringForce
import com.example.candycrushtooltips.databinding.ActivityTutorialBinding
import com.skydoves.balloon.*
import com.skydoves.balloon.animations.BalloonRotateAnimation
import com.skydoves.balloon.overlay.BalloonOverlayAnimation
import com.skydoves.balloon.overlay.BalloonOverlayRoundRect
import com.skydoves.balloon.overlay.BalloonOverlayShape
import io.github.douglasjunior.androidSimpleTooltip.SimpleTooltip

class TutorialActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTutorialBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTutorialBinding.inflate(layoutInflater)
        val root = binding.root
        setContentView(root)
        displayTooltip()

    }

    private fun displayTooltip() {

        val balloon = Balloon.Builder(this)
            .setDismissWhenClicked(true)
            .setLayout(R.layout.first_custom_layout)
            .setIsVisibleArrow(false)
            .setBackgroundColor(ContextCompat.getColor(this, R.color.transparent))
            .setCornerRadius(12f)
            .setBalloonHighlightAnimationResource(android.R.anim.slide_out_right)
            .setBalloonAnimation(BalloonAnimation.CIRCULAR)
            .setMarginRight(32)
            .build()


        binding.textView.showAlignRight(balloon)

        binding.clTutorial.setOnClickListener {
            val i = Intent(this, TutorialActivity2::class.java)
            startActivity(i)
        }

    }


}