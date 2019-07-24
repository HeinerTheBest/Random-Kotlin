package com.mobileapps.randomwithkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe( view : View) {val toast = Toast.makeText(this,"Helloo",Toast.LENGTH_LONG).show()}

    fun countMe( vie : View)
    {
        val showCountTextView = findViewById<TextView>(R.id.textView)
        val countString = showCountTextView.text.toString()
        var count: Int = Integer.parseInt(countString)
        count++
        showCountTextView.text = count.toString()

    }

    fun randomMe( view : View)
    {
        val intent = Intent(this, Main2Activity :: class.java)
        val showCountTextView = findViewById<TextView>(R.id.textView)
        val countString = showCountTextView.text.toString()
        var count: Int = Integer.parseInt(countString)
        intent.putExtra(Main2Activity.TOTAL_COUNT, count)
        startActivity(intent)
    }


}
