package com.example.notvpn;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    String colorArray[] = {"#9dc4c3", "#a4b6c0", "566777", "#1c7097", "#e01449", "#8591ca", "#384936"};
    Button btn_ch;
    RelativeLayout bck;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Background Randomize Button
        btn_ch = (Button) findViewById(R.id.floatingActionButton3);
        bck = (RelativeLayout) findViewById(R.layout.activity_main);

        btn_ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random i = new Random();
                int c = i.nextInt(7 - 1) + 1;

                bck.setBackgroundColor(Color.parseColor(colorArray[c]));
            }
        });
        //Setting Menu Button
        Button button = findViewById(R.id.floatingActionButton);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openSettings_Menu();
                    }
                });
    }
        public void openSettings_Menu() {
        Intent intent = new Intent(this,Settings_Menu.class);
        startActivity(intent);
        }
}
