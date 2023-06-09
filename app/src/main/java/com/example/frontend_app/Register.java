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

public class Register extends AppCompatActivity {

    Button register, authorization;
    EditText editTextUsername;
    EditText editTextName;
    EditText editTextSurname;
    EditText editTextEmail;
    EditText editTextPassword;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        editTextUsername = findViewById(R.id.login);
        editTextEmail = findViewById(R.id.email);
        editTextPassword = findViewById(R.id.password);
        Button register = findViewById(R.id.button3);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userSignUp();
            }
        });
    }

    public void userSignUp() {
        String login = editTextUsername.getText().toString().trim();
        String email = editTextEmail.getText().toString().trim();
        String id = editTextPassword.getText().toString().trim();

        retrofit2.Call<ResponseBody> call = RetrofitClient
                .getInstance()
                .getApi()
                .register(login, email, id);

        Log.d("MAINACTIVITY2LOGTAG", call.request().body().toString());
        call.enqueue(new retrofit2.Callback<ResponseBody>() {
            @Override
            public void onResponse(retrofit2.Call<ResponseBody> call, retrofit2.Response<ResponseBody> response) {
                try {
                    int s = Integer.parseInt(response.body().string());
                    Log.d("userok", "onResponse: " + s);
                    if(s == 1) {
                        Intent intent1 = new Intent(Register.this, MainPage.class);
                        startActivity(intent1);
                    } else {
                        Toast.makeText(Register.this, "Неверная почта или пароль", Toast.LENGTH_SHORT).show();
                        Intent intent228 = new Intent(Register.this, Register.class);
                        startActivity(intent228);
                    }
                    Toast.makeText(Register.this, s, Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override
            public void onFailure(retrofit2.Call<ResponseBody> call, Throwable t) {
                Toast.makeText(Register.this, "ошибка", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void signIn(View v) {

        try {
            Intent intent = new Intent(Register.this, Authorization.class);
            startActivity(intent);
        } catch (Exception e) {
            Toast.makeText(this, "ошибка", Toast.LENGTH_SHORT).show();
        }
    }


}

















