package com.example.tporepaso1;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class LogginActivityViewModel extends AndroidViewModel {

    private MutableLiveData<Boolean> validado = new MutableLiveData<>();
    private String usuario = "";
    private String contrasenia = "";
    private Context context;

    public LogginActivityViewModel(@NonNull Application application) {
        super(application);
        this.context = application.getApplicationContext();
    }

    public LiveData<Boolean> getValidado() {
        return validado;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void validoUsuario() {
        if (usuario.isEmpty() || contrasenia.isEmpty()) {
            validado.setValue(true);
        } else {
            validado.setValue(false);
            Toast.makeText(context, "Credenciales inválidas", Toast.LENGTH_SHORT).show();
        }
    }

    public void setContext(Context context) {
        this.context = context;
    }
}

