package com.example.intentpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        returnToMainBtn.setOnClickListener {

//            val myIntent = Intent(this, MainActivity::class.java)
//            startActivity(myIntent)
            
//            위와 같이 이전화면으로 돌아갈떄 즉 복귀 할때는 피니쉬를 사용함

            finish() //지금 화면을 종료해주는 함수



        }

    }
}