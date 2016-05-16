package com.ulima.sw.pizzaplanetac.Remote;

import com.ulima.sw.pizzaplanetac.beans.Mensaje;
import com.ulima.sw.pizzaplanetac.beans.Usuario;

import java.util.List;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by fixt on 11/05/16.
 */

    public interface PizzaPService {
        @POST("alumnos/login")
        Call<Mensaje> obtenerLogin(@Body Usuario user);

        //@GET("equipos")
        //Call<List<Equipo>> obtenerEquipos();

        //@GET("equipos/{id}")
        //Call<Equipo> obtenerEquipoID(@Path("id") int id);


        //@GET("alumnos?sin_equipo=true")
        //Call<List<Alumno>> obtenerAlumnosSEqu();

        //@POST("equipos/{id}/{codigo_alumno}")
        //Call<Mensaje> agregarAlumnoaEquipo(@Path("id") int id, @Path("codigo_alumno") String codigo);
    }


