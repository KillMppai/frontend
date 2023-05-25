package com.example.frontend_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Catalog extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catalog);
    }

    public void onClickProfile(View view) {
        try {
            Intent intent = new Intent(Catalog.this, Profile.class);
            startActivity(intent);

        } catch (Exception e) {
            Toast.makeText(this, "ошибка", Toast.LENGTH_SHORT).show();
        }

    }

    public void onClickForum(View view) {
        try {
            Intent intent = new Intent(Catalog.this, Forum.class);
            startActivity(intent);

        } catch (Exception e) {
            Toast.makeText(this, "ошибка", Toast.LENGTH_SHORT).show();
        }

    }

    public void onClickMain(View view) {
        try {
            Intent intent = new Intent(Catalog.this, MainPage.class);
            startActivity(intent);

        } catch (Exception e) {
            Toast.makeText(this, "ошибка", Toast.LENGTH_SHORT).show();
        }

    }
}