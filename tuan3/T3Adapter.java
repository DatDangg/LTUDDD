package com.example.dat.tuan3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dat.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class T3Adapter extends BaseAdapter {
    private ArrayList<T3Contact> ls;
    private Context context;

    public T3Adapter(ArrayList<T3Contact> ls, Context context) {
        this.ls = ls;
        this.context = context;
    }
    // lấy về số lượng item
    @Override
    public int getCount() {
        return ls.size();
    }
    // lấy về item
    @Override
    public Object getItem(int position) {
        return ls.get(position);
    }
    // lấy về id
    @Override
    public long getItemId(int position) {
        return position;
    }
    // tạo view
    // gán dữ liệu
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // b1: tạo view
        ViewA va;
        // nếu chưa có view thì ta tạo view mới, nếu có rồi thì sử dụng lại
        if (convertView == null)
        {
            va = new ViewA();
            // ánh xạ layout
            convertView = LayoutInflater.from(context).inflate(R.layout.tuan3_lv_item,null);
            // ánh xạ từng thành phần trong layout
            va.img_hinh = convertView.findViewById(R.id.t3ItemHinh);
            va.tv_ten = convertView.findViewById(R.id.t3ItemTen);
            va.tv_tuoi = convertView.findViewById(R.id.t3ItemTuoi);
            // tạo template để lần sau sử dụng
            convertView.setTag(va);
        }
        else
        {
            va = (ViewA) convertView.getTag();
        }
        // gán dữ liệu cho layout
        va.img_hinh.setImageResource(ls.get(position).getHinh());
        va.tv_ten.setText(ls.get(position).getTen());
        va.tv_tuoi.setText(ls.get(position).getTuoi());
        return convertView;
    }
    // định nghĩa view
    class ViewA{
        ImageView img_hinh;
        TextView tv_ten, tv_tuoi;

    }
}
