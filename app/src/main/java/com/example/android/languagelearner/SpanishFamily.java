package com.example.android.languagelearner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SpanishFamily extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spanish_family2);

        Button father = findViewById(R.id.spanishFather);
        Button mother = findViewById(R.id.spanishMother);
        Button sibling = findViewById(R.id.spanishSibling);
        Button cousin = findViewById(R.id.spanishCousin);

        father.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SpanishFamily.this, "Father", Toast.LENGTH_SHORT).show();
            }
        });

        mother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SpanishFamily.this, "Mother", Toast.LENGTH_SHORT).show();
            }
        });

        sibling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SpanishFamily.this, "Sibling", Toast.LENGTH_SHORT).show();
            }
        });

        cousin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SpanishFamily.this, "Cousin", Toast.LENGTH_SHORT).show();
            }
        });
    }
}


