package com.example.craigg.budgetise;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }    public void onClickbtnAddBill(View view) {
        startActivity(new Intent(Menu.this, addBill.class));
    }
    public void onClickbtnAddToCurrentBudget(View view) {
        startActivity(new Intent(Menu.this, AddToCurrentBudget.class));
    }

    public void onClickbtnViewBills(View view) {
        startActivity(new Intent(Menu.this, ViewBills.class));
    }
    public void onClickbtnRemaining(View view) {
        startActivity(new Intent(Menu.this, ViewRemaining.class));
    }

}
