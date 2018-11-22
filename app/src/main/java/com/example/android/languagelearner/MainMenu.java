package com.example.android.languagelearner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {
private Button spanishMainMenu;
private Button polishMainMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        spanishMainMenu = findViewById(R.id.btnSpanishMenu);
        spanishMainMenu.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpanishMenu();
            }
        }));

        polishMainMenu = findViewById(R.id.btnPolishMenu);
        polishMainMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openPolishMenu();
            }
        });


    }
    public void openSpanishMenu() {
        Intent intentOpenSpanishMenu = new Intent(this, SpainishMainMenu.class);
        startActivity(intentOpenSpanishMenu);

    }

    public void openPolishMenu() {
           Intent intentOpenPolishMenu = new Intent(this, PolishMainMenu.class);
           startActivity(intentOpenPolishMenu);




    }
}
