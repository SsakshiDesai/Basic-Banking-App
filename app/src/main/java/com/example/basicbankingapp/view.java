package com.example.basicbankingapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.basicbankingapp.ui.DBHelper;

import java.util.ArrayList;

public class view extends AppCompatActivity {

    DBHelper db = new DBHelper(this);
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        listView = findViewById(R.id.list);
        ArrayList<String> data = new ArrayList<>();

        final ArrayList<String> list1 = new ArrayList<String>();



        data = db.getAllCustomers();

        list1.clear();
        for(int i=0;i<data.size();i++)
        {
            list1.add(data.get(i));
        }

        final ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.textlist,list1);
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}