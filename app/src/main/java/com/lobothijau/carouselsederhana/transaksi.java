package com.lobothijau.carouselsederhana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class transaksi extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference myRef;
    EditText text1;
    EditText text2;
    EditText text3;
    EditText text4;
    EditText text5;
    EditText text6;
    EditText text7;
    EditText text8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaksi);
        Button btn = (Button) findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(transaksi.this,konfir.class);
                startActivity(i);
            }
        });

    }
    public void Click1(View view) {
        EditText text1 = (EditText) findViewById(R.id.edit1);
        EditText text2 = (EditText) findViewById(R.id.edit2);
        EditText text3 = (EditText) findViewById(R.id.edit3);
        EditText text4 = (EditText) findViewById(R.id.edit4);
        EditText text5 = (EditText) findViewById(R.id.edit5);
        EditText text6 = (EditText) findViewById(R.id.edit6);
        EditText text7 = (EditText) findViewById(R.id.edit7);
        EditText text8 = (EditText) findViewById(R.id.edit8);


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Penyewa : ").child(text1.getText().toString());


        myRef.child("Nama").setValue(text2.getText().toString());
        myRef.child("NoHp").setValue(text3.getText().toString());
        myRef.child("Alamat").setValue(text4.getText().toString());
        myRef.child("IdMobil").setValue(text5.getText().toString());
        myRef.child("Supir").setValue(text6.getText().toString());
        myRef.child("Tanggal_Sewa").setValue(text7.getText().toString());
        myRef.child("Tanggal_Kembali").setValue(text8.getText().toString());
    }
}
