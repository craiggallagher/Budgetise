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

public class EditBill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_bill);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    public void onClickbtnDelete(View view) {
        startActivity(new Intent(EditBill.this, ViewBills.class));
        Toast toast= Toast.makeText(getApplicationContext(),
                "Bill Deleted", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 100, 0);
        toast.show();
    }

    public void onClickbtnSave(View view) {
        startActivity(new Intent(EditBill.this, ViewBills.class));
        Toast toast= Toast.makeText(getApplicationContext(),
                "Bill Saved", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 100, 0);
        toast.show();
    }


}
