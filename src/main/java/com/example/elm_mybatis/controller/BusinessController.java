package com.example.elm_mybatis.controller;

import com.example.elm_mybatis.pojo.Business;
import com.example.elm_mybatis.service.IBusinessService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "商户操作接口")
@CrossOrigin(allowedHeaders = {"*"})
@RequestMapping(value = "/business")
//http://localhost:9092/mybatis/swagger-ui/index.html
public class BusinessController {

    @Autowired
    private IBusinessService iBusinessService;

    @GetMapping(value = "/query")
    @ApiOperation(value = "查询所有商家")
    public List<Business> queryBusinessList() {
        return iBusinessService.getBusinessList();
    }

    @PostMapping(value = "/add")
    @ApiOperation(value = "添加商家")
    public boolean add(@RequestBody Business business) {
        try {
            iBusinessService.addBusiness(business);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
