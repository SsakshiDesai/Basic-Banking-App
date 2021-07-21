package com.example.basicbankingapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.basicbankingapp.ui.DBHelper;

public class select extends AppCompatActivity {

    Button ser, transfermoney;
    EditText nm;
    TextView textView0, textView1;
    String rollno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        ser = findViewById(R.id.ser);
        nm = findViewById(R.id.nm);
        textView1 = findViewById(R.id.textView1
        );
        transfermoney = findViewById(R.id.transfermoney);



        DBHelper db = new DBHelper(this);

        ser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollno = nm.getText().toString();
                textView1.setText(db.getSearchedCus(rollno));

            }
        });



        transfermoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), TransferMoney.class);
                i.putExtra("value", "entry");
                startActivity(i);

            }
        });

    }
}

