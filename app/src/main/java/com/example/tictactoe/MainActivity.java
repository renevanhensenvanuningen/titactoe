package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    String color = "red";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img1 = findViewById(R.id.imageView);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOnClick(v);
            }
        });
        setTransparent(img1);

        ImageView img2 = findViewById(R.id.imageView1);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOnClick(v);
            }
        });
        setTransparent(img2);


        ImageView img3 = findViewById(R.id.imageView2);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOnClick(v);
            }
        });
        setTransparent(img3);


        ImageView img4 = findViewById(R.id.imageView3);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOnClick(v);
            }
        });
        setTransparent(img4);


        ImageView img5 = findViewById(R.id.imageView4);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOnClick(v);
            }
        });
        setTransparent(img5);


        ImageView img6 = findViewById(R.id.imageView5);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOnClick(v);
            }
        });
        setTransparent(img6);


        ImageView img7 = findViewById(R.id.imageView6);
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOnClick(v);
            }
        });
        setTransparent(img7);

        ImageView img8 = findViewById(R.id.imageView7);
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOnClick(v);
            }
        });
        setTransparent(img8);

        ImageView img9 = findViewById(R.id.imageView8);
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOnClick(v);
            }
        });
        setTransparent(img9);


    }

    private void setTransparent(View v){
        ImageView iv = (ImageView) v;
        iv.setAlpha(0.0f);

    }

    private void doOnClick(View v){
        ImageView iv = (ImageView) v;
        if (color == "yellow")
          iv.setImageResource(R.drawable.yellow);
        else
          iv.setImageResource(R.drawable.red);

        String o = (String)iv.getTag();
        int iTag =  Integer.valueOf(o);
        if (iTag < 3)
            iv.setTranslationY(-200);
        if ((iTag >= 3) && (iTag < 7))
            iv.setTranslationY(-350);
        if ((iTag >= 7) && (iTag < 10))
            iv.setTranslationY(-550);

        iv.setAlpha(1.0f);
        iv.invalidate();
        if (iTag < 3)
          iv.animate().translationY(+0).setDuration(1000);
        if ((iTag >= 3) && (iTag < 7))
          iv.animate().translationY(+0).setDuration(1000);
        if ((iTag >= 7) && (iTag < 10))
          iv.animate().translationY(+0).setDuration(1000);

        if (String.valueOf(color) == "red")  color = "yellow";
        else color = "red";


    }
}
