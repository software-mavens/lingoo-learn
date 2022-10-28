package com.example.lingolearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;

public class PaperActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper);

        Button card = (Button) findViewById(R.id.button);
        card.setOnClickListener(v->{
            startActivity(new Intent(PaperActivity.this,MemoActivity.class));
        });
    }
}