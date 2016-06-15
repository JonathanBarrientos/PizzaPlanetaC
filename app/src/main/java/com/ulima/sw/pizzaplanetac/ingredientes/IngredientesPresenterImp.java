package com.ulima.sw.pizzaplanetac.ingredientes;

import com.ulima.sw.pizzaplanetac.beans.Ingrediente;

import java.util.List;

/**
 * Created by fixt on 15/06/16.
 */
public class IngredientesPresenterImp implements IngredientesPresenter {

    private IngredientesView lview;

    public IngredientesPresenterImp(IngredientesView lview) {
        this.lview = lview;
    }

    @Override
    public void obtenerIngredientes() {

    }
}
