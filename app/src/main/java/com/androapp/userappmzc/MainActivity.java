package com.androapp.userappmzc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    AppCompatButton b1,b2;
    String getUname,getPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText) findViewById(R.id.Uname);
        ed2=(EditText) findViewById(R.id.Pass);
        b1=(AppCompatButton) findViewById(R.id.Log);
        b2=(AppCompatButton) findViewById(R.id.Reg);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getUname=ed1.getText().toString();
                getPass=ed2.getText().toString();
                Toast.makeText(getApplicationContext(),getUname, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getPass, Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(i);
            }
        });
    }
}