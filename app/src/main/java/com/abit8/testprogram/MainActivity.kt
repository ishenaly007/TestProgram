package com.abit8.testprogram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abit8.testprogram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initclickers()
    }

    private fun initclickers() {
        with(binding){
            btnPlus.setOnClickListener {
                result.text = Math().add(etFirst.text.toString(), etSecond.text.toString())
            }
            btnDevide.setOnClickListener {
                result.text = Math().divide(etFirst.text.toString(),etSecond.text.toString())
            }
        }
    }
}