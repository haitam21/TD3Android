package com.example.login_tp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class news extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        setTitle(getLocalClassName());
        Button logout=(Button) findViewById(R.id.logout);
        Button details=(Button) findViewById(R.id.details);
        Button about=(Button) findViewById(R.id.about);
        TextView username=(TextView) findViewById(R.id.textView);
        final NewsListApplication app = (NewsListApplication) getApplicationContext();

        username.setText(app.getLogin());

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(news.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(news.this,Details.class);
                startActivity(intent);
                finish();
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://news.google.com/";
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}