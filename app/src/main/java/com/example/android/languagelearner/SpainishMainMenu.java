package com.example.android.languagelearner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SpainishMainMenu extends AppCompatActivity {

    private Button animales;
    private Button food;
    private Button family;
    private Button school;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spainish_main_menu);

        animales = findViewById(R.id.btnSpanishAnimals);
        animales.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnimales();
                Toast.makeText(SpainishMainMenu.this, "Animals", Toast.LENGTH_SHORT).show();
            }
        }));

        food = findViewById(R.id.btnSpanishFood);
        food.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openComida();
                Toast.makeText(SpainishMainMenu.this, "Food", Toast.LENGTH_SHORT).show();
            }
        }));

        family = findViewById(R.id.btnSpanishFamily);
        family.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFamilia();
                Toast.makeText(SpainishMainMenu.this, "Family", Toast.LENGTH_SHORT).show();
            }
        }));

        school = findViewById(R.id.btnSpanishSchool);
        school.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColegio();
                Toast.makeText(SpainishMainMenu.this, "School", Toast.LENGTH_SHORT).show();
            }
        }));
    }
        public void openAnimales() {
        Intent openAnimales = new Intent(this, SpanishAnimals.class);
        startActivity(openAnimales);

        }

    public void openFamilia() {
        Intent openFamilia = new Intent(this, SpanishFamily.class);
        startActivity(openFamilia);

    }

    public void openColegio() {
        Intent openColegio = new Intent(this, SpanishSchool.class);
        startActivity(openColegio);
        
    }

        public void openComida() {
        Intent openComida = new Intent(this, SpanishFood.class);
        startActivity(openComida);







    }
}
