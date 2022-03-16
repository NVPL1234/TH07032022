package com.example.th07032022;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Lab4aActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab4a);
        ListView lvProduct=(ListView) findViewById(R.id.listItem);
        ArrayList<ProductLab4a> products=new ArrayList<>();
        products.add(new ProductLab4a("Ca nấu lẩu, nấu mì mini", "Devang", R.drawable.ca_nau_lau));
        products.add(new ProductLab4a("1KG KHÔ GÀ BƠ TỎI", "LTD Food", R.drawable.ga_bo_toi));
        products.add(new ProductLab4a("Xe cần cẩu đa năng", "Thế giới đồ chơi", R.drawable.xa_can_cau));
        products.add(new ProductLab4a("Đồ chơi dạng mô hình", "Thế giới đồ chơi", R.drawable.do_choi_dang_mo_hinh));
        products.add(new ProductLab4a("Lãnh đạo giản đơn", "Minh Long Book", R.drawable.lanh_dao_gian_don));
        products.add(new ProductLab4a("Hiểu lòng con trẻ", "Minh Long Book", R.drawable.hieu_long_con_tre));
        ProductAdapterLab4a productAdapter=new ProductAdapterLab4a(this, products, R.layout.item_lab4a);
        lvProduct.setAdapter(productAdapter);
    }
}