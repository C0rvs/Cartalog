package com.webshoppe.ecommerce.entity;

import java.math.BigDecimal;

public class Book {
    
    private String id;
    private String name;
    private String descriptionString;
    private BigDecimal price;
    
    public Book() {
        
    }
    public Book(String id, String name, String descriptionString, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.descriptionString = descriptionString;
        this.price = price;
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return descriptionString;
    }
    public void setDescription(String descriptionString) {
        this.descriptionString = descriptionString;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    

}
