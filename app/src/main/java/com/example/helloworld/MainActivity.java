package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;



public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = findViewById(R.id.spinner2);
        TextView txt = findViewById(R.id.txtspinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.item, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        txt.setText(spinner.getSelectedItem().toString());


    }

    public void onBtnClick (View view){
        TextView txt = findViewById(R.id.textView);

        EditText edtID = findViewById(R.id.ID);
        EditText edtAddress = findViewById(R.id.Address);

        txt.setText(edtID.getText().toString() + '@' + edtAddress.getText().toString());


    }

}