package com.itcellsr.southernrailway;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Bossuser extends AppCompatActivity {
    Button btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bossuser);
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                openAssigncensus();
            }
        });

        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReports();
            }
        });
    }

    public void openAssigncensus()

    {
        Intent intent = new Intent(this, Assigncensus.class);
        startActivity(intent);

    }
    public void openReports()

    {
        Intent intent = new Intent(this, Reports.class);
        startActivity(intent);

    }

    public boolean onCreateOptionsMenu(Menu menu)
    {

        //Inflate the menu,add items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.ccmmenu,menu);//Menu REsourceFile
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {

        switch(item.getItemId())
        {

            case R.id.item1:

                Toast.makeText(getApplicationContext(),"Item 1 Selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item2:
            Toast.makeText(getApplicationContext(), "you are logged out", Toast.LENGTH_LONG).show();

                Intent intent=new Intent(Bossuser.this, Loginscreen.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);


    }

}}

