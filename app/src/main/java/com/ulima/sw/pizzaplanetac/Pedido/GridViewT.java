package com.ulima.sw.pizzaplanetac.Pedido;

import com.ulima.sw.pizzaplanetac.beans.Pedido;

import java.util.List;

/**
 * Created by fixt on 14/06/16.
 */
public interface GridViewT {
    public void setPresenter(GridPresenter presenter);
    public void mostrarPedidos(List<Pedido> pedidos);
}
