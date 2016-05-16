package com.ulima.sw.pizzaplanetac.Informacion;


import com.ulima.sw.pizzaplanetac.beans.Pedido;

/**
 * Created by fixt on 14/05/16.
 */
public interface InformView {
    public void setPresenter(InformPresenter presenter);
    public void mostrarPedido(Pedido pedido);
}
