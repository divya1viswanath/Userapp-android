package com.androapp.userappmzc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText ed1,ed2,ed3,ed4,ed5,ed6;
    AppCompatButton b1,b2;
    String getName,getMob,getMail,getUname,getPass,getCpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1=(EditText) findViewById(R.id.name);
        ed2=(EditText) findViewById(R.id.mob);
        ed3=(EditText) findViewById(R.id.mail);
        ed4=(EditText) findViewById(R.id.Uname);
        ed5=(EditText) findViewById(R.id.Pass);
        ed6=(EditText) findViewById(R.id.Cpass);
        b1=(AppCompatButton) findViewById(R.id.Reg);
        b2=(AppCompatButton) findViewById(R.id.Log);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName=ed1.getText().toString();
                getMob=ed2.getText().toString();
                getMail=ed3.getText().toString();
                getUname=ed4.getText().toString();
                getPass=ed5.getText().toString();
                getCpass=ed6.getText().toString();
                Toast.makeText(getApplicationContext(),getName, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getMob, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getMail, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getUname, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getPass, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getCpass, Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}