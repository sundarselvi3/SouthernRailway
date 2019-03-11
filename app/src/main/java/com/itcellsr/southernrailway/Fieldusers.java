package com.itcellsr.southernrailway;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Fieldusers extends AppCompatActivity {

    EditText a1;
    final Calendar myCalendar = Calendar.getInstance();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fieldusers);
        a1=(EditText)findViewById(R.id.editText18);
        Date todaysdate = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String date = format.format(todaysdate);
        updateLabel1();
    }
    private void updateLabel1()
    {
        String myFormat = "dd/MM/yy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat,Locale.UK);

        a1.setText(sdf.format(myCalendar.getTime()));
    }
}
