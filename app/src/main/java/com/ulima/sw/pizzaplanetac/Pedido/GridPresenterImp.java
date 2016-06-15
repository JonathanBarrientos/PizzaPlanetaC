package com.ulima.sw.pizzaplanetac.Pedido;

import com.ulima.sw.pizzaplanetac.Remote.PizzaPService;
import com.ulima.sw.pizzaplanetac.beans.Pedido;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by fixt on 14/06/16.
 */
public class GridPresenterImp implements GridPresenter {

    private GridViewT Gview;

    public GridPresenterImp(GridViewT gview) {
        Gview = gview;
    }

    @Override
    public void obtenerPedidos() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://pizzaplanetac.mybluemix.net/webresources/generic/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PizzaPService service = retrofit.create(PizzaPService.class);
        service.obtenerPedidos().enqueue(new Callback<List<Pedido>> () {
            @Override
            public void onResponse(Call<List<Pedido>> call, Response<List<Pedido>> response) {
                Gview.mostrarEquipos(response.body());
            }

            @Override
            public void onFailure(Call<List<Pedido>>  call, Throwable t) {

            }
        });

    }
}
