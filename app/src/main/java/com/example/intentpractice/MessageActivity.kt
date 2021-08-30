package com.example.intentpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_message.*

class MessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

//        이 화면에 들어올떄 첨부된 데이터를 텍스트뷰에 반영
//        메인 화면에서 적은 문구를 받아오기 위해 인텐트.겟스트링엑스트라 사용 후
//        메인 화면에 적은 이름인 message를 넣어야 받는 화면에 메인화면에서 적은 문구가 변수로 들어올 수 있음

        val intentMessage = intent.getStringExtra("message")

        receivedMessageTxt.text = intentMessage

    }
}