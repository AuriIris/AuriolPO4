package com.example.auriolpo4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mUsernameEditText;
    private EditText mPasswordEditText;
    private Button mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtener las referencias de los elementos de la interfaz de usuario
        mUsernameEditText = findViewById(R.id.username_edittext);
        mPasswordEditText = findViewById(R.id.password_edittext);
        mLoginButton = findViewById(R.id.login_button);

        // Asociar un listener al botón de inicio de sesión
        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener los valores ingresados en los campos de texto
                String username = mUsernameEditText.getText().toString();
                String password = mPasswordEditText.getText().toString();

                // Validar las credenciales del usuario
                if (username.equals("R") && password.equals("1")) {
                    // Si las credenciales son válidas, abrir la actividad del menú
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                } else {
                    // Si las credenciales son inválidas, mostrar un mensaje de error
                    Toast.makeText(MainActivity.this, "Nombre de usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
