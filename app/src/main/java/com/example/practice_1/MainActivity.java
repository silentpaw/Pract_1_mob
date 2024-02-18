package com.example.practice_1;

import static android.provider.Contacts.SettingsColumns.KEY;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String KEY = "РОССИЯ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = findViewById(R.id.button);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button2)
        {
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra(KEY, "РОССИЯ");
            startActivity(intent);
        }
        else
        {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            String str = "https://youtube.ru";
            intent.setData(Uri.parse(str));
            startActivity(intent);
        }

    }
}