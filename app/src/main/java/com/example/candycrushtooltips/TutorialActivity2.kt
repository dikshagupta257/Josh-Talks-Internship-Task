package com.example.candycrushtooltips

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import androidx.core.content.ContextCompat
import com.example.candycrushtooltips.databinding.ActivityTutorial2Binding
import com.skydoves.balloon.ArrowOrientation
import com.skydoves.balloon.Balloon
import com.skydoves.balloon.BalloonAnimation
import com.skydoves.balloon.showAlignRight
import io.github.douglasjunior.androidSimpleTooltip.SimpleTooltip

class TutorialActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityTutorial2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTutorial2Binding.inflate(layoutInflater)
        val root = binding.root
        setContentView(root)

        displayTooltip()
    }

    private fun displayTooltip() {

        val balloon = Balloon.Builder(this)
            .setBalloonAnimation(BalloonAnimation.CIRCULAR)
            .setDismissWhenClicked(true)
            .setIsVisibleArrow(false)
            .setLayout(R.layout.second_custom_layout)
            .setBackgroundColor(ContextCompat.getColor(this , R.color.transparent))
            .setBalloonHighlightAnimationResource(android.R.anim.slide_out_right)
            .setCornerRadius(12f)
            .setMarginRight(32)
            .build()


        binding.textView.showAlignRight(balloon)

        binding.clTutorial.setOnClickListener {
            val i = Intent(this , TutorialActivity3::class.java)
            startActivity(i)
        }

    }
}