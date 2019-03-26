package com.example.spmaindemo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText editText1,editText2;
    Button save,show;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=findViewById(R.id.editText1);
        editText2=findViewById(R.id.editText2);
        save=findViewById(R.id.save);
        show=findViewById(R.id.show);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveData();
                Toast.makeText(getApplicationContext(),"data save sussessfull",Toast.LENGTH_SHORT).show();
            }
        });
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //load();
                Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent);

            }
        });
    }
    public void SaveData(){
        sharedPreferences=getSharedPreferences("SpName", Context.MODE_PRIVATE);
        editor=sharedPreferences.edit();
        editor.putString("name",editText1.getText().toString());
        editor.putString("pass",editText2.getText().toString());
        editor.commit();
    }
//    public void load(){
//        sharedPreferences=getSharedPreferences("SpName",Context.MODE_PRIVATE);
//        String value1=sharedPreferences.getString("name","no found");
//        String value2=sharedPreferences.getString("pass","no found");
//
//    }


    }

