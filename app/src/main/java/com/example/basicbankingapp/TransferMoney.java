package com.example.basicbankingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.basicbankingapp.ui.DBHelper;

public class TransferMoney extends AppCompatActivity {
    Button ser1, done;
    EditText nm1, rs;
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_money);

        ser1 = findViewById(R.id.ser1);
        nm1 = findViewById(R.id.nm1);
        textView3 = findViewById(R.id.textView3);
        done = findViewById(R.id.done);
        rs = findViewById(R.id.rs);
        DBHelper db = new DBHelper(this);

        ser1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String rollno = nm1.getText().toString();
                String rupeeno = rs.getText().toString();
                textView3.setText(db.getSearchedCus(rollno));
            }
        });

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Final.class);

                i.putExtra("value", "entry");
                startActivity(i);
            }
        });

    }
}
