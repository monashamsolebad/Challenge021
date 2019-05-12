package com.mona.shamsolebad.challenge021;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private ScrollView scrollView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        scrollView=findViewById(R.id.secondactivity_scrollview);
        textView=findViewById(R.id.secondactivity_textview);
        Intent intent=getIntent();
        String message=intent.getStringExtra("PassageContent");
        textView.setText(message);
    }
}
