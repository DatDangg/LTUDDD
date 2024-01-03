package com.example.dat.tuan2_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.dat.R

class Tuan21Main2Activity : AppCompatActivity() {
    var lv:ListView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan21_main2)
        lv = findViewById(R.id.t22lv)

        val arr = arrayOf("item1", "item2", "item3", "item4", "item5", "item6")

        val ad = ArrayAdapter(this, android.R.layout.simple_list_item_1,arr)

        lv!!.adapter = ad
    }
}