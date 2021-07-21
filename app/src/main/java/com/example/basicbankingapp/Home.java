package com.example.basicbankingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
     Button view, transfermoney;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        view = (Button) findViewById(R.id.button1);
        transfermoney = (Button) findViewById(R.id.button2);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view();
            }
        });
        transfermoney.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    transfermoney();
                }



                });
            }
            public void view(){
                Intent intent1= new Intent(this, view.class);
                startActivity(intent1);
            }

            public void transfermoney(){
                Intent intent2= new Intent(this, TransferMoney.class);
                startActivity(intent2);
            }



            }
