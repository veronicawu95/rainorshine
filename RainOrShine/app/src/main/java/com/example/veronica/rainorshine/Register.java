package com.example.veronica.rainorshine;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    Button registerButton;
    EditText nameEditText, emailEditText, passwordEditText, password2EditText;

    public static final String DEFAULT = "not available";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registerButton = (Button) findViewById(R.id.registerButton);
        nameEditText = (EditText) findViewById(R.id.nameEditText);
        emailEditText = (EditText) findViewById(R.id.emailEditText);
        passwordEditText = (EditText) findViewById(R.id.passwordEditText);
        password2EditText = (EditText) findViewById(R.id.password2EditText);
    }

    public void onSignUpClick(View v) {
        if (v.getId() == R.id.registerButton) {
            String pass1 = passwordEditText.getText().toString();
            String pass2 = password2EditText.getText().toString();

            if (!pass1.equals(pass2)) {
                Toast.makeText(this, "Passwords don't match!", Toast.LENGTH_SHORT).show();
            } else {
                SharedPreferences sharedPrefs = getSharedPreferences("UserCredentials", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPrefs.edit();
                editor.putString("name", nameEditText.getText().toString());
                editor.putString("email", emailEditText.getText().toString());
                editor.putString("password", passwordEditText.getText().toString());
                Toast.makeText(this, "User Credentials saved to Preferences", Toast.LENGTH_LONG).show();
                editor.commit();
                Intent intent = new Intent(this, Login.class);
                startActivity(intent);
            }
        }
    }
}
