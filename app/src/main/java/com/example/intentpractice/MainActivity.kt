package com.example.intentpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToOtherBtn.setOnClickListener {

//            버튼이 눌리면 다른 화면 OtherActivity화면으로 이동해라
//            화면 전환은 주로 Intent를 이용한다 액티비티 이동해주는 클래스
            val myIntent=Intent(this,OtherActivity::class.java)

            startActivity(myIntent)



        }

    }


}