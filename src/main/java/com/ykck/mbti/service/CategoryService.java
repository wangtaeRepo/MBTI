package com.ykck.mbti.service;

import com.ykck.mbti.dao.*;
import java.util.*;
import com.ykck.mbti.dto.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    CategoryDao categoryDao;
    
    public List<Category> getCategoryList(){

        return categoryDao.getCategoryList();

    }

    public Category getCategoryByFirst(int first_category_id) {
        return categoryDao.getCategoryByFirst(first_category_id);
    }
}
