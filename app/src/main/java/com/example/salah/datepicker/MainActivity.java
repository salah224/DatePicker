package com.example.salah.datepicker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatePicker datePicker;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        final DatePicker datePicker = (DatePicker)findViewById( R.id.datePicker);
        //int day = datePicker.getDayOfMonth();
        // int month = datePicker.getMonth();
        // int year = datePicker.getYear();
        Button submit = (Button)findViewById( R.id.button );
        submit.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String day= " Day = "   + datePicker.getDayOfMonth();
                String month = "Month = " + (datePicker.getMonth() + 1);
                String year = "Year = " +  datePicker.getYear();

                Toast.makeText( getApplicationContext(),day + "\n" + month + "\n" + year, Toast.LENGTH_SHORT ).show();

            }
        } );





    }
}
