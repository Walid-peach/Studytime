package com.example.studytime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GroupSolo extends AppCompatActivity {
    private Button groupe;
    private Button solo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_solo);

        solo = (Button) findViewById(R.id.solo);
        solo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GroupSolo.this, BookingActivity.class);
                startActivity(i);
            }
    });

    
}
}