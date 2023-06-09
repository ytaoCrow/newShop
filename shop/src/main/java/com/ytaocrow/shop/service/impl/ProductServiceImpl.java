package com.ytaocrow.shop.service.impl;

import com.ytaocrow.shop.dao.ProductDao;
import com.ytaocrow.shop.model.Product;
import com.ytaocrow.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
