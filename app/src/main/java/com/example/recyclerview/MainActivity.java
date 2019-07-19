package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import Adapters.MyAdapter;
import Model.Listitem;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
private List<Listitem> listitems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.RecycerViewID);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

       listitems = new ArrayList<>();
//       Listitem item1 = new Listitem("movie 1 ", " someone crazy ","great");
 //       Listitem item2 = new Listitem("movie 1 ", " someone crazy ","noice");
       for( int i=0; i<10; i++){
           Listitem item = new Listitem("item " + (i+1), "description", "excellent");

           listitems.add(item);
          // listitems.add(item2);
       //}
    adapter = new MyAdapter(this, listitems);
recyclerView.setAdapter(adapter);


    }


}}
