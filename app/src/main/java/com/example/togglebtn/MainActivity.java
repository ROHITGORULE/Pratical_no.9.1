package com.example.togglebtn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToggleButton tb1 = (ToggleButton) findViewById(R.id.tog1);

        tb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st = "Biuetooth =  "+tb1.getText()+"\n";
                Toast.makeText(getApplicationContext(),st, Toast.LENGTH_SHORT).show();
            }
        });
    }
}