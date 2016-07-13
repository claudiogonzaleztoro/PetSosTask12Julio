package com.nisum.petsostask12julio;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("onCreate");
        setContentView(R.layout.activity_main);


    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume");
        TextView petAlertTextView = (TextView)findViewById(R.id.petAlertTextView);
        petAlertTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.pet_alert);
            }
        });

        TextView profileTextView = (TextView)findViewById(R.id.profileTextView);
        profileTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.profile);
            }
        });

        TextView myPetTextView = (TextView)findViewById(R.id.myPetTextView);
        myPetTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.my_pets);
            }
        });

        TextView savePetTextView = (TextView)findViewById(R.id.savePetTextView);
        savePetTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.save_pet);
            }
        });

        TextView foundLostTextView = (TextView)findViewById(R.id.foundLostTextView);
        foundLostTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.found_lost);
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
}
