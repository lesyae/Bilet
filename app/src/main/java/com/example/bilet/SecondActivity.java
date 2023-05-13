package com.example.bilet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView vivod;
    private Button button2;

    private Bilet bilet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        vivod=findViewById(R.id.vivod);
        button2=findViewById(R.id.button2);

        Bundle bundleIntent = getIntent().getExtras();
        if (bundleIntent !=null){
            bilet =(Bilet) bundleIntent.getSerializable(Bilet.class.getSimpleName());

            vivod.setText("ID: " + bilet.getIdl()+"\n"
            +"Место: "+ bilet.getPlacel()+"\n"
                    +"Время отправления: "+bilet.getTime1l()+"\n"
                    +"Время прибывания: "+bilet.getTime2l()+"\n"
                    +"Стоимость: "+bilet.getSumml());
        }

        button2.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);

        }
    };
}