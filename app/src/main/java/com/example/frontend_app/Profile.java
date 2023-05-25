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

public class Profile extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
    }

    public void onClickMain(View view){
        try {
            Intent intent = new Intent(Profile.this, MainPage.class);
            startActivity(intent);
        } catch (Exception e) {
            Toast.makeText(this, "ошибка", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickCatalog(View view) {
        try {
            Intent intent = new Intent(Profile.this, Catalog.class);
            startActivity(intent);
        } catch (Exception e) {
            Toast.makeText(this, "ошибка", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickForum(View view) {
        try {
            Intent intent = new Intent(Profile.this, Forum.class);
            startActivity(intent);
        } catch (Exception e) {
            Toast.makeText(this, "ошибка", Toast.LENGTH_SHORT).show();
        }
    }
}
