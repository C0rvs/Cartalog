package com.webshoppe.ecommerce.entity;

import java.awt.geom.IllegalPathStateException;
import java.math.BigDecimal;

public class Flower {
    private String id; 
    private String title;
    private String description;
    private BigDecimal price;
    public Flower() {
        
    }
    public Flower(String id, String title, String description, BigDecimal price) {
        this.id = id;
        this.title = title;
        this.description =description;
        this.price = price ;
        
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return title;
    }
    public void setName(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
