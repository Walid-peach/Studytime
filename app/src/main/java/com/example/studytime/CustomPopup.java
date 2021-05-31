package com.example.studytime;

import android.app.Activity;
import android.app.Dialog;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



public class CustomPopup extends Dialog {

    private ImageView image;
    private TextView title;
    private Button place1, place2, place3, place4, place5, place6, place7, place8;


    public CustomPopup(Activity activity){
        super (activity, R.style.Theme_AppCompat_DayNight_Dialog);
        setContentView(R.layout.my_popup);

    }

    public void build() {
        show();
    }

}
