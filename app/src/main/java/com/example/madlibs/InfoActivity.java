package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    public static final String MY_ADJECTIVE = "adjective";
    public static final String MY_NOUN = "noun";
    public static final String MY_ANIMAL = "animal";
    public static final String MY_NUMBER = "age";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Intent intent = getIntent();
        String adjectiveTextEdit = ((Intent) intent).getStringExtra(MY_ADJECTIVE);
        String nounTextEdit = ((Intent) intent).getStringExtra(MY_NOUN);
        String animalTextEdit = ((Intent) intent).getStringExtra(MY_ANIMAL);
        String numberTextEdit = ((Intent) intent).getStringExtra(MY_NUMBER);

        String strToDisplay = "Once upon a time " +

        TextView str = (TextView) findViewById(R.id.info);
        str.setText(strToDisplay);
    }
}
