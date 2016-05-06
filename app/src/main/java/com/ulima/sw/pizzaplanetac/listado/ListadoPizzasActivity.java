package com.ulima.sw.pizzaplanetac.listado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.ulima.sw.pizzaplanetac.R;
import com.ulima.sw.pizzaplanetac.adapter.ListadoPizzasAdapter;
import com.ulima.sw.pizzaplanetac.beans.Pizza;

import java.util.List;

public class ListadoPizzasActivity extends AppCompatActivity implements ListadoPizzasView {

    ListadoPizzasPresenter lPresenter;
    ListView lstPizzas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_pizzas);

        lstPizzas = (ListView)findViewById(R.id.lstPizza);
        setPresenter(new ListadoPizzasPresenterImp(this));

        lPresenter.obtenerListaP();
    }

    @Override
    public void setPresenter(ListadoPizzasPresenter presenter) {
        this.lPresenter = presenter;
    }

    @Override
    public void mostrarPizzas(List<Pizza> Pizzas) {
        ListadoPizzasAdapter adapter = new ListadoPizzasAdapter(Pizzas,this);
    }
}
