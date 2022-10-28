package com.example.lingolearn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class PastActivity extends AppCompatActivity {

    private RelativeLayout card;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past);

        card = (RelativeLayout) findViewById(R.id.card1);
        card.setOnClickListener(v->{
            startActivity(new Intent(PastActivity.this,PaperActivity.class));
        });    }
}