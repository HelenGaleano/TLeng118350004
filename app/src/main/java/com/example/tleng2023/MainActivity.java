package com.example.tleng2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText txtnombre, txtapellido;
    Button btnmostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtapellido=(EditText) findViewById(R.id.txtapellido);
        btnmostrar =(Button) findViewById(R.id.btnmostrar);

        btnmostrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity.this, txtnombre.getText()+"-"+txtapellido.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}