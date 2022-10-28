package com.example.lingolearn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout card = (RelativeLayout) findViewById(R.id.card);
        card.setOnClickListener(v->{
            startActivity(new Intent(MainActivity.this,PastActivity.class));
        });
    }
}