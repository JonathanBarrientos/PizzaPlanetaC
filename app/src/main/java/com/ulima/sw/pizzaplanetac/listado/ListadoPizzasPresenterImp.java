package com.ulima.sw.pizzaplanetac.listado;

import com.ulima.sw.pizzaplanetac.beans.Pizza;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 6/05/2016.
 */
public class ListadoPizzasPresenterImp implements ListadoPizzasPresenter {

    private ListadoPizzasView lview;

    public ListadoPizzasPresenterImp(ListadoPizzasView lview) {
        this.lview = lview;
    }

    @Override
    public void obtenerListaP() {

        List<Pizza> pizzas = new ArrayList<>();
        Pizza pi = new Pizza();

        pi.setId(1);
        pi.setNombre("Americana");
        pi.setTamaño("M");
        pi.setImg("@drawable/americana");

        pizzas.add(pi);

        pi.setId(2);
        pi.setNombre("Bacon");
        pi.setTamaño("L");
        pi.setImg("@drawable/bacon");

        pizzas.add(pi);

       lview.mostrarPizzas(pizzas);
    }
}
