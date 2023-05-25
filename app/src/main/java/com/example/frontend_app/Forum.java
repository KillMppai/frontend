package com.example.frontend_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.IOException;

import okhttp3.ResponseBody;

public class Forum extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forum);
    }

    public void onClickProfile(View view) {
        try {
            Intent intent = new Intent(Forum.this, Profile.class);
            startActivity(intent);

        } catch (Exception e) {
            Toast.makeText(this, "ошибка", Toast.LENGTH_SHORT).show();
        }

    }

    public void onClickCatalog(View view) {
        try {
            Intent intent = new Intent(Forum.this, Catalog.class);
            startActivity(intent);

        } catch (Exception e) {
            Toast.makeText(this, "ошибка", Toast.LENGTH_SHORT).show();
        }

    }

    public void onClickMain(View view) {
        try {
            Intent intent = new Intent(Forum.this, MainPage.class);
            startActivity(intent);

        } catch (Exception e) {
            Toast.makeText(this, "ошибка", Toast.LENGTH_SHORT).show();
        }

    }
}