package com.ykck.mbti.dao;

import java.util.List;

import com.ykck.mbti.dto.Product;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ProductDao {
    public List<Product> getProductList();

    public void insertProduct(Product product);

	public List<Product> getLiverList();

	public List<Product> getExerciseList();

	public List<Product> getBrainList();

	public List<Product> getStomachList();

	public List<Product> getEyeList();

	public List<Product> getBoneList();

    public Product getProductById(@Param("product_Id")int id);

    public List<Product> getProductByCategoryId(int first_category_id);
}
