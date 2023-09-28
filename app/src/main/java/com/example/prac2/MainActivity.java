package com.example.prac2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView imageView;
Button btn;
private static final int SELECT_IMAGE=100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        imageView=findViewById(R.id.imageView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivityForResult(
                        Intent.createChooser(intent, "Select Image"),
                SELECT_IMAGE);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
    super.onActivityResult(requestCode, resultCode, data);
    if(requestCode == SELECT_IMAGE && null != data){
        Uri uri = data.getData();
        imageView.setImageURI(uri);
    }
    }
    public void next(View view){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}