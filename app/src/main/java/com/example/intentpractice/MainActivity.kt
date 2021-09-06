package com.example.intentpractice

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    멤버변수는 클래스 바로 밑에 만듬
    val REQUEST_FOR_NICKNAME = 1005//멤버변수 선언

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        CALL 액션 예제
        callBtn.setOnClickListener {
            val inputPhoneNum = phoneNumEdt.text.toString()

            val myUri = Uri.parse("tel:${inputPhoneNum}")
            val myIntent = Intent(Intent.ACTION_CALL,myUri)
            startActivity(myIntent)


        }


//        DIAL 액션 예제
        dialBtn.setOnClickListener {
//            phoneNumEdt에 입력한 전화번호를 받아서 ->해당 번호에 전화연결

            val inputPhoneNum = phoneNumEdt.text.toString()

            val myUri = Uri.parse("tel:${inputPhoneNum}")
            val myIntent = Intent(Intent.ACTION_DIAL,myUri)
            startActivity(myIntent)

        }


//        닉네임 변경 버튼이 눌리면 해야할 작업
        editNicknameBtn.setOnClickListener {

            val myIntent = Intent(this, EditNicNameActivity::class.java)

//            결과를 받으러 가는 과정
           startActivityForResult(myIntent, REQUEST_FOR_NICKNAME)//닉네임 가지러 갈때는 1005를 사용한다고 구분해줌
//            숫자만 적으면 정확히 코드만 코드 어떤 내용인지 이해하기 어려워 멤버변수를 이용하여 가독성을 올려야함



        }

        sendMessageBtn.setOnClickListener {

//            입력한 내용을 변수에 저장
//            변수에 문자열 저장시 .text.toString()기능사용
            val inputMessage = messageEdt.text.toString()

//            인텐트 사용해서 화면 이동 변수 선언
            val myIntent = Intent(this, MessageActivity::class.java)

//            수화물 첨부->메시지를 받을 화면에 보내줌
            myIntent.putExtra("message",inputMessage)

//            실제 출발
            startActivity(myIntent)
        }

        moveToOtherBtn.setOnClickListener {

//            버튼이 눌리면 다른 화면 OtherActivity화면으로 이동해라
//            화면 전환은 주로 Intent를 이용한다 액티비티 이동해주는 클래스
            val myIntent=Intent(this,OtherActivity::class.java)

            startActivity(myIntent)

//            Intent는 실제로 다른 화면으로 이동한 것이 아니라 새 화면에 얹어주는 기능


        }

    }


//    내가 다른 화면에서 버튼을 누르면 바로 이 함수가 메인에서 실행됨됨
   override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

//        돌아온 이유가 닉네임을 받으러 다녀온게 맞는지?

        if(requestCode == REQUEST_FOR_NICKNAME){


//                추가질문 : 확인을 눌러서 돌아온게 맞는가?
            if(resultCode == RESULT_OK){

//                실제로 첨부된 새 닉네임을 꺼내서 텍스트뷰에 반영.
                val newNickname =data?.getStringExtra("nickname")
                nicknameTxt.text = newNickname
            }
        }

    }


}