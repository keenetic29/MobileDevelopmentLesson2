package com.mirea.andreevai.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void informOfStudent(View view){
        EditText editText = findViewById(R.id.editTextCount);
        Toast toast = Toast.makeText(getApplicationContext(),
                "Cтудент №2 БСБО-01-20 Кол-во символов: " +
                        (editText.getText().toString()).length(),
                Toast.LENGTH_LONG);
        toast.show();
    }
}