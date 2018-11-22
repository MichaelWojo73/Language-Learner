package com.example.android.languagelearner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SpanishAnimals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spanish_animals);

        Button pig = findViewById(R.id.spanishPig);
        Button dog = findViewById(R.id.spanishDog);
        Button goat = findViewById(R.id.spanishGoat);
        Button cat = findViewById(R.id.spanishCat);

        pig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SpanishAnimals.this, "Pig", Toast.LENGTH_SHORT).show();
            }
        });

        dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SpanishAnimals.this, "Dog", Toast.LENGTH_SHORT).show();
            }
        });

        goat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SpanishAnimals.this, "Goat", Toast.LENGTH_SHORT).show();
            }
        });

        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SpanishAnimals.this, "Cat", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
