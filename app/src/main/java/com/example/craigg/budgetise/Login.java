package com.example.craigg.budgetise;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }



    public void onClickbtnLogInMain(View view) {
        startActivity(new Intent(Login.this, Menu.class));
    }

    public void onClickbtnFacebook(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/?stype=lo&jlou=AfdWi4fInaqsTCB58h9qUZllBqhMmW1ujEaxjkuCHEnok_EQ550mtxObMBTvntlcGRBDsZiwnX-Dam-0iipYH8le&smuh=11914&lh=Ac-TWlf9k1_qm0Jv"));
        startActivity(intent);
    }


}
