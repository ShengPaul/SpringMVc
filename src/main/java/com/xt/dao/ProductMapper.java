package com.xt.dao;

import com.xt.vo.Product;

import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer proId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer proId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List<Product> getPros();

}