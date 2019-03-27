package com.lobothijau.carouselsederhana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MenuKatalog extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_menu_katalog);


            Button btnsigra=(Button)findViewById(R.id.btnsigra);

            btnsigra.setOnClickListener(new View.OnClickListener() {



                public void onClick(View arg0) {


                    Intent i =new Intent(getApplicationContext(),Sigra_Katalog.class);

                    startActivity(i);
                }

            });

            Button btnxenia=(Button)findViewById(R.id.btnxenia);
            btnxenia.setOnClickListener(new View.OnClickListener() {



                public void onClick(View arg0) {


                    Intent i =new Intent(getApplicationContext(),Xenia.class);

                    startActivity(i);
                }

            });

            Button btnavansa=(Button)findViewById(R.id.btnavansa);
            btnavansa.setOnClickListener(new View.OnClickListener() {



                public void onClick(View arg0) {


                    Intent i =new Intent(getApplicationContext(),avanza.class);

                    startActivity(i);



                }

            });

            Button btnelf=(Button)findViewById(R.id.btnelf);
            btnelf.setOnClickListener(new View.OnClickListener() {



                public void onClick(View arg0) {


                    Intent i =new Intent(getApplicationContext(),elf.class);

                    startActivity(i);



                }

            });
            Button btnpajero=(Button)findViewById(R.id.btnpajero);
            btnpajero.setOnClickListener(new View.OnClickListener() {



                public void onClick(View arg0) {


                    Intent i =new Intent(getApplicationContext(),pajero.class);

                    startActivity(i);



                }

            });
            Button btnalpahard=(Button)findViewById(R.id.btnalpahard);
            btnalpahard.setOnClickListener(new View.OnClickListener() {



                public void onClick(View arg0) {


                    Intent i =new Intent(getApplicationContext(),alpahard.class);

                    startActivity(i);



                }

            });
            Button btnbrio=(Button)findViewById(R.id.btnbrio);
            btnbrio.setOnClickListener(new View.OnClickListener() {



                public void onClick(View arg0) {


                    Intent i =new Intent(getApplicationContext(),brio.class);

                    startActivity(i);



                }

            });
            Button btnamaze=(Button)findViewById(R.id.btnamaze);
            btnamaze.setOnClickListener(new View.OnClickListener() {



                public void onClick(View arg0) {


                    Intent i =new Intent(getApplicationContext(),amaze.class);

                    startActivity(i);



                }

            }); Button btninova=(Button)findViewById(R.id.btninova);
            btninova.setOnClickListener(new View.OnClickListener() {



                public void onClick(View arg0) {


                    Intent i =new Intent(getApplicationContext(),inova.class);

                    startActivity(i);



                }

            });
        }
    }
