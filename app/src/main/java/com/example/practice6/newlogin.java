package com.example.practice6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class newlogin extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newlogin);
        e1=findViewById(R.id.n1);
        e2=findViewById(R.id.n2);
        e3=findViewById(R.id.n3);
        e4=findViewById(R.id.n4);
        b1=findViewById(R.id.b1);
    }
}