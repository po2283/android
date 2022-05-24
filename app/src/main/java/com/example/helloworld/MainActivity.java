package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick (View view){
        TextView txt = findViewById(R.id.textView);
        TextView txt2 = findViewById(R.id.textView2);
        TextView txt3 = findViewById(R.id.textView3);

        EditText edtTxtName1 = findViewById(R.id.editTextTextFirstName);
        EditText edtTxtName2 = findViewById(R.id.editTextTextLastName);
        EditText edtTxtName3 = findViewById(R.id.editTextTextEmail);

        txt.setText("First Name: " + edtTxtName1.getText().toString());
        txt2.setText("Last Name: " + edtTxtName2.getText().toString());
        txt3.setText("Email: " + edtTxtName3.getText().toString());

        //= findViewById(R.id.editTextTextEmail);
        //EditText edtTxtName = findViewById(R.id.editTextTextEmail);

    }
}