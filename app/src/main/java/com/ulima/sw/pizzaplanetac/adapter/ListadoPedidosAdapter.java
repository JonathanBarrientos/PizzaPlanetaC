package com.ulima.sw.pizzaplanetac.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ulima.sw.pizzaplanetac.R;
import com.ulima.sw.pizzaplanetac.beans.Pedido;

import java.util.List;

/**
 * Created by fixt on 14/06/16.
 */
public class ListadoPedidosAdapter extends BaseAdapter {

    private List<Pedido> lPedidos;
    private LayoutInflater mInflater;
    private Context mContext;

    public ListadoPedidosAdapter(List<Pedido> pedidos, Context context){
        mContext = context;
        lPedidos = pedidos;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return lPedidos.size();
    }

    @Override
    public Object getItem(int position) {
        return lPedidos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return lPedidos.get(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder viewHolder;
        if (view == null){
            view = mInflater.inflate(R.layout.pedidoitm, null);
            viewHolder = new ViewHolder();
            viewHolder.imgE =(ImageView) view.findViewById(R.id.imgE);
            viewHolder.txtPedido = (TextView) view.findViewById(R.id.txtPedido);
            viewHolder.txtHora=(TextView) view.findViewById(R.id.txtHora);
            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }
        final Pedido pedido = lPedidos.get(position);
        viewHolder.txtPedido.setText("Pedido #"+position);
        viewHolder.txtHora.setText(pedido.getEstado().getHora());
        if (pedido.getEstado().getId() == 0) {
            viewHolder.imgE.setImageResource(R.drawable.rojo);
        }else if (pedido.getEstado().getId() == 1) {
            viewHolder.imgE.setImageResource(R.drawable.amarillo);
        }else if (pedido.getEstado().getId() == 2) {
                viewHolder.imgE.setImageResource(R.drawable.verde);
        }

        return view;
    }

    class ViewHolder{
        ImageView imgE;
        TextView txtPedido;
        TextView txtHora;
    }
}

