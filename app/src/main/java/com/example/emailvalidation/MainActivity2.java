package com.example.emailvalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    private Button button1;
    private EditText mail;
    private EditText pass;
    private String validemail="^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button1=findViewById(R.id.loginbtn);
        mail=findViewById(R.id.email);
        pass=findViewById(R.id.password);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isEmailValid()&&isPassWordValid()){
                    Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                    intent.putExtra("email",mail.getText().toString());
                    startActivity(intent);
                }

            }
        });
    }
    private boolean isEmailValid(){
        if(mail.getText().toString().matches(validemail)){
        return true;
        }else{
            mail.setError("Invalid Email");
            return false;
        }
    }
    private boolean isPassWordValid(){
        if(pass.getText().toString().length()>=6){
            return true;
        }else{
            pass.setError("Password length is less than 6 character");
            return false;
        }

    }
}