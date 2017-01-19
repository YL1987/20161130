package com.sevendoor.adoor.myapplicationstu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var mTextView: TextView? = null
    private var mImageView: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mTextView = findViewById(R.id.dd) as TextView
        mImageView = findViewById(R.id.ss) as ImageView
        mTextView!!.setOnClickListener { view -> Toast.makeText(this@MainActivity, "sss", 1).show() }
        mImageView!!.setBackgroundResource(R.mipmap.ic_launcher)
        Toast.makeText(this,"ss",1).show();
    }
}

