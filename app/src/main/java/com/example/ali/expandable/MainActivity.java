package com.example.ali.expandable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> childSubTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ModelEx firstList = new ModelEx();
        firstList.setTitleList("Title1");
        firstList.setChildTitle("Title1");
        firstList.set



    }
}
