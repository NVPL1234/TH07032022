package com.example.th07032022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class Lab4bActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab4b);
        GridView gvProduct=(GridView) findViewById(R.id.gridView);
        ArrayList<ProductLab4b> products=new ArrayList<>();
        products.add(new ProductLab4b(R.drawable.giacchuyen, "Cáp chuyển từ Cổng USB sang PS2", 4, "(15)", 69900, "-39%"));
        products.add(new ProductLab4b(R.drawable.daynguon, "Cáp chuyển từ Cổng USB sang PS2", 4, "(15)", 69900, "-39%"));
        products.add(new ProductLab4b(R.drawable.dauchuyendoiii, "Cáp chuyển từ Cổng USB sang PS2", 4, "(15)", 69900, "-39%"));
        products.add(new ProductLab4b(R.drawable.dauchuyendoi, "Cáp chuyển từ Cổng USB sang PS2", 4, "(15)", 69900, "-39%"));
        products.add(new ProductLab4b(R.drawable.carbusbtops, "Cáp chuyển từ Cổng USB sang PS2", 4, "(15)", 69900, "-39%"));
        products.add(new ProductLab4b(R.drawable.daucam, "Cáp chuyển từ Cổng USB sang PS2", 4, "(15)", 69900, "-39%"));
        ProductAdapterLab4b productAdapter=new ProductAdapterLab4b(this, products, R.layout.item_lab4b);
        gvProduct.setAdapter(productAdapter);
    }
}