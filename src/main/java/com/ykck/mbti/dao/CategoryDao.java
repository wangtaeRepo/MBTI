package com.ykck.mbti.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.ykck.mbti.dto.Category;
import java.util.List;


@Mapper
@Repository
public interface CategoryDao {
    public List<Category> getCategoryList();

}
