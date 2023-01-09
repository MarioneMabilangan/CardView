package com.example.christmastcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nom, cognoms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nom = (EditText) findViewById(R.id.editNom);
        cognoms = (EditText) findViewById(R.id.editCognom);
    }
    public void Nadal(View view){
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("nom", nom.getText().toString());
        intent.putExtra("cognoms", cognoms.getText().toString());
        startActivity(intent);
    }
}