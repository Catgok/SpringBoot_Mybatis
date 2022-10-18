package com.example.elm_mybatis.service.impl;

import com.example.elm_mybatis.dao.IBusinessDao;
import com.example.elm_mybatis.pojo.Business;
import com.example.elm_mybatis.service.IBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessService implements IBusinessService {

    @Autowired
    private IBusinessDao iBusinessDao;

    @Override
    public List<Business> getBusinessList() {
        return iBusinessDao.queryBusiness();
    }

    @Override
    public Business getBusinessById(Integer businessId) {
        return iBusinessDao.queryBusinessById(businessId);
    }

    @Override
    public boolean addBusiness(Business business) {
        try {
            int result = iBusinessDao.insertBusiness(business);
            return result > 0;
        } catch (Exception e) {
            return false;
        }
    }


}
