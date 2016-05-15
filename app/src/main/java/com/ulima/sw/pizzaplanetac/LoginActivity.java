package com.ulima.sw.pizzaplanetac;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.ulima.sw.pizzaplanetac.beans.Usuario;
import com.ulima.sw.pizzaplanetac.listado.ListadoPizzasActivity;

/**
 * Created by fixt on 05/05/16.
 */
public  class LoginActivity extends AppCompatActivity {

    EditText eteUsuario, etePassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        eteUsuario = (EditText) findViewById(R.id.txtUsuario);
        etePassword = (EditText) findViewById(R.id.txtContra);
    }

    public void onLoginClicked(View view){
        String username = eteUsuario.getText().toString();
        String password = etePassword.getText().toString();

        if ((username.trim().toLowerCase().equals("pizza")) &&
                password.equals("planeta") ){
            // Login correcto
            Usuario usuario = new Usuario(username, password);
            Intent intent = new Intent(this, ListadoPizzasActivity.class);
            //intent.putExtra("username", username);
            intent.putExtra("usuario", usuario);
            eteUsuario.setText(null);
            etePassword.setText(null);

            startActivity(intent);
        }else{
            Toast.makeText(this, "Credenciales Erradas", Toast.LENGTH_SHORT).show();
        }


    }
}
