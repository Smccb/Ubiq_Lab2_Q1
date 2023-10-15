package com.example.lab2_q1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.lab2_q1.NewActivity;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String key;
    String finalMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getting button from layout and creating message String to display out
        Button button = (Button)findViewById(R.id.button);
        String message2 = "Thank you ";
        String message3 = ", your request is being processed";

        EditText nameEntered   = findViewById(R.id.name);
        key = "message";
        finalMessage = message2+(nameEntered.getText().toString())+message3;


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });

        //Toast.makeText((Context)MainActivity.this, message, Toast.LENGTH_LONG).show();

        //when button is clicked display out a toast using message variable


    }

    private void openNewActivity() {
        Intent intent = new Intent(getApplicationContext(), NewActivity.class);
        intent.putExtra(key, finalMessage);
        startActivity(intent);
    }
}