package com.codegym.model;

public class Product {
    private int id ;
    private String nameProduct;
    private double price;
    private String productDescription;
    private String producer;

    public Product() {
    }

    public Product(int id, String nameProduct, double price, String productDescription, String producer) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.productDescription = productDescription;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
