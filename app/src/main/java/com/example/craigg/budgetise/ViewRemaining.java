package com.example.craigg.budgetise;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ViewRemaining extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_remaining);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ListView listView;
        int cost=0;

        String[] from = { "Electricity: 20", "Groceries: 20","Rent: 200","Loan: 50","Entertainment:40" };

        ArrayAdapter arrayAdapter;

        listView = (ListView) findViewById(R.id.zone_list);

        arrayAdapter = new ArrayAdapter(this,R.layout.bills, R.id.tvName, from);

        listView.setAdapter(arrayAdapter);


    }
    public void onClickbtnSummary(View view) {
        startActivity(new Intent(ViewRemaining.this, Summary.class));
    }


}
