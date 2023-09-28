package com.example.prac2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.net.URLEncoder;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }
    public void browser(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://vk.com"));
        startActivity(intent);
    }
}