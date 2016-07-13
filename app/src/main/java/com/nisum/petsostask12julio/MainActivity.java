package com.nisum.petsostask12julio;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("onCreate");
        setContentView(R.layout.activity_main);

        /*
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                showTranslationAnimation(findViewById(R.id.petAlertLinearLayout));

            }
        },1000);

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                showAlphaAnimation(findViewById(R.id.petAlertLinearLayout));

            }
        },2000);
        */
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume");
        TextView petAlertTextView = (TextView)findViewById(R.id.petAlertTextView);
        petAlertTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this,TestActivity.class);
                startActivity(i);
            }
        });

        TextView profileTextView = (TextView)findViewById(R.id.profileTextView);
        profileTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,ProfileActivity.class);
                startActivity(i);
            }
        });


        TextView myPetTextView = (TextView)findViewById(R.id.myPetTextView);
        myPetTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,MyPetActivity.class);
                startActivity(i);
            }
        });

        TextView savePetTextView = (TextView)findViewById(R.id.savePetTextView);
        savePetTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,SavePetActivity.class);
                startActivity(i);
            }
        });

        TextView foundLostTextView = (TextView)findViewById(R.id.foundLostTextView);
        foundLostTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,FoundLostActivity.class);
                startActivity(i);
            }
        });

//        ImageView imgCircle = (ImageView)findViewById(R.id.imgCircle);
//
//        Paint paint = new Paint();
//        paint.setColor(Color.parseColor("#FFA500"));
//        paint.setStyle(Paint.Style.FILL);
//
//        Bitmap bmp = Bitmap.createBitmap(500,500,Bitmap.Config.ARGB_8888);
//
//        Canvas canvas = new Canvas(bmp);
//        canvas.drawCircle(bmp.getWidth()/2, bmp.getHeight()/2,200,paint);
//        imgCircle.setImageBitmap(bmp);

        System.out.println("onResume end");
    }


    private void showTranslationAnimation(View v){
        AnimatorSet set = new AnimatorSet();
        //set.play(ObjectAnimator.ofFloat(v, View.ALPHA, 0,1));
        //set.play(ObjectAnimator.ofFloat(v, View.SCALE_Y, 0, 1));
        set.play(ObjectAnimator.ofFloat(v, View.TRANSLATION_Y, 500, 0));
        set.setDuration(1000);
        set.setInterpolator(new DecelerateInterpolator());
        set.start();
    }

    private void showAlphaAnimation(View v){
        AnimatorSet set = new AnimatorSet();
        set.play(ObjectAnimator.ofFloat(v, View.ALPHA, 0,1));
        set.setDuration(3000);
        set.setInterpolator(new DecelerateInterpolator());
        set.start();
    }
}
