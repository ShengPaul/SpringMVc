package com.xt.service.impl;

import com.xt.dao.ProductMapper;
import com.xt.service.IProductService;
import com.xt.vo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    //service调用数据库
    @Autowired
    private ProductMapper productMapper;

    @Override
    public int delProductById(Integer proId) {

        return   productMapper.deleteByPrimaryKey(proId);
    }

    @Override
    public List<Product> queryPros() {

        List<Product> pros = new ArrayList<Product>();
       return  productMapper.getPros();
    }

    @Override
    public int saveProduct(Product product) {
       return productMapper.insertSelective(product);
    }

    @Override
    public Product updateProMsg(Integer proId) {
      return   productMapper.selectByPrimaryKey(proId);
    }

    @Override
    public void saveUpdateProMsg(Product product) {
        productMapper.updateByPrimaryKey(product);
    }
}
