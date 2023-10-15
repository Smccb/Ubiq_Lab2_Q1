package com.example.lab2_q1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        TextView tF   = findViewById(R.id.textView);
        tF.setText(getIntent().getExtras().getString("message"));
    }
}
