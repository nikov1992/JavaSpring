package com.agencia.crud.product;

import java.security.PublicKey;
import java.time.LocalDate;

public class Product {

    private Long id;

    private String name;

    private float price;

    private LocalDate date;

//    cuantos anios lleva creado
    private int antiquity;



    public Product(){
    }

//    CONSTRUCTOR WITH ID.
    public Product(Long id, String name, float price1, LocalDate date, int antiquity) {
        this.id = id;
        this.name = name;
        this.price = price1;
        this.date = date;
        this.antiquity = antiquity;

    }

//    CONSTRUCTOR WITH OUT IDs
    public Product(String name, float price1, LocalDate date, int antiquity) {
        this.name = name;
        this.price = price1;
        this.date = date;
        this.antiquity = antiquity;

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getAntiquity() {
        return antiquity;
    }

    public float getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setAntiquity(int antiquity) {
        this.antiquity = antiquity;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
