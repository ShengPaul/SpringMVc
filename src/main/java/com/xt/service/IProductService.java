package com.xt.service;

import com.xt.vo.Product;

import java.util.List;

public interface IProductService {

    //根据id删除产品
    public int delProductById(Integer proId);

    public List<Product> queryPros();

    public int saveProduct(Product product);


    public Product updateProMsg(Integer proId);

    public void saveUpdateProMsg(Product product);
}
