package com.gzeinnumer.glideimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class GlideImageViewExer extends AppCompatActivity {

    ImageView imageView;
    String url = "https://i.ibb.co/2d8qQH4/me.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exer_glide_imageview);

        imageView= findViewById(R.id.image);

        Glide.with(this)
                .asBitmap()
                .load(url)
                .into(imageView);

    }
}
