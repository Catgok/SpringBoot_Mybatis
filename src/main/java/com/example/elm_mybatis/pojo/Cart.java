package com.example.elm_mybatis.pojo;

public class Cart {
    private Integer cartId;
    private Integer foodId;
    private Integer businessId;
    private String userId;
    private Integer quantity;

    //外键   多对一：所属食品
    private Food food;

    //外键   多对一：所属商家
    private Business business;

    private User user;

    public User getUser() {
        return user;
    }

    public void SetUser(User user) {
        this.user = user;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void SetCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void SetFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void SetBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public String getUserId() {
        return userId;
    }

    public void SetUserId(String userId) {
        this.userId = userId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void SetQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Food getFood() {
        return food;
    }

    public void SetFood(Food food) {
        this.food = food;
    }

    public Business getBusiness() {
        return business;
    }

    public void SetBusiness(Business business) {
        this.business = business;
    }
}