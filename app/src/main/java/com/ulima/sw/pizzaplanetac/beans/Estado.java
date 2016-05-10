package com.ulima.sw.pizzaplanetac.beans;

import java.util.Date;

/**
 * Created by fixt on 10/05/16.
 */
public class Estado {
    Date hora;
    int id;
    int estado;

    public Estado() {
    }

    public Estado(Date hora, int id, int estado) {
        this.hora = hora;
        this.id = id;
        this.estado = estado;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
