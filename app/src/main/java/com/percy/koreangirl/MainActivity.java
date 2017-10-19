package com.percy.koreangirl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * 4 componentes
 *
 * 1. Activites   <------------
 * 2. Services
 * 3. Broadcast Receiver
 * 4. Content Providers
 */

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button button,button2;
    private int mFlag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageView = (ImageView) findViewById(R.id.iv_koreangirl);
        //imageView.setOnClickListener(this);
        button = (Button) findViewById(R.id.back);
        button2 = (Button) findViewById(R.id.next);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadGirlKoreanFromURL(mFlag);
            }
        });
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                nextGirlKoreanFromURL(mFlag);

            }
        });
        //button.setOnClickListener(this);

        //button2.setOnClickListener(this);
       /* imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadGirlKoreanFromURL(mFlag);
            }
        });*/
    }



    private void loadGirlKoreanFromURL(int flag){
        switch (flag){
            case 0:
                Glide.with(this).load("https://0.soompi.io/wp-content/uploads/2016/06/28181615/Black-Pink-3.png").into(imageView);
                mFlag++;
                break;
            case 1:
                Glide.with(this).load("https://s-media-cache-ak0.pinimg.com/564x/ef/82/b5/ef82b5e2b43d415fe62c916126176ec6.jpg").into(imageView);
                mFlag++;
                break;
            case 2:
                Glide.with(this).load("https://s-media-cache-ak0.pinimg.com/736x/72/c5/7b/72c57b001154803f74486d3b21907ec4.jpg").into(imageView);
                mFlag++;
                break;
            case 3:
                Glide.with(this).load("http://images6.fanpop.com/image/photos/39700000/Group-Teaser-Image-black-pink-39729889-500-334.jpg").into(imageView);
                mFlag++;
                break;
            case 4:
                Glide.with(this).load("http://images6.fanpop.com/image/photos/39700000/Jennie-yg-entertainments-new-girl-group-39717021-500-333.jpg").into(imageView);
                mFlag=0;
                break;
        }
    }
    private void nextGirlKoreanFromURL(int flag){
        switch (flag){
            case 0:
                Glide.with(this).load("https://0.soompi.io/wp-content/uploads/2016/06/28181615/Black-Pink-3.png").into(imageView);
                mFlag--;
                break;
            case 1:
                Glide.with(this).load("https://s-media-cache-ak0.pinimg.com/564x/ef/82/b5/ef82b5e2b43d415fe62c916126176ec6.jpg").into(imageView);
                mFlag--;
                break;
            case 2:
                Glide.with(this).load("https://s-media-cache-ak0.pinimg.com/736x/72/c5/7b/72c57b001154803f74486d3b21907ec4.jpg").into(imageView);
                mFlag--;
                break;
            case 3:
                Glide.with(this).load("http://images6.fanpop.com/image/photos/39700000/Group-Teaser-Image-black-pink-39729889-500-334.jpg").into(imageView);
                mFlag--;
                break;
            case 4:
                Glide.with(this).load("http://images6.fanpop.com/image/photos/39700000/Jennie-yg-entertainments-new-girl-group-39717021-500-333.jpg").into(imageView);
                mFlag=0;
                break;
        }
    }




}
