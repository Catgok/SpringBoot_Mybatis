package com.example.elm_mybatis.service;

import com.example.elm_mybatis.pojo.Business;

import java.util.List;

public interface IBusinessService {
    List<Business> getBusinessList();

    Business getBusinessById(Integer businessId);

    boolean addBusiness(Business business);
}
