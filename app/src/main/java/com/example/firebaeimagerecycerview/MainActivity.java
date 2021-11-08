package com.example.firebaeimagerecycerview;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    Button choseImage,saveImage,showImge;
    EditText imageName;
    ProgressBar progressBar;
    ImageView imageView;
    public static final int ImageRequest=1;
    Uri imageUri;

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
        choseImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               imageChoser();
            }
        });
        saveImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        showImge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    private void imageChoser() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent,ImageRequest);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==ImageRequest&&resultCode==RESULT_OK&&data!=null&&data.getData()!=null){
            imageUri=data.getData();
            Picasso.get().load(imageUri).into(imageView);
        }
    }
}