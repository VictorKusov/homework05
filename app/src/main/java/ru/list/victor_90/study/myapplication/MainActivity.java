package ru.list.victor_90.study.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(true);

        List<Item> items = new ArrayList<Item>();


        for (int i=0;i<100;i++){
            Item item = new Item("Text " + i);
            items.add(item);
        }

        GridLayoutManager  layoutManager = new GridLayoutManager(MainActivity.this,5);
        recyclerView.setLayoutManager(layoutManager);

        RVAdapter adapter = new RVAdapter(items);
        recyclerView.setAdapter(adapter);

    }
}
