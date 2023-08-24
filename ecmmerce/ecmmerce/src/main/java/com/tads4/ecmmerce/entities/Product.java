package com.tads4.ecmmerce.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name ="tb_product")
public class Product {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String name;
    private String description;
    private Double price;
    private String imgUrl;
@ManyToMany
@JoinTable(name = "tb_product_category",
                joinColumns=@JoinColumn(name = "product_id"),
                inverseJoinColumns = @JoinColumn(name = "category_id")
          )
        private Set<Category> categories = new HashSet<>();
    public Product() {
    }

    public Product(long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
