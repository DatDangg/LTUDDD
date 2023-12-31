package com.example.dat.tuan4_1;

import android.content.Context;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class VolleyFN {
    String strJson = "";
    public void getJsonArray(Context context, TextView textView){
        RequestQueue queue = Volley.newRequestQueue(context);
        String url = "https://batdongsanabc.000webhostapp.com/thanglong/array_json_new.json";
        JsonArrayRequest request = new JsonArrayRequest(url,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        for(int i=0;i<response.length();i++){
                            try {
                                JSONObject person = response.getJSONObject(i);
                                String id = person.getString("id");
                                String name = person.getString("name");
                                String email = person.getString("email");
                                //
                                strJson += "Id: " + id + "\n";
                                strJson += "name: " + name + "\n";
                                strJson += "email: " + email + "\n";
                            } catch (JSONException e) {
                                throw new RuntimeException(e);
                            }
                            textView.setText(strJson);
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                textView.setText(error.getMessage());
            }
        });
        queue.add(request);
    }
}
