package com.wpsns.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("TAG", "onCreate:用户一， 创建分支1")
        Log.i("TAG", "onCreate:用户一， 修改内容2")


        Log.e("TAG", "onCreate: 用户二，创建分支2", )
        Log.e("TAG", "onCreate: 用户二，修改内容2", )

    }
}