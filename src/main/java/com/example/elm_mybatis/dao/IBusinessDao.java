package com.example.elm_mybatis.dao;

import com.example.elm_mybatis.pojo.Business;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface IBusinessDao {
    List<Business> queryBusiness();

    Business queryBusinessById(Integer businessId);

    int insertBusiness(Business business);

    int updateBusiness(Business business);

    int deleteBusiness(Integer businessId);
}
