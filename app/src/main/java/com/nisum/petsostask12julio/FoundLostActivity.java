package com.nisum.petsostask12julio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class FoundLostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("onCreate");
        setContentView(R.layout.found_lost);


    }

    @Override
    protected void onResume() {
        super.onResume();
    }

}
