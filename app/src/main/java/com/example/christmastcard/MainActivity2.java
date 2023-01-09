package com.example.christmastcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    String nom, cognoms;
    TextView text, text2;
    ImageView imageView;
    int min = 1;
    int max = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text = (TextView) findViewById(R.id.txt2);
        text2 = (TextView) findViewById(R.id.txt3);
        imageView= findViewById(R.id.lobo);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            nom = extras.getString("nom");
            cognoms = extras.getString("cognoms");
        }
        text.setText(nom);
        text2.setText(cognoms);
        System.out.println(nom);
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
        if(random_int == 1){
            imageView.setImageResource(R.drawable.xmas_werewolf_dec19);
        }else if(random_int == 2){
            imageView.setImageResource(R.drawable.tqc9w86zzz1a1);
        }else if(random_int == 3){
        imageView.setImageResource(R.drawable.a248d9736f33e8164187f1aeb18e024b);
    }
    }
}