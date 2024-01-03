package com.example.dat.tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.dat.R;

import java.util.ArrayList;

public class Tuan3MainActivity extends AppCompatActivity {
    ListView lv;
    T3Adapter adapter;
    ArrayList<T3Contact> ls=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan3_main);
        lv = findViewById(R.id.lv1);
        // tạo nguồn dữ liệu
        ls.add(new T3Contact("Đặng Tiến Đạt","20",R.drawable.ic_launcher_background));
        ls.add(new T3Contact("Đặng Văn Đạt","11",R.drawable.ic_launcher_background));
        ls.add(new T3Contact("Đỗ Tiến Đạt","17",R.drawable.ic_launcher_background));
        ls.add(new T3Contact("Nguyễn Tiến Đạt","18",R.drawable.ic_launcher_background));
        ls.add(new T3Contact("Đinh Tiến Đạt","21",R.drawable.ic_launcher_background));
        // tạo adapter
        adapter = new T3Adapter(ls, this);
        lv.setAdapter(adapter);
    }
}