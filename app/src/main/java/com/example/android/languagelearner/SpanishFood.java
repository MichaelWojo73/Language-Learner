package com.example.android.languagelearner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SpanishFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spanish_food);

        Button carrot = findViewById(R.id.spanishCarrot);
        Button lettuce = findViewById(R.id.spanishLettuce);
        Button eggs = findViewById(R.id.spanishEggs);
        Button apple = findViewById(R.id.spanishApple);

        carrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SpanishFood.this, "Carrot", Toast.LENGTH_SHORT).show();
            }
        });

        lettuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SpanishFood.this, "Lettuce", Toast.LENGTH_SHORT).show();
            }
        });

        eggs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SpanishFood.this, "Eggs", Toast.LENGTH_SHORT).show();
            }
        });

        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SpanishFood.this, "Apple", Toast.LENGTH_SHORT).show();
            }
        });











    }
}
