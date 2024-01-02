package com.example.uikotlinpractice_watereel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uikotlinpractice_watereel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.okBtn.setOnClickListener {
            val inputContent = binding.contentEdt.text.toString()
            binding.resultTxt.text = inputContent
        }
        // 입력된 내용? : contentEdt 의 text 의 값 조회 (get) 변수에 저장해두자
        // Now you can access views using `binding` e.g., binding.myTextView.text = "Hello, ViewBinding!"
    }
}