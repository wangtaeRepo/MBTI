package com.ykck.mbti.dao;

import java.util.List;

import com.ykck.mbti.dto.Product;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ProductDao {
    public List<Product> getProductsList();
    
}
