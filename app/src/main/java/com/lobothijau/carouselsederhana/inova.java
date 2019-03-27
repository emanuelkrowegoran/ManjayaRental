package com.lobothijau.carouselsederhana;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class inova extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inova);

        Button btn = (Button) findViewById(R.id.button8);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(inova.this,transaksi.class);
                startActivity(i);
            }
        });


    }
}

