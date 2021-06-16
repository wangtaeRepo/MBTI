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

    public List<Product> getProductList() {

        return productDao.getProductList();
    }

    public void insertProduct(Product product) {
        productDao.insertProduct(product);
    }

	public List<Product> getLiverList() {
		return productDao.getLiverList();
	}

	public List<Product> getExerciseList() {
		return productDao.getExerciseList();
	}

	public List<Product> getBrainList() {
		return productDao.getBrainList();
	}

	public List<Product> getStomachList() {
		return productDao.getStomachList();
	}

	public List<Product> getEyeList() {
		return productDao.getEyeList();
	}

	public List<Product> getBoneList() {
		return productDao.getBoneList();
	}

}