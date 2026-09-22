package com.example.heels;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailHeel extends AppCompatActivity {
     TextView textView1,textView2;
     ImageView imageView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_heel);
        imageView=findViewById(R.id.detailImage);
        textView1=findViewById(R.id.detailName);
        textView2=findViewById(R.id.collectionName);
        Intent intent=getIntent();

        int image=intent.getIntExtra("image",0);
        String category=intent.getStringExtra("category");
        String name=intent.getStringExtra("name");
        textView1.setText(name);
        textView2.setText(category);
        imageView.setImageResource(image);

    }
}