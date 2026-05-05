package edu.ban7.e3chatbotback.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

@Entity
@Table(name = "products")
public class Product {

    public interface OnCreate {}
    public interface OnUpdate {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank(groups = {OnCreate.class, OnUpdate.class})
    private String name;

    @Column(length = 1000)
    private String description;

    @Column(nullable = false)
    @NotNull(groups = {OnCreate.class, OnUpdate.class})
    @PositiveOrZero(groups = {OnCreate.class, OnUpdate.class})
    private Double price;

    @Column(nullable = false)
    @NotNull(groups = {OnCreate.class, OnUpdate.class})
    @PositiveOrZero(groups = {OnCreate.class, OnUpdate.class})
    private Integer stock;

    public Product() {
    }

    public Product(String name, String description, Double price, Integer stock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(groups = {OnCreate.class, OnUpdate.class}) String getName() {
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

    public @NotNull(groups = {OnCreate.class, OnUpdate.class}) @PositiveOrZero(groups = {OnCreate.class, OnUpdate.class}) Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public @NotNull(groups = {OnCreate.class, OnUpdate.class}) @PositiveOrZero(groups = {OnCreate.class, OnUpdate.class}) Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}