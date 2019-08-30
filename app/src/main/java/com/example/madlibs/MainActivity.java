package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendTexts(View V)
    {
        // getting a reference to my edit text fields
        EditText adjectiveTextEdit = (EditText) findViewById(R.id.adjectiveEditText);
        EditText nounTextEdit = (EditText) findViewById(R.id.nounTextEdit);
        EditText animalTextEdit = (EditText) findViewById(R.id.animalTextEdit);
        EditText numberTextEdit = (EditText) findViewById(R.id.numberTextEdit);

        // extracting the text from those edit text fields
        String adjectiveTextEditStr = adjectiveTextEdit.getText().toString();
        String nounTextEditStr = nounTextEdit.getText().toString();
        String animalTextEditStr = animalTextEdit.getText().toString();
        String numberTextEditStr = numberTextEdit.getText().toString();

        // Creating the intent object so I can send data
        Intent intent = new Intent(this, InfoActivity.class);

        // putting data from edit text fields into intent to send to other activity
        // MY_ADJECTIVE, MY_NOUN, MY_ANIMAL and MY_NUMBER are constants in InfoActivity class
        intent.putExtra(InfoActivity.MY_ADJECTIVE, adjectiveTextEditStr);
        intent.putExtra(InfoActivity.MY_NOUN, nounTextEditStr);
        intent.putExtra(InfoActivity.MY_ANIMAL, animalTextEditStr);
        intent.putExtra(InfoActivity.MY_NUMBER, numberTextEditStr);

        // loads the next activity
        startActivity(intent);

    }
}
