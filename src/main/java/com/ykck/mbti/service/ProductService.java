package com.ykck.mbti.service;

import java.util.List;

import com.ykck.mbti.dao.ProductDao;
import com.ykck.mbti.dto.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductDao productDao;

    public List<Product> getProductsList() {

        return productDao.getProductsList();
    }

    public void insertProduct(Product product) {
        productDao.insertProduct(product);
    }

}