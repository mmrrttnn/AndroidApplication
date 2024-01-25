package com.example.androidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        Button logIn = findViewById(R.id.button);

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameString = username.getText().toString();
                String passwordString = password.getText().toString();

                if (usernameString.isEmpty() && passwordString.isEmpty()) {
                    username.setError("Insert Username");
                    password.setError("Insert Password");
                } else if (usernameString.isEmpty()) {
                    username.setError("Insert Username");
                } else if (passwordString.isEmpty()) {
                    password.setError("Insert Password");
                } else {
                    Intent intent = new Intent(MainActivity.this, Activity2.class);
                    intent.putExtra("username", usernameString);
                    intent.putExtra("password", passwordString);
                    startActivity(intent);
                }
            }
        });
    }
}