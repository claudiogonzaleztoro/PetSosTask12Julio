package com.nisum.petsostask12julio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MyPetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("onCreate");
        setContentView(R.layout.my_pets);


    }

    @Override
    protected void onResume() {
        super.onResume();
    }

}
