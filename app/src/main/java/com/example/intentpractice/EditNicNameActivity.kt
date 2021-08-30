package com.example.intentpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nic_name.*

class EditNicNameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nic_name)

        okBtn.setOnClickListener {

//            입력한 새 닉네임이 뭔지?변수로 저장
            val inputNewNickname = newNicknameEdt.text.toString()

//            입력한 닉네임을 가지고 메인화면으로 복귀하기

//            입력한 닉네임을 담아주기 위한 용도로만 사용되는 intent
            val resultIntent = Intent()//왕복티켓임

//            putExtra는 변수 resultIntent에 값을 넣어주는 기능능
           resultIntent.putExtra("nickname",inputNewNickname)
            setResult(RESULT_OK,resultIntent)
            finish()

        }


    }
}