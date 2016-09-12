package com.example.craigg.budgetise;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ViewBills extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_bills);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView listView;


        String[] from = { "Electricity","Groceries","Rent","Loan","Entertainment" };

        ArrayAdapter arrayAdapter;

        listView = (ListView) findViewById(R.id.zone_list);

        arrayAdapter = new ArrayAdapter(this,R.layout.bills, R.id.tvName, from);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Intent intent = new Intent(ViewBills.this, EditBill.class);

                startActivity(intent);
            }
        });


        ListView listView1;

        String[] getfrom = { "Fun Money", "Fuel","Presents" };

        ArrayAdapter arrayAdapter1;

        listView1 = (ListView) findViewById(R.id.lstOnceOff);

        arrayAdapter = new ArrayAdapter(this,R.layout.bills, R.id.tvName, getfrom);

        listView1.setAdapter(arrayAdapter);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Intent intent = new Intent(ViewBills.this, EditBill.class);

                startActivity(intent);
            }
        });


    }


}
