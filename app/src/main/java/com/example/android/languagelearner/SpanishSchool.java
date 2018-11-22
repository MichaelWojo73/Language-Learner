package com.example.android.languagelearner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SpanishSchool extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spanish_school);

        Button pencil = findViewById(R.id.spanishPencil);
        Button eraser = findViewById(R.id.spanishEraser);
        Button notebook = findViewById(R.id.spanishNotebook);
        Button desk = findViewById(R.id.spanishDesk);

        pencil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SpanishSchool.this, "Pencil", Toast.LENGTH_SHORT).show();
            }
        });

        eraser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SpanishSchool.this, "Eraser", Toast.LENGTH_SHORT).show();
            }
        });

        notebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SpanishSchool.this, "Notebook", Toast.LENGTH_SHORT).show();
            }
        });

        desk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SpanishSchool.this, "Desk", Toast.LENGTH_SHORT).show();
            }
        });
    }
}


