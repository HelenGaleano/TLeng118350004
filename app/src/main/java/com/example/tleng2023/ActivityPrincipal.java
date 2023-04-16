package com.example.tleng2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPrincipal extends AppCompatActivity {

    Button btnAdd, btnList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnAdd = (Button) findViewById(R.id.btnadd);
        btnList =(Button) findViewById(R.id.btnlist);

        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Intent pagina = new Intent(getApplicationContext(),ActivitList.class);
                 startActivity(pagina);

            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),ActivityIngresar.class);
                startActivity(intent);


            }
        });
    }
}