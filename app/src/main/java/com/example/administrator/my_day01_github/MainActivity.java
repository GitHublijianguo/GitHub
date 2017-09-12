package com.example.administrator.my_day01_github;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listview;
    private List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        init();
        initData();
        initAdapter();
    }

    private void initAdapter() {
        list = new ArrayList<>();
        MyAdapter adapter = new MyAdapter(this, list);
        listview.setAdapter(adapter);
    }

    private void initData() {
        for (int i = 0; i < 10; i++) {
            List<String> list = new ArrayList<>();
            list.add("123");
        }
    }

    private void init() {
        int a = 1;
    }

    private void initView() {
        listview = (ListView) findViewById(R.id.listview);
//        listview.setOnClickListener(this);
    }
}