package com.example.candycrushtooltips

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.candycrushtooltips.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val root = binding.root
        setContentView(root)

        //making an intent to tutorial activity
        binding.btnPlay.setOnClickListener{
            val i = Intent(this , TutorialActivity::class.java)
            startActivity(i)
        }
    }
}