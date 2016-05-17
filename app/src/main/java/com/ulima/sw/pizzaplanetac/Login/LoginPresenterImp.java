package com.ulima.sw.pizzaplanetac.Login;

import android.content.Intent;
import android.widget.Toast;

import com.ulima.sw.pizzaplanetac.Remote.PizzaPService;
import com.ulima.sw.pizzaplanetac.beans.Mensaje;
import com.ulima.sw.pizzaplanetac.beans.Usuario;
import com.ulima.sw.pizzaplanetac.dao.LoginDAO;
import com.ulima.sw.pizzaplanetac.listado.ListadoPizzasActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by fixt on 11/05/16.
 */
public class LoginPresenterImp implements LoginPresenter {

    private LoginView lView;

    public LoginPresenterImp(LoginView lView) {
        this.lView = lView;
    }

    @Override
    public void obtenerLogin(Usuario user) {

        /*Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://pichangers-api.mybluemix.net/rest/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PizzaPService service = retrofit.create(PizzaPService.class);
        service.obtenerLogin(user).enqueue(new Callback<Mensaje>() {
            @Override
            public void onResponse(Call<Mensaje> call, Response<Mensaje> response) {
                lView.callActiviy(response.body().getMsg());
            }

            @Override
            public void onFailure(Call<Mensaje> call, Throwable t) {

            }
        });*/

        /*if ((user.getUsuario().trim().toLowerCase().equals("pizza")) &&
                user.getPassword().equals("planeta") ){
            lView.callActiviy("OK");
        }else{
            lView.callActiviy("Credenciales Erradas");
        }*/

        LoginDAO dao = new LoginDAO();
        int val = dao.login(user.getUsuario().trim().toLowerCase(),user.getPassword());
        if (val == 1) {
            lView.callActiviy("OK");
        }else{
            lView.callActiviy("Credenciales Erradas");
        }
    }
}
