package com.example.spmaindemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    TextView textId;
    Button loadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textId=findViewById(R.id.textId);
        loadButton=findViewById(R.id.loadButton);
        loadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              loadData();
            }
        });


    }
    public void loadData(){
         sharedPreferences=getSharedPreferences("SpName", Context.MODE_PRIVATE);
        String value2=sharedPreferences.getString("name","data no found");
        String value1=sharedPreferences.getString("name","data no found");
        textId.setText(value1);
    }
}
