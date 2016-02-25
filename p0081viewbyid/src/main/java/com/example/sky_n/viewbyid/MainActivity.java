package com.example.sky_n.viewbyid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myTextView = (TextView) findViewById(R.id.myText);
        myTextView.setText("Всем привет");
        Button myBtn = (Button) findViewById(R.id.myBtn);
        myBtn.setText("Моя кнопка");
        myBtn.setEnabled(false);

    }
}
