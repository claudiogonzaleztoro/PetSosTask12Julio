package com.nisum.petsostask12julio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("onCreate");
        setContentView(R.layout.profile);


    }

    @Override
    protected void onResume() {
        super.onResume();
    }

}
