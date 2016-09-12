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

public class Alert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }
    public void onClickbtnSaveAlert(View view) {
        startActivity(new Intent(Alert.this, Menu.class));
    }
    public void onClickbtnBillAdded(View view) {
        startActivity(new Intent(Alert.this, Menu.class));

        Toast toast= Toast.makeText(getApplicationContext(),
                "Alert Was Created", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 100, 0);
        toast.show();

    }
}
