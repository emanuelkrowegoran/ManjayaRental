package com.lobothijau.carouselsederhana;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pajero extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pajero);

        Button btn = (Button) findViewById(R.id.button9);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(pajero.this,transaksi.class);
                startActivity(i);
            }
        });


    }
}

