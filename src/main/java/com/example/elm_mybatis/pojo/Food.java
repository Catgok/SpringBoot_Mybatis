package com.example.elm_mybatis.pojo;

import java.util.List;

public class Food {
    private Integer foodId;
    private String foodName;
    private String foodExplain;
    private String foodImg;
    private Double foodPrice;
    private Integer businessId;
    private String remarks;
    //@OneToMany(mappedBy = "Cart", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    private List<Cart> carts;

    //@OneToMany(mappedBy = "OrderDetailet", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    private List<OrderDetailet> orderDetailets;

    public List<Cart> getCarts() {
        return carts;
    }

    public void SetCarts(List<Cart> carts) {
        this.carts = carts;
    }

    public List<OrderDetailet> getOrderDetailets() {
        return orderDetailets;
    }

    public void SetOrderDetailets(List<OrderDetailet> orderDetailets) {
        this.orderDetailets = orderDetailets;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void SetFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void SetFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodExplain() {
        return foodExplain;
    }

    public void SetFoodExplain(String foodExplain) {
        this.foodExplain = foodExplain;
    }

    public String getFoodImg() {
        return foodImg;
    }

    public void SetFoodImg(String foodImg) {
        this.foodImg = foodImg;
    }

    public Double getFoodPrice() {
        return foodPrice;
    }

    public void SetFoodPrice(Double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void SetBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void SetRemarks(String remarks) {
        this.remarks = remarks;
    }
}