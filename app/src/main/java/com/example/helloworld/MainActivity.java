package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
        EditText edtID = findViewById(R.id.ID);
        Button bt = findViewById(R.id.button2);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.item, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(edtID.getText().toString() + '@' + spinner.getSelectedItem().toString());
            }
        });


/**
 *         spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
 *             @Override
 *             public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
 *                 txt.setText(edtID.getText().toString() + spinner.getSelectedItem().toString());
 *             }
 *
 *             @Override
 *             public void onNothingSelected(AdapterView<?> parent) {
 *
 *             }
 *         });
 */




        //txt.setText(spinner.getSelectedItem().toString());


    }

    /**
     *
     * @param view
     *           public void onBtnClick (View view){
     *               TextView txt = findViewById(R.id.textView);
     *
     *               EditText edtID = findViewById(R.id.ID);
     *
     *               txt.setText(edtID.getText().toString() + '@');
     *
     *
     *         }
     */




}