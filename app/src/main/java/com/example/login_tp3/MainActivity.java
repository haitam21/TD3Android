package com.example.login_tp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(getLocalClassName());
        final EditText username=(EditText) findViewById(R.id.userName);
        final EditText password=(EditText) findViewById(R.id.Password);
        Button login=(Button) findViewById(R.id.login);
        final NewsListApplication app = (NewsListApplication) getApplicationContext();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    Intent intent=new Intent(MainActivity.this,news.class);
                    app.setLogin(username.getText().toString());
                    //intent.putExtra("login",username.getText().toString());
                    startActivity(intent);
                    finish();
                }else{
                    Toast toast=Toast.makeText(MainActivity.this,"user incorrecte",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }
}