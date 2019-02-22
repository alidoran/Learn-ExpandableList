package com.example.ali.expandable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.HashMap;
import java.util.List;

public class ActivityEx extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView listView;
    HashMap<String, List<String>> chilList;
    List<String> titleList;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable);
    }
}
