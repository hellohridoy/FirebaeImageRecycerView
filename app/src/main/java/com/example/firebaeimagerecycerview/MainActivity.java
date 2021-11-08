package com.example.firebaeimagerecycerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    Button choseImage,saveImage,showImge;
    EditText imageName;
    ProgressBar progressBar;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        choseImage = findViewById(R.id.chosePhotoButtoId);
        saveImage = findViewById(R.id.saveImageButtonId);
        showImge = findViewById(R.id.showAllImageButtonId);
        imageName=findViewById(R.id.choseImageNameTextViewId);
        progressBar = findViewById(R.id.progressbarId);
        imageView=findViewById(R.id.choseImageViewId);

    }
}