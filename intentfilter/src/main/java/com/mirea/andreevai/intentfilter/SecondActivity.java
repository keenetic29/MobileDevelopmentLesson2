package com.mirea.andreevai.intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // по заданию не требовалось, cоздано для тестирования
        Bundle arguments = getIntent().getExtras();
        String fio = arguments.get(Intent.EXTRA_TEXT).toString();
        textView = findViewById(R.id.textViewFIO);
        textView.setText(fio);
    }
}