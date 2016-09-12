package com.example.craigg.budgetise;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class AddToCurrentBudget extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_current_budget);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void onClickbtnTopUp(View view) {
        startActivity(new Intent(AddToCurrentBudget.this, Menu.class));

        Toast toast= Toast.makeText(getApplicationContext(),
                "Budget Topped Up", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 100, 0);
        toast.show();
    }
    public void onClickbtnAlert(View view) {
        startActivity(new Intent(AddToCurrentBudget.this, Alert.class));
    }

}
