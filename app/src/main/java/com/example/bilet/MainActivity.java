package com.example.bilet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText id;
    private EditText place;
    private EditText time1;
    private EditText time2;
    private EditText summ;
    private Button button;

    private String idl;
    private String placel;
    private String time1l;
    private String time2l;
    private String summl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id=findViewById(R.id.id);
        place=findViewById(R.id.place);
        time1=findViewById(R.id.time1);
        time2=findViewById(R.id.time2);
        summ=findViewById(R.id.summ);
        button=findViewById(R.id.button);

        button.setOnClickListener(listener);
    }


    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            idl=id.getText().toString();
            placel=place.getText().toString();
            time1l=time1.getText().toString();
            time2l=time2.getText().toString();
            summl=summ.getText().toString();

            Bilet bilet=new Bilet(idl,placel,time1l,time2l,summl);

            Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
            intent.putExtra(Bilet.class.getSimpleName(),bilet);
            startActivity(intent);

        }
    };
}