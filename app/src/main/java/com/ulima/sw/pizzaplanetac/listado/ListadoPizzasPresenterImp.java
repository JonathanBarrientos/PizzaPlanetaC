package com.ulima.sw.pizzaplanetac.listado;

import android.widget.Toast;

import com.ulima.sw.pizzaplanetac.Remote.PizzaPService;
import com.ulima.sw.pizzaplanetac.beans.Mensaje;
import com.ulima.sw.pizzaplanetac.beans.Pedido;
import com.ulima.sw.pizzaplanetac.beans.Pizza;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Admin on 6/05/2016.
 */
public class ListadoPizzasPresenterImp implements ListadoPizzasPresenter {

    private ListadoPizzasView lview;

    public ListadoPizzasPresenterImp(ListadoPizzasView lview) {
        this.lview = lview;
    }


    @Override
    public void obtenerListaP(int idpizzas) {

        Retrofit retrofit = new Retrofit.Builder()
                //.baseUrl("http://pizzaplanetac.mybluemix.net/webresources/generic/")
                .baseUrl("http://pizzac.mybluemix.net/webresources/generic/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PizzaPService service = retrofit.create(PizzaPService.class);
        service.obtenerPizzas(idpizzas).enqueue(new Callback<List<Pizza>>() {
            @Override
            public void onResponse(Call<List<Pizza>> call, Response<List<Pizza>> response) {
                lview.mostrarPizzas(response.body());
            }

            @Override
            public void onFailure(Call<List<Pizza>>  call, Throwable t) {

            }
        });

    }

    @Override
    public void actualizarEstado(int idPedido) {

        Retrofit retrofit = new Retrofit.Builder()
                //.baseUrl("http://pizzaplanetac.mybluemix.net/webresources/generic/")
                .baseUrl("http://pizzac.mybluemix.net/webresources/generic/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PizzaPService service = retrofit.create(PizzaPService.class);
        service.actualizarEstado(idPedido).enqueue(new Callback<Integer>() {
            @Override
            public void onResponse(Call<Integer> call, Response<Integer> response) {
                lview.toAst(response.body());
            }

            @Override
            public void onFailure(Call<Integer>  call, Throwable t) {

            }
        });

    }
}
