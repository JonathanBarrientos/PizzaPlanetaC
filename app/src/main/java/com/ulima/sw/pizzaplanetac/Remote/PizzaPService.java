package com.ulima.sw.pizzaplanetac.Remote;


import com.ulima.sw.pizzaplanetac.beans.Mensaje;
import com.ulima.sw.pizzaplanetac.beans.Pedido;
import com.ulima.sw.pizzaplanetac.beans.Pizza;
import com.ulima.sw.pizzaplanetac.beans.Usuario;

import java.util.List;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by fixt on 11/05/16.
 */

    public interface PizzaPService {
        @GET("login")
        Call<String> obtenerLogin(@Query("usuario") String usuario, @Query("password") String password);

        @GET("getMensaje")
        Call<List<Mensaje>> obtenerMensajes();

        @GET("getPizza")
        Call<List<Pizza>> obtenerPizzas(@Query("id") int id);

        @GET("Estado")
        Call<Integer> actualizarEstado(@Query("pedido") int idPedido,@Query("usuario") String usuario);


    }


