package com.example.dat.tuan2_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.dat.R

class tuan22Main2Activity : AppCompatActivity() {
    var txt1: EditText? = null
    var txt2: EditText? = null
    var btn: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan22_main2)
        txt1 = findViewById(R.id.txt1)
        txt2 = findViewById(R.id.txt2)
        btn = findViewById(R.id.btn)
        btn!!.setOnClickListener(View.OnClickListener {
            var i=Intent(this@tuan22Main2Activity,Tuan22v1MainActivity::class.java)

            i.putExtra("so1",txt1!!.text.toString())
            i.putExtra("so2",txt2!!.text.toString())
            startActivity(i)
        })
    }
}