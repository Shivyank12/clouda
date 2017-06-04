package com.example.user.cloudc;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    TextView textView;

    String Modelno = Build.MODEL;
    String Board = Build.BOARD;
    String Brand = Build.BRAND;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        textView = (TextView)findViewById(R.id.t1);


        textView.setText("model"+Modelno+"\n"+"Board" + Board + "<\n>" + "Brand" + Brand);

    }
}
