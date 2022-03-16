package com.example.th07032022;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ProductAdapterLab4a extends BaseAdapter {
    private Context context;
    private List<ProductLab4a> products;
    private int layout;

    public ProductAdapterLab4a(Context context, List<ProductLab4a> products, int layout) {
        this.context = context;
        this.products = products;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int i) {
        return products.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null){
            view= LayoutInflater.from(viewGroup.getContext()).inflate(layout,viewGroup,false);
        }
        ImageView imgProduct=(ImageView) view.findViewById(R.id.imgProduct);
        TextView tvName= (TextView) view.findViewById(R.id.name);
        TextView tvNameShop=(TextView) view.findViewById(R.id.nameShop);

        imgProduct.setImageResource(products.get(i).getImg());
        tvName.setText(products.get(i).getName());
        tvNameShop.setText(products.get(i).getShop());
        return view;
    }
}
