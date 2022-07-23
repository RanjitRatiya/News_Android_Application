package com.example.newsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity
{
    Button takeNews,tandC,aboutUs;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        takeNews = findViewById(R.id.takemetonews);
        tandC = findViewById(R.id.termsandconditions);
        aboutUs = findViewById(R.id.aboutuspage);

        takeNews.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(StartActivity.this , MainActivity.class);
                startActivity(i);
            }
        });

        tandC.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i1 = new Intent(StartActivity.this , TermsConditions.class);
                startActivity(i1);
            }
        });

        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(StartActivity.this , AboutUs.class);
                startActivity(i2);
            }
        });
    }
}