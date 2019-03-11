package com.itcellsr.southernrailway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Srdcm extends AppCompatActivity {
    Button button2,button4,button5;
    TextView di;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_srdcm);
        Bundle bn = getIntent().getExtras();
        String name = bn.getString("div2");
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddusersr();
            }

        });
        button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSrreport();
            }
        });
        button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSrassign();
            }
        });
        di=(TextView)findViewById(R.id.div1);
        di.setText(String.valueOf(name));
    }
    public void openAddusersr()
    {
        Intent intent = new Intent(this,Addusersr.class);
        startActivity(intent);
    }
    public void openSrreport()
    {
        Intent intent = new Intent (this,Srreport.class);
        startActivity(intent);
    }
    public void openSrassign()
    {
        Intent intent = new Intent (this,Srassign.class);
        startActivity(intent);
    }

}
