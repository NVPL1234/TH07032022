package com.example.th07032022;

public class ProductLab4a {
    private String name;
    private String shop;
    private int img;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public ProductLab4a(String name, String shop, int img) {
        this.name = name;
        this.shop = shop;
        this.img = img;
    }

    public ProductLab4a() {
    }
}
