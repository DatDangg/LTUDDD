package com.example.dat.tuan4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dat.R;

public class Tuan41MainActivity extends AppCompatActivity {

    Button btn;
    TextView TvQK;

    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan41_main);
        VolleyFN volleyFN = new VolleyFN();
        TvQK = findViewById(R.id.TvQK);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volleyFN.getJsonArray(context, TvQK);
            }
        });
    }
}