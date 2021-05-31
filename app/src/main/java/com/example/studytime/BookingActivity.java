package com.example.studytime;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BookingActivity extends AppCompatActivity {

    private Button t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    private BookingActivity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        this.activity=this;
         t1 = (Button) findViewById(R.id.table1);
         t1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 CustomPopup customPopup = new CustomPopup(activity);
                 customPopup.build();
             }
         });
    }
}
