package com.example.intents;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t= findViewById(R.id.txtnumero);
        new CountDownTimer(10000,10000){
            @Override
            public void onTick(long millisUntilFinished){
                t.setText(String.valueOf(millisUntilFinished/1000));
            }
            @Override
            public void onFinish(){
                Intent it = new Intent(MainActivity.this, Main2Activity.class);
                it.putExtra("Nombre", "Pifi");
                startActivity(it);
                finish();
            }
        }.start();
    }
}
