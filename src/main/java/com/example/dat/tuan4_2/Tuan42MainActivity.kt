package com.example.dat.tuan4_2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.dat.R

class Tuan42MainActivity : AppCompatActivity() {
    var btn:Button? = null
    var TvKQ:TextView? = null
    var context:Context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan42_main)
        btn = findViewById(R.id.btntuan4)
        TvKQ = findViewById(R.id.TvKQ)
        val fn = VolleyFN()
        btn!!.setOnClickListener {
            fn.getJSONArrayObjects(context, TvKQ!!)
        }
    }
}